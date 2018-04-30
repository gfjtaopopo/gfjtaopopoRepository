package com.atguigu.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.crud.bean.AirConstants;
import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 处理员工CRUD请求
 * @author taofe
 *
 */
@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	/*
	 * URL:
	 * /emp			POST	保存员工
	 * /emp/{id}	GET		查询员工
	 * /emp/{id}	PUT		修改员工
	 * /emp/{id}	DELETE	删除员工
	 */
	
	/**
	 * 检查用户名是否可用
	 * @param empName
	 * @return
	 */
	@RequestMapping("/checkuser")
	@ResponseBody
	public Msg checkUser(@RequestParam("empName")String empName) {
		// 先判断用户名是否是合法的表达式
		if(!empName.matches(AirConstants.EMP_NAME_REGEX)) {
			return Msg.fail().add("va_msg", AirConstants.EMP_NAME_ERR_MSG);
		}
		
		// 数据库用户名重复校验
		if(employeeService.checkUser(empName)) {
			return Msg.success();
		} else {
			return Msg.fail().add("va_msg", AirConstants.EMP_NAME_DB_ERR_MSG);
		}
	}
	
	/**
	 * 员工保存
	 * 1,支持JSR303校验
	 * 2,导入Hibernate-validator
	 * 
	 * @return
	 */
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveEmp(@Valid Employee employee, BindingResult result) {
		// 校验失败,返回失败,在模态框中显示校验失败的错误信息
		if(result.hasErrors()) {
			Map<String, Object> map = new HashMap<String, Object>();
			
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				System.out.println("错误字段名:" + fieldError.getField());
				System.out.println("错误信息:" + fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		} else {
			
			employeeService.saveEmp(employee);
			return Msg.success();
		}
	}
	
	/**
	 * 导入Jackson包。
	 * @param pn
	 * @return
	 */
	@RequestMapping("/emps")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value="pn",defaultValue="1")Integer pn) {
		// 这不是一个分页查询；
		// 引入PageHelper分页插件
		// 在查询之前只需调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Employee> emps =  employeeService.getAll();
		// 使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行了。
		// 封装了详细的分页信息，包括有我们查询出来的数据，传入连续显示的页数。
		PageInfo page = new PageInfo(emps, 5);
		return Msg.success().add("pageInfo", page);
	}
	
	/**
	 * 查询员工数据（分页查询）
	 * @return
	 */
//	@RequestMapping("/emps")
	public String getEmps(@RequestParam(value="pn",defaultValue="1")Integer pn, Model model) {
		
		// 这不是一个分页查询；
		// 引入PageHelper分页插件
		// 在查询之前只需调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Employee> emps =  employeeService.getAll();
		// 使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行了。
		// 封装了详细的分页信息，包括有我们查询出来的数据，传入连续显示的页数。
		PageInfo page = new PageInfo(emps, 5);
		
		model.addAttribute("pageInfo", page);
//		page.getNavigatepageNums();
		
		return "list";
	}
}

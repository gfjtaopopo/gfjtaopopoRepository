package com.atguigu.crud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
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
	 * 删除员工(单个批量二合一)
	 * 单个删除:id1
	 * 批量删除:id1-id2-id3....
	 * @param empIds
	 * @return
	 */
	@RequestMapping(value="/emp/{empIds}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteEmpById(@PathVariable("empIds")String empIds) {
		
		// 批量删除
		if(empIds.contains(AirConstants.HAIFUN)) {
			String[] str_empIds = empIds.split(AirConstants.HAIFUN);
			List<Integer> del_empIds = new ArrayList<Integer>();
			// 组装id的集合
			for (String empId : str_empIds) {
				del_empIds.add(Integer.valueOf(empId));
//				del_empIds.add(Integer.parseInt(empId));
			}
			employeeService.deleteBatch(del_empIds);
			
		// 单个删除(可以合并到批量删除employeeService.deleteBatch中)
		} else {
			employeeService.delEmp(Integer.valueOf(empIds));
		}
		return Msg.success();
	}
	
	/**
	 * 我们要能支持直接发送PUT之类的请求还要封装请求体中的数据
	 * 1,配置上HttpPutFormContentFilter---web.xml
	 * 		:将请求体中的数据解析包装成一个MAP
	 * 2,request被重新包装,request.getParameter()被重写,就会从自己封装的MAP中取数据
	 * 员工更新方法
	 * @param employee
	 * @return
	 */
	@RequestMapping(value="/emp/{empId}",method=RequestMethod.PUT)
	@ResponseBody
//	public Msg updateEmp(@Valid Employee employee, BindingResult result) {
	public Msg updateEmp(Employee employee) {
		
//		public Msg saveEmp(@Valid Employee employee, BindingResult result) {
		// 校验失败,返回失败,在模态框中显示校验失败的错误信息
//		if(result.hasErrors()) {
//			Map<String, Object> map = new HashMap<String, Object>();
//			
//			List<FieldError> errors = result.getFieldErrors();
//			for (FieldError fieldError : errors) {
//				map.put(fieldError.getField(), fieldError.getDefaultMessage());
//			}
//			return Msg.fail().add("errorFields", map);
//		} else {
			
			employeeService.updateEmp(employee);
			return Msg.success();
//		}
	}
	
	/**
	 * 按照员工id查询员工信息(更新用)
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getEmp(@PathVariable("id")Integer id) {
		Employee employee = employeeService.getEmp(id);
		return Msg.success().add("emp", employee);
	}
	
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
		PageHelper.startPage(pn, AirConstants.PAGE_SIZE);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Employee> emps =  employeeService.getAll();
		// 使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行了。
		// 封装了详细的分页信息，包括有我们查询出来的数据，传入连续显示的页数。
		PageInfo page = new PageInfo(emps, AirConstants.PAGE_RANGE_SIZE);
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
		PageHelper.startPage(pn, AirConstants.PAGE_SIZE);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Employee> emps =  employeeService.getAll();
		// 使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行了。
		// 封装了详细的分页信息，包括有我们查询出来的数据，传入连续显示的页数。
		PageInfo page = new PageInfo(emps, AirConstants.PAGE_RANGE_SIZE);
		
		model.addAttribute("pageInfo", page);
//		page.getNavigatepageNums();
		
		return "list";
	}
}

package com.atguigu.crud.test;

import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.crud.bean.Department;
import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.bean.EmployeeExample;
import com.atguigu.crud.bean.EmployeeExample.Criteria;
import com.atguigu.crud.bean.DepartmentExample;
import com.atguigu.crud.dao.DepartmentMapper;
import com.atguigu.crud.dao.EmployeeMapper;

/**
 * 测试dao层的工作
 * @author taofe
 * 推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 * 1、导入SpringTest模块
 * 2、@ContextConfiguration指定Spring配置文件的位置
 * 3、直接autowired要使用的组建即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@Autowired
	SqlSession sqlSession;
	
//	@Autowired
//	EmployeeExample employeeExample;
	
	/**
	 * 测试DepartmentMapper
	 */
	@Test
	public void testCRUD() {
		// 1、创建SpringIOC容器
//		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2、从容器中获取mapper
//		DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);
		
//		System.out.println(departmentMapper);
		System.out.println(employeeMapper);
		
		// 1、插入几个部门
//		departmentMapper.insertSelective(new Department(null, "开发部"));
//		departmentMapper.insertSelective(new Department(null, "测试部"));
//		departmentMapper.insertSelective(new Department(null, "办公室"));
//		departmentMapper.insertSelective(new Department(null, "安保部"));
		
		// 2、生成员工数据，测试员工插入
//		employeeMapper.insertSelective(new Employee(null, "Jerry", "M", "Jerry@atguigu.com", 1));
//		employeeMapper.insertSelective(new Employee(null, "Daming", "F", "Daming@atguigu.com", 2));
//		employeeMapper.insertSelective(new Employee(null, "Sam", "F", "Sam@atguigu.com", 5));
		
		// 删除员工数据
//		employeeMapper.deleteByPrimaryKey(4);
//		employeeExample = new EmployeeExample();
//		Criteria criteria = employeeExample.createCriteria();
//		criteria.andEmpNameEqualTo("uuid");
//		criteria.andEmpIdGreaterThan(1000);
//		employeeMapper.deleteByExample(employeeExample);
		
//		List<Employee> listEmployees = 
		
//		for (Employee e : listEmployees) {
//			System.out.println(JSON.toJSONStringWithDateFormat(t,  
//                    "yyyy-MM-dd", SerializerFeature.WriteDateUseDateFormat));  
//		}
//		employeeMapper.deleteByExample(example);
		
		// 3、批量插入多个员工：使用可以执行批量操作的sqlSession。
		EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
		for (int i = 0; i < 98; i++) {
			
			String uid = UUID.randomUUID().toString().substring(0, 5) + i;
			mapper.insertSelective(new Employee(null, uid, "M", uid + "@atguigu.com", 1));
		}
		
		System.out.println("批量完成");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

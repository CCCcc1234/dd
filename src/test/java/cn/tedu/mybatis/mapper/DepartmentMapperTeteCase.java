package cn.tedu.mybatis.mapper;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.mybatis.entity.maaper.DepartmentMapper;
import entity.User;
import vo.UserVO;



public class DepartmentMapperTeteCase {

	AbstractApplicationContext ac;
	DepartmentMapper mapper;
	
	@Before
	public void doBefore() {
		ac = new ClassPathXmlApplicationContext("spring-dao.xml");
		mapper = ac.getBean("DepartmentMapper", DepartmentMapper.class);
	}
	
	@After
	public void doAfter() {
		ac.close();
	}
	@Test
	public void findById(){
		int id=2;
		
		
	}
	

}

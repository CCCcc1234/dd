package cn.tedu.mybatis.mapper;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.mybatis.entity.maaper.UserMapper;
import entity.User;
import vo.UserVO;



public class UserMapperTeteCase {

	AbstractApplicationContext ac;
	UserMapper mapper;
	
	@Before
	public void doBefore() {
		ac = new ClassPathXmlApplicationContext("spring-dao.xml");
		mapper = ac.getBean("userMapper", UserMapper.class);
	}
	
	@After
	public void doAfter() {
		ac.close();
	}
	
//	@Test
//	public void addnew() {
//		User user = new User();
//		user.setUsername("¡ıGB");
//		user.setPassword("666");
//		Integer rows = mapper.addnew(user);
//		System.out.println("rows=" + rows);
//	}
	@Test
	public void findById() {
		Integer id=2;
		User user=mapper.findById(id);
		System.out.println(user);
		
	}
	@Test
	public void finAll() {
		List<User> users=mapper.findAll();
		for (User user2 : users) {
			System.out.println(user2);
		}
			
	}
	@Test
	public void updatePassword() {
		Integer id = 14;
		String password = "666";
		
		Integer rows
			= mapper.updatePassword(id, password);
		System.out.println("rows=" + rows);
	}
	@Test
	public void	deleteByIds(){
		Integer[] ids={1,3,5,7,8};
		Integer rows = mapper.deleteByIds(ids);
		System.out.println(rows);
	}
	
	@Test
	public void findAll2(){
		List<UserVO> users=mapper.findAll2();
		for (UserVO user2 : users) {
			System.out.println(user2);
		}
	}
	
	
}

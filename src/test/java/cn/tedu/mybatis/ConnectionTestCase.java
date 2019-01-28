package cn.tedu.mybatis;

import java.sql.SQLException;

import javax.sql.DataSource;


import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionTestCase {
SqlSessionFactoryBean d;
	@Test
	public void getConnection() throws SQLException {
		AbstractApplicationContext ac
			= new ClassPathXmlApplicationContext(
					"spring-dao.xml");
		
		DataSource dataSource = 
				ac.getBean("dataSource", DataSource.class);
		
		System.out.println(dataSource.getConnection());
		
		ac.close();
	}
	
}








package org.zerock.tests;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MysqlConnectionTests {
	
	@Autowired
	private DataSource ds;
	
	@Autowired
	private TimeMapper tm;
	
	@Test
	public void mysqlConnectionTest()  throws Exception{
		Class<?> clz = Class.forName("com.mysql.cj.jdbc.Driver");
		log.info(clz);
		Connection con = DriverManager.
				getConnection
				("jdbc:mysql://localhost:3306/bitdb?characterEncoding=UTF-8&serverTimezone=Asia/Seoul&useSSL=false",
						"bit04", "bit04");
		con.close();
	}
	
	@Test
	public void mysqlConnectionTest2() throws Exception {
		log.info(ds);
		Connection con = ds.getConnection();
		
		log.info(con);
		assertNotNull(con);
		
	}
	
	@Test
	public void getTimeTest() throws Exception {
		log.info(tm.getTime());
		
	}

	@Test
	public void getTimeTest2() throws Exception {
		log.info(tm.getTime2());
		
	}
	
}

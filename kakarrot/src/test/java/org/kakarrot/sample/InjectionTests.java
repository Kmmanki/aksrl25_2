package org.kakarrot.sample;


import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kakarrot.mapper.TimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Data;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
@Data
public class InjectionTests {
	
	@Autowired
	private DataSource ds;
	
	@Autowired
	private TimeMapper TimeMapper;
	
	@Test
	public void test1() {
		log.info(TimeMapper.getTime());
	}

	@Test
	public void TestDs() {
		log.info(ds);
		
		try {
			Connection con =  ds.getConnection();
			log.info(con);
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
	
	@Test
	public void Test1() {
		
	
	}
}

package org.kakarrot.sample;

import javax.activation.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kakarrot.mapper.TimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Data;
import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Data
public class InjectionTest {

	@Autowired
	private DataSource ds;
	@Autowired
	private TimeMapper tm;

	@Test
	public void test1() {
		log.info(tm.getTime());
	}
	
}

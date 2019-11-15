package org.zerock.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import lombok.extern.log4j.Log4j;

@Log4j
public class loadingTests {

	@Autowired
	private ApplicationContext ac;
	
	@Test
	public void logTest() {
		log.info("Logtest....................");
	}

	@Test
	public void appcontextTest() {
		log.info(ac);
		assertNotNull(ac);
		
	}
}

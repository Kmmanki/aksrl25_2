package org.zerock.ex;

public class main {

	public static void main(String[] args) {

		sample real = new sampleReal();
		sample porxy = new SampleProxy();
		
		new SampleRunner(porxy).play();
		
		
				
	}

}

package org.zerock.ex;

public class SampleProxy implements sample {

	
	private sample target ;

	public void setTarget(sample target) {
		this.target = target;
	}
	
	public void DoA() {

		System.out.println("before...");
		target.DoA();
		System.out.println("After....");
	}

	public void DoB() {
		// TODO Auto-generated method stub
		System.out.println("before...");

		System.out.println("After....");

	}


}

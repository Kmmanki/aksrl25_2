package org.zerock.ex;

public class SampleRunner {
	private sample sample;

	public SampleRunner(org.zerock.ex.sample sample) {
		super();
		this.sample = sample;
	}

	public void play() {
		sample.DoA();
		sample.DoB();
	}
}

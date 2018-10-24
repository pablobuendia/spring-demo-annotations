package com.luv2code.springdemo;

public class NeutralFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "My opinion is neutral";
	}

}

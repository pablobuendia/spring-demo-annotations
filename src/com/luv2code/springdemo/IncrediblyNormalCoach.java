package com.luv2code.springdemo;

public class IncrediblyNormalCoach implements Coach {

	private FortuneService fortuneService;
	
	public IncrediblyNormalCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do normal stuff";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

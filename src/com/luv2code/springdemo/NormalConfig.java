package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.luv2code.springdemo")
public class NormalConfig {
	
	
	// define bean for our neutral fortune service
	@Bean
	public FortuneService neutralFortuneService() {
		return new NeutralFortuneService();
	}
	
	// define bean for our incredibly normal coach AND inject dependency
	@Bean
	public Coach incrediblyNormalCoach() {
		return new IncrediblyNormalCoach(neutralFortuneService());
	}
}

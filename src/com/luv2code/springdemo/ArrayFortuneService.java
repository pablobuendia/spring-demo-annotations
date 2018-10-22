package com.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ArrayFortuneService implements FortuneService {

	@Value("${fortune1}")
	private String a;
	@Value("${fortune2}")
	private String b;
	@Value("${fortune3}")
	private String c;
	@Value("${fortune4}")
	private String d;
	@Value("${fortune5}")
	private String e;
	
	private String[] data;
	
	@PostConstruct
	public void setupMyData() {
		System.out.println(">> inside setupMyData()");
		data = new String[5];
		
		data[0] = a;
		data[1] = b;
		data[2] = c;
		data[3] = d;
		data[4] = e;
	}
	
	private Random myRandom;
	
	@Override
	public String getFortune() {
		myRandom = new Random();
		return "Your fortune is " + data[myRandom.nextInt(data.length)];
	}

}

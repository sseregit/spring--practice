package com.example.demo.web;

import org.springframework.stereotype.Service;

import com.example.demo.common.MyLogger;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LogDemoService {
	
	private final MyLogger mylogger;

	public void logic(String id) {
		mylogger.log("service id = "+id);
		
	}

}

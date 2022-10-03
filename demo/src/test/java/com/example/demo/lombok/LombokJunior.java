package com.example.demo.lombok;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class LombokJunior {

	private Long id;
	private String name;
	
	public static void main(String[] args) {
		LombokJunior lj = new LombokJunior();
	}
}

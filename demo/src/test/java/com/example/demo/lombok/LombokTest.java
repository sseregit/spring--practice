package com.example.demo.lombok;

import java.util.function.IntPredicate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class LombokTest {
	
	@Test
	void lombokTestMethod() {
	
		Long a = 1L;
		String aName = "a";
		
		LombokJunior lj = new LombokJunior();
		
		lj.setId(a);
		lj.setName(aName);
		
		Assertions.assertThat(lj.getId()).isEqualTo(a);
		Assertions.assertThat(lj.getName()).isEqualTo(aName);
		
	}
	

	
}

package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.member.Grade;
import com.example.demo.member.Member;
import com.example.demo.member.MemberService;
import com.example.demo.order.Order;
import com.example.demo.order.OrderService;

public class OrderApp {

	public static void main(String[] args) {
//		AppConfig appConfig = new AppConfig();
//		MemberService memberService = appConfig.memberService();
//		OrderService orderService = appConfig.orderService();
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MemberService memberService = applicationContext.getBean("memberService",MemberService.class);
		OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
		
		long memberId = 1L;
		Member member = new Member(memberId, "memberA", Grade.VIP);
		memberService.join(member);
		
		Order order = orderService.createOrder(memberId, "itemName", 20000);
		
		System.out.println("order = "+ order);
		System.out.println("order = "+ order.calculatePrice());
	}
}

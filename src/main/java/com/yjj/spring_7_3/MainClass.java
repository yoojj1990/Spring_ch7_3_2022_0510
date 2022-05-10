package com.yjj.spring_7_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		Student stu1 = ctx.getBean("student", Student.class);
		
		System.out.println(stu1.getName());
		
		Student stu2 = ctx.getBean("student", Student.class);
		stu2.setName("이순신");
		
		System.out.println(stu2.getName());
		System.out.println(stu1.getName());
		
		
		if(stu1.equals(stu2)) {
			System.out.println("stu1 과 stu2 는 같은 객체를 참조하고 있습니다.");
		} else {
			System.out.println("stu1 과 stu2 는 다른 객체를 참조하고 있습니다.");
		}
		
		
		ctx.close();
		
		
		
		
	}

}

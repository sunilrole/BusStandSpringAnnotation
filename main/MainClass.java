package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfig;
import com.entity.BusStand;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		BusStand b = context.getBean(BusStand.class);
		System.out.println(b);
		BusStand b1 = context.getBean(BusStand.class);
		System.out.println(b1);
		System.out.println(b == b1);

	}

}

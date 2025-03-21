package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.BeanAnnotationMyConfig;
import com.entity.BeanAnnotationClassBusStand;

public class BeanAnnotationMainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanAnnotationMyConfig.class);
		BeanAnnotationClassBusStand bs = context.getBean(BeanAnnotationClassBusStand.class);
		System.out.println(bs);
	}
}

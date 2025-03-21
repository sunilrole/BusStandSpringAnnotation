package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.BeanAnnotationClassBusStand;

@Configuration
public class BeanAnnotationMyConfig {

	@Bean
	public BeanAnnotationClassBusStand bus() {
		return new BeanAnnotationClassBusStand();
	}
}

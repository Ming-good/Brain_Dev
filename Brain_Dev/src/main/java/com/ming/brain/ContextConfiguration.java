package com.ming.brain;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;

import com.ming.brain.rootConfig.DatabaseConfig;
import com.ming.brain.rootConfig.SessionFactory;

//Application Context(root-context ����)  
//Controller �����ϰ� ��� Bean�� ��Ȥ��.

@Configuration
@Import({
	DatabaseConfig.class,
	SessionFactory.class
})
@ComponentScan(excludeFilters = @ComponentScan.Filter(Controller.class))
public class ContextConfiguration {
	@Bean
	public PropertiesFactoryBean cofigProperties() {
		PropertiesFactoryBean bean = new PropertiesFactoryBean();
		bean.setLocation(new ClassPathResource("properties/config.properties"));
		return bean;
	}
}

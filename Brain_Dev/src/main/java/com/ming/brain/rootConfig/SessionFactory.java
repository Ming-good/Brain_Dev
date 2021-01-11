package com.ming.brain.rootConfig;

import java.io.IOException;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.sf.log4jdbc.Log4jdbcProxyDataSource;

@Configuration
@MapperScan(basePackages =  "com.ming.brain.mapperInterface")
public class SessionFactory {
	@Autowired
	ApplicationContext applicationContext;
	
	@Bean
	public SqlSessionFactoryBean sessionFactory(Log4jdbcProxyDataSource log4) {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		try {
			sessionFactory.setDataSource(log4);
			sessionFactory.setConfigLocation(applicationContext.getResource("classpath:/mybatis-config.xml"));
			sessionFactory.setMapperLocations(applicationContext.getResources("classpath:/mappers/*.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return sessionFactory;
		}
	}
}

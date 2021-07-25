package com.ming.brain.rootConfig;

import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan(basePackages =  "com.ming.brain.mapperInterface")
@EnableTransactionManagement
public class SessionFactory {
	@Autowired
	ApplicationContext applicationContext;
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws IOException {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setConfigLocation(applicationContext.getResource("classpath:/mybatis-config.xml"));
		sessionFactory.setMapperLocations(applicationContext.getResources("classpath:/mappers/*.xml"));
		return sessionFactory;
	}
}

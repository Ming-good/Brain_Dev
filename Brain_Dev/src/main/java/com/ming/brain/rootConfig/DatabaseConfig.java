package com.ming.brain.rootConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.sf.log4jdbc.Log4jdbcProxyDataSource;
import net.sf.log4jdbc.tools.Log4JdbcCustomFormatter;
import net.sf.log4jdbc.tools.LoggingType;

@Configuration
public class DatabaseConfig {
	
	@Bean(destroyMethod="close")
	public Log4jdbcProxyDataSource dataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		datasource.setUrl("jdbc:oracle:thin:@172.105.197.109:1521:XE");
		datasource.setUsername("ming");
		datasource.setPassword("1897");
		
		Log4jdbcProxyDataSource log4 = new Log4jdbcProxyDataSource(datasource);
		Log4JdbcCustomFormatter spyLogDelegator = new Log4JdbcCustomFormatter();
		spyLogDelegator.setLoggingType(LoggingType.MULTI_LINE);
		spyLogDelegator.setSqlPrefix("[SQL]");
		log4.setLogFormatter(spyLogDelegator);
		
		return log4;
	}
}

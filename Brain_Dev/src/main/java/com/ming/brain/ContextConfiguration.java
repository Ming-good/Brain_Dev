package com.ming.brain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

import com.ming.brain.rootConfig.DatabaseConfig;
import com.ming.brain.rootConfig.SessionFactory;

//Application Context(root-context 설정)  
//Controller 제외하고 모든 Bean을 등혹함.

@Configuration
@Import({
	DatabaseConfig.class,
	SessionFactory.class
})
@ComponentScan(excludeFilters = @ComponentScan.Filter(Controller.class))
public class ContextConfiguration {

}

package com.ming.brain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

//Application Context(root-context 설정)  
//Controller 제외하고 모든 Bean을 등혹함.

@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(Controller.class))
public class ContextConfiguration {

}

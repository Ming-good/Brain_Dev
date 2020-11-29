package com.ming.brain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

//Application Context(root-context ����)  
//Controller �����ϰ� ��� Bean�� ��Ȥ��.

@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(Controller.class))
public class ContextConfiguration {

}

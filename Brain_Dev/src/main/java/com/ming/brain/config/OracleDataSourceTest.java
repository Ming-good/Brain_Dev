package com.ming.brain.config;

import java.util.HashMap;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //스프링의 테스트 컨텍스트 프레임워크의 JUnit의 확장기능 지정
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class OracleDataSourceTest {
	
    @Inject 
    private SqlSessionFactory sqlFactory;
    
    @Test
    public void testFactory(){
        System.out.println(sqlFactory);
    }
    @Test
    public void testSession()throws Exception{
        SqlSession session = sqlFactory.openSession();
        HashMap map= session.selectOne("com.ming.brain.mapperInterface.selectTest");
        System.out.println(map.get("NAME"));
    } 

}

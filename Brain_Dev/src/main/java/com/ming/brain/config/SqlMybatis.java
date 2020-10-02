package com.ming.brain.config;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;


public class SqlMybatis {
	@Test
	public void builds() throws IOException, Exception {
		String Driver = "oracle.jdbc.driver.OracleDriver";
		String URL = "jdbc:oracle:thin:@172.105.197.109:1521:XE";
		String user_id = "ming";
		String user_pw = "1897";
	
		Class.forName(Driver);
		
		Connection con = DriverManager.getConnection(URL, user_id, user_pw);
		System.out.println(con);
		
	}
}

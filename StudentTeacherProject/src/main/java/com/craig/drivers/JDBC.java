package com.craig.drivers;

import java.sql.Connection;

import com.craig.utils.ConnectionFactory;

public class JDBC {
	
	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnection();
		
	}

	
}

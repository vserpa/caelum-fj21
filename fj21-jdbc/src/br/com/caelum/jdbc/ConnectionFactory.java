package br.com.caelum.jdbc;

import java.sql.*;

public class ConnectionFactory {

	public Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
}

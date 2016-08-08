package br.com.caelum.jdbc;

import java.sql.*;

public class ConnectionFactory {
	
	public Connection getConnection(){
		try{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/fj21", "root", "qwe123");
		} catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
}

package br.com.caelum.projetocdc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/cdc", "root", "kiko");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

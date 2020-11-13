package br.com.projetoWeb.cnn;

import java.sql.*;

public class ConnectionFactory {

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/agenda";
			Connection cnn = DriverManager.getConnection(url, "root", "root");
			return cnn;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		return null;
	}
}

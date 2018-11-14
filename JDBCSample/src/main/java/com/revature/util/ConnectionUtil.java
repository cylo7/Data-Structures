package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class ConnectionUtil {
	private static final Logger LOGGER = Logger.getLogger(ConnectionUtil.class);

	public static Connection getConnection() throws SQLException {

		// You should get all three parameters with environment variables
		// System.getemv
		String url = "jdbc:oracle:thin:@revaturerds.clx9inu2rddu.us-east-2.rds.amazonaws.com\r\n" + 
				":1521:ORCL";
		String username = "ANIMAL_DB";
		String password = "p4ssw0rd";

		return DriverManager.getConnection(url, username, password);

	}
	public static void main(String[] args) {
		LOGGER.trace("Attempting to connect to database");
		try(Connection connection = ConnectionUtil.getConnection()){
			LOGGER.info("Connection Successful");
		}catch (SQLException e) {
			LOGGER.info("Unable to Connect");
		}
	}

}

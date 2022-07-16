package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("Start...");

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deloitte", "root", "root");

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM student");
		ResultSetMetaData rsmd = rs.getMetaData();
		while (rs.next()) {
			int columnIndex = 1;
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(rs.getString(columnIndex) + "\t");
				columnIndex++;
			}
			System.out.println("");
		}

		System.out.println("...End");

	}

}

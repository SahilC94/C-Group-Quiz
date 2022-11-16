package quizminiproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnect {
	
	public static Connection getConnection() {
	
	Connection con = null;
	
	 try {
		Class.forName("com.mysql.jdbc.Driver");

		 String url = "jdbc:mysql://localhost:3306/project?characterEncoding=utf8";
	     con = DriverManager.getConnection(url,"root","root");
	     
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	return con;
	
	}

}

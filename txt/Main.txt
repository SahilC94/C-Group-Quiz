package quizminiproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	static String Grade;
	static int Score;
	
	public static void main(String[] args) {
		
		Connection con = JdbcConnect.getConnection(); 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your ID");
		int ID = scan.nextInt();
		System.out.println("Please Enter your Name");
		String Name = scan.next();
		
		Quiz obj = new Quiz();
		obj.displayQues();		
		String Grade = obj.getGrade;
		int Score = obj.getScore;
		
		PreparedStatement ps = null ;
		String query = "insert into studentdata values(?,?,?,?)";
		
		try {			  
			  ps = con.prepareStatement(query);
			  ps.setInt(1,ID);
			  ps.setString(2,Name);
			  ps.setInt(3,Score);
			  ps.setString(4,Grade);
			  
			  int record = ps.executeUpdate();
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*finally {
			try {
				con.close();
				ps.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		String query1 = "select * from studentdata order by Score desc";
		try {
			 ps=con.prepareStatement(query1);
			 
			 
			 ResultSet rs = ps.executeQuery();
			 System.out.println("SCORECARD=>");
			 while(rs.next()) {
				 System.out.print("ID>>"+rs.getInt(1)+", ");
				 System.out.print("Name>>"+rs.getString(2)+", ");
				 System.out.print("Score>>"+rs.getInt(3)+", ");
				 System.out.println("Grade>>"+rs.getString(4)+", ");
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				ps.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}		
}

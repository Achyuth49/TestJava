package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class TestJDBC {
	private static final String password = "root123";
	private static final String url = "jdbc:mysql://127.0.0.1:3306/mydatabase";
	private static final String userName = "root";
	public static void main(String[] args) throws SQLException {
		
		System.out.println("Connecting to JDBC");
		
		//get connection object
		Connection con = DriverManager.getConnection(url,userName,password);
		//create statement
		//Statement statement = con.createStatement();
		PreparedStatement pst = con.prepareStatement("select * from Citizen where Name=? and age=?");
		pst.setString(1, "Nani");
		pst.setInt(2, 28);
		ResultSet rs = pst.executeQuery();
		
		//statement.execute("create table Citizen(Name varchar(45),Age int)");
		//int rowsAffected_count = statement.executeUpdate("insert into Citizen values('Achyuth',26)");
		
		//ResultSet rs = statement.executeQuery("select * from Citizen");
		
		ResultSetMetaData rsMetaData = rs.getMetaData();
		
		int columnCount = rsMetaData.getColumnCount();
		
		while(rs.next()) {
			for(int i=1;i<=columnCount;i++) {
				System.out.print(rs.getString(i)+" ");
			}
			System.out.println();
		}
		/*
		 * while(rs.next()) { System.out.print(rs.getString(1)+" ");
		 * System.out.println(rs.getInt(2)); }
		 */
		
		System.out.println("sql ran success");
		//System.out.println(rowsAffected_count+" rows affected");
	}

}

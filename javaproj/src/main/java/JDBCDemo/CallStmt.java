package JDBCDemo;
import java.sql.*;



public class CallStmt {
	
	public static void main(String[] args) {
	
	  callInsertStudent("jdbc:mysql://127.0.0.1:3306/mydatabase","root","root123",
			  				106,"Arjun",88,26);
	 
	} 
	private static void callInsertStudent(String url,String username,String password,
			int id,String name,int marks,int age) {
		
		String callsql = "{call insert_student_info(?,?,?,?)}";
		
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			
			CallableStatement cstmt = con.prepareCall(callsql);
			cstmt.setInt(1, id);
			cstmt.setString(2, name);
			cstmt.setInt(3, marks);
			cstmt.setInt(4, age);
			cstmt.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}

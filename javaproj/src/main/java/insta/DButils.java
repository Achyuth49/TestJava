package insta;
import java.sql.*;
public class DButils {
	
	public static void instaSignUpDetails(UserDetails userdata) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabase",
				"root","root123");
		PreparedStatement pst=con.prepareStatement("insert into insta_user values(?,?,?,?);");
		
		pst.setString(1,userdata.getFirstName());
		pst.setString(2,userdata.getLastName());
		pst.setString(3,userdata.getUserName());
		pst.setString(4,userdata.getPassword());
		
		int rowsInserted  = pst.executeUpdate();
		System.out.println(rowsInserted+" rows inserted");
	}
	
	public static void failedCount(UserDetails userdata) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabase",
				"root","root123");
		PreparedStatement pst=con.prepareStatement("update insta_user set failedcount = "
				+ "failedcount+1 where Username = ?;");
		
		pst.setString(1,userdata.getUserName());
		pst.executeUpdate();
		
	}
	public static void instaSignInDetails(UserDetails userdata) throws SQLException{
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabase",
				"root","root123");
		PreparedStatement pst=con.prepareStatement("select count(*) from insta_user "
				+ "where Username = ? and Password=? ;");
		PreparedStatement pst1 = con.prepareStatement("select failedcount from insta_user where Username = ?;");
		pst1.setString(1, userdata.getUserName());
		ResultSet rs1 = pst1.executeQuery();
		pst.setString(1,userdata.getUserName());
		pst.setString(2,userdata.getPassword());
		
		ResultSet  rs = pst.executeQuery();
		while(rs.next()) {
			int res = rs.getInt(1);
			//System.out.println(rs.getInt(4));
			if(res > 0) {
				while(rs1.next()) {
					int res1 = rs1.getInt(1);
					if(res1>3) {
						System.out.println("Maximum attempts reached ! account blocked");
					}else {
						System.out.println("Sign-in successfull ! ");
					}
				}
				
			}else {
				failedCount(userdata);
				System.out.println("Incorrect username or password ! Please check");
			}
		}
		 
		 
	}
}

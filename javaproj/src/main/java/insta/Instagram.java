package insta;
import java.sql.SQLException;
import java.util.*;

public class Instagram {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Instagram");
		System.out.println("Enter any option :");
		System.out.println("1.Sigin-up 2.Sign-in");
		int option = s.nextInt();
		switch(option) {
		case 1:
			InstaSignUp.signUp();
			break;
		case 2:
			InstaSignUp.signIn();
			break;
		default :
			System.out.println("Invalid option entered");
		}
	}

}

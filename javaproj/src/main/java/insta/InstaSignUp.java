package insta;

import java.sql.SQLException;
import java.util.Scanner;

public class InstaSignUp {
	
	public static void signIn() throws SQLException {
		Scanner si = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter user name");
		String userName = si.nextLine();
		System.out.println("Enter Password");
		String pass = si.nextLine();
		si.close();
		UserDetails userobj = new UserDetails(userName,pass);
		DButils.instaSignInDetails(userobj);
	}

	public static void signUp() throws SQLException {
		Scanner su = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter first name");
		String firstName = su.nextLine();
		System.out.println("Enter last name");
		String lastName = su.nextLine();
		System.out.println("Enter user name");
		String userName = su.nextLine();
		System.out.println("Enter password");
		String pass = su.nextLine();
		System.out.println("Re-enter password");
		String re_pass = su.nextLine();
		su.close();
		if(pass.equalsIgnoreCase(re_pass)) {
			System.out.println("Sign-up successfull");
			UserDetails userobj = new UserDetails(firstName,lastName,userName,pass);
			DButils.instaSignUpDetails(userobj);
		}else {
			System.out.println("Password mismatched !! enter again");
		}
	}

}

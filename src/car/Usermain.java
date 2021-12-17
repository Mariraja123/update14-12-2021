package car;

import java.sql.SQLException;

import java.util.Scanner;

import carproduct.Carproduct;
import carproduct.CarproductDAO;

public class Usermain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Registered \t 2.login");
		System.out.println("Enter choice");
		UserDAO us = null;
		String x = scan.nextLine();
		
		switch (x) {
		case "Register":
			us = new UserDAO();

			String first_name;
			String tempNum;
			long phoneno;
			String email;
			String roletype;
			String cpassword;
			String cpassword1;
			String Email;

			do {
				System.out.println("Enter First Name:");
				first_name = scan.nextLine();
				if (!first_name.matches("[A-Za-z]{3,}")) {
					System.out.println("Enter name more than 3 characters");

				}
				if (first_name.isEmpty()) {
					System.out.println("your name is empty");
				}

			} while (!first_name.matches("[A-Za-z]{3,}"));

			// phone number]

			do {
				System.out.println("Enter Phone Number:");
				tempNum = scan.nextLine();

				if (tempNum.isEmpty()) {
					System.out.println("Enter your number");
				}
				if (!tempNum.matches("[6-9][0-9]{9}")) {
                    System.out.println("number start with  6,7,8,9 only");
				} 

			} while (!tempNum.matches("[6-9][0-9]{9}"));
			phoneno = Long.parseLong(tempNum);

			
			// Email ID

			do {
				System.out.println("Enter email ID:");
				email = scan.nextLine();
				if(email.isEmpty())
				{
					System.out.println("Enter your mail");
				}
				else if (!email.matches("[a-z0-9]+[@][a-z]+[.][a-z]+")) {
					System.out.println("Enter mail @ and . sysmb0l ");

				} 

			} while (!email.matches("[a-z0-9]+[@][a-z]+[.][a-z]+"));

			// Password

			do {
				System.out.println("Enter password:");
				cpassword = scan.nextLine();
				if (!cpassword.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&?/*$^]).{8,16}$")) {
					System.out.println("Enter cpssword atleast 8 character");

				} 
				else if(cpassword.isEmpty())
				{
					System.out.println("please enter passwor");
				}

			} while (!cpassword.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&?/*$^]).{8,16}$"));
			Userdetail users = new Userdetail(first_name, cpassword, email, phoneno);
			us.insert(users);
			break;

		case "Login":
			System.out.println("login");

		
			do {
				
				System.out.println("Enter email ID:");
				Email = scan.nextLine();
				if(Email.isEmpty())
				{
					System.out.println("Enter your mail");
				}
				else if (!Email.matches("[a-z0-9]+[@][a-z]+[.][a-z]+")) {
					System.out.println("Enter mail @ and . sysmb0l ");

				} 

			} while (!Email.matches("[a-z0-9]+[@][a-z]+[.][a-z]+"));

			
			do {
				System.out.println("Enter your password");
				 cpassword1 = scan.nextLine();
				
				if (!cpassword1.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&?/*$^]).{8,16}$+")) {
					System.out.println("Enter cpssword atleast 8 character");

				} 
				else if(cpassword1.isEmpty())
				{
					System.out.println("please enter passwor");
				}

			} while (!cpassword1.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&?/*$^]).{8,16}$+"));
			Userdetail user2 = new Userdetail(Email, cpassword1);
			UserDAO user1 = new UserDAO();
			boolean flag1 = user1.validate(user2);
			if (flag1) {
				System.out.println("valid");
				System.out.println("1.Show product");
				
			} else {
				System.out.println("invalid");
			}

		}
		

	}
}

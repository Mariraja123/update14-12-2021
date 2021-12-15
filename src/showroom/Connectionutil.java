package showroom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import registerd.RegisteredDAO;

public class Connectionutil {

	public static Connection getDBconnection() throws ClassNotFoundException, SQLException
	  {
		  Class.forName("oracle.jdbc.OracleDriver");
		  
		  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		  
		  return con;
	  }
}
//public class Adminmain {
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		// TODO Auto-generated method stub
//
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter your choice 1.login");
//		RegisteredDAO user=null;
//		String x=s.nextLine();
//		
//		switch(x)
//		{
//			case "login":
//
//				System.out.println("Enter your username");
//				String uname=s.nextLine();
//				System.out.println("enter password");
//				String password=s.nextLine();
//				user=new RegisteredDAO();
//				boolean val=user.fetch(uname, password);
//						System.out.println(val);
//				if(val)
//						
//						{
//					System.out.println("login successfull");
//					
//						}
//				else
//				{
//					System.out.println("invalid passwordil");
//				}
//		}
//	}
//
//}
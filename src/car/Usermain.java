package car;

import java.sql.SQLException;
import java.util.Scanner;

import carproduct.Carproduct;
import carproduct.CarproductDAO;

public class Usermain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        System.out.println("Enter choice");
	        UserDAO user=null;
	        int x=s.nextInt();
	        s.nextLine();
	        switch(x)
	        {
	        case 1:
	        	System.out.println("insert the value");
	        	String sm=s.next();
			    Userdetail obj=new Userdetail(Integer.parseInt(sm.split(",")[0]) ,sm.split(",")[1],sm.split(",")[2],sm.split(",")[3],sm.split(",")[4]);
			    UserDAO abc=new  UserDAO();
			    abc.insert(obj);
			    break;
	        case 2:
	        	System.out.println("login");
	        	System.out.println("Enter your mail");
	        	String Email=s.nextLine();
	        	System.out.println("Enter your password");
	        	String password=s.nextLine();
	        	Userdetail user2 = new Userdetail(Email,password);
	        	UserDAO user1=new UserDAO();
	        	boolean flag = user1.validate(user2);
	        	if(flag) {
	        		System.out.println("valid");
	        	}else {
	        		System.out.println("invalid");
	        	}
	        	
	        	
	}
	     

}
}

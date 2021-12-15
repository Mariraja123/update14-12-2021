package registerd;

import java.sql.SQLException;
import java.util.Scanner;
import car.*;
public class Registeredmain {

		// TODO Auto-generated method stub
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			System.out.println("enter your choice 1.register");
	        int x=s.nextInt();
	        switch(x)
	        {
	        case 1:
	        	System.out.println("Enter your first_name,last_name,phone_number,email,password,conf.password");
	        	String sm=s.next();
	        	
			    Registered obj=new Registered(sm.split(",")[0],sm.split(",")[1],Long.parseLong(sm.split(",")[2]) ,sm.split(",")[3],sm.split(",")[4],sm.split(",")[5]);
			    RegisteredDAO abc=new  RegisteredDAO();
			    abc.insert(obj);
			    break;
//	        case 2:
//	        	System.out.println("update the value");
//	        	String sm1=s.next();
//	        	Registered obj1=new Registered(sm1.split(",")[0],sm1.split(",")[1]);
//	        	RegisteredDAO abc1=new  RegisteredDAO();
//			    abc1.update(obj1);
//	        }

	}

		}
}

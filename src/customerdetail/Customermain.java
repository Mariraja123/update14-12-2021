package customerdetail;

import java.sql.SQLException;
import java.util.Scanner;

public class Customermain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        int x=s.nextInt();
	        switch(x)
	        {
	        case 1:
	        	System.out.println("insert the value");
	        	String sm=s.next();
			    Customerdetail obj=new Customerdetail(sm.split(",")[0],sm.split(",")[1],sm.split(",")[2],Long.parseLong(sm.split(",")[3]) ,sm.split(",")[4],sm.split(",")[5]);
			    CustomerDAO abc=new  CustomerDAO();
			    abc.insert(obj);
			    break;
	        case 2:
	        	System.out.println("update the value");
	        	String sm1=s.next();
	        	Customerdetail obj1=new Customerdetail(sm1.split(",")[0],Integer.parseInt( sm1.split(",")[1]));
	        	CustomerDAO abc1=new  CustomerDAO();
			    abc1.update(obj1);
	        }
		}
	}


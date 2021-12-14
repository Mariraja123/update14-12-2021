package car;

import java.sql.SQLException;
import java.util.Scanner;

public class Adminmain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		switch(x)
		{
			case 1:
				System.out.println("insert your value");
			    String sm=s.next();
			    Car obj=new Car(sm.split(",")[0],sm.split(",")[1],sm.split(",")[2]);
			    UserDAO abc=new UserDAO();
			    abc.insert(obj);
			    break;
		}
	}

}

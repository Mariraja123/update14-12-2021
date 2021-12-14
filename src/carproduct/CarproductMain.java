package carproduct;

import java.sql.SQLException;
import java.util.Scanner;

import car.Car;
import car.UserDAO;

public class CarproductMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        switch(x)
        {
        case 1:
        	System.out.println("insert the value");
        	String sm=s.next();
		    Carproduct obj=new Carproduct(sm.split(",")[0],sm.split(",")[1],sm.split(",")[2],sm.split(",")[3],sm.split(",")[4],sm.split(",")[5],sm.split(",")[6]);
		    CarproductDAO abc=new  CarproductDAO();
		    abc.insert(obj);
		    break;
        case 2:
        	System.out.println("update the value");
        	String sm1=s.next();
        	Carproduct obj1=new Carproduct(sm1.split(",")[0],sm1.split(",")[1]);
        	CarproductDAO abc1=new  CarproductDAO();
		    abc1.update(obj1);
        }
	}

}

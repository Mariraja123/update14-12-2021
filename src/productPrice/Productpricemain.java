package productPrice;

import java.sql.SQLException;
import java.util.Scanner;



public class Productpricemain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        switch(x)
        {
        case 1:
        	System.out.println("insert the value");
        	String sm=s.next();
		    Productprice obj=new Productprice(sm.split(",")[0],sm.split(",")[1],sm.split(",")[2],sm.split(",")[3],Integer.parseInt(sm.split(",")[4]),sm.split(",")[5],Integer.parseInt(sm.split(",")[6]));
		    PriceDAO abc=new  PriceDAO();
		    abc.insert(obj);
		    break;
        case 2:
        	System.out.println("update the value");
        	String sm1=s.next();
        	Productprice obj1=new Productprice(sm1.split(",")[0],sm1.split(",")[1]);
        	PriceDAO abc1=new  PriceDAO();
		    abc1.update(obj1);
        }
	}

	}


package showroom;

import java.util.Scanner;



public class Showroommain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        switch(x)
        {
        case 1:
        	System.out.println("insert the value");
        	String sm=s.next();
		    Showroom obj=new Showroom(sm.split(",")[0],sm.split(",")[1],sm.split(",")[2],Integer.parseInt(sm.split(",")[3]) ,sm.split(",")[4]);
		    ShowroomDAO abc=new  ShowroomDAO();
		    abc.insert(obj);
		    break;
        case 2:
        	System.out.println("update the value");
        	String sm1=s.next();
        	Showroom obj1=new Showroom(sm1.split(",")[0],sm1.split(",")[1]);
        	ShowroomDAO abc1=new  ShowroomDAO();
		    abc1.update(obj1);
        }
	}
	
	}


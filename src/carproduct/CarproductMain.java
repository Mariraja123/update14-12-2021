package carproduct;

import java.sql.SQLException;
import java.util.Scanner;

import car.Car;
import car.UserDAO;

public class CarproductMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter choice");
        int x=s.nextInt();
        switch(x)
        {
        case 1:
        	System.out.println("insert the value");
        	String sm=s.next();
		    Carproduct obj=new Carproduct(sm.split(",")[1],sm.split(",")[2],sm.split(",")[3],sm.split(",")[4],sm.split(",")[5]);
		    CarproductDAO abc=new  CarproductDAO();
		    abc.insert(obj);
		    break;
//        case 2:
//        	System.out.println("update the value");
//        	String sm1=s.next();
//        	Carproduct obj1=new Carproduct(sm1.split(",")[0],sm1.split(",")[1]);
//        	CarproductDAO abc1=new  CarproductDAO();
//		    abc1.update(obj1);
        }
	}

}
//public static void main(String[] args) {
//
//	Scanner scan = new Scanner(System.in);
//	System.out.println("\tWelcome to Online Book Shop");
//	System.out.println("\n1.Register\n2.Login\nEnter your Choice :");
//	int choice = Integer.parseInt(scan.nextLine());
//
//	UserDao userDao = null;
//	switch (choice) {
//	case 1:
//
//		userDao = new UserDao();
//		
//		//name
//		System.out.println("Enter user Name:");
//		String name = scan.nextLine();
//		int flag = 0;
//		do {
//			if(name.matches("[A-Za-z]{5,}")) 
//			{
//				flag = 0;
//				break;
//			} else
//				System.out.println("Enter valid name ");
//			name = scan.nextLine();
//			flag = 1;
//		} while (flag == 1);
//		
//		// phone number
//		System.out.println("Enter Phone Number:");
//		String phno = scan.nextLine();
//		do {
//			if(phno.matches("[6-9][0-9]{9}"))
//			{
//				flag = 0;
//				break;
//			}else
//				System.out.println("Enter valid Phone no:");
//			    phno = scan.nextLine();
//			    flag = 1;
//		}while (flag == 1);
//		long phoneNo =Long.parseLong(phno);
//		
//		//Address
//		System.out.println("Enter address");
//		String address = scan.nextLine();
//		do {
//			if(address.matches("[A-Za-z0-9]{4,}+[,][A-Za-z]{4,}+[,][0-9]{6}+{20,}"))
//			{
//				flag = 0;
//				break;
//			}else
//				System.out.println("Enter valid address");
//			    address = scan.nextLine();
//			    flag = 1;
//		}while (flag == 1);
//		
//		//Email ID
//		System.out.println("Enter email ID:");
//		String email = scan.nextLine();
//		do {
//			if (email.matches("[a-z0-9]+[@][a-z]+[.][a-z]+{8,15}")) {
//				flag = 0;
//				break;
//			} else
//				System.out.println("Enter valid email ");
//			email = scan.nextLine();
//			flag = 1;
//		} while (flag == 1);
//		
//		//Password
//		System.out.println("Enter password:");
//		String password = scan.nextLine();
//		do {
//			if (password.matches("[A-Za-z0-9]{8,10}")) {
//				flag = 0;
//				break;
//			} else
//				System.out.println("Enter valid password pattern");
//			password = scan.nextLine();
//			flag = 1;
//		} while (flag == 1);
//		User user = new User(name, phoneNo, address ,email, password);
//		userDao.insertUser(user);
//		break;


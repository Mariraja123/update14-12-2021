package Carbookingmain;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.List.*;
import java.util.Scanner;

import Carbooking.*;
import CarbookingDAO.*;




public class Usermain {


		// TODO Auto-generated method stub
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("1.Registered \t 2.login");
			System.out.println("Enter choice");
			UserdetailDAO us = null;
			String x = scan.nextLine();
			
			switch (x) {
			case "Register":
				us = new UserdetailDAO();

				String first_name;
				String tempNum;
				long phoneno;
				String email;
				String roletype;
				String cpassword;
				String cpassword1;
				String Email;
				int userId = 0;

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
				Userdetail users = new Userdetail((userId),first_name, cpassword, email, phoneno);
				try {
					us.insert(users);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
					
					if (!cpassword1.matches("[A-Za-z0-9@]*")) {
						System.out.println("Enter cpssword atleast 8 character");

					} 
					else if(cpassword1.isEmpty())
					{
						System.out.println("please enter passwor");
					}

				} while (!cpassword1.matches("[A-Za-z0-9@]*"));
				
				Userdetail user2 = new Userdetail(Email, cpassword1);
				UserdetailDAO user1 = new UserdetailDAO();
//				boolean flag1=false;
				try {
					String user_type = user1.validate(user2);
					System.out.println(user_type);
					switch(user_type)
					{
					case "user":
						System.out.println("1.Show product+2. update password + 3.delete account");
						int x1=Integer.parseInt(scan.nextLine());
						String userFlag=null;
           				Carproduct product=null;
						switch(x1)
						{
						case 1:
						CarproductDAO pro1=new CarproductDAO();
//						Carproduct=null;
						List<Carproduct> lProducts=pro1.showview();
						for(int i=0;i<lProducts.size();i++)
						{
							System.out.println(lProducts.get(i));
							
						}
//						System.out.println("enter no of Products Needed");
//						int noOf=Integer.parseInt(scan.nextLine());
//					
//					Carproduct.insertOrder(product,currentUser,noOf);
						
					
//						System.out.println("do you want to buy more products(y/n)");
//						  userFlag=scan.nextLine();
//					while(userFlag.charAt(0)=='y');
						
						break;
						case 2:
							System.out.println("Enter your userid");
							int username=Integer.parseInt(scan.nextLine());
							System.out.println("Enter your password");
							String newpass=scan.nextLine();
							Userdetail obj=new Userdetail(username,newpass);
							
							UserdetailDAO pstm=new UserdetailDAO();
							try {
								pstm.update(obj);
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case 3:
							System.out.println("Delete your account");
							System.out.println("Enter you user_id");
							int userid=scan.nextInt();
							Userdetail obj1=new Userdetail(userid);
							UserdetailDAO pst=new UserdetailDAO();
							try {
								pst.delete(obj1);
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
					  break;
					case "admin":
					{
						System.out.println("1.Add car + 2.update car +  delete car"); 
						int add=Integer.parseInt(scan.nextLine());
						switch(add)
						
						{
						case 1:
							System.out.println("add you products");
							System.out.println("Enter your car_id");
						     String car_id=scan.nextLine();
							System.out.println("Enter your car_name");
						    String car_name=scan.nextLine();
						    
							System.out.println("Enter your fueltype");
							String fueltype=scan.nextLine();
							System.out.println("Enter your carModel");
							String carmodel=scan.nextLine();
							System.out.println("Enter your cartype");
							String cartype=scan.nextLine();
							System.out.println("price");
							long price=scan.nextLong();
							Carproduct obj=new Carproduct(car_id,car_name,fueltype,carmodel,cartype,price);
							CarproductDAO  pst1=new CarproductDAO();
							pst1.insert(obj);
							break;
						case 2:
							System.out.println("update your products");
							System.out.println("Enter your car_id");
							String car_id1=scan.nextLine();
							System.out.println("price");
							long prices=scan.nextLong();
							Carproduct obj1=new Carproduct(car_id1,prices);
							CarproductDAO pst2=new CarproductDAO();
							pst2.update(obj1);
							break;
						case 3:
							System.out.println("delete your product");
							System.out.println("Enter your car_id");
							String car_id2=scan.nextLine();
							Carproduct pst3=new Carproduct(car_id2);
							CarproductDAO pst13=new CarproductDAO();
							pst13.delete(pst3);
							break;
							
						}
					}
					}
				}
				 catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}}}
//				System.out.println(flag1);
//				if (flag1) {
//					System.out.println("valid");
//					String userFlag=null;
//					Carproduct product=null;
//					System.out.println("1.Show product+2. update password + 3.delete account");
//					int x1=Integer.parseInt(scan.nextLine());
//					switch(x1)
//					{
//					case 1:
//					CarproductDAO pro1=new CarproductDAO();
////					Carproduct=null;
//					List<Carproduct> lProducts=pro1.showview();
//					for(int i=0;i<lProducts.size();i++)
//					{
//						System.out.println(lProducts.get(i));
//						
//					}
//					break;
//					System.out.println("Enter the Product Name:");
//					String proName=scan.nextLine();
//					for(int i=0;i<lProducts.size();i++)
//					{
//						if(lProducts.get(i).getProduct_name().equals(proName))
//						{
//							product=lProducts.get(i);
//						}
//					}
//					System.out.println("enter no of Products Needed");
//					int noOf=Integer.parseInt(scan.nextLine());
//					
//					Carproduct.insertOrder(product,currentUser,noOf);
//					
//				
//					System.out.println("do you want to buy more products(y/n)");
//					  userFlag=scan.nextLine();
//				while(userFlag.charAt(0)=='y');
//					case 2:
//						System.out.println("Enter your userid");
//						int username=Integer.parseInt(scan.nextLine());
//						System.out.println("Enter your password");
//						String newpass=scan.nextLine();
//						Userdetail obj=new Userdetail(username,newpass);
//						
//						UserdetailDAO pstm=new UserdetailDAO();
//						try {
//							pstm.update(obj);
//						} catch (ClassNotFoundException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						} catch (SQLException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						break;
//					case 3:
//						System.out.println("Delete your account");
//						System.out.println("Enter you user_id");
//						int userid=scan.nextInt();
//						Userdetail obj1=new Userdetail(userid);
//						UserdetailDAO pst=new UserdetailDAO();
//						try {
//							pst.delete(obj1);
//						} catch (ClassNotFoundException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						} catch (SQLException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
			
					
					
					
					
//				} else {
//					System.out.println("invalid");
//				}





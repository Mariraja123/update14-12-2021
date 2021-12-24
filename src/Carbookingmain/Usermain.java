package Carbookingmain;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.List.*;
import java.util.Scanner;

import com.CarbookingDao.*;
import com.Carbookingpojo.*;






public class Usermain {


		// TODO Auto-generated method stub
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
			SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
			Scanner scan = new Scanner(System.in);
			System.out.println("1.Registered \t 2.login");
			System.out.println("Enter choice");
			Userdetaildao us = null;
			int x = Integer.parseInt(scan.nextLine());
			
			switch (x) {
			case 1:
				us = new Userdetaildao();

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
				Userdetail users = new Userdetail(first_name, cpassword, email, phoneno);
				try {
					us.insert(users);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			case 2:
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
				
				Userdetail user2 = new Userdetail(0, null, cpassword1, Email, null, null);
				Userdetaildao user1 = new Userdetaildao();
//				boolean flag1=false;
				try {
//					String user_type = user1.validate(user2);
					
					Userdetail crtUser=user1.validate(user2);
					
					switch(crtUser.getUsertype())
					{
					
					case "user":
						while(true)
						{
						System.out.println("1.Show product"+'\n'+"2. update password" +'\n'+ "3.delete account" +'\n'+" 4.serach product");
						int x1=Integer.parseInt(scan.nextLine());

						switch(x1)
						{
						case 1:
							//list product2no
						Carproductdao pro1=new Carproductdao();
						String carname=null;
						List<Carproduct> lProducts=pro1.showview();
						for(int i=0;i<lProducts.size();i++)
						{
							System.out.println(lProducts.get(i));
							
						}
						
					          System.out.println("buy or not('yes/no')");
					          String confi=scan.nextLine().toLowerCase();
					          if(confi.equals("yes"))
					          {
					          
                        
                        	 System.out.println("which is you want to buy");
                        	
                        	 System.out.println("select car_id");
                        	 String carid1=scan.nextLine();
                        	 Carproduct car=new Carproduct(carid1);
                        	 Carproductdao dao=new Carproductdao();
                            	 Carproduct cars=dao.selectproduct(car);
                        	 System.out.println("sorted selected car in cart");
                        	 int user=crtUser.getUserId();
                        	 System.out.println(user);
                        	 String proId=car.getCar_id();
                        	 

                       	 Pricedetaildao priceDao=new Pricedetaildao();
                        	  int onroad=priceDao.Findproduct(proId);
                        	  Orderdetaildao sdf=new Orderdetaildao();
                        	 Orderdetail price=new Orderdetail(user,proId,onroad);
                        	 sdf.insert(price);
                        	 System.out.println("do you want to confirm your car bookingclick('yes/no')");
                        	 String confirm=scan.nextLine().toLowerCase();
                        	 if(confirm.equals("yes"))
                        	 {
                        		 System.out.println("Enter your Expected");
                        	String temp=scan.nextLine();
                        	Date date1 = null;
							try {
								date1 = sdf1.parse(temp);
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                        	CarorderDao sdao= new CarorderDao();
                        	Orderdetaildao orderdao=new Orderdetaildao();
                        	int onorder=orderdao.Findorder(price);
                        	Carproduct abc=new Carproduct();
//                        	abc.getCar_name();
                        	
//                        	System.out.println(cars.getCar_name());
                        	String carName=cars.getCar_name();
                        	
                        	Carproductdao productdao=new Carproductdao();
//                        	String name1=productdao.Searchcar(abc);
                       	
                        	Carorder scar=new Carorder(onorder,proId,carName,date1);
                        	sdao.insert(scar);
                        	Userdetaildao stm1=new Userdetaildao();
    						Userdetail san=new Userdetail(user);
    						long wallet=stm1.wallte(san);
    						wallet=wallet-onroad;
    						Userdetail sand=new Userdetail(wallet,user);
    						stm1.updateWallet(sand);
                        	
                        		 
                        	 }
					          }
//                        	 priceDao.Findproduct(price);
//                        	 
                        	 
                        	 
                        	 
////                        	 System.out.println("Enter your userid");
//                        	 int user=scan.nextInt();
////                        	String user=s
//                        	 
//                        	 Orderdetail od=new Orderdetail(user,carc,prc);
//                        	 Orderdetaildao ord= new Orderdetaildao();
//                        	 ord.insert(od);
//						
						break;
						case 2:
							System.out.println("Enter your userid");
							int username=Integer.parseInt(scan.nextLine());
							System.out.println("Enter your password");
							String newpass=scan.nextLine();
							Userdetail obj=new Userdetail(username,newpass);
							
							Userdetaildao pstm=new Userdetaildao();
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
							Userdetaildao pst=new Userdetaildao();
							try {
								pst.delete(obj1);
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case 4:
							System.out.println("search your product");
							System.out.println("Enter your car id");
							String search=scan.nextLine();
							System.out.println("Enter your carname");
							String name=scan.nextLine();
							Carproduct obj3=new Carproduct(search,name);
							Carproductdao stm=new Carproductdao();
							stm.Searchproduct(obj3);
							 break;
							 default:
							 {
							 System.exit(0);
							 }
						}
						
						
					 
						}
					case "admin":
					{
						while(true)
						{
						System.out.println("1.Add car"+'\n'+" 2.update car"+ '\n'+ "3.delete car"+'\n'+" 4. show car"+'\n'+"5.price detail"+'\n'+"view all user"); 
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
							Carproductdao  pst1=new Carproductdao();
							pst1.insert(obj);
							break;
						case 2:
							System.out.println("update your products");
							System.out.println("Enter your car_id");
							String car_id1=scan.nextLine();
							System.out.println("price");
							long prices=scan.nextLong();
							Carproduct obj1=new Carproduct(car_id1,prices);
							Carproductdao pst2=new Carproductdao();
							pst2.update(obj1);
							break;
						case 3:
							System.out.println("delete your product");
							System.out.println("Enter your car_id");
							String car_id2=scan.nextLine();
							Carproduct pst3=new Carproduct(car_id2);
							Carproductdao pst13=new Carproductdao();
							pst13.delete(pst3);
							break;
						case 4:
							System.out.println("show car");
							Carproductdao pro1=new Carproductdao();
//							Carproduct=null;
							List<Carproduct> lProducts=pro1.showview();
							for(int i=0;i<lProducts.size();i++)
							{
								System.out.println(lProducts.get(i));
								
							}
						case 5:
							System.out.println("price details");
							System.out.println("1.insert value"+'\n'+" 2.update value"+'\n'+" 3.delete value");
							int enter=Integer.parseInt(scan.nextLine());
							
							switch(enter)
							{
							case 1:
								System.out.println("Enter your carid");
								String carid=scan.nextLine();
								System.out.println("Enter your carname");
								String carname=scan.nextLine();
								System.out.println("Enter Exshowroom price");
								int show=scan.nextInt();
								System.out.println("Enter roadtax");
								int road=scan.nextInt();
								System.out.println("enter insurance");
								int insurance=scan.nextInt();
								int onroad=show+road+insurance;
							    Pricedetail sm1=new Pricedetail(carid,carname,show,road,insurance,onroad);
							    Pricedetaildao obj5=new Pricedetaildao();
							    obj5.insert(sm1);
							    break;
							case 2:
								System.out.println("update details");
								System.out.println("Enter your car_id");
								String car=scan.nextLine();
								System.out.println("Enter your Exshowroom_price");
								int room=scan.nextInt();
								  Pricedetail prc=new Pricedetail(car,room);
								    Pricedetaildao obj6=new Pricedetaildao();
								    obj6.update(prc);
								    break;
							case 3:
								System.out.println("delete deatils");
								System.out.println("Enter your car_id");
								String cars=scan.nextLine();
								 Pricedetail prc1=new Pricedetail(cars);
								    Pricedetaildao obj7=new Pricedetaildao();
								    obj7.delete(prc1);
								    break;
								
							}
						case 6:
							System.out.println("view all users");
							Userdetail use=new Userdetail();
							Userdetaildao alluse=new Userdetaildao();
							List<Userdetail>allusers=alluse.alluser(use);
//							System.out.println(allusers.get(0));
							Userdetail selva=allusers.get(0);
//							System.out.println(selva.getPhoneno());
//							System.out.println(selva.getFirst_name());
							
							for(int i=0;i<allusers.size();i++)
							{
								System.out.println(allusers.get(i));
								
							}
							
						
						}
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
		}
		}
}






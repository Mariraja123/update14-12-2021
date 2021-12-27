package Carbookingmain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.List.*;
import java.util.Scanner;

import com.CarbookingDao.Impl.*;
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
				UserDetail users = new UserDetail(first_name, cpassword, email, phoneno);
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
				
				UserDetail user2 = new UserDetail(0, null, cpassword1, Email, null, null);
				Userdetaildao user1 = new Userdetaildao();
//				boolean flag1=false;
				try {
//					String user_type = user1.validate(user2);
					if(user1.validate(user2) != null) {
					UserDetail crtUser=user1.validate(user2);
					
					
					switch(crtUser.getUsertype())
					{
					
					case "user":
						while(true)
						{
						System.out.println("1.Show product"+'\n'+"2. update password" +'\n'+ "3.delete account" +'\n'+" 4.serach product"+'\n'+"5.delete cart"+'\n'+"6.view cart");
						int x1=Integer.parseInt(scan.nextLine());

						switch(x1)
						{
						case 1:
							//list product
						Carproductdao pro1=new Carproductdao();
						String carname=null;
						List<CarProduct> lProducts=pro1.showview();
						for(int i=0;i<lProducts.size();i++)
						{
							System.out.println(lProducts.get(i));
							
						}
						
					          System.out.println("buy or not('yes/no')");
					          //selected car
					          String confi=scan.nextLine().toLowerCase();
					          if(confi.equals("yes"))
					          {
					          
                        
                        	 System.out.println("which is you want to buy");
                        	
                        	 System.out.println("select car_id");
                        	 String carid1=scan.nextLine();
                        	 CarProduct car=new CarProduct(carid1);
                        	 Carproductdao dao=new Carproductdao();
                            	 CarProduct cars=dao.selectproduct(car);
                            	//stored in cart 
                        	 System.out.println("sorted selected car in cart");
                        	 int user=crtUser.getUserId();
                        	 System.out.println(user);
                        	 String proId=car.getCar_id();
                        	 

                       	 Pricedetaildao priceDao=new Pricedetaildao();
                        	  int onroad=priceDao.Findproduct(proId);
                        	  Orderdetaildao sdf=new Orderdetaildao();
                        	 OrderDetail price=new OrderDetail(user,proId,onroad);
                        	 sdf.insert(price);
                        	 
                        	 //confirm booking
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
                        	CarProduct abc=new CarProduct();
//                        	abc.getCar_name();
                        	
//                        	System.out.println(cars.getCar_name());
                        	String carName=cars.getCar_name();
                        	
                        	Carproductdao productdao=new Carproductdao();
//                        	String name1=productdao.Searchcar(abc);
                       	
                        	CarOrder scar=new CarOrder(onorder,proId,carName,date1);
                        	sdao.insert(scar);
                        	//wallet
                        	Userdetaildao stm1=new Userdetaildao();
    						UserDetail san=new UserDetail(user);
    						long wallet=stm1.wallte(san);
    						wallet=wallet-onroad;
    						UserDetail sand=new UserDetail(wallet,user);
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
							//change password
							System.out.println("Enter your userid");
							int username=Integer.parseInt(scan.nextLine());
							System.out.println("Enter your password");
							String newpass=scan.nextLine();
							UserDetail obj=new UserDetail(username,newpass);
							
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
							//delete account
							System.out.println("Delete your account");
							System.out.println("Enter you user_id");
							int userid=scan.nextInt();
							UserDetail obj1=new UserDetail(userid);
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
							//search product
							System.out.println("search your product");
							System.out.println("Enter your car id");
							String search=scan.nextLine();
							System.out.println("Enter your carname");
							String name=scan.nextLine();
							CarProduct obj3=new CarProduct(search,name);
							Carproductdao stm=new Carproductdao();
							stm.Searchproduct(obj3);
							 break;
						case 5:
							//delete cart
							System.out.println("delete in cart");
							System.out.println("Enter your order_id");
							int orderid=Integer.parseInt( scan.nextLine());
							OrderDetail orderdetail = new OrderDetail(orderid);
							Orderdetaildao orderdetaildao = new Orderdetaildao();
							orderdetaildao.delete(orderdetail);
							break;
						case 6:
							System.out.println("view cart list");
							OrderDetail orderdetail2 = new OrderDetail(crtUser.getUserId());
							Orderdetaildao orderdetaildao2 = new Orderdetaildao();
							ResultSet rs = orderdetaildao2.view(orderdetail2);
							while(rs.next()) {
								int ordid = rs.getInt(1);
								int uid = rs.getInt(2);
								String carid = rs.getString(3);
								Long amount = rs.getLong(4);
								
								System.out.println("order id : " + ordid + "\n" + "user id : " + uid + "\n" + "car_id : " +carid + "\n" + "wallet amount :  "+ amount);
							
							}
							break;
						case 7:
							System.out.println("Cancel booking");
						
							System.out.println("Enter your status");
							String can=scan.nextLine();
							System.out.println("Enter your booking id");
							int cancel=Integer.parseInt(scan.nextLine());
							CarOrder sac=new CarOrder(can,cancel);
							CarorderDao sac1=new CarorderDao();
							sac1.update(sac);
							break;
//							 default:
//							 {
//							 System.exit(0);
//							 }
						}					
						
					 
						}
					case "admin":
					{
						while(true)
						{
						System.out.println("1.Add car"+'\n'+" 2.update car"+ '\n'+ "3.delete car"+'\n'+" 4. show car"+'\n'+"5.price detail"+'\n'+"6 view all user"+'\n'+"7 view booking detail"); 
						int add=Integer.parseInt(scan.nextLine());
						switch(add)
						
						{
						case 1:
							//add product
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
							CarProduct obj=new CarProduct(car_id,car_name,fueltype,carmodel,cartype,price);
							Carproductdao  pst1=new Carproductdao();
							pst1.insert(obj);
							break;
						case 2:
							//update product
							System.out.println("update your products");
							System.out.println("Enter your car_id");
							String car_id1=scan.nextLine();
							System.out.println("price");
							long prices=scan.nextLong();
							CarProduct obj1=new CarProduct(car_id1,prices);
							Carproductdao pst2=new Carproductdao();
							pst2.update(obj1);
							break;
						case 3:
							//delete product
							System.out.println("delete your product");
							System.out.println("Enter your car_id");
							String car_id2=scan.nextLine();
							CarProduct pst3=new CarProduct(car_id2);
							Carproductdao pst13=new Carproductdao();
							pst13.delete(pst3);
							break;
						case 4:
							//view all car
							System.out.println("show car");
							Carproductdao pro1=new Carproductdao();
//							Carproduct=null;
							List<CarProduct> lProducts=pro1.showview();
							for(int i=0;i<lProducts.size();i++)
							{
								System.out.println(lProducts.get(i));
								
							}
						case 5:
							//price detail
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
								//update price
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
//								delete price
								System.out.println("delete deatils");
								System.out.println("Enter your car_id");
								String cars=scan.nextLine();
								 Pricedetail prc1=new Pricedetail(cars);
								    Pricedetaildao obj7=new Pricedetaildao();
								    obj7.delete(prc1);
								    break;
								
							}
						case 6:
//							view all user
							System.out.println("view all users");
							UserDetail use=new UserDetail();
							Userdetaildao alluse=new Userdetaildao();
							List<UserDetail>allusers=alluse.alluser(use);
//							System.out.println(allusers.get(0));
							UserDetail selva=allusers.get(0);
//							System.out.println(selva.getPhoneno());
//							System.out.println(selva.getFirst_name());
							
							for(int i=0;i<allusers.size();i++)
							{
								System.out.println(allusers.get(i));
								
							}
							
						case 7:
							System.out.println("view all booking details");
							CarOrder book=new CarOrder();
							CarorderDao allbook=new CarorderDao();
							List<CarOrder>allbooks=allbook.allbook(book);

							
							for(int i=0;i<allbooks.size();i++)
							{
								System.out.println(allbooks.get(i));
								
							}
						
						}
						}
					}
					}
					}else {
						System.out.println("user not Exist!!");
					}
				}
				 catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					 
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("dfgh");
					e1.printStackTrace();
				}
		}
		}
}







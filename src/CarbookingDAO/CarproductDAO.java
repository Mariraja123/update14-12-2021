package CarbookingDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Carbooking.Carproduct;
import Carbookingconnection.Connectionutil;


public class CarproductDAO {

	public static  List<Carproduct> showview() 
	{
		List<Carproduct> productsList=new ArrayList<Carproduct>();
		
		String showQuery="select * from Car_details";
		Connection con;
		try {
			con = Connectionutil.getDBconnection();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(showQuery);
			while(rs.next())
			{
				Carproduct product=new Carproduct(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),Long.parseLong(rs.getString(6)));
				productsList.add(product);
				
			}
			
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return productsList;
	}
//	public static int findProductId(Carproduct product)
//	{
//		String findUserID="select product_name from Carproduct where product_id= '"+Carproduct.getProduct_name()+"'";
//		Connection con=Connectionutil.getDBconnection();
//		Statement stmt=null;
//		int productId=0;
//		try {
//			stmt = con.createStatement();
//			ResultSet rs=stmt.executeQuery(findUserID);
//			if(rs.next())
//			{
//			productId=rs.getInt(1);
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return productId;
//		
//	}
//	
     public static void update(Carproduct obj1) throws ClassNotFoundException, SQLException
     {
   	  String update="update car_details set price=? where Car_id=? ";
   	  Connection Con=Connectionutil.getDBconnection();
   	  PreparedStatement stmt=Con.prepareStatement(update);
   	  stmt.setLong(1, obj1.getPrice());
   	  stmt.setString(2, obj1.getCar_id());
   	  int i=stmt.executeUpdate();
   	  System.out.println(i);
     }
     public static void insert(Carproduct obj1) throws ClassNotFoundException, SQLException
     {
    	 String insert="insert into car_details values(?,?,?,?,?,?)";
    	 Connection Con=Connectionutil.getDBconnection();
    	 PreparedStatement stmt=Con.prepareStatement(insert);
    	 stmt.setString(1, obj1.getCar_id());
    	 stmt.setString(2, obj1.getCar_name());
    	 stmt.setString(3, obj1.getFuelType());
    	 stmt.setString(4, obj1.getCarModel());
    	 stmt.setString(5, obj1.getCarType());
    	 stmt.setLong(6, obj1.getPrice());
    	 int i=stmt.executeUpdate();
    	 System.out.println(i);
     }
     public static void delete(Carproduct obj1) throws ClassNotFoundException, SQLException
     {
    	 String delete="delete from car_details where car_id=?";
    	 Connection Con=Connectionutil.getDBconnection();
    	 PreparedStatement stmt1=Con.prepareStatement(delete);
    	 stmt1.setString(1, obj1.getCar_id());
    	 int i=stmt1.executeUpdate();
    	 System.out.println(i+"deleted");
     }
     public static void Searchproduct(Carproduct obj3) throws ClassNotFoundException, SQLException
     {
    	 String search="Select * from car_details where car_name=? and car_id=?";
    	 Connection Con=Connectionutil.getDBconnection();
    	 PreparedStatement stmt=Con.prepareStatement(search);
    	stmt.setString(1, obj3.getCar_name());
    	stmt.setString(2, obj3.getCar_id());
    	 ResultSet rs=stmt.executeQuery();
    	 while(rs.next())
    	 {
    		 System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(5)+rs.getString(6));
    	 }
    	 
     }


}

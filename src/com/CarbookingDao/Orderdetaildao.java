package com.CarbookingDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Carbookingpojo.*;
import com.connection.*;



public class Orderdetaildao {

	public static void insert(Orderdetail obj) throws ClassNotFoundException, SQLException
    {
		
	String insert="insert into order_details (user_id,car_id,price)values(?,?,?)";
	Connection Con=Connectionutil.getDBconnection();
	PreparedStatement stmt=Con.prepareStatement(insert);
	stmt.setInt(1, obj.getUserId());
	stmt.setString(2, obj.getCarid());
	stmt.setInt(3, obj.getPrice());
	
	int i=stmt.executeUpdate();
	System.out.println(i+"saved on cart");
    }
	public static int Findorder(Orderdetail obj) 
    {
   	 String search="Select Order_id from order_details where user_id=? and Car_id=?";
   	 Connection Con;
   
   	 int order=0;

			
			 try {
				Con = Connectionutil.getDBconnection();
				PreparedStatement stmt=Con.prepareStatement(search);
			    stmt.setInt(1, obj.getUserId());
			    stmt.setString(2, obj.getCarid());
			 
			    	 ResultSet rs=stmt.executeQuery();
			    	
			    	 if(rs.next())
			    	 {
			             order=rs.getInt(1);
//			             System.out.println(order);
			             
			    		 

			    	 }
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return order;
			 
    }
//    public static void update(Orderdetail obj1) throws ClassNotFoundException, SQLException
//    {
//  	  String update="update order_details set phone=? where order_id=? ";
//  	  Connection Con=Connectionutil.getDBconnection();
//  	  PreparedStatement stmt=Con.prepareStatement(update);
//  	 stmt.setInt(1, obj1.getUserId());
//  	  stmt.setInt(2, obj1.getOrder_id());
//  	  int i=stmt.executeUpdate();
//  	  System.out.println(i);
//    }
    public static void delete(Orderdetail obj1)
    {
    	String delete="delete from order_details where order_id=?";
    	 Connection Con;
		try {
			Con = Connectionutil.getDBconnection();
			 PreparedStatement stmt=Con.prepareStatement(delete);
	    	 stmt.setInt(1, obj1.getOrder_id());
	    	 int i=stmt.executeUpdate();
	    	 System.out.println(i+"deleted in cart");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
    public static ResultSet view (Orderdetail obj1)
    {
    	String delete="select * from Order_details where user_id=?";
    	 Connection Con;
		try {
			Con = Connectionutil.getDBconnection();
			 PreparedStatement stmt=Con.prepareStatement(delete);
	    	 stmt.setInt(1, obj1.getOrder_id());
	    	 ResultSet rs=stmt.executeQuery();
	    	return rs;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    	
    	
    }
    
}

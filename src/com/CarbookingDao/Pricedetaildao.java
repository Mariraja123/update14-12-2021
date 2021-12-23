package com.CarbookingDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Carbookingpojo.*;
import com.connection.*;



public class Pricedetaildao {
	public static void insert(Pricedetail obj) throws ClassNotFoundException, SQLException
    {
		
	String insert="insert into price_detail (car_id,car_name,Exshowroom_price,road_tax,insurance,onroad_price)values(?,?,?,?,?,?)";
//	String query="update price_detail set onroad_price=sum(exshowroom_price,road_tax) where car_id in ? and car_name=?";
	Connection Con=Connectionutil.getDBconnection();
	PreparedStatement stmt=Con.prepareStatement(insert);
	stmt.setString(1, obj.getCar_id());
	stmt.setString(2, obj.getCar_name());
	stmt.setInt(3, obj.getExshowroomprice());
	stmt.setInt(4, obj.getRoadtax());
	stmt.setInt(5, obj.getInsurance());
	stmt.setInt(6, obj.getOnroadprice());
	int i=stmt.executeUpdate();
//	stmt=Con.prepareStatement(query);
//	stmt.setString(1,obj.getCar_id());
//	stmt.executeUpdate();
	System.out.println(i);
    }
    public static void update(Pricedetail obj1)
    {
  	  String update="update price_detail set Exshowroom_price=? where car_id=? ";
  	  Connection Con;
	try {
		Con = Connectionutil.getDBconnection();
		 PreparedStatement stmt=Con.prepareStatement(update);
	     stmt.setInt(1, obj1.getExshowroomprice());
	     System.out.println(obj1.getCar_name());
	        stmt.setString(2, obj1.getCar_id());
	  	  int i=stmt.executeUpdate();
	  	  System.out.println(i);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  	 
    }
    public static void delete (Pricedetail obj) throws ClassNotFoundException, SQLException
    {
    	String delete="delete from price_detail where car_id=?";
    	Connection Con=Connectionutil.getDBconnection();
    	PreparedStatement stmt=Con.prepareStatement(delete);
    	stmt.setString(1, obj.getCar_id());
    	int i=stmt.executeUpdate();
    	System.out.println(i);
    }
    public static int Findproduct(String obj) 
    {
   	 String search="Select onroad_price from price_detail where car_id=?";
   	 Connection Con;
   	System.out.println(obj);
   	 int onprice=0;

		try {
			
			 Con = Connectionutil.getDBconnection();
			 PreparedStatement stmt=Con.prepareStatement(search);
		    	stmt.setString(1, obj);
		 
		    	 ResultSet rs=stmt.executeQuery();
		    	
		    	 if(rs.next())
		    	 {
		             onprice=rs.getInt(1);
		             System.out.println(onprice);
		             
		    		 
//		    		 Carproduct pd=new  Carproduct(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
//		    	 System.out.println(pd);
		    	 }
		    	 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  return onprice;
    }
    
   
    
//    public static ResultSet insert(Pricedetail obj) throws ClassNotFoundException, SQLException
//    {
//	String insert="select exshowroom_price,road_tax,insurance from price_detail where carid in ?";
//	String query="update price_detail set onroad_price=sum(exshowroom_price,road_tax,insurance) where car_id in ?";
//	Connection Con=Connectionutil.getDBconnection();
//	PreparedStatement stmt=Con.prepareStatement(insert);
//	stmt.setString(1, obj.getCar_id());
//	
//	
//	System.out.println(i);
//    }
  
	

}

package com.CarbookingDao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Carbookingpojo.CarOrder;
import com.Carbookingpojo.UserDetail;
import com.connection.Connectionutil;

public class CarorderDao {

	public static void insert(CarOrder obj)
	{
		String insert="insert into car_orders(Order_id,Car_id,Car_name,Expecteddate) values(?,?,?,?)";
		  Connection Con;
		try {
			Con = Connectionutil.getDBconnection();
			PreparedStatement stmt=Con.prepareStatement(insert);
			stmt.setInt(1, obj.getOrder_id());
			stmt.setString(2, obj.getCar_id());		
			stmt.setString(3, obj.getCarname());
		
			
//			stmt.setString(1, obj.getStatus());
			stmt.setDate(4, new java.sql.Date (obj.getExpecteddate().getTime()));
			int i=stmt.executeUpdate();
			System.out.println(i+"booked succesfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static List<CarOrder> allbook(CarOrder obj1) throws ClassNotFoundException, SQLException {
		List<CarOrder> viewbooking=new ArrayList<CarOrder>();
		String allbook="Select * from Car_orders";
		Connection Con = Connectionutil.getDBconnection();
		PreparedStatement stmt=Con.prepareStatement(allbook);
		ResultSet rs=stmt.executeQuery();
		while(rs.next())
		{
		     CarOrder details=new CarOrder(rs.getInt(1),rs.getString(2),rs.getString(3),(rs.getDate(4)),rs.getString(5));
		     viewbooking.add(details);
		}
		return viewbooking;
	}
	public static void update(CarOrder obj) throws ClassNotFoundException, SQLException {
		String log1 = "update Car_orders set status=? where order_id=?";
		Connection Con = Connectionutil.getDBconnection();
		PreparedStatement stmt = Con.prepareStatement(log1);
		stmt.setString(1, obj.getStatus());
		stmt.setInt(2, obj.getOrder_id());
		int i = stmt.executeUpdate();
		System.out.println(i + "updated");

	}
}

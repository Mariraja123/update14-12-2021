package com.CarbookingDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Carbookingpojo.Carorder;
import com.connection.Connectionutil;

public class CarorderDao {

	public static void insert(Carorder obj)
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
			System.out.println(i);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

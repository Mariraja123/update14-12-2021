package com.CarbookingDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Carbookingpojo.Admin;
import com.connection.Connectionutil;


public class Admindao {
	public static void insert(Admin caa) throws ClassNotFoundException, SQLException
	{
		String insert="insert into Admin values(?,?)";
		Connection Con=Connectionutil.getDBconnection();
		PreparedStatement stmt=Con.prepareStatement(insert);
		stmt.setString(1, caa.getEmail());
		stmt.setString(2,caa.getPassword());
		int i=stmt.executeUpdate();
		System.out.println(i);
	}

}

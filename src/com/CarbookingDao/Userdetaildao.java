package com.CarbookingDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Carbookingpojo.*;
import com.connection.*;

public class Userdetaildao {

	public static void insert(Userdetail obj) throws ClassNotFoundException, SQLException {
		String insert = "insert into User_details(First_name,cpassword,Email,Phone) values(?,?,?,?)";
		Connection Con = Connectionutil.getDBconnection();
		PreparedStatement stmt = Con.prepareStatement(insert);
		stmt.setString(1, obj.getFirst_name());
		stmt.setString(2, obj.getCpassword());
		stmt.setString(3, obj.getEmail());
		stmt.setLong(4, obj.getPhoneno());

		int i = stmt.executeUpdate();
		System.out.println(i);
	}

	public static Userdetail validate(Userdetail user2) throws ClassNotFoundException, SQLException {
		String log = "Select * from user_details where Email=? and cpassword=?";
		Connection Con = Connectionutil.getDBconnection();
	
		Userdetail type = null;
		PreparedStatement stmt = Con.prepareStatement(log);
		
		stmt.setString(1, user2.getEmail());
		stmt.setString(2, user2.getCpassword());
		ResultSet rs = stmt.executeQuery();

		
			while (rs.next()) {
				
				type = new Userdetail(rs.getString(1), rs.getString(2), rs.getString(3), rs.getLong(4),rs.getInt(5), rs.getString(6));

				return type;
			

			} 
		return type;
	}

	public static ResultSet validateAdmin(Userdetail obj) throws ClassNotFoundException, SQLException {
		String log = "Select * from user_details where Email=? and cpassword=?";
		Connection Con = Connectionutil.getDBconnection();
		PreparedStatement stmt = Con.prepareStatement(log);
		stmt.setString(1, obj.getCpassword());
		stmt.setString(2, obj.getEmail());
		ResultSet rs = stmt.executeQuery();
		return rs;

	}

	public static void update(Userdetail obj) throws ClassNotFoundException, SQLException {
		String log1 = "update user_details set cpassword=? where user_id=?";
		Connection Con = Connectionutil.getDBconnection();
		PreparedStatement stmt = Con.prepareStatement(log1);
		stmt.setString(1, obj.getCpassword());
		stmt.setInt(2, obj.getUserId());
		int i = stmt.executeUpdate();
		System.out.println(i + "updated");

	}

	public static void delete(Userdetail obj1) throws ClassNotFoundException, SQLException {
		String log2 = "delete from user_details where user_id=?";
		Connection Con = Connectionutil.getDBconnection();
		PreparedStatement stmt = Con.prepareStatement(log2);
		stmt.setInt(1, obj1.getUserId());
		int i = stmt.executeUpdate();
		System.out.println(i + "deleted");
	}
	public static List<Userdetail> alluser(Userdetail obj1) throws ClassNotFoundException, SQLException {
		List<Userdetail> veiwall=new ArrayList<Userdetail>();
		String alluser="Select * from user_details";
		Connection Con = Connectionutil.getDBconnection();
		PreparedStatement stmt=Con.prepareStatement(alluser);
		ResultSet rs=stmt.executeQuery();
		while(rs.next())
		{
		     Userdetail detail=new Userdetail(rs.getString(1),rs.getString(2),rs.getString(3),Long.parseLong(rs.getString(4)),rs.getInt(5),rs.getString(6));
		     veiwall.add(detail);
		}
		return veiwall;
	}
	public static Long wallte(Userdetail obj)
	{
		String query="select userwallet from user_details where user_id in ?";
		long wallet=0;
		try {
			Connection Con = Connectionutil.getDBconnection();
			PreparedStatement stmt=Con.prepareStatement(query);
			stmt.setInt(1, obj.getUserId());
			ResultSet rs=stmt.executeQuery();
			System.out.println(obj.getUserId());
			while(rs.next())
			{
				 wallet=rs.getLong(1);
				 System.out.println(wallet);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wallet;
		
	}

	public void updateWallet(Userdetail obj) {
		// TODO Auto-generated method stub
		String query="update user_details set userwallet=? where user_id in ?";
		
		try {
			Connection con=Connectionutil.getDBconnection();
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setLong(1, obj.getWallet());
			pstmt.setInt(2, obj.getUserId());
			pstmt.executeUpdate();
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}

package CarbookingDAO;

import java.sql.Connection;
import Carbookingconnection.*;
import Carbooking.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserdetailDAO {

	 public static void insert(Userdetail obj) throws ClassNotFoundException, SQLException
     {
	String insert="insert into User_details(First_name,cpassword,Email,Phone) values(?,?,?,?)";
	Connection Con=Connectionutil.getDBconnection();
	PreparedStatement stmt=Con.prepareStatement(insert);
	stmt.setString(1, obj.getFirst_name());
	stmt.setString(2, obj.getCpassword());
	stmt.setString(3, obj.getEmail());
	stmt.setLong(4, obj.getPhoneno());
	
	
	
	
	int i=stmt.executeUpdate();
	System.out.println(i);
     }
 
     public static String validate(Userdetail obj) throws ClassNotFoundException, SQLException {
     String log="Select * from user_details where Email=? and cpassword=?";
     Connection Con=Connectionutil.getDBconnection();
		PreparedStatement stmt=Con.prepareStatement(log);
		System.out.println(obj.getCpassword());
		stmt.setString(1, obj.getCpassword());
		stmt.setString(2, obj.getEmail());
		ResultSet rs=stmt.executeQuery();
	
		if(rs.next())
		{
			System.out.println("VAlid");
			String query = "Select usertype from user_details where cpassword in ?";
			System.out.println(obj.getEmail());
			PreparedStatement pstmt=Con.prepareStatement(query);
			pstmt.setString(1,obj.getEmail());
		    ResultSet rs1=pstmt.executeQuery();
		    String type=null;
		    while(rs1.next()) {
			type= rs1.getString(1);
		    }
			return type;

			
		}
		else {
	     return "invalid";
		}
}
     public static ResultSet validateAdmin(Userdetail obj) throws ClassNotFoundException, SQLException {
         String log="Select * from user_details where Email=? and cpassword=?";
         Connection Con=Connectionutil.getDBconnection();
    		PreparedStatement stmt=Con.prepareStatement(log);
    		stmt.setString(1, obj.getCpassword());
    		stmt.setString(2, obj.getEmail());
    		ResultSet rs=stmt.executeQuery();
    		return rs;
         
    }
     public static void  update(Userdetail obj) throws ClassNotFoundException, SQLException
     {
    	String log1="update user_details set cpassword=? where user_id=?" ;
        Connection Con=Connectionutil.getDBconnection();
        PreparedStatement stmt=Con.prepareStatement(log1);
        stmt.setString(1, obj.getCpassword());
        stmt.setInt(2, obj.getUserId()); 
        int i=stmt.executeUpdate();
        System.out.println(i+"updated");
    	
     }
     public static void delete(Userdetail obj1) throws ClassNotFoundException, SQLException
     {
    	 String log2="delete from user_details where user_id=?";
    	 Connection Con=Connectionutil.getDBconnection();
    	 PreparedStatement stmt=Con.prepareStatement(log2);
    	 stmt.setInt(1,obj1.getUserId());
    	 int i=stmt.executeUpdate();
    	 System.out.println(i+"deleted");
     }
}

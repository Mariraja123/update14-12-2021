package car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDAO {

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
	  
	      public static boolean validate(Userdetail obj) throws ClassNotFoundException, SQLException {
	      String log="Select * from user_details where Email=? and cpassword=?";
	      Connection Con=Connectionutil.getDBconnection();
			PreparedStatement stmt=Con.prepareStatement(log);
			stmt.setString(1, obj.getCpassword());
			stmt.setString(2, obj.getEmail());
			ResultSet rs=stmt.executeQuery();
			if(rs.next())
			{
				
				return true;
				
				
			}
			
		return false;
	      
}
}
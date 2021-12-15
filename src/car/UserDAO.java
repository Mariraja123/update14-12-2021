package car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDAO {

	      public static void insert(Userdetail obj) throws ClassNotFoundException, SQLException
	      {
		String insert="insert into User_detail values(?,?,?,?,?)";
		Connection Con=Connectionutil.getDBconnection();
		PreparedStatement stmt=Con.prepareStatement(insert);
		stmt.setInt(1, obj.getUser_id());
		stmt.setString(2, obj.getFirst_name());
		stmt.setString(3, obj.getCpassword());
		stmt.setString(4, obj.getRoletype());
		stmt.setString(5, obj.getEmail());
		
		int i=stmt.executeUpdate();
		System.out.println(i);
	      }
	     // Userdetail user=null;
	      public static boolean validate(Userdetail obj) throws ClassNotFoundException, SQLException {
	      String log="Select * from user_detail where Email=? and cpassword=?";
	      Connection Con=Connectionutil.getDBconnection();
			PreparedStatement stmt=Con.prepareStatement(log);
			stmt.setString(1, obj.getCpassword());
			stmt.setString(2, obj.getEmail());
			System.out.println(obj.getEmail());
			System.out.println(obj.getCpassword());
			ResultSet rs=stmt.executeQuery();
			if(rs.next())
			{
		
				return true;
			}
			
		return false;
	      
}
}
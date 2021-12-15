package showroom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ShowroomDAO {

	public static void insert(Showroom obj) throws ClassNotFoundException, SQLException
    {
	String insert="insert into showroom values(?,?,?,?,?,?)";
	Connection Con=Connectionutil.getDBconnection();
	PreparedStatement stmt=Con.prepareStatement(insert);
	stmt.setString(1, obj.getShowroom_id());
	stmt.setString(2, obj.getLocation());
	stmt.setString(3, obj.getBranch());
	stmt.setInt(4, obj.getPhone());
	stmt.setString(5, obj.getAddress());
	
	int i=stmt.executeUpdate();
	System.out.println(i);
    }
    public static void update(Showroom obj1) throws ClassNotFoundException, SQLException
    {
  	  String update="update price_detail set location=? where showroom_id=? ";
  	  Connection Con=Connectionutil.getDBconnection();
  	  PreparedStatement stmt=Con.prepareStatement(update);
  	  stmt.setString(1, obj1.getLocation());
  	  stmt.setString(2, obj1.getShowroom_id());
  	  int i=stmt.executeUpdate();
  	  System.out.println(i);
    }
}

package car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {

	public void insert(Car obj) throws SQLException, ClassNotFoundException {
		String insert="insert into user_detail values(?,?,?)";
		Connection Con=Connectionutil.getDBconnection();
		PreparedStatement stmt=Con.prepareStatement(insert);
		stmt.setString(1, obj.getUser_id());
		stmt.setString(2,obj.getUsername());
		stmt.setString(3, obj.getPassword());
		int i=stmt.executeUpdate();
		System.out.println(i+"row inserted");
		
//		
		
	}
}

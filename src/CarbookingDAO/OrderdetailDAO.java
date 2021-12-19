package CarbookingDAO;

import java.sql.Connection;
import Carbookingconnection.*;
import Carbooking.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class OrderdetailDAO {

	public static void insert(orderDetail obj) throws ClassNotFoundException, SQLException
    {
	String insert="insert into order_details values(?,?,?,?,?,?)";
	Connection Con=Connectionutil.getDBconnection();
	PreparedStatement stmt=Con.prepareStatement(insert);
	stmt.setInt(1, obj.getOrder_id());
	stmt.setLong(2, obj.getNumber());
	stmt.setString(3, obj.getCar_id());
	stmt.setInt(4, obj.getQuantity());
	stmt.setInt(5, obj.getPrice());
	
	int i=stmt.executeUpdate();
	System.out.println(i);
    }
    public static void update(orderDetail obj1) throws ClassNotFoundException, SQLException
    {
  	  String update="update order_details set phone=? where order_id=? ";
  	  Connection Con=Connectionutil.getDBconnection();
  	  PreparedStatement stmt=Con.prepareStatement(update);
  	  stmt.setLong(1, obj1.getNumber());
  	  stmt.setInt(2, obj1.getOrder_id());
  	  int i=stmt.executeUpdate();
  	  System.out.println(i);
    }
}

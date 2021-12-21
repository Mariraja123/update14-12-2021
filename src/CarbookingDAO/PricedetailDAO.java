package CarbookingDAO;

import java.sql.Connection;
import Carbookingconnection.*;
import Carbooking.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class PricedetailDAO {
	public static void insert(Pricedetail obj) throws ClassNotFoundException, SQLException
    {
	String insert="insert into price_detail (car_id,car_name,Exshowroom_price,road_tax,insurance)values(?,?,?,?,?)";
	Connection Con=Connectionutil.getDBconnection();
	PreparedStatement stmt=Con.prepareStatement(insert);
	stmt.setString(1, obj.getCar_id());
	stmt.setString(2, obj.getCar_name());
	stmt.setInt(3, obj.getExshowroomprice());
	stmt.setInt(4, obj.getRoadtax());
	stmt.setInt(5, obj.getInsurance());
	int i=stmt.executeUpdate();
	System.out.println(i);
    }
    public static void update(Pricedetail obj1)
    {
  	  String update="update price_detail set Exshowroom_price=? where car_id=? ";
  	  Connection Con;
	try {
		Con = Connectionutil.getDBconnection();
		 PreparedStatement stmt=Con.prepareStatement(update);
	     stmt.setInt(1, obj1.getExshowroomprice());
	     System.out.println(obj1.getCar_name());
	        stmt.setString(2, obj1.getCar_id());
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
    public static void delete (Pricedetail obj) throws ClassNotFoundException, SQLException
    {
    	String delete="delete from price_detail where car_id=?";
    	Connection Con=Connectionutil.getDBconnection();
    	PreparedStatement stmt=Con.prepareStatement(delete);
    	stmt.setString(1, obj.getCar_id());
    	int i=stmt.executeUpdate();
    	System.out.println(i);
    }
	

}

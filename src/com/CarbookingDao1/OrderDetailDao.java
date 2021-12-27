package com.CarbookingDao1;

import java.sql.ResultSet;

import com.Carbookingpojo.OrderDetail;

public interface OrderDetailDao {

	public  void insert(OrderDetail obj);
	public  int Findorder(OrderDetail obj) ;
	public  void delete(OrderDetail obj1);
	 public  ResultSet view (OrderDetail obj1);
}

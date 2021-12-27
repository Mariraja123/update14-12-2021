package com.CarbookingDao1;

import java.util.List;

import com.Carbookingpojo.CarOrder;

public interface CarOrderDao {

	public  void insert(CarOrder obj);
	public  List<CarOrder> allbook(CarOrder obj1);
	public  void update(CarOrder obj);
}

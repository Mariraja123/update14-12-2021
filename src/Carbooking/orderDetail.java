package Carbooking;


import java.sql.Date;
import java.util.Objects;

public class orderDetail {
	private  int order_id;
	private int userId;
	private String car_id;
	private int price;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCar_id() {
		return car_id;
	}
	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(car_id, order_id, price, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		orderDetail other = (orderDetail) obj;
		return Objects.equals(car_id, other.car_id) && order_id == other.order_id && price == other.price
				&& userId == other.userId;
	}
	@Override
	public String toString() {
		return "orderDetail [order_id=" + order_id + ", userId=" + userId + ", car_id=" + car_id + ", price=" + price
				+ "]";
	}
	public orderDetail(int order_id, int userId, String car_id, int price) {
		super();
		this.order_id = order_id;
		this.userId = userId;
		this.car_id = car_id;
		this.price = price;
	}
	public orderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public orderDetail(int userId, String car_id, int price) {
		super();
		this.userId = userId;
		this.car_id = car_id;
		this.price = price;
	}



	

}

package Carbooking;


import java.util.Objects;

public class orderDetail {
	private  int order_id;
	private long number;
	private String car_id;
	private int quantity;
	private int price;
	public orderDetail(int order_id, long number, String car_id, int quantity, int price) {
		super();
		this.order_id = order_id;
		this.number = number;
		this.car_id = car_id;
		this.quantity = quantity;
		this.price = price;
	}
	public orderDetail(int order_id, long number) {
		super();
		this.order_id = order_id;
		this.number = number;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getCar_id() {
		return car_id;
	}
	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(car_id, number, order_id, price, quantity);
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
		return Objects.equals(car_id, other.car_id) && number == other.number && order_id == other.order_id
				&& price == other.price && quantity == other.quantity;
	}

	@Override
	public String toString() {
		return "orderDetail [order_id=" + order_id + ", number=" + number + ", car_id=" + car_id + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
	


}

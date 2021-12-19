package Carbooking;

import java.util.Objects;

public class Carproduct {

	private String Car_id;
	private String Car_name;
	private String fuelType;
	private String CarModel;
	private String CarType;
	private long price;
	@Override
	public String toString() {
		return "Carproduct [Car_id=" + Car_id + ", Car_name=" + Car_name + ", fuelType=" + fuelType + ", CarModel="
				+ CarModel + ", CarType=" + CarType + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(CarModel, CarType, Car_id, Car_name, fuelType, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carproduct other = (Carproduct) obj;
		return Objects.equals(CarModel, other.CarModel) && Objects.equals(CarType, other.CarType)
				&& Objects.equals(Car_id, other.Car_id) && Objects.equals(Car_name, other.Car_name)
				&& Objects.equals(fuelType, other.fuelType) && price == other.price;
	}
	public Carproduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carproduct(String car_id, String car_name, String fuelType, String carModel, String carType, long price) {
		super();
		this.Car_id = car_id;
		this.Car_name = car_name;
		this.fuelType = fuelType;
		this.CarModel = carModel;
		this.CarType = carType;
		this.price = price;
	}
	public String getCar_id() {
		return Car_id;
	}
	public void setCar_id(String car_id) {
		Car_id = car_id;
	}
	public String getCar_name() {
		return Car_name;
	}
	public void setCar_name(String car_name) {
		this.Car_name = car_name;
	}
	public String getFuelType() {
		return fuelType;
	}
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	public Carproduct(String car_id, long price) {
		super();
		Car_id = car_id;
		this.price = price;
	}
	public Carproduct(String car_id) {
		super();
		Car_id = car_id;
	}
	public String getCarModel() {
		return CarModel;
	}
	public void setCarModel(String carModel) {
		this.CarModel = carModel;
	}
	public String getCarType() {
		return CarType;
	}
	public void setCarType(String carType) {
		CarType = carType;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
}

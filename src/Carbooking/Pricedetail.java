package Carbooking;

import java.util.Objects;

public class Pricedetail {
	 private  String car_id;
		private String car_name;
		 private int Exshowroomprice;
			private int onroadprice;
			 private int roadtax;
			 private int insurance;
			public Pricedetail(String car_id, String car_name, int exshowroomprice, int onroadprice, int roadtax,
					int insurance) {
				super();
				this.car_id = car_id;
				this.car_name = car_name;
				Exshowroomprice = exshowroomprice;
				this.onroadprice = onroadprice;
				this.roadtax = roadtax;
				this.insurance = insurance;
			}
			public Pricedetail() {
				super();
				// TODO Auto-generated constructor stub
			}
			public String getCar_id() {
				return car_id;
			}
			public void setCar_id(String car_id) {
				this.car_id = car_id;
			}
			public String getCar_name() {
				return car_name;
			}
			public void setCar_name(String car_name) {
				this.car_name = car_name;
			}
			public int getExshowroomprice() {
				return Exshowroomprice;
			}
			public void setExshowroomprice(int exshowroomprice) {
				Exshowroomprice = exshowroomprice;
			}
			public int getOnroadprice() {
				return onroadprice;
			}
			public void setOnroadprice(int onroadprice) {
				this.onroadprice = onroadprice;
			}
			public int getRoadtax() {
				return roadtax;
			}
			public void setRoadtax(int roadtax) {
				this.roadtax = roadtax;
			}
			public int getInsurance() {
				return insurance;
			}
			public void setInsurance(int insurance) {
				this.insurance = insurance;
			}
			@Override
			public int hashCode() {
				return Objects.hash(Exshowroomprice, car_id, car_name, insurance, onroadprice, roadtax);
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Pricedetail other = (Pricedetail) obj;
				return Exshowroomprice == other.Exshowroomprice && Objects.equals(car_id, other.car_id)
						&& Objects.equals(car_name, other.car_name) && insurance == other.insurance
						&& onroadprice == other.onroadprice && roadtax == other.roadtax;
			}
			@Override
			public String toString() {
				return "Pricedetail [car_id=" + car_id + ", car_name=" + car_name + ", Exshowroomprice="
						+ Exshowroomprice + ", onroadprice=" + onroadprice + ", roadtax=" + roadtax + ", insurance="
						+ insurance + "]";
			}
			public Pricedetail(String car_id, String car_name, int exshowroomprice, int roadtax, int insurance) {
				super();
				this.car_id = car_id;
				this.car_name = car_name;
				this.Exshowroomprice = exshowroomprice;
				this.roadtax = roadtax;
				this.insurance = insurance;
			}
			
			public Pricedetail(String car_id) {
				super();
				this.car_id = car_id;
			}
			public Pricedetail(String car_id, int exshowroomprice) {
				super();
				this.car_id = car_id;
				this.Exshowroomprice = exshowroomprice;
			}
		
	



}

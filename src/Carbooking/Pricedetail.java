package Carbooking;

import java.util.Objects;

public class Pricedetail {
	 private  String car_id;
		private String car_name;
		 private String Exshowroomprice;
			private int onroadprice;
			 private String roadtax;
			 private int insurance;
		 @Override
		public String toString() {
			return "Pricedetail [car_id=" + car_id + ", car_name=" + car_name + ", Exshowroomprice=" + Exshowroomprice
					+ ", onroadprice=" + onroadprice + ", roadtax=" + roadtax + ", insurance=" + insurance + "]";
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
			return Objects.equals(Exshowroomprice, other.Exshowroomprice) && Objects.equals(car_id, other.car_id)
					&& Objects.equals(car_name, other.car_name) && insurance == other.insurance
					&& onroadprice == other.onroadprice && Objects.equals(roadtax, other.roadtax);
		}
		public Pricedetail(String car_id, String car_name, String exshowroomprice, int onroadprice, String roadtax,
				int insurance) {
			super();
			this.car_id = car_id;
			this.car_name = car_name;
			Exshowroomprice = exshowroomprice;
			this.onroadprice = onroadprice;
			this.roadtax = roadtax;
			this.insurance = insurance;
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
		public String getExshowroomprice() {
			return Exshowroomprice;
		}
		public void setExshowroomprice(String exshowroomprice) {
			Exshowroomprice = exshowroomprice;
		}
		public int getOnroadprice() {
			return onroadprice;
		}
		public void setOnroadprice(int onroadprice) {
			this.onroadprice = onroadprice;
		}
		public String getRoadtax() {
			return roadtax;
		}
		public void setRoadtax(String roadtax) {
			this.roadtax = roadtax;
		}
		public int getInsurance() {
			return insurance;
		}
		public void setInsurance(int insurance) {
			this.insurance = insurance;
		}



}

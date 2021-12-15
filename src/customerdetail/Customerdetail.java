package customerdetail;

public class Customerdetail {

	private  String customer_id;
	 private String login_id;
	 private String customer_name;
	private long phone;
	 private String email;
	 private String address;
	 public Customerdetail(String customer_id, long phone) {
			super();
			this.customer_id = customer_id;
			this.phone = phone;
		}
	public Customerdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customerdetail(String customer_id, String login_id, String customer_name, long phone, String email,
			String address) {
		super();
		this.customer_id = customer_id;
		this.login_id = login_id;
		this.customer_name = customer_name;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

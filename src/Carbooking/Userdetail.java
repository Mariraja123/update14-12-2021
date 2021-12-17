package Carbooking;

public class Userdetail {

	public Userdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userdetail(String cpassword, String email) {
		super();
		this.cpassword = cpassword;
		Email = email;
	}
	public Userdetail(String first_name, String cpassword, String email, Long phoneno) {
		super();
		this.first_name = first_name;
		this.cpassword = cpassword;
		this.Email = email;
		this.phoneno = phoneno;
	
	}
	private String first_name;
	private String cpassword;
	private String Email;
	private Long phoneno;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	
	
}

package Carbooking;

import java.util.Objects;

public class Userdetail {
	private int userId;
	private String first_name;
	private String cpassword;
	private String Email;
	private Long phoneno;

	public Userdetail(String cpassword, String email) {
		super();
		this.cpassword = cpassword;
		Email = email;
	}
	@Override
	public String toString() {
		return "Userdetail [userId=" + userId + ", first_name=" + first_name + ", cpassword=" + cpassword + ", Email="
				+ Email + ", phoneno=" + phoneno + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Email, cpassword, first_name, phoneno, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Userdetail other = (Userdetail) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(cpassword, other.cpassword)
				&& Objects.equals(first_name, other.first_name) && Objects.equals(phoneno, other.phoneno)
				&& userId == other.userId;
	}

	public Userdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userdetail(int userId, String first_name, String cpassword, String email, Long phoneno) {
		super();
		this.userId = userId;
		this.first_name = first_name;
		this.cpassword = cpassword;
		Email = email;
		this.phoneno = phoneno;
	}
	public int getUserId() {
		return userId;
	}
	public Userdetail(int userId, String cpassword) {
		super();
		this.userId = userId;
		this.cpassword = cpassword;
	}
	public Userdetail(int userId) {
		super();
		this.userId = userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
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

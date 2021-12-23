package com.Carbookingpojo;

import java.util.Objects;

public class Admin {

	private String Email;
	private String password;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String email, String password) {
		super();
		Email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [Email=" + Email + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Email, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(password, other.password);
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

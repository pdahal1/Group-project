package CisGroupProject;

import java.util.Scanner;

public class User {
	private String FirstName;
	private String LastName;
	private String Address;
	private String ZipCode;
	private String State;
	private String Password;
	private String email;
	private int SSN;
	private String AccountType;
	private String SecurityQuestion1;
	private String SecurityAnswer1;
	private String SecurityQuesion2;
	private String SecurityAnswer2;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public String getSecurityQuestion1() {
		return SecurityQuestion1;
	}
	public void setSecurityQuestion1(String securityQuestion1) {
		SecurityQuestion1 = securityQuestion1;
	}
	public String getSecurityQuesion2() {
		return SecurityQuesion2;
	}
	public void setSecurityQuesion2(String securityQuesion2) {
		SecurityQuesion2 = securityQuesion2;
	}
	
	

}

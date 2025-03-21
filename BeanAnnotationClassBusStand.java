package com.entity;

import org.springframework.beans.factory.annotation.Value;

public class BeanAnnotationClassBusStand {

	@Value("3")
	private int sr;
	@Value("Pranita Subhash Biradar")
	private String fullname;
	@Value("pranitabiradar1515@gmail.com")
	private String emailaddress;
	@Value("Latur")
	private String city;
	@Value("18/11/2004")
	private String dateofBirth;
	@Value("Female")
	private String gender;
	@Value("Dhanegaon")
	private String address;
	@Value("India")
	private String country;
	@Value("413519")
	private int pincode;
	@Value("Pranita@123")
	private String password;
	@Value("Pranita@123")
	private String confirm_password;
	@Value("pranitabiradar")
	private String username;
	public int getSr() {
		return sr;
	}
	public void setSr(int sr) {
		this.sr = sr;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "BeanAnnotationClassBusStand [sr=" + sr + ", fullname=" + fullname + ", emailaddress=" + emailaddress
				+ ", city=" + city + ", dateofBirth=" + dateofBirth + ", gender=" + gender + ", address=" + address
				+ ", country=" + country + ", pincode=" + pincode + ", password=" + password + ", confirm_password="
				+ confirm_password + ", username=" + username + "]";
	}
	
	
}

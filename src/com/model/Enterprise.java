package com.model;

public class Enterprise {

	private String gstn;
	private String enterpriseName;
	private String spoke;
	private String address;	
	private String phone;
	private String emailId;
	public String getGstn() {
		return gstn;
	}
	public void setGstn(String gstn) {
		this.gstn = gstn;
	}
	public String getEnterpriseName() {
		return enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public String getSpoke() {
		return spoke;
	}
	public void setSpoke(String spoke) {
		this.spoke = spoke;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Enterprise [gstn=" + gstn + ", enterpriseName=" + enterpriseName + ", spoke=" + spoke + ", address="
				+ address + ", phone=" + phone + ", emailId=" + emailId + "]";
	}
	

}

package com.sspuiur.model;

// Generated Mar 27, 2016 10:45:43 AM by Hibernate Tools 4.0.0

/**
 * SspuIurUniversityTeacher generated by hbm2java
 */
public class SspuIurUniversityTeacher implements java.io.Serializable {

	private Integer id;
	private Integer UId;
	private String name;
	private String englishName;
	private Byte sex;
	private String department;
	private String title;
	private String position;
	private String phoneNumber1;
	private String phoneNumber2;
	private String qq;
	private String mail;
	private String officeLocation;
	private Byte status;

	public SspuIurUniversityTeacher() {
	}

	public SspuIurUniversityTeacher(Integer UId, String name,
			String englishName, Byte sex, String department, String title,
			String position, String phoneNumber1, String phoneNumber2,
			String qq, String mail, String officeLocation, Byte status) {
		this.UId = UId;
		this.name = name;
		this.englishName = englishName;
		this.sex = sex;
		this.department = department;
		this.title = title;
		this.position = position;
		this.phoneNumber1 = phoneNumber1;
		this.phoneNumber2 = phoneNumber2;
		this.qq = qq;
		this.mail = mail;
		this.officeLocation = officeLocation;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnglishName() {
		return this.englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public Byte getSex() {
		return this.sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPhoneNumber1() {
		return this.phoneNumber1;
	}

	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	public String getPhoneNumber2() {
		return this.phoneNumber2;
	}

	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getOfficeLocation() {
		return this.officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

}

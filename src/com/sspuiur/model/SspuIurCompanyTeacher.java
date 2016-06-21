package com.sspuiur.model;

// Generated Mar 27, 2016 10:45:43 AM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * SspuIurCompanyTeacher generated by hbm2java
 */
public class SspuIurCompanyTeacher implements java.io.Serializable {

	private Integer id;
	private int CId;
	private String name;
	private String englishName;
	private Byte sex;
	private String position;
	private String department;
	private String superiorName;
	private Date hiredate;
	private String mail;
	private String qq;
	private String phoneNumber1;
	private String phoneNumber2;
	private Byte status;

	public SspuIurCompanyTeacher() {
	}

	public SspuIurCompanyTeacher(int CId) {
		this.CId = CId;
	}

	public SspuIurCompanyTeacher(int CId, String name, String englishName,
			Byte sex, String position, String department, String superiorName,
			Date hiredate, String mail, String qq, String phoneNumber1,
			String phoneNumber2, Byte status) {
		this.CId = CId;
		this.name = name;
		this.englishName = englishName;
		this.sex = sex;
		this.position = position;
		this.department = department;
		this.superiorName = superiorName;
		this.hiredate = hiredate;
		this.mail = mail;
		this.qq = qq;
		this.phoneNumber1 = phoneNumber1;
		this.phoneNumber2 = phoneNumber2;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCId() {
		return this.CId;
	}

	public void setCId(int CId) {
		this.CId = CId;
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

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSuperiorName() {
		return this.superiorName;
	}

	public void setSuperiorName(String superiorName) {
		this.superiorName = superiorName;
	}

	public Date getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
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

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

}

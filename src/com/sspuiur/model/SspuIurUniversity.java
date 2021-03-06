package com.sspuiur.model;

// Generated Mar 27, 2016 10:45:43 AM by Hibernate Tools 4.0.0

/**
 * SspuIurUniversity generated by hbm2java
 */
public class SspuIurUniversity implements java.io.Serializable {

	private Integer id;
	private String name;
	private String englishName;
	private String type;
	private String property;
	private String category;
	private String adminDepartment;
	private String address;
	private String website;
	private Byte satsus;

	public SspuIurUniversity() {
	}

	public SspuIurUniversity(String name, String englishName, String type,
			String property, String category, String adminDepartment,
			String address, String website, Byte satsus) {
		this.name = name;
		this.englishName = englishName;
		this.type = type;
		this.property = property;
		this.category = category;
		this.adminDepartment = adminDepartment;
		this.address = address;
		this.website = website;
		this.satsus = satsus;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAdminDepartment() {
		return this.adminDepartment;
	}

	public void setAdminDepartment(String adminDepartment) {
		this.adminDepartment = adminDepartment;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Byte getSatsus() {
		return this.satsus;
	}

	public void setSatsus(Byte satsus) {
		this.satsus = satsus;
	}

}

package com.sspuiur.model;

// Generated Mar 27, 2016 10:45:43 AM by Hibernate Tools 4.0.0

/**
 * SspuIurStudentInformation generated by hbm2java
 */
public class SspuIurStudentInformation implements java.io.Serializable {

	private Integer id;
	private int SId;
	private String class_;
	private String classPostion;
	private String politicalStatus;
	private String nationality;
	private String nativePlace;
	private String major;
	private String degree;
	private String notes;
	private String jobIntention;
	private String briefIntroduction;
	private String skills;
	private String languageCertification;
	private String department;

	public SspuIurStudentInformation() {
	}

	public SspuIurStudentInformation(int SId) {
		this.SId = SId;
	}

	public SspuIurStudentInformation(int SId, String class_,
			String classPostion, String politicalStatus, String nationality,
			String nativePlace, String major, String degree, String notes,
			String jobIntention, String briefIntroduction, String skills,
			String languageCertification, String department) {
		this.SId = SId;
		this.class_ = class_;
		this.classPostion = classPostion;
		this.politicalStatus = politicalStatus;
		this.nationality = nationality;
		this.nativePlace = nativePlace;
		this.major = major;
		this.degree = degree;
		this.notes = notes;
		this.jobIntention = jobIntention;
		this.briefIntroduction = briefIntroduction;
		this.skills = skills;
		this.languageCertification = languageCertification;
		this.department = department;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getSId() {
		return this.SId;
	}

	public void setSId(int SId) {
		this.SId = SId;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getClassPostion() {
		return this.classPostion;
	}

	public void setClassPostion(String classPostion) {
		this.classPostion = classPostion;
	}

	public String getPoliticalStatus() {
		return this.politicalStatus;
	}

	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNativePlace() {
		return this.nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getJobIntention() {
		return this.jobIntention;
	}

	public void setJobIntention(String jobIntention) {
		this.jobIntention = jobIntention;
	}

	public String getBriefIntroduction() {
		return this.briefIntroduction;
	}

	public void setBriefIntroduction(String briefIntroduction) {
		this.briefIntroduction = briefIntroduction;
	}

	public String getSkills() {
		return this.skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getLanguageCertification() {
		return this.languageCertification;
	}

	public void setLanguageCertification(String languageCertification) {
		this.languageCertification = languageCertification;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}

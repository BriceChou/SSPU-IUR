package com.sspuiur.model;

// Generated Mar 27, 2016 10:45:43 AM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * SspuIurPositionAttendance generated by hbm2java
 */
public class SspuIurPositionAttendance implements java.io.Serializable {

	private Long id;
	private int PId;
	private int SId;
	private Date signIn;
	private Date signOut;
	private Integer workHours;

	public SspuIurPositionAttendance() {
	}

	public SspuIurPositionAttendance(int PId, int SId) {
		this.PId = PId;
		this.SId = SId;
	}

	public SspuIurPositionAttendance(int PId, int SId, Date signIn,
			Date signOut, Integer workHours) {
		this.PId = PId;
		this.SId = SId;
		this.signIn = signIn;
		this.signOut = signOut;
		this.workHours = workHours;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPId() {
		return this.PId;
	}

	public void setPId(int PId) {
		this.PId = PId;
	}

	public int getSId() {
		return this.SId;
	}

	public void setSId(int SId) {
		this.SId = SId;
	}

	public Date getSignIn() {
		return this.signIn;
	}

	public void setSignIn(Date signIn) {
		this.signIn = signIn;
	}

	public Date getSignOut() {
		return this.signOut;
	}

	public void setSignOut(Date signOut) {
		this.signOut = signOut;
	}

	public Integer getWorkHours() {
		return this.workHours;
	}

	public void setWorkHours(Integer workHours) {
		this.workHours = workHours;
	}

}

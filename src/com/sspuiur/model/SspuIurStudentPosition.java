package com.sspuiur.model;

// Generated Mar 27, 2016 10:45:43 AM by Hibernate Tools 4.0.0

/**
 * SspuIurStudentPosition generated by hbm2java
 */
public class SspuIurStudentPosition implements java.io.Serializable {

	private Integer id;
	private Integer SId;
	private Integer PId;
	private Integer utId;
	private Integer ctId;
	private Byte status;

	public SspuIurStudentPosition() {
	}

	public SspuIurStudentPosition(Integer SId, Integer PId, Integer utId,
			Integer ctId, Byte status) {
		this.SId = SId;
		this.PId = PId;
		this.utId = utId;
		this.ctId = ctId;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public Integer getPId() {
		return this.PId;
	}

	public void setPId(Integer PId) {
		this.PId = PId;
	}

	public Integer getUtId() {
		return this.utId;
	}

	public void setUtId(Integer utId) {
		this.utId = utId;
	}

	public Integer getCtId() {
		return this.ctId;
	}

	public void setCtId(Integer ctId) {
		this.ctId = ctId;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

}

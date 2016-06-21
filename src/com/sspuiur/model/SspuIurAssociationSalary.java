package com.sspuiur.model;

// Generated Mar 27, 2016 10:45:43 AM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * SspuIurAssociationSalary generated by hbm2java
 */
public class SspuIurAssociationSalary implements java.io.Serializable {

	private Integer id;
	private SspuIurPositionSalary sspuIurPositionSalary;
	private int SId;
	private Double actualSalary;
	private Double receivedSalary;
	private Date receivedTime;
	private Date payTime;
	private String paymentVoucher;
	private Byte payStatus;

	public SspuIurAssociationSalary() {
	}

	public SspuIurAssociationSalary(
			SspuIurPositionSalary sspuIurPositionSalary, int SId) {
		this.sspuIurPositionSalary = sspuIurPositionSalary;
		this.SId = SId;
	}

	public SspuIurAssociationSalary(
			SspuIurPositionSalary sspuIurPositionSalary, int SId,
			Double actualSalary, Double receivedSalary, Date receivedTime,
			Date payTime, String paymentVoucher, Byte payStatus) {
		this.sspuIurPositionSalary = sspuIurPositionSalary;
		this.SId = SId;
		this.actualSalary = actualSalary;
		this.receivedSalary = receivedSalary;
		this.receivedTime = receivedTime;
		this.payTime = payTime;
		this.paymentVoucher = paymentVoucher;
		this.payStatus = payStatus;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SspuIurPositionSalary getSspuIurPositionSalary() {
		return this.sspuIurPositionSalary;
	}

	public void setSspuIurPositionSalary(
			SspuIurPositionSalary sspuIurPositionSalary) {
		this.sspuIurPositionSalary = sspuIurPositionSalary;
	}

	public int getSId() {
		return this.SId;
	}

	public void setSId(int SId) {
		this.SId = SId;
	}

	public Double getActualSalary() {
		return this.actualSalary;
	}

	public void setActualSalary(Double actualSalary) {
		this.actualSalary = actualSalary;
	}

	public Double getReceivedSalary() {
		return this.receivedSalary;
	}

	public void setReceivedSalary(Double receivedSalary) {
		this.receivedSalary = receivedSalary;
	}

	public Date getReceivedTime() {
		return this.receivedTime;
	}

	public void setReceivedTime(Date receivedTime) {
		this.receivedTime = receivedTime;
	}

	public Date getPayTime() {
		return this.payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPaymentVoucher() {
		return this.paymentVoucher;
	}

	public void setPaymentVoucher(String paymentVoucher) {
		this.paymentVoucher = paymentVoucher;
	}

	public Byte getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(Byte payStatus) {
		this.payStatus = payStatus;
	}

}
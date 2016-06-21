package com.sspuiur.model;

// Generated Mar 27, 2016 10:45:43 AM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SspuIurPayCheck generated by hbm2java
 */
public class SspuIurPayCheck implements java.io.Serializable {

	private Integer id;
	private Date payTime;
	private String payor;
	private String payee;
	private String paymentVoucher;
	private Set sspuIurPositionSalaries = new HashSet(0);

	public SspuIurPayCheck() {
	}

	public SspuIurPayCheck(Date payTime, String payor, String payee,
			String paymentVoucher, Set sspuIurPositionSalaries) {
		this.payTime = payTime;
		this.payor = payor;
		this.payee = payee;
		this.paymentVoucher = paymentVoucher;
		this.sspuIurPositionSalaries = sspuIurPositionSalaries;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getPayTime() {
		return this.payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPayor() {
		return this.payor;
	}

	public void setPayor(String payor) {
		this.payor = payor;
	}

	public String getPayee() {
		return this.payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getPaymentVoucher() {
		return this.paymentVoucher;
	}

	public void setPaymentVoucher(String paymentVoucher) {
		this.paymentVoucher = paymentVoucher;
	}

	public Set getSspuIurPositionSalaries() {
		return this.sspuIurPositionSalaries;
	}

	public void setSspuIurPositionSalaries(Set sspuIurPositionSalaries) {
		this.sspuIurPositionSalaries = sspuIurPositionSalaries;
	}

}
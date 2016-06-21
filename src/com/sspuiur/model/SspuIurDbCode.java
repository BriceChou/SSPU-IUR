package com.sspuiur.model;

// Generated Mar 27, 2016 10:45:43 AM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * SspuIurDbCode generated by hbm2java
 */
public class SspuIurDbCode implements java.io.Serializable {

	private Integer id;
	private Byte codeNumber;
	private String codeField;
	private String codeName;
	private Byte status;
	private Set sspuIurDbTables = new HashSet(0);

	public SspuIurDbCode() {
	}

	public SspuIurDbCode(Byte codeNumber, String codeField, String codeName,
			Byte status, Set sspuIurDbTables) {
		this.codeNumber = codeNumber;
		this.codeField = codeField;
		this.codeName = codeName;
		this.status = status;
		this.sspuIurDbTables = sspuIurDbTables;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Byte getCodeNumber() {
		return this.codeNumber;
	}

	public void setCodeNumber(Byte codeNumber) {
		this.codeNumber = codeNumber;
	}

	public String getCodeField() {
		return this.codeField;
	}

	public void setCodeField(String codeField) {
		this.codeField = codeField;
	}

	public String getCodeName() {
		return this.codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Set getSspuIurDbTables() {
		return this.sspuIurDbTables;
	}

	public void setSspuIurDbTables(Set sspuIurDbTables) {
		this.sspuIurDbTables = sspuIurDbTables;
	}

}

package com.sspuiur.model;

// Generated Mar 27, 2016 10:45:43 AM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * SspuIurMenuPath generated by hbm2java
 */
public class SspuIurMenuPath implements java.io.Serializable {

	private Integer id;
	private String name;
	private String description;
	private String path;
	private Byte orderSeq;
	private Integer parentId;
	private Byte menuLevel;
	private Byte status;
	private Set sspuIurMenus = new HashSet(0);

	public SspuIurMenuPath() {
	}

	public SspuIurMenuPath(String name, String description, String path,
			Byte orderSeq, Integer parentId, Byte menuLevel, Byte status,
			Set sspuIurMenus) {
		this.name = name;
		this.description = description;
		this.path = path;
		this.orderSeq = orderSeq;
		this.parentId = parentId;
		this.menuLevel = menuLevel;
		this.status = status;
		this.sspuIurMenus = sspuIurMenus;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Byte getOrderSeq() {
		return this.orderSeq;
	}

	public void setOrderSeq(Byte orderSeq) {
		this.orderSeq = orderSeq;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Byte getMenuLevel() {
		return this.menuLevel;
	}

	public void setMenuLevel(Byte menuLevel) {
		this.menuLevel = menuLevel;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Set getSspuIurMenus() {
		return this.sspuIurMenus;
	}

	public void setSspuIurMenus(Set sspuIurMenus) {
		this.sspuIurMenus = sspuIurMenus;
	}

}

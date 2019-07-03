package com.brianblosser.dialogapi.dialog;

import com.brianblosser.dialogapi.core.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Dialog extends BaseEntity {
	private String name;
	private String roles;
	private String lines;

	public Dialog() {
		super();
	}

	public Dialog(String name, String roles, String lines) {
		this();
		this.name = name;
		this.roles = roles;
		this.lines = lines;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getLines() {
		return lines;
	}

	public void setLines(String lines) {
		this.lines = lines;
	}
}

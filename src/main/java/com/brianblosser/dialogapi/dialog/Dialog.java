package com.brianblosser.dialogapi.dialog;

import com.brianblosser.dialogapi.core.BaseEntity;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Dialog extends BaseEntity {
	private String name;
	private ArrayList<String> roles;
	private ArrayList<String> lines;

	public Dialog() {
		super();
	}

	public Dialog(String name, ArrayList<String> roles, ArrayList<String> lines) {
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

	public ArrayList<String> getRoles() {
		return roles;
	}

	public void setRoles(ArrayList<String> roles) {
		this.roles = roles;
	}

	public ArrayList<String> getLines() {
		return lines;
	}

	public void setLines(ArrayList<String> lines) {
		this.lines = lines;
	}
}

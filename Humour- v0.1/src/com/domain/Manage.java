package com.domain;

import java.io.Serializable;

//管理员
public class Manage implements Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int id;
  private String name;
  private String password;
  public int getId() {
	return id;
  }
  public void setId(int id) {
	this.id = id;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
  }
  public void setPassword(String password) {
	this.password = password;
  } 
}

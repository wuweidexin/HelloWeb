package com.excellence.springboot.model;

public class UserStatTotal {
	private String wbNetworkId;
	private String longNumber;
	private String parentId;
	private String longName;
	private int totalUser;
	private int activeUser;
	public String getWbNetworkId() {
		return wbNetworkId;
	}
	public void setWbNetworkId(String wbNetworkId) {
		this.wbNetworkId = wbNetworkId;
	}
	public String getLongNumber() {
		return longNumber;
	}
	public void setLongNumber(String longNumber) {
		this.longNumber = longNumber;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public int getTotalUser() {
		return totalUser;
	}
	public void setTotalUser(int totalUser) {
		this.totalUser = totalUser;
	}
	public int getActiveUser() {
		return activeUser;
	}
	public void setActiveUser(int activeUser) {
		this.activeUser = activeUser;
	}
	
	
}

package com.excellence.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "t_user_stat_total")  
public class UserStatTotal implements java.io.Serializable{
	private UserStatTotalFK userStatTotalFK;
	
	private String wbNetworkId;
	
	private String longNumber;
	
	private String parentId;
	
	private String longName;

	private int totalUser;
	
	private int activeUser;
	
	public UserStatTotal() {
		super();
	}
	
	public UserStatTotal(UserStatTotalFK userStatTotalFK, String parentId, String longName, int totalUser,
			int activeUser) {
		super();
		this.userStatTotalFK = userStatTotalFK;
		this.wbNetworkId = wbNetworkId;
		this.longNumber = longNumber;
		this.parentId = parentId;
		this.longName = longName;
		this.totalUser = totalUser;
		this.activeUser = activeUser;
	}
	/**
	 * 注意驼峰引起的列的问题.同时还需要注意数据库是否区分大小写
	 * 比如 
	 * 	parentId = parent_id
	 * 	parentid = parentid
	 * 
	 * @return
	 */
	@Column(name="parentid")
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	@Column(name="longname")
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	/**
	 * 暂时一个属性，不作为列
	 * @return
	 */
//	@Transient
	@Column(name="totaluser")
	public int getTotalUser() {
		return totalUser;
	}
	public void setTotalUser(int totalUser) {
		this.totalUser = totalUser;
	}
	@Column(name="activeuser")
	public int getActiveUser() {
		return activeUser;
	}
	public void setActiveUser(int activeUser) {
		this.activeUser = activeUser;
	}
	@Id
	public UserStatTotalFK getUserStatTotalFK() {
		return userStatTotalFK;
	}
	public void setUserStatTotalFK(UserStatTotalFK userStatTotalFK) {
		this.userStatTotalFK = userStatTotalFK;
	}
	@Transient
	public String getWbNetworkId() {
		return userStatTotalFK.getWbNetworkId();
	}

	public void setWbNetworkId(String wbNetworkId) {
		this.wbNetworkId = wbNetworkId;
	}
	@Transient
	public String getLongNumber() {
		return userStatTotalFK.getLongNumber();
	}

	public void setLongNumber(String longNumber) {
		this.longNumber = longNumber;
	}
	
	
}

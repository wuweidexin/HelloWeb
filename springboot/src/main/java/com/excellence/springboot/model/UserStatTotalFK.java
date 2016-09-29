package com.excellence.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 * 这个配置是，表示可嵌入式配置，可以用来作为复合主键的主键类等
 * @author chen
 *
 */
@Embeddable
public class UserStatTotalFK implements Serializable{
	private String wbNetworkId;
	private String longNumber;
	@Column(name="wbnetworkid")
	public String getWbNetworkId() {
		return wbNetworkId;
	}
	public void setWbNetworkId(String wbNetworkId) {
		this.wbNetworkId = wbNetworkId;
	}
	@Column(name="longnumber")
	public String getLongNumber() {
		return longNumber;
	}
	public void setLongNumber(String longNumber) {
		this.longNumber = longNumber;
	}
	//通用重新计算hashCode的方案
	/**
	    Google首席Java架构师Joshua Bloch在他的著作《Effective Java》中提出了一种简单通用的hashCode算法
		1. 初始化一个整形变量，为此变量赋予一个非零的常数值，比如int result = 17;
		2. 选取equals方法中用于比较的所有域，然后针对每个域的属性进行计算：
		  (1) 如果是boolean值，则计算f ? 1:0
		  (2) 如果是byte\char\short\int,则计算(int)f
		  (3) 如果是long值，则计算(int)(f ^ (f >>> 32))
		  (4) 如果是float值，则计算Float.floatToIntBits(f)
		  (5) 如果是double值，则计算Double.doubleToLongBits(f)，然后返回的结果是long,再用规则(3)去处理long,得到int
		  (6) 如果是对象应用，如果equals方法中采取递归调用的比较方式，那么hashCode中同样采取递归调用hashCode的方式。　　
		  	      否则需要为这个域计算一个范式，比如当这个域的值为null的时候，那么hashCode 值为0
		  (7) 如果是数组，那么需要为每个元素当做单独的域来处理。如果你使用的是1.5及以上版本的JDK，那么没必要自己去　　　　
		  	      重新遍历一遍数组，java.util.Arrays.hashCode方法包含了8种基本类型数组和引用数组的hashCode计算，算法同上，
		　　java.util.Arrays.hashCode(long[])的具体实现:
	 */
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + longNumber.hashCode();
		result = 31 * result + wbNetworkId.hashCode();
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof UserStatTotalFK)){
			return false;
		}
		UserStatTotalFK temp = (UserStatTotalFK)obj;
		if(null == temp.getLongNumber()) return false;
		if(null == temp.getWbNetworkId()) return false;
		return (this.getLongNumber().equals(temp.getLongNumber()) && this.getWbNetworkId().equals(temp.getWbNetworkId()));
	}
}

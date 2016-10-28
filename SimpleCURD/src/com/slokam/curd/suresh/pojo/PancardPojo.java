package com.slokam.curd.suresh.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pancarddetails")
public class PancardPojo {
	
	
	private int panId;
	
	private String pancardName;
	
	private String pancardAddress;
	@Id
	@GeneratedValue
	@Column(name="panid")
	public int getPanId() {
		return panId;
	}
	public void setPanId(int panId) {
		this.panId = panId;
	}
	@Column(name="pancardname")
	public String getPancardName() {
		return pancardName;
	}
	public void setPancardName(String pancardName) {
		this.pancardName = pancardName;
	}
	@Column(name="pancardaddress")
	public String getPancardAddress() {
		return pancardAddress;
	}
	public void setPancardAddress(String pancardAddress) {
		this.pancardAddress = pancardAddress;
	}
	

}

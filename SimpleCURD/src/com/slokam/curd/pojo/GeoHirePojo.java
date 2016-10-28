package com.slokam.curd.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Generated;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="geoHire")
public class GeoHirePojo {
	@Id
	@GeneratedValue
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column
	private String name;
	private String code;
	private String entity;
	private String status;
	@Transient
	private Integer countryId;
	@Transient
	private Integer stateId;
	
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	@Transient
	private MultipartFile multipart;
	
	public MultipartFile getMultipart() {
		return multipart;
	}
	public void setMultipart(MultipartFile multipart) {
		this.multipart = multipart;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}

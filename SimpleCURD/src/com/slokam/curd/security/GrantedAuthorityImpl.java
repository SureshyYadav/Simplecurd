package com.slokam.curd.security;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
@Entity
@Table(name="authority")
public class GrantedAuthorityImpl implements GrantedAuthority{
	private String authority;
	private Integer id;
	private List<UserDetailsImpl> users;
	@ManyToMany
	@JoinTable(name="user_authority",
	joinColumns={@JoinColumn(name="aid")},inverseJoinColumns={@JoinColumn(name="uid")})
	public List<UserDetailsImpl> getUsers() {
		return users;
	}
	public void setUsers(List<UserDetailsImpl> users) {
		this.users = users;
	}
	@Id
	@GeneratedValue
	@Column(name="aid")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	@Column(name="name")
	public String getAuthority() {
		
		return this.authority;
	}

}

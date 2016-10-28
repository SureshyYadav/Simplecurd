package com.slokam.curd.security;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
@Entity
@Table(name="userdetails")
public class UserDetailsImpl implements UserDetails {
	private Integer id;
	@Id
	@GeneratedValue
	@Column(name="uid")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String password;
	private String username;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	private boolean credentialsNonExpired;
	private boolean enabled;
	
	private List<GrantedAuthorityImpl> authorities;
	@ManyToMany
    @JoinTable(name="user_authority",
	joinColumns={@JoinColumn(name="uid")},inverseJoinColumns={@JoinColumn(name="aid")})
	public Collection<GrantedAuthorityImpl> getAuthorities() {
		
		return authorities;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setAuthorities(Collection<GrantedAuthorityImpl> authorities2) {
		this.authorities = (List<GrantedAuthorityImpl>) authorities2;
	}
	@Column(name="password")
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}
	@Column(name="username")
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}
	@Column(name="accountNonExpired")
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Column(name="accountNonLocked")
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Column(name="credentialsNonExpired")
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Column(name="enabled")
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}

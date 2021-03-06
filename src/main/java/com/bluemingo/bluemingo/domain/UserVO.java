package com.bluemingo.bluemingo.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserVO implements UserDetails{
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private Integer user_key;
	private String user_id;
	private String user_password;
	private String user_name;
	private String user_phone;
	private Integer product_key;
	private Integer res_type;
	
	private String role_name;
	
	private List<RoleVO> authorities; // 권한 목록 -spring security 관리
	
	public UserVO(){
		authorities = new ArrayList<RoleVO>();
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return this.authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.user_password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.user_id;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public Integer getUser_key() {
		return user_key;
	}

	public void setUser_key(Integer user_key) {
		this.user_key = user_key;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		
		this.user_id = user_id;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setAuthorities(List<RoleVO> roles) {
		this.authorities = roles;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
		authorities.add(new RoleVO(role_name));
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public Integer getProduct_key() {
		return product_key;
	}

	public void setProduct_key(Integer product_key) {
		this.product_key = product_key;
	}

	public Integer getRes_type() {
		return res_type;
	}

	public void setRes_type(Integer res_type) {
		this.res_type = res_type;
	}

	
}

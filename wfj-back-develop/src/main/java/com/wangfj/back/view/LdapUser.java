/**
 * @Probject Name: shopin-back-demo
 * @Path: com.wangfj.back.viewLdapUser.java
 * @Create By chengsj
 * @Create In 2013-5-10 下午5:08:33
 * TODO
 */
package com.wangfj.back.view;

import java.io.Serializable;

/**
 * @Class Name LdapUser
 * @Author chengsj
 * @Create In 2013-5-10
 */
public class LdapUser implements Serializable{
	
	private String username;//uac username
	private String password;//uac password
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LdapUser :{username:'" + username + "', password:'" + password
				+ "}";
	}
	
	

}

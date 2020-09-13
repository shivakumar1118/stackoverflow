package com.shiva.stack;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Owner implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer reputation;
	private Integer user_id;
	private String user_type;
	private String profile_image;
	private String display_name;
	private String link;
	private Integer accept_rate;
	
	
	public Integer getAccept_rate() {
		return accept_rate;
	}
	public void setAccept_rate(Integer accept_rate) {
		this.accept_rate = accept_rate;
	}
	public Integer getReputation() {
		return reputation;
	}
	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getProfile_image() {
		return profile_image;
	}
	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Owner [reputation=" + reputation + ", user_id=" + user_id + ", user_type=" + user_type
				+ ", profile_image=" + profile_image + ", display_name=" + display_name + ", link=" + link + "]";
	}
}

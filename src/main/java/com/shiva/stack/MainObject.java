package com.shiva.stack;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MainObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Items> items;
	
	private boolean has_more;
	
	private Integer quota_max;
	
	private Integer quota_remaining;

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public boolean isHas_more() {
		return has_more;
	}

	public void setHas_more(boolean has_more) {
		this.has_more = has_more;
	}

	public Integer getQuota_max() {
		return quota_max;
	}

	public void setQuota_max(Integer quota_max) {
		this.quota_max = quota_max;
	}

	public Integer getQuota_remaining() {
		return quota_remaining;
	}

	public void setQuota_remaining(Integer quota_remaining) {
		this.quota_remaining = quota_remaining;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "MainObject [items=" + items + ", has_more=" + has_more + ", quota_max=" + quota_max
				+ ", quota_remaining=" + quota_remaining + "]";
	}
	
}

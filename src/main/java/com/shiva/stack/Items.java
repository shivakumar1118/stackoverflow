package com.shiva.stack;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Items implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> tags;
	
	private boolean is_answered;
	
	private Integer view_count;
	
	private Integer accepted_answer_id;
	
	private Integer answer_count;
	
	private Integer score;
	
	private Date last_activity_date;
	
	private Date creation_date;
	
	private Integer question_id;
	
	private String content_license;
	
	private String link;
	
	private String title;
	
	private Date last_edit_date;
	
	public Date getLast_edit_date() {
		return last_edit_date;
	}

	public void setLast_edit_date(Date last_edit_date) {
		this.last_edit_date = last_edit_date;
	}

	private Owner owner;

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public boolean isIs_answered() {
		return is_answered;
	}

	public void setIs_answered(boolean is_answered) {
		this.is_answered = is_answered;
	}

	public Integer getView_count() {
		return view_count;
	}

	public void setView_count(Integer view_count) {
		this.view_count = view_count;
	}

	public Integer getAccepted_answer_id() {
		return accepted_answer_id;
	}

	public void setAccepted_answer_id(Integer accepted_answer_id) {
		this.accepted_answer_id = accepted_answer_id;
	}

	public Integer getAnswer_count() {
		return answer_count;
	}

	public void setAnswer_count(Integer answer_count) {
		this.answer_count = answer_count;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Date getLast_activity_date() {
		return last_activity_date;
	}

	public void setLast_activity_date(Date last_activity_date) {
		this.last_activity_date = last_activity_date;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public Integer getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Integer question_id) {
		this.question_id = question_id;
	}

	public String getContent_license() {
		return content_license;
	}

	public void setContent_license(String content_license) {
		this.content_license = content_license;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Title: "+title +"\n"+"URL: "+link +"\n"+"Author Display Name: "+owner.getDisplay_name()+"\n";
	}
	
}

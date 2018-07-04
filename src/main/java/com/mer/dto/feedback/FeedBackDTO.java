package com.mer.dto.feedback;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="feedbacktable")
public class FeedBackDTO {
	
	@Id
	@GenericGenerator(name="idGenerator",strategy="increment")
	@GeneratedValue(generator="idGenerator")
	private int id;
	private String userEmail;
	private String feedbackSubject;
	private String feedbackText;
	private String feedbackresponse;
	private boolean state;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date feedbackSubmitDate;
	public FeedBackDTO() {
	}
	public FeedBackDTO(int id, String userEmail, String feedbackSubject, String feedbackText) {
		super();
		this.id = id;
		this.userEmail = userEmail;
		this.feedbackSubject = feedbackSubject;
		this.feedbackText = feedbackText;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getFeedbackSubject() {
		return feedbackSubject;
	}
	public void setFeedbackSubject(String feedbackSubject) {
		this.feedbackSubject = feedbackSubject;
	}
	public String getFeedbackText() {
		return feedbackText;
	}
	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
	}
	public Date getFeedbackSubmitDate() {
		return feedbackSubmitDate;
	}
	public void setFeedbackSubmitDate(Date feedbackSubmitDate) {
		this.feedbackSubmitDate = feedbackSubmitDate;
	}
	public String getFeedbackresponse() {
		return feedbackresponse;
	}
	public void setFeedbackresponse(String feedbackresponse) {
		this.feedbackresponse = feedbackresponse;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "FeedBackDTO [id=" + id + ", userEmail=" + userEmail + ", feedbackSubject=" + feedbackSubject
				+ ", feedbackText=" + feedbackText + ", feedbackSubmitDate=" + feedbackSubmitDate + "]";
	}

}

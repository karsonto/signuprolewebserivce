package com.karson.webmagic.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SignupRule")
public class SignupRule {
	@Id
	private String id;
	private String carrier;
	private String applicationVersionStatus;
	private String group;
	private String identityType;
	private String identity;
	private Boolean regex;
	private String policy;
	private Long order;
	private String comments;
	private String updatedUser;
	private Long updatedTimestamp;
	private String createdUser;
	private Long createdTimestamp;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getApplicationVersionStatus() {
		return applicationVersionStatus;
	}
	public void setApplicationVersionStatus(String applicationVersionStatus) {
		this.applicationVersionStatus = applicationVersionStatus;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getIdentityType() {
		return identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public Boolean getRegex() {
		return regex;
	}
	public void setRegex(Boolean regex) {
		this.regex = regex;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}
	public Long getOrder() {
		return order;
	}
	public void setOrder(Long order) {
		this.order = order;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getUpdatedUser() {
		return updatedUser;
	}
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}
	public Long getUpdatedTimestamp() {
		return updatedTimestamp;
	}
	public void setUpdatedTimestamp(Long updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Long getCreatedTimestamp() {
		return createdTimestamp;
	}
	public void setCreatedTimestamp(Long createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	
	
	
}
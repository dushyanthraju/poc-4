package com.xml.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;

@Entity
@NamedNativeQuery(name = "Job.findByExperience", query = "SELECT * FROM job  WHERE experience = ?", resultClass = Job.class)
public class Job {
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "jobId")
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int jobId;

	private String jobTiltle;
	private String jobDescription;
	private String country;
	private String state;
	private String availability;
	private double replyRate;
	private double payRate;
	private double experiance;
	private String skills;
	private String language;
	private String jobType;
public Job() {
		
	}


	public Job(List<User> users, int jobId, String jobTiltle, String jobDescription, String country, String state,
			String availability, double replyRate, double payRate, double experiance, String skills, String language,
			String jobType) {
		super();
		this.users = users;
		this.jobId = jobId;
		this.jobTiltle = jobTiltle;
		this.jobDescription = jobDescription;
		this.country = country;
		this.state = state;
		this.availability = availability;
		this.replyRate = replyRate;
		this.payRate = payRate;
		this.experiance = experiance;
		this.skills = skills;
		this.language = language;
		this.jobType = jobType;
	}

	public String getJobTiltle() {
		return jobTiltle;
	}

	public void setJobTiltle(String jobTiltle) {
		this.jobTiltle = jobTiltle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public double getReplyRate() {
		return replyRate;
	}

	public void setReplyRate(double replyRate) {
		this.replyRate = replyRate;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public double getExperiance() {
		return experiance;
	}

	public void setExperiance(double experiance) {
		this.experiance = experiance;
	}

	public String getSkills() {
		return skills;
	}

	public List<User> getUser() {
		return users;
	}

	public void setUser(List<User> users) {
		this.users = users;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
}

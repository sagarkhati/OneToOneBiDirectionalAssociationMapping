package com.ssk.OneToOneBiDirectionalAssociationMapping.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String ppid;
	private String country;
	private Date issueDate;

	public Passport() {
		super();
	}

	public Passport(String ppid, String country, Date issueDate) {
		super();
		this.ppid = ppid;
		this.country = country;
		this.issueDate = issueDate;
	}

	public String getPpid() {
		return ppid;
	}

	public void setPpid(String ppid) {
		this.ppid = ppid;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
}

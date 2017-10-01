package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Patient {

	private String name;
	private String emailAddress;

	public Patient(final String name, final String emailAddress) {
		this.name = name;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return this.name;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setEmailAddress(final String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
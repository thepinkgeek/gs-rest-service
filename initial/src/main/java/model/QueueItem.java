package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueueItem {

	private Long position;
	private Patient patient;
	
	public QueueItem(final Long position, final Patient patient) {
		this.position = position;
		this.patient = patient;
		
	}

	public Long getPosition() {
		return this.position;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPosition(final Long position) {
		this.position = position;
	}

	public void setPatient(final Patient patient) {
		this.patient = patient;
	}
}
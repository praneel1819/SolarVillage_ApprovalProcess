package com.myspace.solarvillage_approvalprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SolarNewOrder implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Solar New order Permit Id unique")
	private java.lang.Long solarNewOrderPermitID;
	@org.kie.api.definition.type.Label(value = "Applicant Name")
	private java.lang.String applicantName;
	@org.kie.api.definition.type.Label(value = "Applicant Address")
	private java.lang.String applicantAddress;
	@org.kie.api.definition.type.Label(value = "HOA Meeting Scheduled Date")
	private java.util.Date HOAMeetingDate;
	@org.kie.api.definition.type.Label(value = "HOA Approved ?")
	private java.lang.Boolean isHOAApproved;
	@org.kie.api.definition.type.Label(value = "Did Sales Rep Accept")
	private java.lang.Boolean isSalesRepAccept;
	@org.kie.api.definition.type.Label(value = "Escalated to Executive")
	private java.lang.Boolean escalationToExec;
	@org.kie.api.definition.type.Label(value = "EscalationEmailSent")
	private java.lang.Boolean escalationEmailSent;

	public SolarNewOrder() {
	}

	public java.lang.Long getSolarNewOrderPermitID() {
		return this.solarNewOrderPermitID;
	}

	public void setSolarNewOrderPermitID(java.lang.Long solarNewOrderPermitID) {
		this.solarNewOrderPermitID = solarNewOrderPermitID;
	}

	public java.lang.String getApplicantName() {
		return this.applicantName;
	}

	public void setApplicantName(java.lang.String applicantName) {
		this.applicantName = applicantName;
	}

	public java.lang.String getApplicantAddress() {
		return this.applicantAddress;
	}

	public void setApplicantAddress(java.lang.String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public java.util.Date getHOAMeetingDate() {
		return this.HOAMeetingDate;
	}

	public void setHOAMeetingDate(java.util.Date HOAMeetingDate) {
		this.HOAMeetingDate = HOAMeetingDate;
	}

	public java.lang.Boolean getIsHOAApproved() {
		return this.isHOAApproved;
	}

	public void setIsHOAApproved(java.lang.Boolean isHOAApproved) {
		this.isHOAApproved = isHOAApproved;
	}

	public java.lang.Boolean getIsSalesRepAccept() {
		return this.isSalesRepAccept;
	}

	public void setIsSalesRepAccept(java.lang.Boolean isSalesRepAccept) {
		this.isSalesRepAccept = isSalesRepAccept;
	}

	public java.lang.Boolean getEscalationToExec() {
		return this.escalationToExec;
	}

	public void setEscalationToExec(java.lang.Boolean escalationToExec) {
		this.escalationToExec = escalationToExec;
	}

	public java.lang.Boolean getEscalationEmailSent() {
		return this.escalationEmailSent;
	}

	public void setEscalationEmailSent(java.lang.Boolean escalationEmailSent) {
		this.escalationEmailSent = escalationEmailSent;
	}

	public SolarNewOrder(java.lang.Long solarNewOrderPermitID,
			java.lang.String applicantName, java.lang.String applicantAddress,
			java.util.Date HOAMeetingDate, java.lang.Boolean isHOAApproved,
			java.lang.Boolean isSalesRepAccept,
			java.lang.Boolean escalationToExec,
			java.lang.Boolean escalationEmailSent) {
		this.solarNewOrderPermitID = solarNewOrderPermitID;
		this.applicantName = applicantName;
		this.applicantAddress = applicantAddress;
		this.HOAMeetingDate = HOAMeetingDate;
		this.isHOAApproved = isHOAApproved;
		this.isSalesRepAccept = isSalesRepAccept;
		this.escalationToExec = escalationToExec;
		this.escalationEmailSent = escalationEmailSent;
	}

}
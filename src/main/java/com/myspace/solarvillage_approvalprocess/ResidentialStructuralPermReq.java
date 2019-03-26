package com.myspace.solarvillage_approvalprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ResidentialStructuralPermReq implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Applicant Address")
	private java.lang.String applicantAddress;
	@org.kie.api.definition.type.Label(value = "Applicant Name")
	private java.lang.String applicantName;
	@org.kie.api.definition.type.Label(value = "Solar New Order Permit ID")
	private java.lang.Long solarNewOrderPermitID;

	public ResidentialStructuralPermReq() {
	}

	public java.lang.String getApplicantAddress() {
		return this.applicantAddress;
	}

	public void setApplicantAddress(java.lang.String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public java.lang.String getApplicantName() {
		return this.applicantName;
	}

	public void setApplicantName(java.lang.String applicantName) {
		this.applicantName = applicantName;
	}

	public java.lang.Long getSolarNewOrderPermitID() {
		return this.solarNewOrderPermitID;
	}

	public void setSolarNewOrderPermitID(java.lang.Long solarNewOrderPermitID) {
		this.solarNewOrderPermitID = solarNewOrderPermitID;
	}

	public ResidentialStructuralPermReq(java.lang.String applicantAddress,
			java.lang.String applicantName, java.lang.Long solarNewOrderPermitID) {
		this.applicantAddress = applicantAddress;
		this.applicantName = applicantName;
		this.solarNewOrderPermitID = solarNewOrderPermitID;
	}

}
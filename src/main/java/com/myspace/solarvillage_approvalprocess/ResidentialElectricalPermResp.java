package com.myspace.solarvillage_approvalprocess;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ResidentialElectricalPermResp implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Electrical Permit ID")
	private java.lang.Long elecPermitId;
	@org.kie.api.definition.type.Label(value = "Status of the permit")
	private java.lang.String status;

	public ResidentialElectricalPermResp() {
	}

	public java.lang.Long getElecPermitId() {
		return this.elecPermitId;
	}

	public void setElecPermitId(java.lang.Long elecPermitId) {
		this.elecPermitId = elecPermitId;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public ResidentialElectricalPermResp(java.lang.Long elecPermitId,
			java.lang.String status) {
		this.elecPermitId = elecPermitId;
		this.status = status;
	}

}
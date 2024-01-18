package com.test1;

public class ElasticComputeCloud {
	private long serviceCode;
	private String infrastructureAsService;
	private String virtualMachine;
	private String virtualDrive;
	private String driveData;
	private String loadDistribution;
	private String upScale;
	private String downScale;
	private String autoScale;

	public ElasticComputeCloud() {

	}

	public ElasticComputeCloud(long serviceCode, String infrastructureAsService, String virtualMachine,
			String virtualDrive, String driveData, String loadDistribution, String upScale, String downScale,
			String autoScale) {
		super();
		this.serviceCode = serviceCode;
		this.infrastructureAsService = infrastructureAsService;
		this.virtualMachine = virtualMachine;
		this.virtualDrive = virtualDrive;
		this.driveData = driveData;
		this.loadDistribution = loadDistribution;
		this.upScale = upScale;
		this.downScale = downScale;
		this.autoScale = autoScale;
	}

	public long getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(long serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getInfrastructureAsService() {
		return infrastructureAsService;
	}

	public void setInfrastructureAsService(String infrastructureAsService) {
		this.infrastructureAsService = infrastructureAsService;
	}

	public String getVirtualMachine() {
		return virtualMachine;
	}

	public void setVirtualMachine(String virtualMachine) {
		this.virtualMachine = virtualMachine;
	}

	public String getVirtualDrive() {
		return virtualDrive;
	}

	public void setVirtualDrive(String virtualDrive) {
		this.virtualDrive = virtualDrive;
	}

	public String getDriveData() {
		return driveData;
	}

	public void setDriveData(String driveData) {
		this.driveData = driveData;
	}

	public String getLoadDistribution() {
		return loadDistribution;
	}

	public void setLoadDistribution(String loadDistribution) {
		this.loadDistribution = loadDistribution;
	}

	public String getUpScale() {
		return upScale;
	}

	public void setUpScale(String upScale) {
		this.upScale = upScale;
	}

	public String getDownScale() {
		return downScale;
	}

	public void setDownScale(String downScale) {
		this.downScale = downScale;
	}

	public String getAutoScale() {
		return autoScale;
	}

	public void setAutoScale(String autoScale) {
		this.autoScale = autoScale;
	}

}

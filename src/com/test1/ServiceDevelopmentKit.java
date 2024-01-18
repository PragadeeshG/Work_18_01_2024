package com.test1;

public class ServiceDevelopmentKit {
	private String sdkVersion;
	private String snapshots;
	private String availableFor;
	private String languageSpecific;
	private Integer manageServiceCount;
	private Integer serviceAccessCount;
	private String desktopAppSupports;
	private String mobileAppSupports;
	private String iotSDKs;
	private String isEmbedded;

	public ServiceDevelopmentKit() {

	}

	public ServiceDevelopmentKit(String sdkVersion, String snapshots, String availableFor, String languageSpecific,
			Integer manageServiceCount, Integer serviceAccessCount, String desktopAppSupports, String mobileAppSupports,
			String iotSDKs, String isEmbedded) {
		super();
		this.sdkVersion = sdkVersion;
		this.snapshots = snapshots;
		this.availableFor = availableFor;
		this.languageSpecific = languageSpecific;
		this.manageServiceCount = manageServiceCount;
		this.serviceAccessCount = serviceAccessCount;
		this.desktopAppSupports = desktopAppSupports;
		this.mobileAppSupports = mobileAppSupports;
		this.iotSDKs = iotSDKs;
		this.isEmbedded = isEmbedded;
	}

	public String getSdkVersion() {
		return sdkVersion;
	}

	public void setSdkVersion(String sdkVersion) {
		this.sdkVersion = sdkVersion;
	}

	public String getSnapshots() {
		return snapshots;
	}

	public void setSnapshots(String snapshots) {
		this.snapshots = snapshots;
	}

	public String getAvailableFor() {
		return availableFor;
	}

	public void setAvailableFor(String availableFor) {
		this.availableFor = availableFor;
	}

	public String getLanguageSpecific() {
		return languageSpecific;
	}

	public void setLanguageSpecific(String languageSpecific) {
		this.languageSpecific = languageSpecific;
	}

	public Integer getManageServiceCount() {
		return manageServiceCount;
	}

	public void setManageServiceCount(Integer manageServiceCount) {
		this.manageServiceCount = manageServiceCount;
	}

	public Integer getServiceAccessCount() {
		return serviceAccessCount;
	}

	public void setServiceAccessCount(Integer serviceAccessCount) {
		this.serviceAccessCount = serviceAccessCount;
	}

	public String getDesktopAppSupports() {
		return desktopAppSupports;
	}

	public void setDesktopAppSupports(String desktopAppSupports) {
		this.desktopAppSupports = desktopAppSupports;
	}

	public String getMobileAppSupports() {
		return mobileAppSupports;
	}

	public void setMobileAppSupports(String mobileAppSupports) {
		this.mobileAppSupports = mobileAppSupports;
	}

	public String getIotSDKs() {
		return iotSDKs;
	}

	public void setIotSDKs(String iotSDKs) {
		this.iotSDKs = iotSDKs;
	}

	public String getIsEmbedded() {
		return isEmbedded;
	}

	public void setIsEmbedded(String isEmbedded) {
		this.isEmbedded = isEmbedded;
	}

}

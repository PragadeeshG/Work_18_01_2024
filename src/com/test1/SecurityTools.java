package com.test1;

public class SecurityTools {
	private long credentialsReport;
	private String userStatusReport;
	private String allUsersReport;
	private String newUsersReport;
	private String removedUsersReport;
	private String modifiedUsersReport;
	private String leaversReport;
	private String moversReport;
	private String accessAdvisor;

	public SecurityTools() {

	}

	public SecurityTools(long credentialsReport, String userStatusReport, String allUsersReport, String newUsersReport,
			String removedUsersReport, String modifiedUsersReport, String leaversReport, String moversReport,
			String accessAdvisor) {
		super();
		this.credentialsReport = credentialsReport;
		this.userStatusReport = userStatusReport;
		this.allUsersReport = allUsersReport;
		this.newUsersReport = newUsersReport;
		this.removedUsersReport = removedUsersReport;
		this.modifiedUsersReport = modifiedUsersReport;
		this.leaversReport = leaversReport;
		this.moversReport = moversReport;
		this.accessAdvisor = accessAdvisor;
	}

	public long getCredentialsReport() {
		return credentialsReport;
	}

	public void setCredentialsReport(long credentialsReport) {
		this.credentialsReport = credentialsReport;
	}

	public String getUserStatusReport() {
		return userStatusReport;
	}

	public void setUserStatusReport(String userStatusReport) {
		this.userStatusReport = userStatusReport;
	}

	public String getAllUsersReport() {
		return allUsersReport;
	}

	public void setAllUsersReport(String allUsersReport) {
		this.allUsersReport = allUsersReport;
	}

	public String getNewUsersReport() {
		return newUsersReport;
	}

	public void setNewUsersReport(String newUsersReport) {
		this.newUsersReport = newUsersReport;
	}

	public String getRemovedUsersReport() {
		return removedUsersReport;
	}

	public void setRemovedUsersReport(String removedUsersReport) {
		this.removedUsersReport = removedUsersReport;
	}

	public String getModifiedUsersReport() {
		return modifiedUsersReport;
	}

	public void setModifiedUsersReport(String modifiedUsersReport) {
		this.modifiedUsersReport = modifiedUsersReport;
	}

	public String getLeaversReport() {
		return leaversReport;
	}

	public void setLeaversReport(String leaversReport) {
		this.leaversReport = leaversReport;
	}

	public String getMoversReport() {
		return moversReport;
	}

	public void setMoversReport(String moversReport) {
		this.moversReport = moversReport;
	}

	public String getAccessAdvisor() {
		return accessAdvisor;
	}

	public void setAccessAdvisor(String accessAdvisor) {
		this.accessAdvisor = accessAdvisor;
	}

}

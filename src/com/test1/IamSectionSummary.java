package com.test1;

public class IamSectionSummary {
	private long docVersion;
	private String users;
	private String group;
	private String policy;
	private String role;
	private String security;
	private String cli;
	private String sdk;
	private String acessKeys;
	private String audit;
	private boolean reported;

	public IamSectionSummary() {

	}

	public IamSectionSummary(long docVersion, String users, String group, String policy, String role, String security,
			String cli, String sdk, String acessKeys, String audit, boolean reported) {
		super();
		this.docVersion = docVersion;
		this.users = users;
		this.group = group;
		this.policy = policy;
		this.role = role;
		this.security = security;
		this.cli = cli;
		this.sdk = sdk;
		this.acessKeys = acessKeys;
		this.audit = audit;
		this.reported = reported;
	}

	public long getDocVersion() {
		return docVersion;
	}

	public void setDocVersion(long docVersion) {
		this.docVersion = docVersion;
	}

	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public String getCli() {
		return cli;
	}

	public void setCli(String cli) {
		this.cli = cli;
	}

	public String getSdk() {
		return sdk;
	}

	public void setSdk(String sdk) {
		this.sdk = sdk;
	}

	public String getAcessKeys() {
		return acessKeys;
	}

	public void setAcessKeys(String acessKeys) {
		this.acessKeys = acessKeys;
	}

	public String getAudit() {
		return audit;
	}

	public void setAudit(String audit) {
		this.audit = audit;
	}

	public boolean isReported() {
		return reported;
	}

	public void setReported(boolean reported) {
		this.reported = reported;
	}

}

package com.test1;

public class ECUSerData {
	private long id;
	private String scriptName;
	private String scriptPath;
	private String runOnce;
	private String runAlways;
	private String runAtStart;
	private String launchingCommand;
	private String installUpdates;
	private String installRequiredSoftwares;
	private String downloadCommonFiles;
	private String scriptOutput;
	private String logPath;
	private String userAccess;

	public ECUSerData() {

	}

	public ECUSerData(long id, String scriptName, String scriptPath, String runOnce, String runAlways,
			String runAtStart, String launchingCommand, String installUpdates, String installRequiredSoftwares,
			String downloadCommonFiles, String scriptOutput, String logPath, String userAccess) {
		super();
		this.id = id;
		this.scriptName = scriptName;
		this.scriptPath = scriptPath;
		this.runOnce = runOnce;
		this.runAlways = runAlways;
		this.runAtStart = runAtStart;
		this.launchingCommand = launchingCommand;
		this.installUpdates = installUpdates;
		this.installRequiredSoftwares = installRequiredSoftwares;
		this.downloadCommonFiles = downloadCommonFiles;
		this.scriptOutput = scriptOutput;
		this.logPath = logPath;
		this.userAccess = userAccess;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getScriptName() {
		return scriptName;
	}

	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
	}

	public String getScriptPath() {
		return scriptPath;
	}

	public void setScriptPath(String scriptPath) {
		this.scriptPath = scriptPath;
	}

	public String getRunOnce() {
		return runOnce;
	}

	public void setRunOnce(String runOnce) {
		this.runOnce = runOnce;
	}

	public String getRunAlways() {
		return runAlways;
	}

	public void setRunAlways(String runAlways) {
		this.runAlways = runAlways;
	}

	public String getRunAtStart() {
		return runAtStart;
	}

	public void setRunAtStart(String runAtStart) {
		this.runAtStart = runAtStart;
	}

	public String getLaunchingCommand() {
		return launchingCommand;
	}

	public void setLaunchingCommand(String launchingCommand) {
		this.launchingCommand = launchingCommand;
	}

	public String getInstallUpdates() {
		return installUpdates;
	}

	public void setInstallUpdates(String installUpdates) {
		this.installUpdates = installUpdates;
	}

	public String getInstallRequiredSoftwares() {
		return installRequiredSoftwares;
	}

	public void setInstallRequiredSoftwares(String installRequiredSoftwares) {
		this.installRequiredSoftwares = installRequiredSoftwares;
	}

	public String getDownloadCommonFiles() {
		return downloadCommonFiles;
	}

	public void setDownloadCommonFiles(String downloadCommonFiles) {
		this.downloadCommonFiles = downloadCommonFiles;
	}

	public String getScriptOutput() {
		return scriptOutput;
	}

	public void setScriptOutput(String scriptOutput) {
		this.scriptOutput = scriptOutput;
	}

	public String getLogPath() {
		return logPath;
	}

	public void setLogPath(String logPath) {
		this.logPath = logPath;
	}

	public String getUserAccess() {
		return userAccess;
	}

	public void setUserAccess(String userAccess) {
		this.userAccess = userAccess;
	}

}

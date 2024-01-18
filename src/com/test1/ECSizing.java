package com.test1;

public class ECSizing {
	private String osName;
	private String numberOfCores;
	private String ramSize;
	private String networkAttached;
	private String hardware;
	private String networkCard;
	private String firewall;
	private String bootStrapScript;

	public ECSizing() {

	}

	public ECSizing(String osName, String numberOfCores, String ramSize, String networkAttached, String hardware,
			String networkCard, String firewall, String bootStrapScript) {
		super();
		this.osName = osName;
		this.numberOfCores = numberOfCores;
		this.ramSize = ramSize;
		this.networkAttached = networkAttached;
		this.hardware = hardware;
		this.networkCard = networkCard;
		this.firewall = firewall;
		this.bootStrapScript = bootStrapScript;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getNumberOfCores() {
		return numberOfCores;
	}

	public void setNumberOfCores(String numberOfCores) {
		this.numberOfCores = numberOfCores;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public String getNetworkAttached() {
		return networkAttached;
	}

	public void setNetworkAttached(String networkAttached) {
		this.networkAttached = networkAttached;
	}

	public String getHardware() {
		return hardware;
	}

	public void setHardware(String hardware) {
		this.hardware = hardware;
	}

	public String getNetworkCard() {
		return networkCard;
	}

	public void setNetworkCard(String networkCard) {
		this.networkCard = networkCard;
	}

	public String getFirewall() {
		return firewall;
	}

	public void setFirewall(String firewall) {
		this.firewall = firewall;
	}

	public String getBootStrapScript() {
		return bootStrapScript;
	}

	public void setBootStrapScript(String bootStrapScript) {
		this.bootStrapScript = bootStrapScript;
	}

}

package com.corona.dto;

public class Guidelines {

	private String oxygenLevels;
	private String quarantine;
	private String liters;
	private String temparatureLevels;

	
	
	public Guidelines(String oxygenLevels, String quarantine, String liters, String temparatureLevels) {
		super();
		this.oxygenLevels = oxygenLevels;
		this.quarantine = quarantine;
		this.liters = liters;
		this.temparatureLevels = temparatureLevels;
	}

	public String getOxygenLevels() {
		return oxygenLevels;
	}

	public void setOxygenLevels(String oxygenLevels) {
		this.oxygenLevels = oxygenLevels;
	}

	public String getQuarantine() {
		return quarantine;
	}

	public void setQuarantine(String quarantine) {
		this.quarantine = quarantine;
	}

	public String getLiters() {
		return liters;
	}

	public void setLiters(String liters) {
		this.liters = liters;
	}

	public String getTemparatureLevels() {
		return temparatureLevels;
	}

	public void setTemparatureLevels(String temparatureLevels) {
		this.temparatureLevels = temparatureLevels;
	}

	@Override
	public String toString() {
		return "Guidelines [oxygenLevels=" + oxygenLevels + ", quarantine=" + quarantine + ", liters=" + liters
				+ ", temparatureLevels=" + temparatureLevels + "]";
	}

}

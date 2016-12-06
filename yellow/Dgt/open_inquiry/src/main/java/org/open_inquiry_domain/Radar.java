package org.open_inquiry_domain;

public class Radar {
	private boolean state;
	private String location;
	public Radar( String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	
	

}

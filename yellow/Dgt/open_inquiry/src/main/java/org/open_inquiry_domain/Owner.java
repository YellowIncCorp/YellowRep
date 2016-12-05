package org.open_inquiry_domain;
public class Owner extends SanctionHolder {
	private Inquiry inquiry;
	
	

	public Owner(int id) {
		super(id);
	}

	public Owner(String dni, String name, String lastName, String fullAddress) {
		super(dni, name, lastName, fullAddress);
	}

	public Inquiry getInquiry() {
		return inquiry;
	}

	public void setInquiry(Inquiry inquiry) {
		this.inquiry = inquiry;
	}



}
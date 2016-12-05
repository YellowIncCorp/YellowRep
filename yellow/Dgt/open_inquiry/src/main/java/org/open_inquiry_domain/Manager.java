package org.open_inquiry_domain;



/**
 * This class is the access point to the business logic.
 * @author macario.polo
 */

public class Manager {

	private Manager() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @return The only existing instance of the Manager
	 */
	public static Manager get() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Executed by {@link Manager} when a vehicle passes through the radar exceeding the speed limit
	 */
	public int openInquiry(String aLicense, double aSpeed, String aLocation, double aMaxSpeed) {
		throw new UnsupportedOperationException();
	}

	
	public void pay(int IdSanction) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Executed from the user interface when a vehicle changes its owner
	 * @param aLicense The license number of the vehicle
	 * @param aNewDni The dni of the new owner
	 */
	public void changeOwner(String aLicense, String aNewDni) {
		throw new UnsupportedOperationException();
	}
	
	
	
}
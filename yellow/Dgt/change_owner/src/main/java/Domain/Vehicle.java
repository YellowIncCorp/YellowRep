package Domain;

public class Vehicle {
	private String license;
	private Driver driver;
	public Vehicle(String license) {
		this.license = license;
		
	}
	
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	

}

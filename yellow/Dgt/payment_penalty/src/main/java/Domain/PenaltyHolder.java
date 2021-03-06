package Domain;

public class PenaltyHolder {

	private int id;
	private String dni;
	private String name;
	private String lastName;
	private String fullAddress;

	public PenaltyHolder(int id) {
		this.id = id;
	}
	public PenaltyHolder(String dni, String name, String lastName, String fullAddress) {
		this.dni = dni;
		this.name = name;
		this.lastName = lastName;
		this.fullAddress = fullAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}


	

}
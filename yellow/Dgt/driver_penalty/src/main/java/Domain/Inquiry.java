package Domain;

import java.util.Date;

public class Inquiry {
	private int id;
	private Date date;
	private String location;
	private Double m_speed;
	private Double speed;
	private Penalty penalty;
	private Driver owner;
	public Inquiry(String license, double speed, String location, double maxSpeed) {
		super();
		this.location = location;	
		this.speed = speed;
		this.owner = findOwner(license);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getM_speed() {
		return m_speed;
	}
	public void setM_speed(Double m_speed) {
		this.m_speed = m_speed;
	}
	public Double getSpeed() {
		return speed;
	}
	public void setSpeed(Double speed) {
		this.speed = speed;
	}
	public Penalty getPenalty() {
		return penalty;
	}
	public void setPenalty(Penalty penalty) {
		this.penalty = penalty;
	}
	public Driver getOwner() {
		return owner;
	}
	public void setOwner(Driver owner) {
		this.owner = owner;
	}
	public Driver findOwner(String aLicense){
		throw new UnsupportedOperationException();
	}
	

}

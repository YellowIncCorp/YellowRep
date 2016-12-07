package org.driver_penalty_domain;

import java.util.Date;

public class Inquiry {
	private int id;
	private Date date;
	private String location;
	private Double m_speed;
	private Double speed;
	private Penalty penalty;
	private Driver owner;
	public Inquiry(int id, Date date, String location, Double m_speed, Double speed, Penalty penalty, Driver owner) {
		super();
		this.id = id;
		this.date = date;
		this.location = location;
		this.m_speed = m_speed;
		this.speed = speed;
		this.penalty = penalty;
		this.owner = owner;
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
	public void findOwner(String aLicense){
		
	}
	

}

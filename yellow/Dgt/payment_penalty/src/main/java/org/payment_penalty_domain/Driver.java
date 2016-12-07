package org.payment_penalty_domain;

public class Driver extends PenaltyHolder {
	private int points;
public Driver(String dni, String name, String lastName, String fullAddress) {
		super(dni, name, lastName, fullAddress);
		// TODO Auto-generated constructor stub
	}
public int getPoints() {
	return points;
}
public void setPoints(int points) {
	this.points = points;
}

public Penalty getPenalty(){
	throw new UnsupportedOperationException();
}

}

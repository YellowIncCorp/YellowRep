package org.payment_penalty_domain;

import java.util.Date;

public class Penalty {
	private int id;
	private Date dateRecept;
	private Date datePayment;
	private Double money;
	private int lostpoints;
	public Penalty(int id, Date dateRecept, Date datePayment, Double money, int lostpoints) {
		super();
		this.id = id;
		this.dateRecept = dateRecept;
		this.datePayment = datePayment;
		this.money = money;
		this.lostpoints = lostpoints;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateRecept() {
		return dateRecept;
	}
	public void setDateRecept(Date dateRecept) {
		this.dateRecept = dateRecept;
	}
	public Date getDatePayment() {
		return datePayment;
	}
	public void setDatePayment(Date datePayment) {
		this.datePayment = datePayment;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public int getLostpoints() {
		return lostpoints;
	}
	public void setLostpoints(int lostpoints) {
		this.lostpoints = lostpoints;
	}
	public PenaltyHolder getPenaltyHolder(){
		return new PenaltyHolder(id);
	}
	public void setPenaltyHolder(PenaltyHolder p){
		  
	}

	
}

package com.xworkz.codeOptimize;


import javax.persistence.*;
@Entity
@Table(name = "laptop_tb")
public class Laptop {

	@Id
	@Column(name = "LAPID")
	private int lapId;
	@Column(name = "LAPNAME")
	private String lapName;
	@Column(name = "LAPPRICE")
	private double lapPrice;

	public Laptop(int lapId, String lapName, double lapPrice) {
		this.lapId = lapId;
		this.lapName = lapName;
		this.lapPrice = lapPrice;
	}

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public int getLapId() {
		return lapId;
	}

	public void setLapId(int lapId) {
		this.lapId = lapId;
	}

	public String getLapName() {
		return lapName;
	}

	public void setLapName(String lapName) {
		this.lapName = lapName;
	}

	public double getLapPrice() {
		return lapPrice;
	}

	public void setLapPrice(double lapPrice) {
		this.lapPrice = lapPrice;
	}

	@Override
	public String toString() {
		return "Laptop [lapId=" + lapId + ", lapName=" + lapName + ", lapPrice=" + lapPrice + "]";
	}
}

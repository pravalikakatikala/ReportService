package com.example.AccountService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class AccountEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private int pin_number;
	private long mobile;
	private double deposit;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin_number() {
		return pin_number;
	}
	public void setPin_number(int pin_number) {
		this.pin_number = pin_number;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	@Override
	public String toString() {
		return "AccountEntity [id=" + id + ", name=" + name + ", pin_number=" + pin_number + ", mobile=" + mobile
				+ ", deposit=" + deposit + "]";
	}
}

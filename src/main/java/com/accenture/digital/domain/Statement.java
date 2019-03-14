package com.accenture.digital.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Statement {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;

	private String name;
	private long limit_bal;
	private int sex;
	private int education;
	private int marriage;
	private int age;
	private long pay_0;
	private long pay_2;
	private long pay_3;
	private long pay_4;
	private long pay_5;
	private long pay_6;
	private long bill_amt1;
	private long bill_amt2;
	private long bill_amt3;
	private long bill_amt4;
	private long bill_amt5;
	private long bill_amt6;
	private long pay_amt1;
	private long pay_amt2;
	private long pay_amt3;
	private long pay_amt4;
	private long pay_amt5;
	private long pay_amt6;
	private int default_payment_next_mont;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getLimit_bal() {
		return limit_bal;
	}

	public void setLimit_bal(long limit_bal) {
		this.limit_bal = limit_bal;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getEducation() {
		return education;
	}

	public void setEducation(int education) {
		this.education = education;
	}

	public int getMarriage() {
		return marriage;
	}

	public void setMarriage(int marriage) {
		this.marriage = marriage;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPay_0() {
		return pay_0;
	}

	public void setPay_0(long pay_0) {
		this.pay_0 = pay_0;
	}

	public long getPay_2() {
		return pay_2;
	}

	public void setPay_2(long pay_2) {
		this.pay_2 = pay_2;
	}

	public long getPay_3() {
		return pay_3;
	}

	public void setPay_3(long pay_3) {
		this.pay_3 = pay_3;
	}

	public long getPay_4() {
		return pay_4;
	}

	public void setPay_4(long pay_4) {
		this.pay_4 = pay_4;
	}

	public long getPay_5() {
		return pay_5;
	}

	public void setPay_5(long pay_5) {
		this.pay_5 = pay_5;
	}

	public long getPay_6() {
		return pay_6;
	}

	public void setPay_6(long pay_6) {
		this.pay_6 = pay_6;
	}

	public long getBill_amt1() {
		return bill_amt1;
	}

	public void setBill_amt1(long bill_amt1) {
		this.bill_amt1 = bill_amt1;
	}

	public long getBill_amt2() {
		return bill_amt2;
	}

	public void setBill_amt2(long bill_amt2) {
		this.bill_amt2 = bill_amt2;
	}

	public long getBill_amt3() {
		return bill_amt3;
	}

	public void setBill_amt3(long bill_amt3) {
		this.bill_amt3 = bill_amt3;
	}

	public long getBill_amt4() {
		return bill_amt4;
	}

	public void setBill_amt4(long bill_amt4) {
		this.bill_amt4 = bill_amt4;
	}

	public long getBill_amt5() {
		return bill_amt5;
	}

	public void setBill_amt5(long bill_amt5) {
		this.bill_amt5 = bill_amt5;
	}

	public long getBill_amt6() {
		return bill_amt6;
	}

	public void setBill_amt6(long bill_amt6) {
		this.bill_amt6 = bill_amt6;
	}

	public long getPay_amt1() {
		return pay_amt1;
	}

	public void setPay_amt1(long pay_amt1) {
		this.pay_amt1 = pay_amt1;
	}

	public long getPay_amt2() {
		return pay_amt2;
	}

	public void setPay_amt2(long pay_amt2) {
		this.pay_amt2 = pay_amt2;
	}

	public long getPay_amt3() {
		return pay_amt3;
	}

	public void setPay_amt3(long pay_amt3) {
		this.pay_amt3 = pay_amt3;
	}

	public long getPay_amt4() {
		return pay_amt4;
	}

	public void setPay_amt4(long pay_amt4) {
		this.pay_amt4 = pay_amt4;
	}

	public long getPay_amt5() {
		return pay_amt5;
	}

	public void setPay_amt5(long pay_amt5) {
		this.pay_amt5 = pay_amt5;
	}

	public long getPay_amt6() {
		return pay_amt6;
	}

	public void setPay_amt6(long pay_amt6) {
		this.pay_amt6 = pay_amt6;
	}

	public int getDefault_payment_next_mont() {
		return default_payment_next_mont;
	}

	public void setDefault_payment_next_mont(int default_payment_next_mont) {
		this.default_payment_next_mont = default_payment_next_mont;
	}

}

package com.springcore.auto.wire;

public class Emp {

	private Addres addres;

	public Addres getAddres() {
		return addres;
	}

	public void setAddres(Addres addres) {
		this.addres = addres;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Addres addres) {
		super();
		this.addres = addres;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return "Emp [addres=" + addres + "]";
	}
	
	
}

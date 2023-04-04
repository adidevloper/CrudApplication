package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("addres2")
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

package com.springfremeworkproject;

public class Address {
	
	private String address;

	public Address() {
		this.address = "Rua 5 Maputo";
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return address;
	}
	
}

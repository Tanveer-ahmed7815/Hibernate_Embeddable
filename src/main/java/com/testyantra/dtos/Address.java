package com.testyantra.dtos;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable //always used on top of class
public class Address {
	
	@Column(name="address_id")
	private int addressId;
	@Column(name="address_lane")
	private String lane;
	@Column(name="address_street")
	private String street;
	@Column(name="address_type")
	private String type;
	
	public Address(int addressId, String lane, String street, String type) {
		this.addressId = addressId;
		this.lane = lane;
		this.street = street;
		this.type = type;
	}
	public Address() {
		
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", lane=" + lane + ", street=" + street + ", type=" + type + "]";
	}
	
	
	
	
}

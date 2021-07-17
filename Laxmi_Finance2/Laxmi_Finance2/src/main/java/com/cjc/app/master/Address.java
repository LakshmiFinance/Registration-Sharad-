package com.cjc.app.master;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address 
{@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private String loaclHouseNo;
	private String localArea;
	private String localLandmark;
	@OneToOne(cascade = CascadeType.ALL)
	private City localCity;
	private String permanantHouseNo;
	private String permanantArea;
	private String permanantLandmark;
	@OneToOne(cascade = CascadeType.ALL)
	private City permanantcity;
	@OneToOne(cascade = CascadeType.ALL)
	private Country country;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getLoaclHouseNo() {
		return loaclHouseNo;
	}
	public void setLoaclHouseNo(String loaclHouseNo) {
		this.loaclHouseNo = loaclHouseNo;
	}
	public String getLocalArea() {
		return localArea;
	}
	public void setLocalArea(String localArea) {
		this.localArea = localArea;
	}
	public String getLocalLandmark() {
		return localLandmark;
	}
	public void setLocalLandmark(String localLandmark) {
		this.localLandmark = localLandmark;
	}
	public City getLocalCity() {
		return localCity;
	}
	public void setLocalCity(City localCity) {
		this.localCity = localCity;
	}
	public String getPermanantHouseNo() {
		return permanantHouseNo;
	}
	public void setPermanantHouseNo(String permanantHouseNo) {
		this.permanantHouseNo = permanantHouseNo;
	}
	public String getPermanantArea() {
		return permanantArea;
	}
	public void setPermanantArea(String permanantArea) {
		this.permanantArea = permanantArea;
	}
	public String getPermanantLandmark() {
		return permanantLandmark;
	}
	public void setPermanantLandmark(String permanantLandmark) {
		this.permanantLandmark = permanantLandmark;
	}
	public City getPermanantcity() {
		return permanantcity;
	}
	public void setPermanantcity(City permanantcity) {
		this.permanantcity = permanantcity;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}

 
}

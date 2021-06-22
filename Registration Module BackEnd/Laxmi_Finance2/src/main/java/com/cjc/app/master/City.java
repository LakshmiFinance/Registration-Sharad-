package com.cjc.app.master;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class City {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cityId;
private String cityname;
private long citypincode;
@OneToOne(cascade = CascadeType.ALL)
private State state;
public int getCityId() {
	return cityId;
}
public void setCityId(int cityId) {
	this.cityId = cityId;
}
public String getCityname() {
	return cityname;
}
public void setCityname(String cityname) {
	this.cityname = cityname;
}
public long getCitypincode() {
	return citypincode;
}
public void setCitypincode(long citypincode) {
	this.citypincode = citypincode;
}
public State getState() {
	return state;
}
public void setState(State state) {
	this.state = state;
}

}

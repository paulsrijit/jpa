package home.hibernatepractice.dto;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String addressLine;
	private String state;
	private String zip;
	
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", state=" + state + ", zip=" + zip + "]";
	}
	
}

package com.htc.vaccinationdetails.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="vaccinationcenter")
public class center {
	@Id
	private long centreid;
	private String centreaddress;
	private long pincode;
	private LocalDateTime scheduleddatetime;
	
	
	public center() {
		super();
		
	}


	public center(long centreid, String centreaddress, long pincode, LocalDateTime scheduleddatetime) {
		super();
		this.centreid = centreid;
		this.centreaddress = centreaddress;
		this.pincode = pincode;
		this.scheduleddatetime = scheduleddatetime;
	}


	public long getCentreid() {
		return centreid;
	}


	public void setCentreid(long centreid) {
		this.centreid = centreid;
	}


	public String getCentreaddress() {
		return centreaddress;
	}


	public void setCentreaddress(String centreaddress) {
		this.centreaddress = centreaddress;
	}


	public long getPincode() {
		return pincode;
	}


	public void setPincode(long pincode) {
		this.pincode = pincode;
	}


	public LocalDateTime getScheduleddatetime() {
		return scheduleddatetime;
	}


	public void setScheduleddatetime(LocalDateTime scheduleddatetime) {
		this.scheduleddatetime = scheduleddatetime;
	}


	@Override
	public int hashCode() {
		return Objects.hash(centreid, pincode);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		center other = (center) obj;
		return centreid == other.centreid && pincode == other.pincode;
	}


	@Override
	public String toString() {
		return "vaccinationcenter [centreid=" + centreid + ", centreaddress=" + centreaddress + ", pincode="
				+ pincode + ", scheduleddatetime=" + scheduleddatetime + "]";
	}
	
}





	

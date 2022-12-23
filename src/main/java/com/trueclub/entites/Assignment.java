package com.trueclub.entites;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "assignment")
public class Assignment {

	@Id
	private long id;
	
	@Column(name = "name",length = 45 )
	private String name;
	
	@Column(name = "address",length = 45 )
	private String address;
	
	@Column(name = "pincode",length = 128)
	private String pincode;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "row_Creation_Date",length = 128)
	private long rowCreationDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getRowCreationDate() {
		return rowCreationDate;
	}

	public void setRowCreationDate(long rowCreationDate) {
		this.rowCreationDate = rowCreationDate;
	}


}

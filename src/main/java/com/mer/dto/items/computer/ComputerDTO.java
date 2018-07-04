package com.mer.dto.items.computer;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="computer")
public class ComputerDTO implements Serializable{
	
	private String catagorey;
	
	@Id
	@GenericGenerator(name="incrementer",strategy="increment")
	@GeneratedValue(generator="incrementer")
	private long id;
	@NotNull
	private String title;
	private String brand;
	private String model;
	@NotNull
	private String description;
	private long pid;
	@NotNull
	private double price;
	private String state;
	@NotNull
	private String province;
	private Date uploadDate;
	@NotNull
	private String ownerPhoneNumber;
	@NotNull
	private String address;
	private long visiters;
	private int priority;
	private String zone;
	@Lob
	private byte[] image1;
	@Lob
	private byte[] image2;
	@Lob
	private byte[] image3;
	@Lob
	private byte[] image4;
	@Lob
	private byte[] image5;
	
	
	public ComputerDTO() {
		this.catagorey="computer";
	}

	public ComputerDTO(long id, @NotNull String title, String brand, String model, @NotNull String description,
			long pid, @NotNull double price, String state, @NotNull String province, Date uploadDate,
			@NotNull String ownerPhoneNumber, @NotNull String address, long visiters, int priority, String zone,
			byte[] image1, byte[] image2, byte[] image3, byte[] image4, byte[] image5) {
		super();
		this.id = id;
		this.title = title;
		this.brand = brand;
		this.model = model;
		this.description = description;
		this.pid = pid;
		this.price = price;
		this.state = state;
		this.province = province;
		this.uploadDate = uploadDate;
		this.ownerPhoneNumber = ownerPhoneNumber;
		this.address = address;
		this.visiters = visiters;
		this.priority = priority;
		this.zone = zone;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
		this.catagorey="computer";
	}
	
	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public long getPid() {
		return pid;
	}


	public void setPid(long pid) {
		this.pid = pid;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getOwnerPhoneNumber() {
		return ownerPhoneNumber;
	}


	public void setOwnerPhoneNumber(String ownerPhoneNumber) {
		this.ownerPhoneNumber = ownerPhoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getVisiters() {
		return visiters;
	}


	public void setVisiters(long visiters) {
		this.visiters = visiters;
	}


	public int getPriority() {
		return priority;
	}


	public void setPriority(int priority) {
		this.priority = priority;
	}


	public String getZone() {
		return zone;
	}


	public void setZone(String zone) {
		this.zone = zone;
	}


	public byte[] getImage1() {
		return image1;
	}


	public void setImage1(byte[] image1) {
		this.image1 = image1;
	}


	public byte[] getImage2() {
		return image2;
	}


	public void setImage2(byte[] image2) {
		this.image2 = image2;
	}


	public byte[] getImage3() {
		return image3;
	}


	public void setImage3(byte[] image3) {
		this.image3 = image3;
	}


	public byte[] getImage4() {
		return image4;
	}


	public void setImage4(byte[] image4) {
		this.image4 = image4;
	}


	public byte[] getImage5() {
		return image5;
	}


	public void setImage5(byte[] image5) {
		this.image5 = image5;
	}


	public  String getCatagorey() {
		return catagorey;
	}


	@Override
	public String toString() {
		return "ComputerDTO [id=" + id + ", title=" + title + ", brand=" + brand + ", model=" + model + ", description="
				+ description + ", pid=" + pid + ", price=" + price + ", state=" + state + ", province=" + province
				+ ", ownerPhoneNumber=" + ownerPhoneNumber + ", address=" + address + ", visiters=" + visiters
				+ ", priority=" + priority + ", zone=" + zone + ", image1=" + Arrays.toString(image1) + ", image2="
				+ Arrays.toString(image2) + ", image3=" + Arrays.toString(image3) + ", image4="
				+ Arrays.toString(image4) + ", image5=" + Arrays.toString(image5) + "]";
	}

}

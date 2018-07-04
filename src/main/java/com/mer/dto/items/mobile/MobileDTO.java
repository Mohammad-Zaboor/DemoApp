package com.mer.dto.items.mobile;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="mobile")
public class MobileDTO implements Serializable {
	
	private String catagorey;
	
	
	@Id
	@GenericGenerator(name="incrementer",strategy="increment")
	@GeneratedValue(generator="incrementer")
	private long id;
	@NotNull
	private String title;
	private String model;
	private String type;
	private String brand;
	private String state;
	
	private String discreption;
	@NotNull
	private double price;
	private long pid;
	@NotNull
	private String ownerPhoneNumber;
	@NotNull
	private String ownerAddress;
	private Date uploadDate;
	private int visiters;
	private int priority;
	private String zone;
	
	@NotNull
	private String province;
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
	
	
	public MobileDTO() {
		this.catagorey="mobile";
	}


	


	public MobileDTO(long id, @NotNull String title, String model, String type, String brand, String state,
			String discreption, @NotNull double price, long pid, @NotNull String ownerPhoneNumber,
			@NotNull String ownerAddress, Date uploadDate, int visiters, int priority, String zone,
			@NotNull String province, byte[] image1, byte[] image2, byte[] image3, byte[] image4, byte[] image5) {
		super();
		this.id = id;
		this.title = title;
		this.model = model;
		this.type = type;
		this.brand = brand;
		this.state = state;
		this.discreption = discreption;
		this.price = price;
		this.pid = pid;
		this.ownerPhoneNumber = ownerPhoneNumber;
		this.ownerAddress = ownerAddress;
		this.uploadDate = uploadDate;
		this.visiters = visiters;
		this.priority = priority;
		this.zone = zone;
		this.province = province;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
		this.catagorey="mobile";

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


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDiscreption() {
		return discreption;
	}


	public void setDiscreption(String discreption) {
		this.discreption = discreption;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public long getPid() {
		return pid;
	}


	public void setPid(long pid) {
		this.pid = pid;
	}


	public String getOwnerPhoneNumber() {
		return ownerPhoneNumber;
	}


	public void setOwnerPhoneNumber(String ownerPhoneNumber) {
		this.ownerPhoneNumber = ownerPhoneNumber;
	}


	public String getOwnerAddress() {
		return ownerAddress;
	}


	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}


	public Date getUploadDate() {
		return uploadDate;
	}


	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}


	public int getVisiters() {
		return visiters;
	}


	public void setVisiters(int visiters) {
		this.visiters = visiters;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
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
	

	public String getCatagorey() {
		return catagorey;
	}





	public void setCatagorey(String catagorey) {
		this.catagorey = catagorey;
	}





	@Override
	public String toString() {
		return "MobileDTO [id=" + id + ", title=" + title + ", model=" + model + ", type=" + type + ", brand=" + brand
				+ ", state=" + state + ", discreption=" + discreption + ", price=" + price + ", pid=" + pid
				+ ", ownerPhoneNumber=" + ownerPhoneNumber + ", ownerAddress=" + ownerAddress + ", uploadDate="
				+ uploadDate + ", visiters=" + visiters + ", province=" + province + "]";
	}
	
	
	

}

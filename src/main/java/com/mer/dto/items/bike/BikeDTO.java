package com.mer.dto.items.bike;

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
@Table(name="bike")
public class BikeDTO implements Serializable{
	
	private String catagorey;
	

	@Id
	@GenericGenerator(name="incrementer",strategy="increment")
	@GeneratedValue(generator="incrementer")
	private long id;
	@NotNull
	private String title;
	private String brand;
	private String yearModel;
	@NotNull
	private double price;
	@NotNull
	private String discreption;
	private String kmDriven;
	private long pid;
	@NotNull
	private String ownerPhoneNumber;
	@NotNull
	private String ownerAddress;
	private String state;
	private long visiters;
	private Date uploadDate;
	private String province;
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
	
	public BikeDTO() {
		
		catagorey="bike";
	}

	
	public BikeDTO(long id, @NotNull String title, String brand, String yearModel, @NotNull double price,
			@NotNull String discreption, String kmDriven, long pid, @NotNull String ownerPhoneNumber,
			@NotNull String ownerAddress, String state, long visiters, Date uploadDate, String province, int priority,
			String zone, byte[] image1, byte[] image2, byte[] image3, byte[] image4, byte[] image5) {
		super();
		this.id = id;
		this.title = title;
		this.brand = brand;
		this.yearModel = yearModel;
		this.price = price;
		this.discreption = discreption;
		this.kmDriven = kmDriven;
		this.pid = pid;
		this.ownerPhoneNumber = ownerPhoneNumber;
		this.ownerAddress = ownerAddress;
		this.state = state;
		this.visiters = visiters;
		this.uploadDate = uploadDate;
		this.province = province;
		this.priority = priority;
		this.zone = zone;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
		catagorey="bike";
	}

	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
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

	public String getYearModel() {
		return yearModel;
	}

	public void setYearModel(String yearModel) {
		this.yearModel = yearModel;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDiscreption() {
		return discreption;
	}

	public void setDiscreption(String discreption) {
		this.discreption = discreption;
	}

	public String getKmDriven() {
		return kmDriven;
	}

	public void setKmDriven(String kmDriven) {
		this.kmDriven = kmDriven;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getVisiters() {
		return visiters;
	}

	public void setVisiters(long visiters) {
		this.visiters = visiters;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public  String getCatagorey() {
		return catagorey;
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

	@Override
	public String toString() {
		return "BikeDTO [id=" + id + ", title=" + title + ", brand=" + brand + ", yearModel=" + yearModel + ", price="
				+ price + ", discreption=" + discreption + ", kmDriven=" + kmDriven + ", pid=" + pid
				+ ", ownerPhoneNumber=" + ownerPhoneNumber + ", ownerAddress=" + ownerAddress + ", state=" + state
				+ ", visiters=" + visiters + ", uploadDate=" + uploadDate + "]";
	}
	
	

}

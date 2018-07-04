package com.mer.dto.items.vehical;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="vehicals")
public class VehicalDTO implements Serializable {
	
	private String catagorey;
	
	@Id
	@GeneratedValue
	private long id;
	@NotNull
	private String title;
	@NotNull
	private String brand;
	@NotNull
	private String type;
	private int yearModel;
	private String state;
	@NotNull
	private double price;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date uploadDate;
	@NotNull
	private String provice;
	private long pid;
	private int visiters;
	@NotNull
	private long ownerPhoneNumber;
	private String description;
	private String fuel;
	private String KMDriven;
	private int priority;
	private String ownerAddress;
	private String madeOfCountry;
	private String noOfSets;
	private String insuranceExpireDate;
	private String priceMonetaryUnit;
	private String color;
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

	public VehicalDTO() {
		
		this.catagorey="vehical";
	}

	public VehicalDTO(long id, @NotNull String title, @NotNull String brand, @NotNull String type, int yearModel,
			String state,String priceMonetaryUnit, @NotNull double price, Date uploadDate, @NotNull String provice, long pid, int visiters,
			@NotNull long ownerPhoneNumber, String description, String fuel, String kMDriven, int priority,
			String ownerAddress, String madeOfCountry, String noOfSets, String insuranceExpireDate, String color,
			String zone, byte[] image1, byte[] image2, byte[] image3, byte[] image4, byte[] image5) {
		super();
		this.id = id;
		this.title = title;
		this.brand = brand;
		this.type = type;
		this.yearModel = yearModel;
		this.state = state;
		this.price = price;
		this.uploadDate = uploadDate;
		this.provice = provice;
		this.pid = pid;
		this.visiters = visiters;
		this.ownerPhoneNumber = ownerPhoneNumber;
		this.description = description;
		this.fuel = fuel;
		this.KMDriven = kMDriven;
		this.priority = priority;
		this.ownerAddress = ownerAddress;
		this.madeOfCountry = madeOfCountry;
		this.noOfSets = noOfSets;
		this.insuranceExpireDate = insuranceExpireDate;
		this.color = color;
		this.priceMonetaryUnit=priceMonetaryUnit;
		this.zone = zone;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
		this.catagorey="vehical";
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public String getProvice() {
		return provice;
	}

	public void setProvice(String provice) {
		this.provice = provice;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getPriceMonetaryUnit() {
		return priceMonetaryUnit;
	}

	public void setPriceMonetaryUnit(String priceMonetaryUnit) {
		this.priceMonetaryUnit = priceMonetaryUnit;
	}

	public int getVisiters() {
		return visiters;
	}

	public void setVisiters(int visiters) {
		this.visiters = visiters;
	}

	public long getOwnerPhoneNumber() {
		return ownerPhoneNumber;
	}

	public void setOwnerPhoneNumber(long ownerPhoneNumber) {
		this.ownerPhoneNumber = ownerPhoneNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getKMDriven() {
		return KMDriven;
	}

	public void setKMDriven(String kMDriven) {
		KMDriven = kMDriven;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getMadeOfCountry() {
		return madeOfCountry;
	}

	public void setMadeOfCountry(String madeOfCountry) {
		this.madeOfCountry = madeOfCountry;
	}

	public String getNoOfSets() {
		return noOfSets;
	}

	public void setNoOfSets(String noOfSets) {
		this.noOfSets = noOfSets;
	}

	public String getInsuranceExpireDate() {
		return insuranceExpireDate;
	}

	public void setInsuranceExpireDate(String insuranceExpireDate) {
		this.insuranceExpireDate = insuranceExpireDate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	@Override
	public String toString() {
		return "VehicalDTO [catagorey=" + catagorey + ", id=" + id + ", title=" + title + ", brand=" + brand + ", type="
				+ type + ", yearModel=" + yearModel + ", state=" + state + ", price=" + price + ", uploadDate="
				+ uploadDate + ", provice=" + provice + ", pid=" + pid + ", visiters=" + visiters
				+ ", ownerPhoneNumber=" + ownerPhoneNumber + ", description=" + description + ", fuel=" + fuel
				+ ", KMDriven=" + KMDriven + ", priority=" + priority + ", ownerAddress=" + ownerAddress
				+ ", madeOfCountry=" + madeOfCountry + ", noOfSets=" + noOfSets + ", insuranceExpireDate="
				+ insuranceExpireDate + ", color=" + color + ", zone=" + zone + ", image1=" + Arrays.toString(image1)
				+ ", image2=" + Arrays.toString(image2) + ", image3=" + Arrays.toString(image3) + ", image4="
				+ Arrays.toString(image4) + ", image5=" + Arrays.toString(image5) + "]";
	}
	
	
}

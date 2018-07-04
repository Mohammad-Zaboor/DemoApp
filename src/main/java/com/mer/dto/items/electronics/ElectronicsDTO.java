package com.mer.dto.items.electronics;

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
@Table(name="electronics")
public class ElectronicsDTO implements Serializable{
	
	private String catagorey;
	
	@Id
	@GenericGenerator(name="incrementer",strategy="increment")
	@GeneratedValue(generator="incrementer")
	private long id;
	@NotNull
	private String title;
	private String brand;
	private double price;
	@NotNull
	private String description;
	private String state;
	private Date uploadDate;
	private String provicne;
	@NotNull
	private String ownerPhoneNumber;
	private String ownerAddress;
	private long pid;
	private String type;
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
	
	public ElectronicsDTO() {
		this.catagorey="electronics";
	}


	public ElectronicsDTO(long id, @NotNull String title, String brand, double price, @NotNull String description,
			String state, Date uploadDate, String provicne, @NotNull String ownerPhoneNumber, String ownerAddress,
			long pid, String type, int priority, String zone, byte[] image1, byte[] image2, byte[] image3,
			byte[] image4, byte[] image5) {
		super();
		this.id = id;
		this.title = title;
		this.brand = brand;
		this.price = price;
		this.description = description;
		this.state = state;
		this.uploadDate = uploadDate;
		this.provicne = provicne;
		this.ownerPhoneNumber = ownerPhoneNumber;
		this.ownerAddress = ownerAddress;
		this.pid = pid;
		this.type = type;
		this.priority = priority;
		this.zone = zone;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
		this.catagorey="electronics";
	}


	public  String getCatagorey() {
		return catagorey;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Date getUploadDate() {
		return uploadDate;
	}


	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}


	public String getProvicne() {
		return provicne;
	}


	public void setProvicne(String provicne) {
		this.provicne = provicne;
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
	

	public void setCatagorey(String catagorey) {
		this.catagorey = catagorey;
	}


	@Override
	public String toString() {
		return "ElectronicsDTO [id=" + id + ", title=" + title + ", brand=" + brand + ", price=" + price
				+ ", description=" + description + ", state=" + state + ", ownerPhoneNumber=" + ownerPhoneNumber
				+ ", ownerAddress=" + ownerAddress + ", pid=" + pid + ", type=" + type + ", priority=" + priority
				+ ", zone=" + zone + ", image1=" + Arrays.toString(image1) + ", image2=" + Arrays.toString(image2)
				+ ", image3=" + Arrays.toString(image3) + ", image4=" + Arrays.toString(image4) + ", image5="
				+ Arrays.toString(image5) + "]";
	}
}

package com.mer.dto.items.cloths;

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
@Table(name="cloths")
public class ClothsDTO implements Serializable{
	
	@Id
	@GenericGenerator(name="incrementer",strategy="increment")
	@GeneratedValue(generator="incrementer")
	private long id;
	@NotNull
	private String title;
	private String state;
	private String model;
	private long visiters;
	private String gender;
	private String description;
	private long pid;
	private String province;
	@NotNull
	private double price;
	private Date uploadDate;
	private int priority;
	private String zone;
	@NotNull
	private String ownerPhoneNumber;
	@NotNull
	private String address;
	private String catagorey;
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
	public ClothsDTO() {
		this.catagorey="cloths";
	}
	public ClothsDTO(long id, @NotNull String title, String state, String model, long visiters, String gender,
			String description, long pid, String province, @NotNull double price, Date uploadDate, int priority,
			String zone, @NotNull String ownerPhoneNumber, @NotNull String address, byte[] image1, byte[] image2,
			byte[] image3, byte[] image4, byte[] image5) {
		super();
		this.id = id;
		this.title = title;
		this.state = state;
		this.model = model;
		this.visiters = visiters;
		this.gender = gender;
		this.description = description;
		this.pid = pid;
		this.province = province;
		this.price = price;
		this.uploadDate = uploadDate;
		this.priority = priority;
		this.zone = zone;
		this.ownerPhoneNumber = ownerPhoneNumber;
		this.address = address;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
		this.catagorey="cloths";
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getVisiters() {
		return visiters;
	}
	public void setVisiters(long visiters) {
		this.visiters = visiters;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
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
		return "ClothsDTO [id=" + id + ", title=" + title + ", state=" + state + ", model=" + model + ", visiters="
				+ visiters + ", gender=" + gender + ", description=" + description + ", pid=" + pid + ", province="
				+ province + ", price=" + price + ", uploadDate=" + uploadDate + ", priority=" + priority + ", zone="
				+ zone + ", ownerPhoneNumber=" + ownerPhoneNumber + ", address=" + address + ", catagorey=" + catagorey
				+ ", image1=" + Arrays.toString(image1) + ", image2=" + Arrays.toString(image2) + ", image3="
				+ Arrays.toString(image3) + ", image4=" + Arrays.toString(image4) + ", image5="
				+ Arrays.toString(image5) + "]";
	}

	
	
	
	

}

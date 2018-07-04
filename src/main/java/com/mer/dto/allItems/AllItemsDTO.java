package com.mer.dto.allItems;

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
@Table(name="Items")
public class AllItemsDTO implements Serializable{
	
	@Id
	@GenericGenerator(name="incrementer",strategy="increment")
	@GeneratedValue(generator="incrementer")
	private long id;
	@NotNull
	private String itemName;
	@NotNull
	private String itemCatagory;
	private String model;
	private String state;
	@NotNull
	private double price;
	private Date uploadDate;
	private String description;
	private long totalItems;
	
	@NotNull
	private String province;
	private long pid;
	@NotNull
	private long ownerPhoneNumber;
	private String ownerEmailAddress;
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
	
	public AllItemsDTO() {
	}
	public AllItemsDTO(long id, @NotNull String itemName, @NotNull String itemCatagory, String model, String state,
			@NotNull double price, Date uploadDate, String description, long totalItems, @NotNull String province,
			long pid, @NotNull long ownerPhoneNumber, String ownerEmailAddress, int priority, String zone,
			byte[] image1, byte[] image2, byte[] image3, byte[] image4, byte[] image5) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemCatagory = itemCatagory;
		this.model = model;
		this.state = state;
		this.price = price;
		this.uploadDate = uploadDate;
		this.description = description;
		this.totalItems = totalItems;
		this.province = province;
		this.pid = pid;
		this.ownerPhoneNumber = ownerPhoneNumber;
		this.ownerEmailAddress = ownerEmailAddress;
		this.priority = priority;
		this.zone = zone;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
	}








	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCatagory() {
		return itemCatagory;
	}

	public void setItemCatagory(String itemCatagory) {
		this.itemCatagory = itemCatagory;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getProvince() {
		return province;
	}



	public void setProvince(String province) {
		this.province = province;
	}



	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public long getOwnerPhoneNumber() {
		return ownerPhoneNumber;
	}

	public void setOwnerPhoneNumber(long ownerPhoneNumber) {
		this.ownerPhoneNumber = ownerPhoneNumber;
	}

	public String getOwnerEmailAddress() {
		return ownerEmailAddress;
	}

	public void setOwnerEmailAddress(String ownerEmailAddress) {
		this.ownerEmailAddress = ownerEmailAddress;
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



	public long getTotalItems() {
		return totalItems;
	}



	public void setTotalItems(long totalItems) {
		this.totalItems = totalItems;
	}



	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", itemName=" + itemName + ", itemCatagory=" + itemCatagory + ", model=" + model
				+ ", state=" + state + ", price=" + price + ", uploadDate=" + uploadDate + ", description="
				+ description + ", city=" + province + ", pid=" + pid + ", ownerPhoneNumber=" + ownerPhoneNumber
				+ ", ownerEmailAddress=" + ownerEmailAddress + "]";
	}
	
}

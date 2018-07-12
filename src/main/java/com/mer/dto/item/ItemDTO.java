package com.mer.dto.item;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import com.mer.dto.image.ImageDTO;

@Entity
@Table()
public class ItemDTO {
	
	@Id
	@GenericGenerator(name="incrementer",strategy="increment")
	@GeneratedValue(generator="incrementer")
	private long id;
	private String title;
	private String brand;
	private String model;
	private double price;
	private String condation;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date uploadDate;
	private long ownerId;
	private long visiters;
	private String description;
	private long paymentId;
	private int priority;
	private String province;
	private String kmDriven;
	private String catagorey;
	private String subCatagorey;
	private String fuel;
	private String madeOfCountry;
	private String insuranceExpireDate;
	private String color;
	private String priceMonetaryUnit;
	private String gender;
	private String itemAvailableAddress;
	private String zone;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="itemId")
	private List<ImageDTO> image;
	@Transient
	private List<MultipartFile> imageFromUser;
	
	public ItemDTO() {
		imageFromUser=new ArrayList<MultipartFile>();
		// TODO Auto-generated constructor stub
	}
	
	


	public ItemDTO(long id, String title, String brand, String model, double price, String condation, Date uploadDate,
			long ownerId, long visiters, String description, long paymentId, int priority, String province,
			String kmDriven, String catagorey, String subCatagorey, String fuel, String madeOfCountry,
			String insuranceExpireDate, String color, String priceMonetaryUnit, String gender,
			String itemAvailableAddress, String zone, List<ImageDTO> image,List<MultipartFile> imageFromUser) {
		super();
		this.id = id;
		this.title = title;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.condation = condation;
		this.uploadDate = uploadDate;
		this.ownerId = ownerId;
		this.visiters = visiters;
		this.description = description;
		this.paymentId = paymentId;
		this.priority = priority;
		this.province = province;
		this.kmDriven = kmDriven;
		this.catagorey = catagorey;
		this.subCatagorey = subCatagorey;
		this.fuel = fuel;
		this.madeOfCountry = madeOfCountry;
		this.insuranceExpireDate = insuranceExpireDate;
		this.color = color;
		this.priceMonetaryUnit = priceMonetaryUnit;
		this.gender = gender;
		this.itemAvailableAddress = itemAvailableAddress;
		this.zone = zone;
		this.image = image;
		this.imageFromUser = imageFromUser;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public List<MultipartFile> getImageFromUser() {
		return imageFromUser;
	}
	public void setImageFromUser(List<MultipartFile> imageFromUser) {
		this.imageFromUser = imageFromUser;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCondation() {
		return condation;
	}
	public void setCondation(String condation) {
		this.condation = condation;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}
	public long getVisiters() {
		return visiters;
	}
	public void setVisiters(long visiters) {
		this.visiters = visiters;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getKmDriven() {
		return kmDriven;
	}
	public void setKmDriven(String kmDriven) {
		this.kmDriven = kmDriven;
	}
	public String getCatagorey() {
		return catagorey;
	}
	public void setCatagorey(String catagorey) {
		this.catagorey = catagorey;
	}
	public String getSubCatagorey() {
		return subCatagorey;
	}
	public void setSubCatagorey(String subCatagorey) {
		this.subCatagorey = subCatagorey;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getMadeOfCountry() {
		return madeOfCountry;
	}
	public void setMadeOfCountry(String madeOfCountry) {
		this.madeOfCountry = madeOfCountry;
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
	public String getPriceMonetaryUnit() {
		return priceMonetaryUnit;
	}
	public void setPriceMonetaryUnit(String priceMonetaryUnit) {
		this.priceMonetaryUnit = priceMonetaryUnit;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getItemAvailableAddress() {
		return itemAvailableAddress;
	}
	public void setItemAvailableAddress(String itemAvailableAddress) {
		this.itemAvailableAddress = itemAvailableAddress;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public List<ImageDTO> getImage() {
		return image;
	}
	public void setImage(List<ImageDTO> image) {
		this.image = image;
	}
	
	

}

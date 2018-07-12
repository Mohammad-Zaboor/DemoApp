package com.mer.dto.image;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class ImageDTO implements Serializable{
	
	@Id
	@GenericGenerator(name="incrementer",strategy="increment")
	@GeneratedValue(generator="incrementer")
	private long id;
	private String imageType;
	private String imageName;
	private String imageUrl;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date uploadDate;
	
	public ImageDTO() {
		// TODO Auto-generated constructor stub
	}
	



	public ImageDTO(String imageType, String imageName, String imageUrl, Date uploadDate) {
		super();
		this.imageType = imageType;
		this.imageName = imageName;
		this.imageUrl = imageUrl;
		this.uploadDate = uploadDate;
	}




	public ImageDTO(long id, String imageType, String imageName, String imageUrl, Date uploadDate) {
		super();
		this.id = id;
		this.imageType = imageType;
		this.imageName = imageName;
		this.imageUrl = imageUrl;
		this.uploadDate = uploadDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	

}

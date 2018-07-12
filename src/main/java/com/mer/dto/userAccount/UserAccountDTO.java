package com.mer.dto.userAccount;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import com.mer.dto.item.ItemDTO;

@Entity
@Table(name="userAccountTable")
public class UserAccountDTO 
{
	@Id
	@GenericGenerator(name="userId",strategy="increment")
	@GeneratedValue(generator="userId")
	private int id;
	private String userFirstName;
	private String userLastName;
	@NotNull
	private String provice;
	private String userEmail;
	private long userPhoneNumber;
	private String userAddress;
	@NotNull
	private String userPassword;
	private String confirmPassword;
	private boolean acceptLisence;
	private boolean status;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date userRegisterDate;
	@OneToMany()
	@JoinColumn(name="ownerId")
	private List<ItemDTO> item;
	
	public UserAccountDTO() {
		System.out.println("useraccountDTO created");
	}

	public UserAccountDTO(int id, String userFirstName, String userLastName, @NotNull String provice, String userEmail,
			long userPhoneNumber, String userAddress, @NotNull String userPassword, String confirmPassword,
			boolean acceptLisence, boolean status, Date userRegisterDate, List<ItemDTO> item) {
		super();
		this.id = id;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.provice = provice;
		this.userEmail = userEmail;
		this.userPhoneNumber = userPhoneNumber;
		this.userAddress = userAddress;
		this.userPassword = userPassword;
		this.confirmPassword = confirmPassword;
		this.acceptLisence = acceptLisence;
		this.status = status;
		this.userRegisterDate = userRegisterDate;
		this.item = item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getProvice() {
		return provice;
	}

	public void setProvice(String provice) {
		this.provice = provice;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public long getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(long userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public boolean isAcceptLisence() {
		return acceptLisence;
	}

	public void setAcceptLisence(boolean acceptLisence) {
		this.acceptLisence = acceptLisence;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getUserRegisterDate() {
		return userRegisterDate;
	}

	public void setUserRegisterDate(Date userRegisterDate) {
		this.userRegisterDate = userRegisterDate;
	}

	public List<ItemDTO> getItem() {
		return item;
	}

	public void setItem(List<ItemDTO> item) {
		this.item = item;
	}

	

	
	

}

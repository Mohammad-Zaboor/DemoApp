package com.mer.dao.userAccount;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mer.dto.userAccount.UserAccountDTO;

@Repository
public interface UserAcccountRepositry extends JpaRepository<UserAccountDTO, Integer> {

	
	public UserAccountDTO findUserAccountDTOByUserEmailAndUserPassword(String userEmail,String userPassword);
	
	public UserAccountDTO findUserAccountDTOByUserPhoneNumberAndUserPassword(long userPhoneNumber,String userPassword);
	
	public String getUserPasswordByUserPhoneNumber(Long userPhoneNumber);
	
	public UserAccountDTO getUserPasswordByUserEmail(String userEmail);
	
	public UserAccountDTO findUserAccountDTOByUserPhoneNumber(long userPhoneNumber);
	
	public UserAccountDTO findUserAccountDTOByUserPassword(String userPassword);
	
}

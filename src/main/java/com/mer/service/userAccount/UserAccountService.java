package com.mer.service.userAccount;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.hibernate.dialect.identity.GetGeneratedKeysDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mer.dao.userAccount.UserAcccountRepositry;
import com.mer.dto.userAccount.UserAccountDTO;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;

@Service
public class UserAccountService {
	
	private JavaMailSender mailSender;

	private SimpleMailMessage mailMessage=new SimpleMailMessage();
	
	@Autowired
	private UserAcccountRepositry userAcccountRepositry;
	
	public static final String ACCOUNT_SID = "ACe3307b0f844d8f6fb47073f9dfaf5339";
	public static final String AUTH_TOKEN = "d0a5b786593054f5c83eaee57e0b23c0";
	public static final String TWILIO_NUMBER = "+15612575592";

	@Autowired
	public UserAccountService(JavaMailSender javaMailSender) {
		this.mailSender=javaMailSender;
		
	}

	public int saveUser(UserAccountDTO userAccountDTO) {
		
		UserAccountDTO dtoFromDB=userAcccountRepositry.findUserAccountDTOByUserPhoneNumber(userAccountDTO.getUserPhoneNumber());
		if(dtoFromDB==null)
		{
			Long phone=userAccountDTO.getUserPhoneNumber();
			System.out.println("inside save method");
			System.out.println(phone.toString().length());
			if(phone.toString().length()==10 || phone.toString().length()==14 )
			{
				userAccountDTO.setUserRegisterDate(new Date());
				userAcccountRepositry.save(userAccountDTO);
				System.out.println("User saved");
				if(userAccountDTO.getUserEmail().length()>2)
				{
					System.out.println("Sending email"+userAccountDTO.getUserEmail());
					mailMessage.setFrom("merwaismuafaq10@gmail.com");
					mailMessage.setTo(userAccountDTO.getUserEmail());
					mailMessage.setSubject("Congertulation "+userAccountDTO.getUserFirstName()+" you are part of BurkaFarkhar family");
					mailMessage.setText("you can access to our application using\nUser Name:"+userAccountDTO.getUserPhoneNumber()+"\n Password:"+userAccountDTO.getUserPassword());
					mailSender.send(mailMessage);
					System.out.println("email sended");
					sendSMS(userAccountDTO.getUserPhoneNumber());
				}
				return 1;
			}
			else {
				return 2;
			}
		}	
		else
		{
			return 3;
		}
	}
	
	public UserAccountDTO loginByUserPhoneNumber(long userPhoneNumber,String userPassword)
	{
		UserAccountDTO userAccountDTO=userAcccountRepositry.findUserAccountDTOByUserPhoneNumberAndUserPassword(userPhoneNumber, userPassword);
		return userAccountDTO;
	
	}
	public boolean loginByUserEmail(String userEmail,String userPassword) {
		
		UserAccountDTO userAccountDTO=userAcccountRepositry.findUserAccountDTOByUserEmailAndUserPassword(userEmail, userPassword);
		if(userAccountDTO==null) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean getPasswordByUserEamil(String userEmail) {
		UserAccountDTO userAccountDTO=userAcccountRepositry.getUserPasswordByUserEmail(userEmail);
		if(userAccountDTO==null) {
			return false;
		}
		else {
			mailMessage.setFrom("merwaismuafaq10@gmail.com");
			mailMessage.setTo(userEmail);
			mailMessage.setSubject("BurkaFarkar has send you your password");
			mailMessage.setText("Dear "+userAccountDTO.getUserFirstName()+"\n your password is:"+userAccountDTO.getUserPassword());
			mailSender.send(mailMessage);
			
			return true;
		}
	}
	
	public boolean findUserAccountDTOByUserPassword(String userPassword) {
		return (userAcccountRepositry.findUserAccountDTOByUserPassword(userPassword) != null);
	}
	public void updateUserAccoutDTO(UserAccountDTO userAccountDTO) {
		userAcccountRepositry.saveAndFlush(userAccountDTO);
	}
	
	public void sendSMS(Long number) {
	    try {
	        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
	 
	        // Build a filter for the MessageList
	        List<NameValuePair> params = new ArrayList<NameValuePair>();
	        params.add(new BasicNameValuePair("Body", "wellcome to BurkhaFarkhar family your requisted is granted"));
	        params.add(new BasicNameValuePair("To","+91"+number.toString())); //Add real number here
	        params.add(new BasicNameValuePair("From", TWILIO_NUMBER));

	        MessageFactory messageFactory = client.getAccount().getMessageFactory();
	        Message message = messageFactory.create(params);
	        System.out.println(number);
	        System.out.println("message sended to your number");
	    } 
	    catch (TwilioRestException e) {
	        System.out.println(e.getErrorMessage());
	    }
	}
	public void changeUserEmail(String email) {
		
	}
}

package com.mer.controller.userAccount;



import java.text.SimpleDateFormat;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mer.dao.userLogin.UserLogin;
import com.mer.dto.userAccount.Response;
import com.mer.dto.userAccount.UserAccountDTO;
import com.mer.service.userAccount.UserAccountService;

@RestController
@RequestMapping({ "/burkaFarkhar", "/" })
public class UserAccountController {
	@Autowired
	private UserAccountService userAccountService;

	public UserAccountController() {
	}


	@GetMapping("mainPage1")
	public ModelAndView userLanding() {
		return new ModelAndView("mainPage.html");
	}

	@GetMapping("/createUserAccount")
	public ModelAndView createUserAccount() {
		return new ModelAndView("createUserAccount");
	}
	
	@GetMapping("/feedBack")
	public ModelAndView userFeedback() {
		return new ModelAndView("feedback.html");
	}
	
	@GetMapping("/userSetting")
	public ModelAndView userSetting() {
		return new ModelAndView("setting.html");
	}
	@GetMapping("/userChats")
	public ModelAndView userChats() {
			return new ModelAndView("userChat.html");
	}	
	@GetMapping("/userUploads")
	public ModelAndView userUploads() {
		return new ModelAndView("userUploads.html");
	}		

	@PostMapping(value="/creatAccount",produces = { MediaType.APPLICATION_JSON_VALUE },consumes = MediaType.APPLICATION_JSON_VALUE)
	public Response createAccountPost(HttpSession session,@RequestBody UserAccountDTO userAccountDTO) {
		
		System.out.println("Saving user");
		int flag = userAccountService.saveUser(userAccountDTO);
		if (flag == 2) {
			return new Response("Phone number should be 10 or 14 digites");
		} else if (flag == 3) {
			return new Response("An account with this phone number already exist please enter another number");
		} else {
			return new Response("Account created successfully");
		}
	}

	// user login controller mehtod
	@PostMapping(value="/userLogin" )
	public ModelAndView userLogin(HttpServletRequest request,UserLogin userLogin) {
		UserAccountDTO userAccountDTO = userAccountService.loginByUserPhoneNumber(userLogin.getUserPhone(),
				userLogin.getUserPassword());
		if (userAccountDTO == null) {
		    return new ModelAndView("index.html","message","wrong user name or password!");
		} else {
			HttpSession session = request.getSession(true);
			session.setAttribute("userAccountDTO", userAccountDTO);
			 return new ModelAndView("mainPage.html");
		}
	}

	// user forgot password

	@PostMapping(value="/forgotPassword",produces =MediaType.APPLICATION_JSON_VALUE ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Response forgotPasswordPost(@RequestBody UserAccountDTO userAccountDTO) {
		System.out.println("forgot password started"+userAccountDTO.getUserEmail());
		String userEmail =userAccountDTO.getUserEmail();
		boolean flag = userEmail.contains("@");
		System.out.println("inside forgot password"+userEmail);
		//send password to email
		if (flag) {
			if (userAccountService.getPasswordByUserEamil(userEmail)) {
				return new Response("We have just send your password to your given email");
			} else {
				return new Response("Wrong email please try again");
			}
		}
		
		// send password to number
		else {
			return new Response("Mobile number is not supported in this eddition pease enter your email");
		}
	}

	// Going to user home
	@GetMapping("/userHome")
	public ModelAndView userHome() {
		return new ModelAndView("userHome");
	}

	// user change password
	@GetMapping("changePassword")
	public ModelAndView userChangePassword() {
		return new ModelAndView("userChangePassword");
	}

	@PostMapping("/userChangePassword")
	public Response userChangePassword(HttpServletRequest req,@RequestBody UserAccountDTO userAccountDTO) {

		HttpSession session = req.getSession(false);
		UserAccountDTO userAccountDTOFromSession = (UserAccountDTO) session.getAttribute("userAccountDTO");
		if (userAccountDTOFromSession.getUserPassword().equals(userAccountDTO.getUserPassword())) {

			if (userAccountDTO.getUserFirstName().equals(userAccountDTO.getConfirmPassword())) {
				userAccountDTOFromSession.setUserPassword(userAccountDTO.getUserFirstName());
				userAccountService.updateUserAccoutDTO(userAccountDTOFromSession);
				return new Response( "your password changed successfully");
			} else {
				return new Response("you have confirmed wrong password");
			}
		} else {
			return new Response("Wrong password please enter your corrent password");
		}
	}

	// user logout
	@GetMapping("/userLogout")
	public ModelAndView userLogout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		session.invalidate();
		return new ModelAndView("index");
	}
	
	// CHANGE USER EMAIL ADDRESS
	@PostMapping(value="/changeEmail",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Response changeEmail(HttpServletRequest request,@RequestBody UserAccountDTO userAccountDTO) {
		
		System.out.println("inside user change email");
		HttpSession session = request.getSession(false);
		UserAccountDTO userAccountDTOFromSession = (UserAccountDTO) session.getAttribute("userAccountDTO");
		userAccountDTOFromSession.setUserEmail(userAccountDTO.getUserEmail());
		userAccountService.updateUserAccoutDTO(userAccountDTOFromSession);
		return new Response("Email Changed successfully");
	}
	
	//change user contact details
	@PostMapping(value="/changeUserContact", consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Response changeUserContact(HttpServletRequest request,@RequestBody UserAccountDTO userAccountDTO) {
		HttpSession session = request.getSession(false);
		System.out.println("inside change contact details");
		UserAccountDTO userAccountDTOFromSession = (UserAccountDTO) session.getAttribute("userAccountDTO");
		userAccountDTOFromSession.setUserPhoneNumber(userAccountDTO.getUserPhoneNumber());
		userAccountDTOFromSession.setProvice(userAccountDTO.getProvice());
		userAccountDTOFromSession.setUserAddress(userAccountDTO.getUserAddress());
		userAccountService.updateUserAccoutDTO(userAccountDTOFromSession);
		return  new Response("Your datails changed successfully");
		
	}
	

}

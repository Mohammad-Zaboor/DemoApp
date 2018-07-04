package com.mer.controller.feedback;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mer.dto.feedback.FeedBackDTO;
import com.mer.dto.userAccount.Response;
import com.mer.service.feedback.FeedBackService;

@RestController
@RequestMapping("/feedback")
public class FeedBackController {
	
	@Autowired
	private FeedBackService feedBackService;
	
	public FeedBackController() {
	}
	
	@PostMapping(value="/saveUserFeedback",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Response saveFeedback(@RequestBody FeedBackDTO feedBackDTO) {
		
		System.out.println("inside feedback controller");
		if(feedBackService.save(feedBackDTO)) {
			return new Response("Your feedback is submited");
		}
		else {
			return new Response("Please fill out all the fields");
		}
		
	}
	
	/*public static void main(String[] args) {
		
		
		Date d=new Date();
		date(d);
	}
	public static void date(@DateTimeFormat(pattern="YYYY-MM-dd") Date n) {
		System.out.println(n);
	}*/
}

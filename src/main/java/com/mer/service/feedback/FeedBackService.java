package com.mer.service.feedback;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mer.dao.feedback.FeedBacRepositry;
import com.mer.dto.feedback.FeedBackDTO;

@Service
public class FeedBackService {
	
	
	@Autowired
	private FeedBacRepositry feedBacRepositry;

	public boolean save(FeedBackDTO feedBackDTO) {
		
		feedBackDTO.setFeedbackSubmitDate(new Date());
		if(feedBackDTO.getFeedbackSubject().length()>0 || feedBackDTO.getUserEmail().length()>0 || feedBackDTO.getFeedbackText().length()>0) {
			feedBacRepositry.save(feedBackDTO);
			return true;
		}
		return false;
	}
}

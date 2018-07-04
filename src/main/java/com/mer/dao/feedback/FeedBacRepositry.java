package com.mer.dao.feedback;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mer.dto.feedback.FeedBackDTO;
@Repository
public interface FeedBacRepositry extends JpaRepository<FeedBackDTO, Integer>{
	
	

}

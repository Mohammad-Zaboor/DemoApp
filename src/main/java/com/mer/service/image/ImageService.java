package com.mer.service.image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mer.dao.image.ImageRepositry;
import com.mer.dto.image.ImageDTO;

@Service
public class ImageService {
	
	
	@Autowired
	private ImageRepositry imageRepositry;

	public ImageService() {
		// TODO Auto-generated constructor stub
	}
	
	public void saveImage(ImageDTO imageDTO) {
		imageRepositry.save(imageDTO);
	}
}

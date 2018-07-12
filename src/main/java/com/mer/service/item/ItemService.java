package com.mer.service.item;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mer.dao.item.ItemRepositry;
import com.mer.dto.image.ImageDTO;
import com.mer.dto.item.ItemDTO;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepositry itemRepositry;
	
	private String imageURL="D:\\BurkaFarkharImages";

	public ItemService() {
	}
	
	public String saveItem(ItemDTO itemDTO,List<MultipartFile> multipartFile) {
		System.out.println("item service started");
		List<ImageDTO> images=new ArrayList<>();
		System.out.println("Item title"+itemDTO.getTitle());
		Iterator<MultipartFile> iterator=multipartFile.iterator();
		while(iterator.hasNext()) {
			MultipartFile image=(MultipartFile)iterator.next();
			String imageName=image.getOriginalFilename();
			String imageType=imageName.substring(imageName.lastIndexOf('.'));
			System.out.println(imageType);
			if(imageType.equals(".jpg") || imageType.equals(".png") || imageType.equals(".jpeg") ||imageType.equals(".gif") || imageType.equals(".bmp")) {
				writeImageInToDirectry(image);
				}
			else {
				return "Only images are allowed! try again.";
				}
				images.add(new ImageDTO( imageType, imageName, imageURL+"\\"+imageName, new Date()));
		}
		itemDTO.setImage(images);
		itemRepositry.save(itemDTO);
		return "Item uploaded successfully.";
	}
	public boolean writeImageInToDirectry(MultipartFile image) {
		try {
			byte[] imageByte=image.getBytes();
			Path path=Paths.get(imageURL, image.getOriginalFilename());
			Files.write(path,imageByte);
			return true;
		} catch (IOException e) {
			return false;
		}
	}
}

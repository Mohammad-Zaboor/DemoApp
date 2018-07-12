package com.mer.controller.item;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.lang3.ArrayUtils;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.mer.dto.item.ItemDTO;
import com.mer.dto.userAccount.Response;
import com.mer.dto.userAccount.UserAccountDTO;
import com.mer.service.image.ImageService;
import com.mer.service.item.ItemService;

@RestController
@RequestMapping(value= {"/item","/"})
public class ItemController 
{

	@Autowired
	private ItemService itemService;
	@Autowired
	private ImageService imageService;
	public ItemController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/uploadItem")
	public ModelAndView uploadItem() {
		return new ModelAndView("uploadVehical.html");
	}
	
	@PostMapping(value="/uploadItem")
	public Response saveItem(MultipartHttpServletRequest requist,ItemDTO itemDTO) {
		System.out.println("upload method started");
		System.out.println(itemDTO.getTitle());
		List<MultipartFile> itemImages=new ArrayList<>();
		Iterator<String> iterator=requist.getFileNames();
		while(iterator.hasNext()) {
			String image=iterator.next();
			MultipartFile multipartFile=(MultipartFile)requist.getFile(image);
			if(!multipartFile.isEmpty()) {
				itemImages.add(multipartFile);
			}
		}
		HttpSession session=requist.getSession();
		UserAccountDTO userAccountDTO=(UserAccountDTO)session.getAttribute("userAccountDTO");
		List<ItemDTO> list=new ArrayList<>();
		list.add(itemDTO);
		userAccountDTO.setItem(list);
		itemDTO.setOwnerId(userAccountDTO.getId());
		String outcome=itemService.saveItem(itemDTO,itemImages); 
         return new Response(outcome);
	}
}

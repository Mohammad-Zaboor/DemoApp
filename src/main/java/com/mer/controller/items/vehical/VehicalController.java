package com.mer.controller.items.vehical;

import org.apache.tomcat.util.http.fileupload.UploadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mer.dto.items.vehical.VehicalDTO;
import com.mer.dto.userAccount.Response;
import com.mer.service.items.vehical.VehicalService;

@Controller
@RestController
@RequestMapping({"/vehicals","/"})
public class VehicalController {
	
	@Autowired
	private VehicalService vehicalService;

	public VehicalController() {
	}
	@GetMapping("/uploadVehical")
	public ModelAndView UploadVehical() {
		return new ModelAndView("uploadVehical.html");
	}
	@PostMapping(value="/uploadVehical",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Response uploadVehical(@RequestBody VehicalDTO vehicalDTO) {
		
		System.out.println("upload vehica started");
		if(vehicalDTO.getPriceMonetaryUnit()=="dollar") {
			vehicalDTO.setPrice(vehicalDTO.getPrice()*50);
		}
		else if(vehicalDTO.getPriceMonetaryUnit()=="keldar") {
			vehicalDTO.setPrice(vehicalDTO.getPrice()*0.5);
		}
		vehicalService.saveVehical(vehicalDTO);
		return new Response("Vehical uploaded successfully");
	}
	
}

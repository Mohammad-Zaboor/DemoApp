package com.mer.service.items.vehical;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mer.dao.items.vehical.VehicalRepositry;
import com.mer.dto.items.vehical.VehicalDTO;



@Service
public class VehicalService {
	
	@Autowired
	private VehicalRepositry vehicalRepositry;

	public VehicalService() {
	}
	
	public List<VehicalDTO> getAllVehicals()
	{
		return null;
	}
	
	public void saveVehical(VehicalDTO vehicalDTO) {
		vehicalRepositry.save(vehicalDTO);
	}
}

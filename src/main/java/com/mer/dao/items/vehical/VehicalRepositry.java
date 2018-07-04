package com.mer.dao.items.vehical;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mer.dto.items.vehical.VehicalDTO;
@Repository
public interface VehicalRepositry extends JpaRepository<VehicalDTO, Integer> {
	
	@Query("SELECT v from VehicalDTO v where v.provice = :ownerProvince")
	public List<VehicalDTO> findByProvince(@Param("ownerProvince")String provice);

}

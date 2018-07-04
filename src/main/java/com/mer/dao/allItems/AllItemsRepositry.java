package com.mer.dao.allItems;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mer.dto.allItems.AllItemsDTO;

public interface AllItemsRepositry extends JpaRepository<AllItemsDTO,Integer> {
	
	
	

}

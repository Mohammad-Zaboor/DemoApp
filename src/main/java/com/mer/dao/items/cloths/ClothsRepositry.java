package com.mer.dao.items.cloths;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mer.dto.items.cloths.ClothsDTO;

@Repository
public interface ClothsRepositry extends JpaRepository<ClothsDTO, Integer>{

}

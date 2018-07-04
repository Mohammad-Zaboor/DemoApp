package com.mer.dao.items.bike;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mer.dto.items.bike.BikeDTO;

@Repository
public interface BikeRepositry extends JpaRepository<BikeDTO,Integer>{

}

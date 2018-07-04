package com.mer.dao.items.electronics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mer.dto.items.electronics.ElectronicsDTO;

@Repository
public interface ElectronicsRepositry extends JpaRepository<ElectronicsDTO, Integer> {

}

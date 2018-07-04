package com.mer.dao.items.computer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mer.dto.items.computer.ComputerDTO;

@Repository
public interface ComputerRepositry extends JpaRepository<ComputerDTO, Integer>{

}

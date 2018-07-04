package com.mer.dao.items.mobile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mer.dto.items.mobile.MobileDTO;

@Repository
public interface MobileRepositry extends JpaRepository<MobileDTO, Integer>{

}

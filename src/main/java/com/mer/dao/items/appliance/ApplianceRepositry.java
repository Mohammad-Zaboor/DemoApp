package com.mer.dao.items.appliance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mer.dto.items.appliance.ApplianceDTO;

@Repository
public interface ApplianceRepositry extends JpaRepository<ApplianceDTO, Integer> {

}

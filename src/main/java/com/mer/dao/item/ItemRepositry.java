package com.mer.dao.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mer.dto.item.ItemDTO;

@Repository
public interface ItemRepositry extends JpaRepository<ItemDTO, Integer> {

}

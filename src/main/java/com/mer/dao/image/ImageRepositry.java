package com.mer.dao.image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mer.dto.image.ImageDTO;

@Repository
public interface ImageRepositry extends JpaRepository<ImageDTO,Integer> {

}

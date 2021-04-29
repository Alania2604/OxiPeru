package com.oxiperu.appweb.repository;

import com.oxiperu.appweb.model.contacto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface  contactoRepository extends JpaRepository<contacto, Integer>{

    
}
package com.oxiperu.appweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.repository;
import com.oxiperu.appweb.model.Contacto;
@repository
public interface ContactoRepository extends JpaRepository<Contacto,Integer>{

}

    

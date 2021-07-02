package com.oxiperu.appweb.repository;

import com.oxiperu.appweb.model.Pago;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer>{
    
}

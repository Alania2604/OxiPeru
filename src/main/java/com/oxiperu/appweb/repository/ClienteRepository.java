package com.oxiperu.appweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.repository;
import com.oxiperu.appweb.model.Cliente;
@repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}

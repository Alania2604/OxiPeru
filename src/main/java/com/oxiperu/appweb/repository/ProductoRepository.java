package com.oxiperu.appweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.repository;
import com.oxiperu.appweb.model.Producto;
@repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{

}

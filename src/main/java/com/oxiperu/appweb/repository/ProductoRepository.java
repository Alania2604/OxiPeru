package com.oxiperu.appweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.oxiperu.appweb.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{

    @Query(value = "SELECT o FROM Producto o WHERE o.status='A'")
    List<Producto> getAllActiveProductos();
}

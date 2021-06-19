package com.oxiperu.appweb.repository;

import java.util.List;
import java.util.Optional;

import com.oxiperu.appweb.model.Producto;
import com.oxiperu.appweb.model.Proforma;
import com.oxiperu.appweb.model.Usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD
@Repository
=======

>>>>>>> 01efe8c6d78502109aad941bff3729bf8889acc5
public interface ProformaRepository extends JpaRepository<Proforma, Integer> {
    @Query(value = "SELECT o FROM Proforma o WHERE o.user=?1 And o.status='PENDING'")
    List<Proforma> findItemsByUsuario(Usuario user);

    @Query(value = "SELECT o FROM Proforma o WHERE o.user=?1 And o.product=?2 And o.status='PENDING'")
    Optional<Proforma> findProformaByUsuarioAndProducto(Usuario user, Producto product);
}

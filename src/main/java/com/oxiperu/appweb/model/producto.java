package com.oxiperu.appweb.model;

<<<<<<< HEAD
public class Producto{
=======
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_product")

public class producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> b5b1dd1271393e2be6959797a6faf2134a8b1f1f
    private Long id;
    private String descripcion;
    private BigDecimal precio;
    
    
<<<<<<< HEAD
}
=======
}
>>>>>>> b5b1dd1271393e2be6959797a6faf2134a8b1f1f

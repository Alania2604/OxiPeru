package com.oxiperu.appweb.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_product")

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private BigDecimal precio;
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    private String imageFileName;
    private String status;
<<<<<<< HEAD

}

=======
<<<<<<< HEAD
   
}
=======
}
>>>>>>> 4d5aa59e76b1c131efa13e808735b1da0db9125a
>>>>>>> eca2a6f659ede8cf9404b1ac1f4b4a7fffbaf726

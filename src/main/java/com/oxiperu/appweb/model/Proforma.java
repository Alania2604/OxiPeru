package com.oxiperu.appweb.model;

import java.math.BigDecimal;
<<<<<<< HEAD
import java.util.Date;
=======
>>>>>>> 01efe8c6d78502109aad941bff3729bf8889acc5

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
<<<<<<< HEAD
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
=======
>>>>>>> 01efe8c6d78502109aad941bff3729bf8889acc5
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_proforma")

public class Proforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id")    
    private Producto product;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
   
    private Usuario user;
    private BigDecimal precio;
    private Integer cantidad;
<<<<<<< HEAD
    
   

    
=======
    @Builder.Default
    private String status="PENDING"; 
>>>>>>> 01efe8c6d78502109aad941bff3729bf8889acc5
}

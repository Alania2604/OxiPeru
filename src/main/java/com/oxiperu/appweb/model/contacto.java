package com.oxiperu.appweb.model;

import javax.validation.constraints.NotNull;
<<<<<<< HEAD

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
@Table(name = "t_contact")

public class Contacto {
=======
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
@Table(name = "t_contact")

public class Contacto{
>>>>>>> 4d5aa59e76b1c131efa13e808735b1da0db9125a
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @NotNull
<<<<<<< HEAD
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String phone; 
    @NotNull
    private String reason;
    
}
=======
    private String nombre;
    @NotNull
    private String email;
    @NotNull
    private String telefono; 
    @NotNull
    private String razon; 
    
}
   
>>>>>>> 4d5aa59e76b1c131efa13e808735b1da0db9125a

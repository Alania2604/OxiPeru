package com.oxiperu.appweb.model;

import javax.validation.constraints.NotNull;

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
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String phone; 
    @NotNull
    private String reason; 

<<<<<<< HEAD:src/main/java/com/oxiperu/appweb/model/Contacto.java
  
    

=======
>>>>>>> 01efe8c6d78502109aad941bff3729bf8889acc5:src/main/java/com/oxiperu/appweb/model/contacto.java
    
}


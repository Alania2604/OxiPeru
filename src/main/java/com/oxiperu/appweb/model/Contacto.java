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
<<<<<<< HEAD:src/main/java/com/oxiperu/appweb/model/Contacto.java
    private String reason;
    
=======
    private String reason; 
>>>>>>> eca2a6f659ede8cf9404b1ac1f4b4a7fffbaf726:src/main/java/com/oxiperu/appweb/model/contacto.java
}

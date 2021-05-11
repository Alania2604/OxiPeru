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

public class contacto{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @NotNull
    private String nombre;
    @NotNull
    private String email;
    @NotNull
    private String telefono; 
    @NotNull
    private String razon; 
    
}
   
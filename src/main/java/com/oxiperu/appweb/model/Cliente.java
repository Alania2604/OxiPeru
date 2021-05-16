package com.oxiperu.appweb.model;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
//import javax.persistence.FetchType;
//import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.JoinColumn;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="t_customer")
public class Cliente{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    //private String nombre;
    //private String apellido;
    //private String email;
    //private String telefono;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date birthdate; //fecha
    //private String genero; //Radio
}
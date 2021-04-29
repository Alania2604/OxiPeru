package com.oxiperu.appweb.model;


import javax.validation.contraints.NotNull;

import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.lang.invoke.InjectedProfile;

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
@Table(name="t_contact")
public class Contacto{
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String telefono;
    @NotNull
    private String razon;
    
}
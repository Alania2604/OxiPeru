package com.oxiperu.appweb.model;
import java.math.BigDecimal;
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
@Table(name="t_catalogo")
public class Catalogo{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idCatalogo;
    private BigDecimal precio;
    private String nombre;
    private String descripcion;


    public Long getIdCatalogo(){
     return this.idCatalogo;

    }
    public void setIdCatalogo(Long idCatalogo){
    this.idCatalogo=idCatalogo;

    }
    public BigDecimal getPrecio(){
     return this.precio;
    }
    public void setPrecio(BigDecimal precio){
        this.precio=precio;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getDescripcion(){
    return this.descripcion;

    }
    public void setDescripcion(String descripcion){
     this.descripcion=descripcion;
    }
    
}
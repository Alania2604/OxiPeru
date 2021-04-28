package com.oxiperu.appweb.model;
import java.math.BigDecimal;
public class Catalogo{
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
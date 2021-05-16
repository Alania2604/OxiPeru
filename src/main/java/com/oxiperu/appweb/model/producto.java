package com.oxiperu.appweb.model;
import java.math.BigDecimal;
public class Producto{
    private long idProducto;
    private BigDecimal precio;
    private String nombre;
    private String descripcion;

    public Long getIdProducto(){
     return this.idProducto;

    }
    public void setIdProducto(Long idProducto){
    this.idProducto=idProducto;

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

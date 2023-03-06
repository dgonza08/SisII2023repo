package com.mycompany.sisii2023dos;
// Generated 06-mar-2023 17:36:20 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categorias generated by hbm2java
 */
public class Categorias  implements java.io.Serializable {


     private int idCategoria;
     private String nombreCategoria;
     private double salarioBaseCategoria;
     private double complementoCategoria;
     private Set trabajadors = new HashSet(0);

    public Categorias() {
    }

	
    public Categorias(int idCategoria, String nombreCategoria, double salarioBaseCategoria, double complementoCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.salarioBaseCategoria = salarioBaseCategoria;
        this.complementoCategoria = complementoCategoria;
    }
    public Categorias(int idCategoria, String nombreCategoria, double salarioBaseCategoria, double complementoCategoria, Set trabajadors) {
       this.idCategoria = idCategoria;
       this.nombreCategoria = nombreCategoria;
       this.salarioBaseCategoria = salarioBaseCategoria;
       this.complementoCategoria = complementoCategoria;
       this.trabajadors = trabajadors;
    }
   
    public int getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getNombreCategoria() {
        return this.nombreCategoria;
    }
    
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    public double getSalarioBaseCategoria() {
        return this.salarioBaseCategoria;
    }
    
    public void setSalarioBaseCategoria(double salarioBaseCategoria) {
        this.salarioBaseCategoria = salarioBaseCategoria;
    }
    public double getComplementoCategoria() {
        return this.complementoCategoria;
    }
    
    public void setComplementoCategoria(double complementoCategoria) {
        this.complementoCategoria = complementoCategoria;
    }
    public Set getTrabajadors() {
        return this.trabajadors;
    }
    
    public void setTrabajadors(Set trabajadors) {
        this.trabajadors = trabajadors;
    }




}



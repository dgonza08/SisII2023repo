package com.mycompany.sisii2023dos;
// Generated 06-mar-2023 17:36:20 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empresas generated by hbm2java
 */
public class Empresas implements java.io.Serializable {


     private int idEmpresa;
     private String nombre;
     private String cif;
     private Set trabajadors = new HashSet(0);

    public Empresas() {
    }

	
    public Empresas(int idEmpresa, String nombre, String cif) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.cif = cif;
    }
    public Empresas(int idEmpresa, String nombre, String cif, Set trabajadors) {
       this.idEmpresa = idEmpresa;
       this.nombre = nombre;
       this.cif = cif;
       this.trabajadors = trabajadors;
    }
   
    public int getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCif() {
        return this.cif;
    }
    
    public void setCif(String cif) {
        this.cif = cif;
    }
    public Set getTrabajadors() {
        return this.trabajadors;
    }
    
    public void setTrabajadors(Set trabajadors) {
        this.trabajadors = trabajadors;
    }




}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sisii2023dos;

import java.util.Scanner;
import org.hibernate.*;
import java.util.List;

/**
 *
 * @author davic
 */
public class main {
    private static SessionFactory sf;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un DNI de un trabajador: ");
        String dni = sc.nextLine();

        Session sesion = sf.openSession();
        String consultaDni = "SELECT * FROM trabajador n WHERE n.trabajador.NIFNIE=:param1";
        Query query = sesion.createQuery(consultaDni); 
        query.setParameter("param1", dni);
        List lista = query.list();
        
        if(lista.isEmpty()){
            System.out.println("No existe el trabajador con ese DNI");
        }else{
            System.out.println("El trabajador con ese DNI existe");
        }
    }
}

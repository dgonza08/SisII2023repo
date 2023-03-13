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
    public static void main(String[] args) {
        // Inicializar session factory
        sf = HibernateUtil.getSessionFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un DNI de un trabajador: ");
        String dni = sc.nextLine();
        List lista = null;      

        try {
            Session session = sf.openSession();

            String consultaDni = "SELECT n FROM Nomina n WHERE n.trabajador.nifnie = :param1";
            Query query = session.createQuery(consultaDni);
            query.setParameter("param1", dni);
            lista = query.list();
        } catch (HibernateException e) {
            System.out.println("Error de hibernate: " + e.getMessage());
        }

        // Si la lista esta vacia pues eso eeeee
        if (lista.isEmpty()) {
            System.out.println("No existe el trabajador con ese DNI");
        } else {
            System.out.println("El trabajador con ese DNI existe");
        }
    }
}

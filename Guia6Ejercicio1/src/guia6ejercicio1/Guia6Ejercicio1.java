/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio1;

import guia6ejercicio1.Entidades.Libro;
import guia6ejercicio1.Servicios.ServicioLibros;

/**
 *
 * @author Usuario
 */
public class Guia6Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ServicioLibros m1 = new ServicioLibros();
        Libro l1 = new Libro();
        m1.llenardatos(l1);
        m1.mostrarDatos(l1);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio12;

import guia6ejercicio12.Entidades.Persona;
import guia6ejercicio12.Entidades.Servicios.ServiciosPersona;

/**
 *
 * @author Usuario
 */
public class Guia6Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiciosPersona l1 = new ServiciosPersona();
        Persona m1 = new Persona();
        l1.crearPersona(m1);
        System.out.println(" La edad es "+l1.calcularEdad(m1));
        int edad1 = l1.calcularEdad(m1);
        l1.menorQue(m1,edad1);
        l1.mostrarPersona(m1, edad1);
    }
    
}

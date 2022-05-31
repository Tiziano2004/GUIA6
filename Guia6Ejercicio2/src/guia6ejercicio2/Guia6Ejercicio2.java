/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio2;

import guia6ejercicio2.Entidades.Circunferencia;

/**
 *
 * @author Usuario
 */
public class Guia6Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia m1 = new Circunferencia();
        m1.crearCircunferencia();
        System.out.println(" El radio es "+ m1.getRadio());
        m1.area();
        System.out.println(m1);
        m1.perimetro();
        System.out.println(m1);
    }
    
}

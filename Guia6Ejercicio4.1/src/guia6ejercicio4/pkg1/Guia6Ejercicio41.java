/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio4.pkg1;

import guia6ejercicio4.pkg1.Entidades.Rectangulo;
import guia6ejercicio4.pkg1.Servicios.Servicios;

/**
 *
 * @author angel
 */
public class Guia6Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicios m1 = new Servicios();
        Rectangulo l1 = new Rectangulo();
        l1 = m1.crearRectangulo();
        l1 = m1.calcularSuperficie();
        l1 = m1.calcularPerimetro();
        l1 = m1.dibujarRectangulo();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicioextra2;

import guia6ejercicioextra2.Entidades.Puntos;
import guia6ejercicioextra2.Servicios.ServiciosPuntos;

/**
 *
 * @author Usuario
 */
public class Guia6Ejercicioextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosPuntos m1 = new ServiciosPuntos();
        Puntos l1 = new Puntos();
        m1.crearPuntos(l1);
        m1.calcularDistancia(l1);
    }
    
}

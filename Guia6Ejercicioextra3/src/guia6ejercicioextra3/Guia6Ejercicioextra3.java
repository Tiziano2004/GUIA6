/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicioextra3;

import guia6ejercicioextra3.Entidades.Raices;
import guia6ejercicioextra3.Servicios.ServiciosRaices;

/**
 *
 * @author Usuario
 */
public class Guia6Ejercicioextra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosRaices m1 = new ServiciosRaices();
        Raices l1 = new Raices();
        double discriminante = m1.encontrarDiscriminante(l1);
        boolean respuesta1 = m1.tieneRaicez(l1, discriminante);
        boolean respuesta = m1.tieneRaiz(l1, discriminante);
        System.out.println(" La respuesta1 es "+ respuesta1);
        System.out.println(" La respuesta 2 es "+ respuesta);
        if(respuesta1 == true){
            m1.obtenerRaices(l1, respuesta1);
        }
        if(respuesta==true){
            m1.obtenerRaiz(l1, respuesta);
        }
        m1.calcular(l1, respuesta, respuesta1);
    }

}

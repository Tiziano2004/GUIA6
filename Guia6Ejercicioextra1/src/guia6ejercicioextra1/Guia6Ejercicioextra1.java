/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicioextra1;

import guia6ejercicioextra1.Entidades.Cancion;
import guia6ejercicioextra1.Servicios.ServiciosCancion;

/**
 *
 * @author Usuario
 */
public class Guia6Ejercicioextra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosCancion l1 = new ServiciosCancion();
        Cancion m1 = new Cancion(); 
        l1.buscarCancion(m1);
    }
    
}

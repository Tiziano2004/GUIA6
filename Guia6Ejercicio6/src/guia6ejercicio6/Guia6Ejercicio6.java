/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio6;

import guia6ejercicio6.Entidades.Cafetera;
import guia6ejercicio6.Servicios.ServiciosCafetera;

/**
 *
 * @author angel
 */
public class Guia6Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera v1 = new Cafetera();
        ServiciosCafetera l1 = new ServiciosCafetera();
        v1 = l1.Cantidad();
        v1 = l1.llenarCafetera();
        v1 = l1.ServirTaza();
        v1 = l1.vaciarCafetera();
        v1 = l1.agregarCafe();
    }
    
}

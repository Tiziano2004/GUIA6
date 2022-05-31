/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio5;

import guia6ejercicio5.Servicios.ServiciosCuenta;

/**
 *
 * @author angel
 */
public class Guia6Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosCuenta l1 = new ServiciosCuenta();
        l1.crearCuenta();
        l1.Ingresar();
        l1.Retirar();
        l1.extraccionRapida();
        l1.consultarSaldo();
        l1.consultarDatos();
    }

}

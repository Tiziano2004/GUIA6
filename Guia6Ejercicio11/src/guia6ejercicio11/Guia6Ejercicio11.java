/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio11;

import guia6ejercicio11.Entidades.Fecha;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia6Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Fecha v1 = new Fecha();
        System.out.println("Ingrese un dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese un mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese un año");
        int anio = leer.nextInt();
        Date momento = new Date( anio-1900,mes-1,dia);
        v1.setFechainicio(momento);
        System.out.println(v1.getFechainicio());
        Date momento1 = new Date();
        System.out.println(momento1);
    }

}

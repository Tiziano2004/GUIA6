/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio8;

import guia6ejercicio8.Entidades.Cadena;
import guia6ejercicio8.Servicios.ServiciosCadena;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Guia6Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosCadena l1 = new ServiciosCadena();
        Cadena m1 = new Cadena();
        System.out.println("Ingrese una frase");
        m1.setFrase(leer.next()); 
        m1.setLongitud(m1.getFrase().length());  
        System.out.println(m1.getLongitud());
        l1.mostrarVocales(m1);
        l1.invertirFrase(m1);
        l1.vecesRepetido(m1);
        l1.compararLongitud(m1);
        l1.unirFrase(m1);
        l1.reemplazar(m1);
        l1.contiene(m1);
    }
    
}

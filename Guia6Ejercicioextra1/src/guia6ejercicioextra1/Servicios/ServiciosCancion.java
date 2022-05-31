/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicioextra1.Servicios;

import guia6ejercicioextra1.Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiciosCancion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cancion v1 = new Cancion();
    public void buscarCancion(Cancion v1){
        System.out.println("Ingrese el titulo");
        v1.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        v1.setAutor(leer.next());
        System.out.println(" El titulo del libro es "+v1.getTitulo()+ " Y el autor es "+v1.getAutor());
    }
    
}

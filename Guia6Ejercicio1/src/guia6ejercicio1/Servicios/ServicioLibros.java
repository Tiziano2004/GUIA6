/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio1.Servicios;

import guia6ejercicio1.Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioLibros {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Libro v1 = new Libro();

    public void llenardatos(Libro v1) {
        System.out.println("Ingrese el ISBN");
        v1.setISBN(leer.nextInt());
        System.out.println("Ingrese el titulo");
        v1.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        v1.setAutor(leer.next());
        System.out.println("Ingrese las paginas");
        v1.setPaginas(leer.nextInt());
    }

    
    public void mostrarDatos(Libro v1) {
        System.out.println(" El ISBN es : " + v1.getISBN());
        System.out.println(" El titulo es : " + v1.getTitulo());
        System.out.println(" El autor es : " + v1.getAutor());
        System.out.println(" Las paginas son : " + v1.getPaginas());
    }
}

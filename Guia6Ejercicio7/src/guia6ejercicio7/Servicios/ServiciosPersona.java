/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio7.Servicios;

import guia6ejercicio7.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class ServiciosPersona {

    Persona v1 = new Persona();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese su genero");
        String sexo = leer.next();
        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println("Usted no ingreso un sexo");
            sexo = leer.next();
        }
        System.out.println("Ingrese su peso");
        int peso = leer.nextInt();
        System.out.println("Ingrese su altura");
        double altura = leer.nextDouble();
        return new Persona(nombre, sexo, peso, altura, edad);
    }

}

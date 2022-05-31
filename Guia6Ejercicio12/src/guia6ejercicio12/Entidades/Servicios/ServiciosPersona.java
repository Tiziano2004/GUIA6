/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio12.Entidades.Servicios;

import guia6ejercicio12.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiciosPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona v1 = new Persona();
    public void crearPersona(Persona v1){
        System.out.println("Ingrese su nombre");
        v1.setNombre(leer.next());
        System.out.println("Ingrese su dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese su año de nacimiento");
        int anio = leer.nextInt();
        Date momento = new Date(anio-1900, mes-1, dia);
        v1.setFecha(momento);
        System.out.println(v1.getFecha());
    }
    public int calcularEdad(Persona v1){
        Date momento1 = new Date();
        int edad = momento1.getYear() - v1.getFecha().getYear();
        return edad;
    }
    public void menorQue(Persona v1, int edad){
        System.out.println("Ingrese una edad");
        int edad1 = leer.nextInt();
        boolean mayor;
        if(edad < edad1){
            mayor = true;
        }else{
            mayor = false;
        }
        System.out.println(mayor);
    }
    public void mostrarPersona(Persona v1, int edad1){
        System.out.println(" El nombre de la persona es "+ v1.getNombre());
        System.out.println(" Su fecha de nacimiento es "+ v1.getFecha());
        System.out.println(" Su edad es "+ edad1);
    }
}

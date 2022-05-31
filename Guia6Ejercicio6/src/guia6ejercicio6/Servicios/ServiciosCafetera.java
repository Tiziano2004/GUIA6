/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio6.Servicios;

import guia6ejercicio6.Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class ServiciosCafetera {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cafetera m1 = new Cafetera();
    public Cafetera Cantidad(){
        System.out.println("Ingrese la cantidad maxima");
        m1.setCapacidadMaxima(leer.nextInt());
        return new Cafetera();
    }
    public Cafetera llenarCafetera(){
        m1.setCantidadActual(m1.getCapacidadMaxima());
        System.out.println(" La cantidad actual es "+ m1.getCantidadActual());
        return new Cafetera();
    }
    public Cafetera ServirTaza(){
        System.out.println("Ingrese el tamaño de la taza");
        int tazavacia = leer.nextInt();
        if(tazavacia > m1.getCantidadActual()){
            System.out.println("La taza no se lleno");
            System.out.println(" La taza tiene "+ m1.getCantidadActual());
        }
        if(tazavacia < m1.getCantidadActual() || tazavacia == m1.getCantidadActual()){
            System.out.println("La taza se lleno");
        }
        return new Cafetera();
    }
    public Cafetera vaciarCafetera(){
        System.out.println("Se va a vaciar la cafetera");
        m1.setCantidadActual(0);
        return new Cafetera();
    }
public Cafetera agregarCafe(){
    System.out.println("Ingrese la cantidad de cafe que quiere poner en la cafetera");
    m1.setCantidadActual(leer.nextInt());
    if(m1.getCantidadActual() > m1.getCapacidadMaxima()){
        do{
            System.out.println("Usted intento ingresar mas de la capacidad maxima de la cafetera");
            System.out.println("Por favor, re ingrese la cantidad de cafe ");
            m1.setCantidadActual(leer.nextInt());
        }while(m1.getCantidadActual() > m1.getCapacidadMaxima());
    }
    return new Cafetera();
}  
}


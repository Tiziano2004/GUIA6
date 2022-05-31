/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicioextra2.Servicios;

import guia6ejercicioextra2.Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiciosPuntos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Puntos v1 = new Puntos();

    public void crearPuntos(Puntos v1) {
        System.out.println("Ingrese los puntos");
        v1.setX1(leer.nextDouble());
        System.out.println("----------------------");
        v1.setX2(leer.nextDouble());
        System.out.println("----------------------");
        v1.setY1(leer.nextDouble());
        System.out.println("----------------------");
        v1.setY2(leer.nextDouble());
    }

    public void calcularDistancia(Puntos v1) {
        System.out.println("Se va a calcular la distancia");
        double primer = Math.pow((v1.getX2()-v1.getX1()), 2);
        double segundo = Math.pow((v1.getY2()-v1.getY1()), 2);
        double distancia = Math.pow(primer + segundo, 0.5);
        System.out.print(" La distancia entre los puntos es : "+distancia);
    }
}

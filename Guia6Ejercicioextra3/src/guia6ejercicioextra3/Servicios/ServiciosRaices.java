/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicioextra3.Servicios;

import guia6ejercicioextra3.Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiciosRaices {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Raices v1 = new Raices();

    public double encontrarDiscriminante(Raices v1) {
        System.out.println("Ingrese los valores");
        v1.setA(leer.nextDouble());
        System.out.println("----------------------");
        v1.setB(leer.nextDouble());
        System.out.println("----------------------");
        v1.setC(leer.nextDouble());
        double discriminante = Math.pow(v1.getB(), 2) - 4 * v1.getA() * v1.getC();
        System.out.println(" El discriminante es " + discriminante);
        return discriminante;
    }

    public boolean tieneRaicez(Raices v1, double discriminante1) {
        System.out.println("Se va a verificar las posibles soluciones");
        boolean respuesta;
        if (discriminante1 >= 0) {
            respuesta = true;
            System.out.println("La ecuacion tiene mas de dos soluciones ");
        } else {
            respuesta = false;
            System.out.println("La ecuacion no tiene mas de dos soluciones");
        }
        return respuesta;

    }

    public boolean tieneRaiz(Raices v1, double discriminante1) {
        System.out.println("Se va a verificar si la ecuacion tiene una unica solucion");
        boolean respuesta;
        if (discriminante1 == 0) {
            respuesta = true;
            System.out.println("La ecuacion tiene una solucion");
        } else {
            respuesta = false;
            System.out.println("La ecuacion no tiene soluciones");
        }
        return respuesta;
    }

    public void obtenerRaices(Raices v1, boolean respuesta) {
        System.out.println("Se van a escribir las soluciones");
        if (respuesta == true) {
            double x1 = (-v1.getB() + Math.sqrt(v1.getB() - (4 * v1.getA() * v1.getC()))) / (2 * v1.getA());
            double x2 = (-v1.getB() - Math.sqrt(v1.getB() - (4 * v1.getA() * v1.getC()))) / (2 * v1.getA());

            System.out.println("Posibles Raíces");
            System.out.println("x1: " + x1 + "x2" + x2);

        }
    }

    public void obtenerRaiz(Raices v1, boolean respuesta) {
        System.out.println("Se va a escribir la solucion");
        if (respuesta == true) {
            double x1 = (-v1.getB() + Math.sqrt(v1.getB() - (4 * v1.getA() * v1.getC()))) / (2 * v1.getA());
            System.out.println("Raíz");
            System.out.println("x1: " + x1);
        }
    }

    public void calcular(Raices v1, boolean respuesta, boolean respuesta1) {
        if (respuesta1 == true) {
            double x1 = (-v1.getB() + Math.sqrt(v1.getB() - (4 * v1.getA() * v1.getC()))) / (2 * v1.getA());
            double x2 = (-v1.getB() - Math.sqrt(v1.getB() - (4 * v1.getA() * v1.getC()))) / (2 * v1.getA());

            System.out.println("Posibles Raíces");
            System.out.println(" La primer solucion es " + x1 + " Y la segunda solucion es " + x2);
        }
        if (respuesta1 == false && respuesta == true) {
            double x1 = (-v1.getB() + Math.sqrt(v1.getB() - (4 * v1.getA() * v1.getC()))) / (2 * v1.getA());
            System.out.println("Raíz");
            System.out.println(" La solucion es " + x1);
        }
        if (respuesta1 == false && respuesta == false) {
            System.out.println("La ecuacion no tiene solucion");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio4.pkg1.Servicios;

import guia6ejercicio4.pkg1.Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Rectangulo v1 = new Rectangulo();

    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la base");
        v1.setBase(leer.nextInt());
        System.out.println("Ingrese la altura");
        v1.setAltura(leer.nextInt());
        return new Rectangulo();
    }

    public Rectangulo calcularSuperficie() {
        System.out.println("Calcularemos la superficie");
        double superficie = v1.getBase() * v1.getAltura();
        System.out.println(" La superficie es " + superficie);
        return new Rectangulo();
    }

    public Rectangulo calcularPerimetro() {
        System.out.println("Calcularemos el perimetro");
        double perimetro = (v1.getBase() + v1.getAltura()) * 2;
        System.out.println(" El perimetro es " + perimetro);
        return new Rectangulo();
    }

    public Rectangulo dibujarRectangulo() {
        String aux = "";
        for (int alto = 0; alto < v1.getAltura(); alto++) {
            for (int largo = 0; largo < v1.getBase(); largo++) {
                if (alto == 0 | alto == v1.getAltura() - 1) {
                    aux = "*";
                } else {
                    if (largo == 0 | largo == v1.getBase() - 1) {
                        aux = "*";
                    }
                    if (largo != 0 & largo != v1.getBase() - 1) {
                        aux = " ";
                    }
                }
                System.out.print(aux);
                if (largo == v1.getBase() - 1) {
                    System.out.print("\n");
                }
            }
        }
        return new Rectangulo();
    
}
}
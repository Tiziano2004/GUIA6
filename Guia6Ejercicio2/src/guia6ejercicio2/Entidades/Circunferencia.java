/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio2.Entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Circunferencia {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }




    public double getRadio() {
        return radio;
    }



    public void crearCircunferencia() {
        System.out.println("Ingrese el radio");
        radio = leer.nextDouble();
    }

    public void area() {
       double area = 3.141592 * radio * radio;
        System.out.println(" El area es " + area);
    }

    public void perimetro() {
       double perimetro = 2 * 3.141592 * radio;
        System.out.println(" El perimetro es " + perimetro);
    }
}

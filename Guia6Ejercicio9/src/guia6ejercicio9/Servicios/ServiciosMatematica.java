/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio9.Servicios;

import guia6ejercicio9.Entidades.Matematica;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class ServiciosMatematica {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public void devolverMayor(Matematica m1){
       int max = (int) Math.max(m1.getNum1(), m1.getNum2());
        System.out.println(" El numero mas grande es "+max);
    }
    public void calcularPotencia(Matematica m1){
        double max =  Math.max(m1.getNum1(), m1.getNum2());
        double min =  Math.min(m1.getNum1(), m1.getNum2());
        double pow =  Math.pow(max,min);
        System.out.println(" La potencia del mayor numero elevado al menor numero es "+pow);
    }
    
    public void calcularRaiz(Matematica m1){
        double min = Math.min(m1.getNum1(), m1.getNum2());
        double raiz = Math.sqrt(min);
        System.out.println(" La raiz cuadrada del numero mas chico es "+raiz);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio9;

import guia6ejercicio9.Entidades.Matematica;
import guia6ejercicio9.Servicios.ServiciosMatematica;
import java.util.Random;

/**
 *
 * @author angel
 */
public class Guia6Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random R = new Random();
        Matematica m1 = new Matematica();
        ServiciosMatematica l1 = new ServiciosMatematica();
        System.out.println("Se van a ingresar los numeros");
        m1.setNum1(R.nextInt(101));
        m1.setNum2(R.nextInt(101));
        System.out.println(m1.getNum1());
        System.out.println(m1.getNum2());
        l1.devolverMayor(m1);
        l1.calcularPotencia(m1);
        l1.calcularRaiz(m1);
    }
    
}

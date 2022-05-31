/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio7;

import guia6ejercicio7.Entidades.Persona;
import guia6ejercicio7.Servicios.ServiciosPersona;

/**
 *
 * @author angel
 */
public class Guia6Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona m1 = new Persona();
        Persona m2 = new Persona();
        Persona m3 = new Persona();
        Persona m4 = new Persona();
        ServiciosPersona l1 = new ServiciosPersona();
        int contador = 0, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0;
        m1 = l1.crearPersona();
        m1.calcularIMC();
        int g = m1.getPesofinal();
        System.out.println(" El peso de la primer persona es " + g);
        m1.esMayordeedad();
        boolean g1 = m1.getMayor();
        System.out.println(" La edad de la primer persona es " + g1);
        if (g == -1) {
            contador = contador + 1;
        }
        if (g == 0) {
            contador1 = contador1 + 1;
        }
        if (g == 1) {
            contador2 = contador2 + 1;
        }
        if (g1 == true) {
            contador3 = contador3 + 1;
        }
        if (g1 == false) {
            contador4 = contador4 + 1;
        }
        m2 = l1.crearPersona();
        m2.calcularIMC();
        int g3 = m2.getPesofinal();
        System.out.println(" El peso de la segunda persona es " + g3);
        m2.esMayordeedad();
        boolean g4 = m2.getMayor();
        System.out.println(" La edad de la segunda persona es " + g4);
        if (g3 == -1) {
            contador = contador + 1;
        }
        if (g3 == 0) {
            contador1 = contador1 + 1;
        }
        if (g3 == 1) {
            contador2 = contador2 + 1;
        }
        if (g4 == true) {
            contador3 = contador3 + 1;
        }
        if (g4 == false) {
            contador4 = contador4 + 1;
        }
        
        m3 = l1.crearPersona();
        m3.calcularIMC();
        int g5 = m3.getPesofinal();
        System.out.println(" El peso de la tercera persona es " + g5);
        m3.esMayordeedad();
        boolean g6 = m3.getMayor();
        System.out.println(" La edad de la tercera persona es " + g6);
        if (g5 == -1) {
            contador = contador + 1;
        }
        if (g5 == 0) {
            contador1 = contador1 + 1;
        }
        if (g5 == 1) {
            contador2 = contador2 + 1;
        }
        if (g6 == true) {
            contador3 = contador3 + 1;
        }
        if (g6 == false) {
            contador4 = contador4 + 1;
        }
        m4 = l1.crearPersona();
        m4.calcularIMC();
        int g7 = m4.getPesofinal();
        System.out.println(" El peso de la cuarta persona es " + g7);
        m4.esMayordeedad();
        boolean g8 = m4.getMayor();
        System.out.println(" La edad de la cuarta persona es " + g8);
        if (g7 == -1) {
            contador = contador + 1;
        }
        if (g7 == 0) {
            contador1 = contador1 + 1;
        }
        if (g7 == 1) {
            contador2 = contador2 + 1;
        }
        if (g8 == true) {
            contador3 = contador3 + 1;
        }
        if (g8 == false) {
            contador4 = contador4 + 1;
        }
      
        System.out.println(contador);
        System.out.println(contador1);
        System.out.println(contador2);
        System.out.println(contador3);
        System.out.println(contador4);
        
        double resultado = (contador*100/4);
        double resultado1 = (contador1*100/4);
        double resultado2 = (contador2*100/4);
        double resultado3 = (contador3*100/4);
        double resultado4 = (contador4*100/4);
        
        System.out.println(" El porcentaje de gente debajo de su peso ideal es "+ resultado +"%");
        System.out.println(" El porcentaje de gente en su peso ideal es "+ resultado1 +"%");
        System.out.println(" El porcentaje de gente con sobrepeso es "+ resultado2 +"%");
        System.out.println(" El porcentaje de gente mayor de edad es "+ resultado3+"%");
        System.out.println(" El porcentaje de gente menor de edad es "+resultado4+"%");
    }
}

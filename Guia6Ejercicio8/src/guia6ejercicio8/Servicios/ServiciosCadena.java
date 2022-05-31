/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio8.Servicios;

import guia6ejercicio8.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class ServiciosCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena m1) {
        int contador = 0;
        String palabra = m1.getFrase();
        for (int i = 0; i < palabra.length(); i++) {
            if ((palabra.charAt(i) == 'a') || (palabra.charAt(i) == 'e') || (palabra.charAt(i) == 'i') || (palabra.charAt(i) == 'o') || (palabra.charAt(i) == 'u')) {
                contador++;
            }
        }
        System.out.println(" La cantidad de vocales en la palabra es " + contador);
    }

    public void invertirFrase(Cadena m1) {
        System.out.println("Se va a invertir la frase ingresada");
        String palabrainvertida = "";
        for (int i = m1.getLongitud() - 1; i >= 0; i--) {
            palabrainvertida = palabrainvertida + m1.getFrase().charAt(i);
        }
        System.out.println(palabrainvertida);
    }

    public void vecesRepetido(Cadena m1) {
        int contador = 0;
        System.out.println("Ingrese la letra que quiere buscar en la frase");
        String letra = leer.next();
        int longitud = letra.length();
        while(longitud != 1){
            System.out.println("Usted no ingreso un solo caracter");
            letra = leer.next();
            longitud = letra.length();
        }
        for (int i = 0; i < m1.getLongitud(); i++) {
            if (m1.getFrase().substring(i, i + 1).equals(letra)) {
                contador++;
            }
        }
        System.out.println(" La letra pedida se repite " + contador);
    }

    public void compararLongitud(Cadena m1) {
        System.out.println("Ingrese una nueva frase");
        String frase = leer.next();
        int longitud = frase.length();
        System.out.println(" La longitud de la nueva palabra es " + longitud);
        if (m1.getLongitud() == longitud) {
            System.out.println("Ambas frases tienen la misma longitud");
        } else {
            System.out.println("Las frases no tienen la misma longitud");
        }
    }

    public void unirFrase(Cadena m1) {
        System.out.println("Ingrese una nueva frase para unirla a la original");
        String frase = leer.next();
        String concat = m1.getFrase().concat(frase);
        System.out.println(" La frase concatenada es " + concat);
    }

    public void reemplazar(Cadena m1) {
        System.out.println("Ingrese el caracter que quiere reemplazar");
        String caracter = leer.next();
        int longitud = caracter.length();
        while (longitud != 1) {
            System.out.println("Usted no ingreso un caracter");
            caracter = leer.next();
            longitud = caracter.length();
        }
        String nuevafrase = m1.getFrase().replace("a", caracter);
        System.out.println(nuevafrase);
    }
    public void contiene(Cadena m1){
        boolean si = false;
        System.out.println("Ingrese el caracter a  buscar en la frase");
        String caracter = leer.next();
        int longitud = caracter.length();
        while(longitud != 1){
            System.out.println("Usted no ingreso un caracter");
            caracter = leer.next();
            longitud = caracter.length();
        }
        for(int i = 0; i < m1.getLongitud(); i++){
            if(m1.getFrase().substring(i, i + 1).equals(caracter)){
                si = true;
                break;
            }
        }
        System.out.println(si);
    }
}

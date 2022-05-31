/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicioextra5.Entidades;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Meses {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String vector[] = new String[12];

    public Meses() {
    }

    public Meses(String[] vector) {
        this.vector = vector;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public String crearVector() {
        vector[0] = "Enero";
        vector[1] = "Febrero";
        vector[2] = "Marzo";
        vector[3] = "Abril";
        vector[4] = "Mayo";
        vector[5] = "Junio";
        vector[6] = "Julio";
        vector[7] = "Agosto";
        vector[8] = "Septiembre";
        vector[9] = "Octubre";
        vector[10] = "Noviembre";
        vector[11] = "Diciembre";
        for (int i = 0; i < 12; i++) {
            System.out.println(vector[i]);
        }
        String mes = vector[4];
        return mes;
    }

    public void encontrarMes(String mes) {
        System.out.println("Ingrese el mes");
        String mespersona = "n";
        while (!mespersona.equals(mes)) {
            mespersona = leer.next();
            if (mespersona.equals(mes)) {
                System.out.println("Acertaste el mes");
            } else {
                System.out.println("No lo acertaste intente con otro");
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicioextra5;

import guia6ejercicioextra5.Entidades.Meses;

/**
 *
 * @author angel
 */
public class Guia6Ejercicioextra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Meses l1 = new Meses();
        String mes = l1.crearVector();
        l1.encontrarMes(mes);
    }
    
}

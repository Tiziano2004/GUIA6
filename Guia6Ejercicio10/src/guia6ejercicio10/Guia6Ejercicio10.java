/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio10;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author angel
 */
public class Guia6Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random R = new Random();
        double vector1 [] = new double [50];
        double vector2 [] = new double [20];
        for(int i = 0; i < 50; i++){
            vector1[i] = R.nextInt(101);
        }
        
        System.out.println(Arrays.toString(vector1)); 
        Arrays.sort(vector1);
        System.out.println(Arrays.toString(vector1));
        for(int i = 0; i <20;i++){
            if(i <= 10){
                 vector2[i] = vector1[i];
            }
        }
        Arrays.fill(vector2, 11, 20, 0.5);
       
        System.out.println(Arrays.toString(vector1));
        System.out.println(Arrays.toString(vector2));
    }
    
}

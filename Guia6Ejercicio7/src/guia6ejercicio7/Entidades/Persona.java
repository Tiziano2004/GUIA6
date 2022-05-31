/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio7.Entidades;

/**
 *
 * @author angel
 */
public class Persona {

    private String nombre, sexo;
    private int peso, edad, pesofinal;
    private double altura;
    private boolean mayor;

    public Persona() {
    }

    public Persona(String nombre, String sexo, int peso, double altura, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPesofinal(int pesofinal) {
        this.pesofinal = pesofinal;
    }

    public void serMayor(boolean mayor) {
        this.mayor = mayor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public int getPesofinal() {
        return pesofinal;
    }

    public boolean getMayor() {
        return mayor;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", peso=" + peso + ", edad=" + edad + ", pesofinal=" + pesofinal + ", altura=" + altura + ", mayor=" + mayor + '}';
    }

    public Persona calcularIMC() {
        double ecuacion = peso / (altura * altura);
        System.out.println(" La ecuacion da " + ecuacion);
        if (ecuacion < 20) {
            int IMC = -1;
            pesofinal = IMC;
        }
        if (ecuacion <= 20 && ecuacion >= 25) {
            int IMC = 0;
            pesofinal = IMC;
        }
        if (ecuacion > 25) {
            int IMC = 1;
            pesofinal = IMC;
            System.out.println(" El peso ideal es " + pesofinal);
        }

        return new Persona();
    }
    public void esMayordeedad(){
        if(edad > 18){
            mayor = true;
        }else {
            mayor = false;
        }
    }
}

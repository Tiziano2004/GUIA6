/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio5.Entidades;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Cuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numeroCuenta;
    private long DNI;
    private double SaldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int DNI, double SaldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

}

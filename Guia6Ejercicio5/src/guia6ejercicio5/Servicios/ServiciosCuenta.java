/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio5.Servicios;

import guia6ejercicio5.Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class ServiciosCuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cuenta v1 = new Cuenta();

    public void crearCuenta() {
        System.out.println("Ingrese el numero de cuenta");
        v1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        v1.setDNI((int) leer.nextLong());
        System.out.println("Ingrese su saldo actual");
        v1.setSaldoActual(leer.nextDouble());
    }
    
    public void Ingresar(){
        System.out.println("Ingrese el monto que quiere sumar a su saldo actual");
        double monto = leer.nextDouble();
        v1.setSaldoActual(v1.getSaldoActual() + monto);
    }
    public void Retirar(){
        System.out.println("Ingrese el monto que quiere retirar");
        double monto = leer.nextDouble();
        v1.setSaldoActual(v1.getSaldoActual() - monto);
        if(v1.getSaldoActual() < 0){
            v1.setSaldoActual(0);
        }
        System.out.println(" El saldo actual es "+ v1.getSaldoActual());
    }
    public void extraccionRapida(){
        double v = v1.getSaldoActual();
        double monto = v1.getSaldoActual() * 0.20;
        System.out.println("Ingrese el monto a retirar");
        v1.setSaldoActual(v);
        double monto1 = leer.nextDouble();
        if(monto1 > monto){
            System.out.println("Intento extraer mas del 20% asi que su extraccion fue cancelada");
        }else{
            v1.setSaldoActual(v1.getSaldoActual() - monto1);
            System.out.println(" Su saldo actual es "+ v1.getSaldoActual());
        }
    }
    public void consultarSaldo(){
        System.out.println(" Su saldo actual es "+v1.getSaldoActual());
    }
    public void consultarDatos(){
        System.out.println("A continuacion se mostraran los datos de su cuenta");
        System.out.println(" Su numero de cuenta es "+ v1.getNumeroCuenta());
        System.out.println(" Su DNI es "+ v1.getDNI());
        System.out.println(" Su saldo actual es "+ v1.getSaldoActual());
    }
}

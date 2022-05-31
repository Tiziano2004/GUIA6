/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio11.Entidades;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Fecha {
    private Date fechainicio;

    public Fecha() {
    }

    public Fecha(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }
    
}

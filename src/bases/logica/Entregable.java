/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.logica;

/**
 *
 * @author Mata
 */
public class Entregable {
    private int idEntregable, porcentaje;
    private Profesor encargado;
    private String descripcion, fechaEntrega;
    private Periodo periodo;
    private Practica practica;

    public Entregable(int idEntregable, int porcentaje, Profesor encargado, String descripcion, String fechaEntrega, Periodo periodo, Practica practica) {
        this.idEntregable = idEntregable;
        this.porcentaje = porcentaje;
        this.encargado = encargado;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.periodo = periodo;
        this.practica = practica;
    }

    public int getIdEntregable() {
        return idEntregable;
    }

    public void setIdEntregable(int idEntregable) {
        this.idEntregable = idEntregable;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Profesor getEncargado() {
        return encargado;
    }

    public void setEncargado(Profesor encargado) {
        this.encargado = encargado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Practica getPractica() {
        return practica;
    }

    public void setPractica(Practica practica) {
        this.practica = practica;
    }
    
}

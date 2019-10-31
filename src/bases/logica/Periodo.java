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
class Periodo {
    private int idPeriodo, numeroSemestre, año;
    Profesor encargado;

    public Periodo(int idPeriodo, int numeroSemestre, int año, Profesor encargado) {
        this.idPeriodo = idPeriodo;
        this.numeroSemestre = numeroSemestre;
        this.año = año;
        this.encargado = encargado;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Profesor getEncargado() {
        return encargado;
    }

    public void setEncargado(Profesor encargado) {
        this.encargado = encargado;
    }
    
}

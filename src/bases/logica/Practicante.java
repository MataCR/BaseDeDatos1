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
public class Practicante extends Persona {
    Supervisor supervisor; 

    public Practicante(Supervisor supervisor, int cedula, int telefono, int provincia, int canton, int distrito, String nombre, String primerApellido, String segundoApellido, String fechaNacimiento, String correo, String señas) {
        super(cedula, telefono, provincia, canton, distrito, nombre, primerApellido, segundoApellido, fechaNacimiento, correo, señas);
        this.supervisor = supervisor;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }
    
}

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
class Empresa {
  private  int cedulaJuridica, telefono, canton, provincia, distrito;
  private String nombreEmpresa, señas;

    public Empresa(int cedulaJuridica, int telefono, int canton, int provincia, int distrito, String nombreEmpresa, String señas) {
        this.cedulaJuridica = cedulaJuridica;
        this.telefono = telefono;
        this.canton = canton;
        this.provincia = provincia;
        this.distrito = distrito;
        this.nombreEmpresa = nombreEmpresa;
        this.señas = señas;
    }

    public int getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(int cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCanton() {
        return canton;
    }

    public void setCanton(int canton) {
        this.canton = canton;
    }

    public int getProvincia() {
        return provincia;
    }

    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }

    public int getDistrito() {
        return distrito;
    }

    public void setDistrito(int distrito) {
        this.distrito = distrito;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getSeñas() {
        return señas;
    }

    public void setSeñas(String señas) {
        this.señas = señas;
    }
  
}

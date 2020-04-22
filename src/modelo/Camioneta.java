
package modelo;

import java.io.Serializable;
import java.util.Objects;


public class Camioneta extends AbstractVehiculo implements Serializable {

    private short capacidad;
    private TipoVehiculo tipoVehiculo;

    public Camioneta(TipoVehiculo tipoVehiculo, short capacidad, String matricula, int km, boolean estado, double valorAlquiler) {
        super(tipoVehiculo, matricula, km, estado, valorAlquiler);
        this.capacidad = capacidad;
        this.tipoVehiculo = tipoVehiculo;
    }
    
    
    
    @Override
    public double calcularAlquiler(int km) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public short getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(short capacidad) {
        this.capacidad = capacidad;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(double valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

   
//Metodo para conertir un objeto con sus atributos a un areglo de tipo objeto
    public Object[] obtenerArregloObjeto(){
        
        Object[] data = { getTipoVehiculo().getTipoVehiculo(), getCapacidad(), getMatricula(), getKm(), isEstado(), getValorAlquiler()  };
        return data;          
    
    }

    @Override
    public String toString() {
        return  capacidad + "" + matricula  + "" + km + "" + estado + "" + valorAlquiler ;
    }


    
    
}

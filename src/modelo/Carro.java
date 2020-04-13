
package modelo;

import java.io.Serializable;


public class Carro extends AbstractVehiculo implements Serializable{

    private boolean extras;
    private TipoVehiculo tipoVehiculo;

    public Carro(TipoVehiculo tipoVehiculo, boolean extras, String matricula, int km, boolean estado, double valorAlquiler) {
        super(matricula, km, estado, valorAlquiler);
        this.extras = extras;
        this.tipoVehiculo = tipoVehiculo;
    }

    
    
    @Override
    public double calcularAlquiler(int km) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
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

  
    
   public Object[] obtenerArregloObjeto(){
        
        Object[] data = { getTipoVehiculo().getTipoVehiculo(), isExtras(), getMatricula(), getKm(), isEstado(), getValorAlquiler()  };
        return data;
          
                
    }

    @Override
    public String toString() {
        return    tipoVehiculo + ""+extras + "" +matricula+""+km+""+estado+""+valorAlquiler;
    }
   
   
    
}
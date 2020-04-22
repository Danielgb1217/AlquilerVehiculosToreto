
package controlador;

import java.io.Serializable;
import modelo.AbstractVehiculo;
import modelo.Camioneta;
import modelo.Carro;
import modelo.Moto;
import modelo.TipoVehiculo;
import modelo.Usuario;

public class AlquilaVehiculo implements Serializable{
    
    private AbstractVehiculo vehiculo;
    private Usuario usuario;

   

    public AbstractVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(AbstractVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return   "vehiculo=" + vehiculo + ", usuario=" + usuario + '}';
    }
    
    public double alquilarVehiculo(AbstractVehiculo vehiculo, Usuario usuario){
        

        return 10000;
        
    }
    
}

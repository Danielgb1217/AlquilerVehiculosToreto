package controlador;

import java.io.Serializable;
import java.util.List;
import modelo.AbstractVehiculo;
import modelo.Camioneta;
import modelo.Carro;
import modelo.InformeAlquiler;
import modelo.Moto;
import modelo.TipoVehiculo;
import modelo.Usuario;
import utilidades.LeerArchivoPlano;

public class AlquilaVehiculo implements Serializable {

    private AbstractVehiculo vehiculo;
    private Usuario usuario;
    private List<InformeAlquiler> listadoInformeAlquiler;

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
        return "vehiculo=" + vehiculo + ", usuario=" + usuario + '}';
    }

    public List<InformeAlquiler> llenarInformeVehiculos() {

        listadoInformeAlquiler = LeerArchivoPlano.cargarInformeAlquiler();
        return listadoInformeAlquiler;
    }

    public List<InformeAlquiler> getListadoInformeAlquiler() {
        return listadoInformeAlquiler;
    }

    public void setListadoInformeAlquiler(List<InformeAlquiler> listadoInformeAlquiler) {
        this.listadoInformeAlquiler = listadoInformeAlquiler;
    }

    public double alquilarVehiculo(AbstractVehiculo vehiculo, Usuario usuario, int kmRecorridos) {

        if (vehiculo instanceof Camioneta) {

            double valorCapacidad =  ((Camioneta) vehiculo).getCapacidad()*5000;
            double costoAlquiler = vehiculo.calcularAlquiler(kmRecorridos)+valorCapacidad;
            return costoAlquiler;
        }
        
return 0;
    }

}

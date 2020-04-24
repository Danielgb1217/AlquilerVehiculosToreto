package modelo;

import java.util.Date;

public class InformeAlquiler {

    private Object usuario;
    private Object vehiculo;
    private Object Matricula;
    private Object fechaInicio;
    private Object fechaFinal;
    private Object costoAlquiler;

    public InformeAlquiler(Object usuario, Object vehiculo, Object Matricula, Object fechaInicio, Object fechaFinal, Object costoAlquiler) {
        this.usuario = usuario;
        this.vehiculo = vehiculo;
        this.Matricula = Matricula;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.costoAlquiler = costoAlquiler;
    }

    public Object getUsuario() {
        return usuario;
    }

    public void setUsuario(Object usuario) {
        this.usuario = usuario;
    }

    public Object getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Object vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Object getMatricula() {
        return Matricula;
    }

    public void setMatricula(Object Matricula) {
        this.Matricula = Matricula;
    }

    public Object getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Object fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Object getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Object fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Object getCostoAlquiler() {
        return costoAlquiler;
    }

    public void setCostoAlquiler(Object costoAlquiler) {
        this.costoAlquiler = costoAlquiler;
    }

   public Object[] obtenerArregloObjeto(){
        
        Object[] data = { getUsuario(), getVehiculo(), getMatricula(), getFechaInicio(), getFechaFinal(), getCostoAlquiler()  };
        return data;
          
                
    }

   

}

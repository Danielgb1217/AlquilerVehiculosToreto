package modelo;

public abstract class AbstractVehiculo implements VehiculoAble {

    protected String matricula;
    protected int km;
    protected boolean estado;
    protected double valorAlquiler;

    public AbstractVehiculo(String matricula, int km, boolean estado, double valorAlquiler) {
        this.matricula = matricula;
        this.km = km;
        this.estado = estado;
        this.valorAlquiler = valorAlquiler;
    }

   
    public void alquilar() {

    }

  
    public void devolver(int kmFinal) {

    }

    public abstract double calcularAlquiler(int km);

    
    public String mostrarDatos(){
       
        
         return null;
    }
    
    
    public Object[] obtenerArregloObjeto(){
        
        return null;
    }

    @Override
    public String toString() {
        return "AbstractVehiculo{" + "matricula=" + matricula + ", km=" + km + ", estado=" + estado + ", valorAlquiler=" + valorAlquiler + '}';
    }
  

}

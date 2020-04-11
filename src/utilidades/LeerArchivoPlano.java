package utilidades;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;


public class LeerArchivoPlano {
    

    
      public static List<Usuario> cargarUsuarios(TipoUsuario[] tipos)  {

        List<Usuario> listado = new ArrayList<>();  //Declara una lista de usuarios de tipo lista Usuario
        File archivo = null;    //Declara objeto de tipo archivo
        FileReader fr = null;   //Objeto que permite leer archivos
        BufferedReader br = null;   //Permite llevar los archivos a la memoria ram

            
            try {
                archivo = new File("src/Listado de usuarios.txt"); //Se ubica en una ruta relativa en la carpea del proyecto
                fr = new FileReader(archivo);

            br = new BufferedReader(fr);
            String linea; 
              br.readLine();  //Lee la primer linea en blanco que contiene los encabezados del archivo    
            while ((linea= br.readLine()) != null) {

                String[] datos = linea.split(";");  //Permite partir una linea leida por el separador indicado(;) metodo string
                //Instanciamos el objetos usuario con lo que leemos de la fila del archivo
             Usuario usuario = new Usuario(datos[0], datos[1], tipos[Byte.parseByte(datos[2]) - 1], datos[3], datos[4],
                        datos[5]);       //Este metodo recivo el arreglo de tipo TipoUsuario---> en esta linea hace uso
                listado.add(usuario);    //de ese arreglo tipos en la posicion [datos 3]-1 que es igual a la posicion
            }                            //del areglo tipos donde sacara la instancia de tipos determinada --> Administrador
            } catch (Exception e) {
                    e.printStackTrace();
        
            }
       
        finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return listado;
    }

      
      

    //Leer datos de lista de Vehiculos
    public static List<Camioneta> cargarCamionetas(TipoVehiculo[] tipoCamioneta) {

        //List<List<AbstractVehiculo>> listadoVehiculos = new ArrayList<List<AbstractVehiculo>>();//Listas anidadas
        List<Camioneta> listadoCamionetas = new ArrayList<>();

        File archivo = null;    //Declara objeto de tipo archivo
        FileReader fr = null;   //Objeto que permite leer archivos
        BufferedReader br = null;   //Permite llevar los archivos a la memoria ram

        try {
            archivo = new File("src/Listado de Vehiculos.txt"); //Se ubica en una ruta relativa en la carpea del proyecto
            fr = new FileReader(archivo);

            br = new BufferedReader(fr);
            String linea;
            br.readLine();  //Lee la primer linea en blanco que contiene los encabezados del archivo    
            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");  //Permite partir una linea leida por el separador indicado(;) metodo string

                //Es una camioneta codigo = 1 posicion 1 de la fila
                if (datos[0].equals("1") ) {

                    Camioneta camioneta = new Camioneta(tipoCamioneta[Integer.parseInt(datos[0]) - 1],
                            Short.parseShort(datos[1]), datos[2],
                            Integer.parseInt(datos[3]), Boolean.parseBoolean(datos[4]), Double.parseDouble(datos[5]));
                    listadoCamionetas.add(camioneta);
                } //Es un Carro codigo = 2 posicion 1 de la fila
               
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return listadoCamionetas;

    }

    public static List<Carro> cargarCarros(TipoVehiculo[] tipoCarro) {

        //List<List<AbstractVehiculo>> listadoVehiculos = new ArrayList<List<AbstractVehiculo>>();//Listas anidadas
        List<Carro> listadoCarros = new ArrayList<>();

        File archivo = null;    //Declara objeto de tipo archivo
        FileReader fr = null;   //Objeto que permite leer archivos
        BufferedReader br = null;   //Permite llevar los archivos a la memoria ram

        try {
            archivo = new File("src/Listado de Vehiculos.txt"); //Se ubica en una ruta relativa en la carpea del proyecto
            fr = new FileReader(archivo);

            br = new BufferedReader(fr);
            String linea;
            br.readLine();  //Lee la primer linea en blanco que contiene los encabezados del archivo    
            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");  //Permite partir una linea leida por el separador indicado(;) metodo string

                //Es una camioneta codigo = 1 posicion 1 de la fila
                
                 if (datos[0].equals("2") ) {

                    Carro carro = new Carro(tipoCarro[Integer.parseInt(datos[0]) - 1], Boolean.parseBoolean(datos[1]), datos[2],
                            Integer.parseInt(datos[3]), Boolean.parseBoolean(datos[4]), Double.parseDouble(datos[5]));
                    listadoCarros.add(carro);
                } //Es un Carro codigo = 2 posicion 1 de la fila

            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return listadoCarros;

    }

    public static List<Moto> cargarMotos(TipoVehiculo[] tipoMoto) {

        //List<List<AbstractVehiculo>> listadoVehiculos = new ArrayList<List<AbstractVehiculo>>();//Listas anidadas
        List<Moto> listadoMotos = new ArrayList<>();

        File archivo = null;    //Declara objeto de tipo archivo
        FileReader fr = null;   //Objeto que permite leer archivos
        BufferedReader br = null;   //Permite llevar los archivos a la memoria ram

        try {
            archivo = new File("src/Listado de Vehiculos.txt"); //Se ubica en una ruta relativa en la carpea del proyecto
            fr = new FileReader(archivo);

            br = new BufferedReader(fr);
            String linea;
            br.readLine();  //Lee la primer linea en blanco que contiene los encabezados del archivo    
            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");  //Permite partir una linea leida por el separador indicado(;) metodo string

                //Es una camioneta codigo = 1 posicion 1 de la fila
                 if (datos[0].equals("3") ) {

                    Moto moto = new Moto(tipoMoto[Integer.parseInt(datos[0]) - 1], Boolean.parseBoolean(datos[1]),datos[2], Integer.parseInt(datos[3]),
                            Boolean.parseBoolean(datos[4]), Double.parseDouble(datos[5]));
                    listadoMotos.add(moto);
                } //Es un Carro codigo = 2 posicion 1 de la fila

            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return listadoMotos;

}
    
}
package modelo;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tecnicoper1
 */
public class Usuario extends Tercero implements Serializable {

    private String login;
    private String passwd;
    private TipoUsuario tipoUsuario;

 
    public Usuario(String login, String passwd, TipoUsuario tipoUsuario, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.login = login;
        this.passwd = passwd;
        this.tipoUsuario = tipoUsuario;
    }

    /**
     *
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * @return
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     *
     * @param passwd
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     *
     * @return
     */
    //Modificacion del metodo get para obtener solo el valor del string del objetio tipoUsuario
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     *
     * @param tipoUsuario
     */
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

  public Object[] obtenerArregloObjeto(){
        
        Object[] data = { getLogin(), getPasswd(), getTipoUsuario(), getNombre(), getApellido(), getCedula()  };
        return data;          
    
    }

 

}

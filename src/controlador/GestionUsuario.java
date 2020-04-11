package controlador;

import java.util.*;
import java.util.regex.*;
import modelo.*;
import utilidades.LeerArchivoPlano;

/**
 *
 * @author tecnicoper1
 */
public class GestionUsuario {

    private TipoUsuario[] tipoUsuario;
    private List<Usuario> lstUsuarios;

    /**
     *
     */
    public GestionUsuario() {
        llenarTipoUsuario();
        llenarUsuarios();

    }

    /**
     *
     */
    public void llenarTipoUsuario() {

        tipoUsuario = new TipoUsuario[3];
        tipoUsuario[0] = new TipoUsuario((byte) 1, "Administrador");
        tipoUsuario[1] = new TipoUsuario((byte) 2, "UsuarioGeneral");
        tipoUsuario[2] = new TipoUsuario((byte) 3, "Secretaria");
    }

    /**
     *
     */
    public void llenarUsuarios() {

        lstUsuarios = LeerArchivoPlano.cargarUsuarios(tipoUsuario);

    }

    public Usuario validarUsuario(String login, String password) {

        for (Usuario usuarioAutenticado :  lstUsuarios) {
//            System.out.println("usuarioAutenticado = " + usuarioAutenticado);
            if (usuarioAutenticado.getLogin().compareTo(login)==0 && usuarioAutenticado.getPasswd().compareTo(password)==0 )  {

                return usuarioAutenticado;
            }

    }

        return null;
    }

    public boolean validarEmail(String email) {
        Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     *
     * @return
     */
    public TipoUsuario[] getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     *
     * @param tipoUsuario
     */
    public void setTipoUsuario(TipoUsuario[] tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     *
     * @return
     */
    public List<Usuario> getLstUsuarios() {
        return lstUsuarios;
    }

    /**
     *
     * @param lstUsuarios
     */
    public void setLstUsuarios(List<Usuario> lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
    }

}

package vista;

import Excepciones.UsuarioException;
import Excepciones.VehiculosException;
import controlador.*;
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.*;
import javafx.scene.control.PasswordField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import utilidades.*;

/**
 *
 * @author tecnicoper1
 */
public class MdiVehiculos extends javax.swing.JFrame {

    private static List<Integer> vehiculoAlquilar;

    private AlquilaVehiculo alquilarVehiculo;
    private GestionUsuario gestionUsuario;
    private Usuario usuarioAutenticado;
    private GestionVehiculo gestionVehiculo;
    private AbstractVehiculo vehiculo;
    private AlquilaVehiculo alquilaVehiculo;
    DefaultTableModel modeloTblCamionetas;
    DefaultTableModel modeloTblCarros;
    DefaultTableModel modeloTblMotos;
    DefaultTableModel modeloAlquilerVehiculo;
    DefaultTableModel modeloTblInformeAlquiler;

    public MdiVehiculos() {
        initComponents();
        gestionUsuario = new GestionUsuario(); //Instancio el control que permite crear la lista llenar usuarios y cargar
        alquilaVehiculo = new AlquilaVehiculo();    //Controlador para< alquilar vehiculos
        modeloTblCamionetas = (DefaultTableModel) tblListadosCamionetas.getModel();
        modeloTblCarros = (DefaultTableModel) tblListadoCarros.getModel();
        modeloTblMotos = (DefaultTableModel) tblListadoMotos.getModel();
        modeloAlquilerVehiculo = (DefaultTableModel) tblAlquilarVehiculo.getModel();
        modeloTblInformeAlquiler = (DefaultTableModel) tblInformeAlquiler.getModel();
        vehiculoAlquilar = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel9 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        jifLogin = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        jifListadoVehiculos = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListadosCamionetas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListadoCarros = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblListadoMotos = new javax.swing.JTable();
        jpConfiguracionVehiculo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtKm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtValorAlquiler = new javax.swing.JTextField();
        btnAgregarVehiculo = new javax.swing.JButton();
        btnEliminarVehiculo = new javax.swing.JButton();
        btnGuardarConfiguracionVehiculo = new javax.swing.JButton();
        chbExtras = new javax.swing.JCheckBox();
        chbCasco = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        chbDisponibilidad = new javax.swing.JCheckBox();
        jspCapacidadVehiculo = new javax.swing.JSpinner();
        jcbTipoVehiculo = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        jifRegistrarUsuario = new javax.swing.JInternalFrame();
        jLabel11 = new javax.swing.JLabel();
        txtRegistrarNombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtRegistrarApellido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtRegistrarCedula = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtRegistrarCorreo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtRegistarPassword = new javax.swing.JPasswordField();
        btnRegistrarUsuario = new javax.swing.JButton();
        jifAlquilarVehiculo = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAlquilarVehiculo = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jdFechaInicial = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jdFechaFinal = new com.toedter.calendar.JDateChooser();
        bntConfirmarAlquiler = new javax.swing.JButton();
        jifInformeAlquiler = new javax.swing.JInternalFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblInformeAlquiler = new javax.swing.JTable();
        jifRecepcionVehiculo = new javax.swing.JInternalFrame();
        txtBuscarMatriculaRecepcionVehiculo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnBuscarMatriculaRecepcionVehiculo = new javax.swing.JButton();
        jpRecepcionVehiculoCamioneta = new javax.swing.JPanel();
        chbCojineria = new javax.swing.JCheckBox();
        chbLuces = new javax.swing.JCheckBox();
        chbAntena = new javax.swing.JCheckBox();
        chbRadio = new javax.swing.JCheckBox();
        chbCarroceria = new javax.swing.JCheckBox();
        chbTapetes = new javax.swing.JCheckBox();
        chbBotiquin = new javax.swing.JCheckBox();
        chbKitCarreteras = new javax.swing.JCheckBox();
        txtKmRecpcion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jpRecepcionVehiculo = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtpRecepcionVehiculo = new javax.swing.JTextPane();
        btnCalcularValorPagar = new javax.swing.JButton();
        txtValorPagar = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        mnuPrincipal = new javax.swing.JMenu();
        mnuVehiculosDisponilbes = new javax.swing.JMenuItem();
        mnuAlquilarVehiculos = new javax.swing.JMenuItem();
        mnuRecepcionVehiculo = new javax.swing.JMenuItem();
        mnuReporteVehiculos = new javax.swing.JMenuItem();
        mnuConfiguracionVehiculos = new javax.swing.JMenu();
        mnuEditarVehiculos = new javax.swing.JMenuItem();
        mnuCargarVehiculos = new javax.swing.JMenuItem();
        mnuConfiguracionUsuario = new javax.swing.JMenuItem();
        mnuCerrarSesion = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jifLogin.setTitle("Login");
        jifLogin.setVisible(true);

        jLabel1.setText("User*");

        jLabel2.setText("Password*");

        btnIngresar.setText("Entrar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnRegistrarse.setText("Registarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jifLoginLayout = new javax.swing.GroupLayout(jifLogin.getContentPane());
        jifLogin.getContentPane().setLayout(jifLoginLayout);
        jifLoginLayout.setHorizontalGroup(
            jifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jifLoginLayout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addGroup(jifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtLogin)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(187, 187, 187))
        );
        jifLoginLayout.setVerticalGroup(
            jifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifLoginLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        desktopPane.add(jifLogin);
        jifLogin.setBounds(40, 40, 700, 370);

        jifListadoVehiculos.setClosable(true);
        jifListadoVehiculos.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifListadoVehiculos.setIconifiable(true);
        jifListadoVehiculos.setMaximizable(true);
        jifListadoVehiculos.setTitle("Listado de Vehiculos");
        jifListadoVehiculos.setVisible(false);

        tblListadosCamionetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)}
            },
            new String [] {
                "Tipo", "Capacidad", "Matricula", "Km", "Disponibilidad", "Valor de Alquiler", "Activo/Inactivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Short.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListadosCamionetas);

        tblListadoCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)}
            },
            new String [] {
                "Tipo", "Extras", "Matricula", "Km", "Disponibilidad", "Valor de Alquiler", "Activo/Inactivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblListadoCarros);

        tblListadoMotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)},
                {null, null, null, null, null, null,  new Boolean(true)}
            },
            new String [] {
                "Tipo", "Casco", "Matricula", "Km", "Disponibilidad", "Valor de Alquiler", "Activo/Inactivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblListadoMotos);

        jLabel3.setText("                      Configuracion de Vehiculos");

        jLabel5.setText("Tipo*");

        jLabel6.setText("Capacidad");

        jLabel7.setText("Matricula*");

        jLabel8.setText("Km*");

        jLabel10.setText("Valor Alquiler*");

        btnAgregarVehiculo.setText("Agregar");
        btnAgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVehiculoActionPerformed(evt);
            }
        });

        btnEliminarVehiculo.setText("Eliminar");
        btnEliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVehiculoActionPerformed(evt);
            }
        });

        btnGuardarConfiguracionVehiculo.setText("Guardar");
        btnGuardarConfiguracionVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarConfiguracionVehiculoActionPerformed(evt);
            }
        });

        chbExtras.setText("Extras");

        chbCasco.setText("Casco");

        jLabel4.setText("Complementarios");

        chbDisponibilidad.setText("Disponibilidad");

        jspCapacidadVehiculo.setModel(new javax.swing.SpinnerNumberModel(Short.valueOf((short)0), Short.valueOf((short)0), Short.valueOf((short)10), Short.valueOf((short)1)));

        jcbTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camioneta", "Carro", "Moto" }));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnDesactivar.setText("Desactivar");
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });

        btnActivar.setText("Activar");
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConfiguracionVehiculoLayout = new javax.swing.GroupLayout(jpConfiguracionVehiculo);
        jpConfiguracionVehiculo.setLayout(jpConfiguracionVehiculoLayout);
        jpConfiguracionVehiculoLayout.setHorizontalGroup(
            jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConfiguracionVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConfiguracionVehiculoLayout.createSequentialGroup()
                        .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpConfiguracionVehiculoLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtValorAlquiler))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpConfiguracionVehiculoLayout.createSequentialGroup()
                                    .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jpConfiguracionVehiculoLayout.createSequentialGroup()
                                            .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jpConfiguracionVehiculoLayout.createSequentialGroup()
                                                    .addComponent(jspCapacidadVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(chbExtras)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(chbCasco))
                                                .addComponent(jcbTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpConfiguracionVehiculoLayout.createSequentialGroup()
                                    .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chbDisponibilidad)
                                        .addComponent(txtMatricula)
                                        .addComponent(txtKm))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpConfiguracionVehiculoLayout.createSequentialGroup()
                                .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpConfiguracionVehiculoLayout.createSequentialGroup()
                                        .addComponent(btnAgregarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEliminarVehiculo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar)))
                                .addGap(0, 67, Short.MAX_VALUE)))
                        .addGap(37, 37, 37))
                    .addGroup(jpConfiguracionVehiculoLayout.createSequentialGroup()
                        .addComponent(btnDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarConfiguracionVehiculo)
                        .addGap(26, 26, 26))
                    .addGroup(jpConfiguracionVehiculoLayout.createSequentialGroup()
                        .addComponent(btnActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpConfiguracionVehiculoLayout.setVerticalGroup(
            jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConfiguracionVehiculoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbExtras)
                    .addComponent(chbCasco)
                    .addComponent(jspCapacidadVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpConfiguracionVehiculoLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConfiguracionVehiculoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbDisponibilidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtValorAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnAgregarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpConfiguracionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarConfiguracionVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jifListadoVehiculosLayout = new javax.swing.GroupLayout(jifListadoVehiculos.getContentPane());
        jifListadoVehiculos.getContentPane().setLayout(jifListadoVehiculosLayout);
        jifListadoVehiculosLayout.setHorizontalGroup(
            jifListadoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifListadoVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jifListadoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jpConfiguracionVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jifListadoVehiculosLayout.setVerticalGroup(
            jifListadoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifListadoVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jifListadoVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpConfiguracionVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jifListadoVehiculosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        desktopPane.add(jifListadoVehiculos);
        jifListadoVehiculos.setBounds(640, 0, 1078, 553);
        try {
            jifListadoVehiculos.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jifRegistrarUsuario.setClosable(true);
        jifRegistrarUsuario.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifRegistrarUsuario.setIconifiable(true);
        jifRegistrarUsuario.setMaximizable(true);
        jifRegistrarUsuario.setTitle("Registrarse");
        jifRegistrarUsuario.setVisible(false);

        jLabel11.setText("Nombre*");

        jLabel12.setText("Apellido*");

        jLabel13.setText("C.C*");

        jLabel14.setText("Correo*");

        jLabel15.setText("Password");

        btnRegistrarUsuario.setText("Registrarse");
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jifRegistrarUsuarioLayout = new javax.swing.GroupLayout(jifRegistrarUsuario.getContentPane());
        jifRegistrarUsuario.getContentPane().setLayout(jifRegistrarUsuarioLayout);
        jifRegistrarUsuarioLayout.setHorizontalGroup(
            jifRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifRegistrarUsuarioLayout.createSequentialGroup()
                .addGroup(jifRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jifRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(jifRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jifRegistrarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegistarPassword))
                            .addGroup(jifRegistrarUsuarioLayout.createSequentialGroup()
                                .addGroup(jifRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jifRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jifRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jifRegistrarUsuarioLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jifRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRegistrarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRegistrarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRegistrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jifRegistrarUsuarioLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtRegistrarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jifRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jifRegistrarUsuarioLayout.setVerticalGroup(
            jifRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifRegistrarUsuarioLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jifRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jifRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistrarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jifRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistrarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jifRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jifRegistrarUsuarioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtRegistrarCorreo))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jifRegistrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtRegistarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        desktopPane.add(jifRegistrarUsuario);
        jifRegistrarUsuario.setBounds(760, 110, 60, 90);
        try {
            jifRegistrarUsuario.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jifAlquilarVehiculo.setClosable(true);
        jifAlquilarVehiculo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifAlquilarVehiculo.setIconifiable(true);
        jifAlquilarVehiculo.setMaximizable(true);
        jifAlquilarVehiculo.setTitle("Alquilar Vehiculo");
        jifAlquilarVehiculo.setVisible(false);

        tblAlquilarVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Vehiculo", "Capacidad-Extras-Casco", "Matricula", "Km", "Disponibilidad", "Valor Alquiler", "Estado Avtivo - Inactivo", "Alquilar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblAlquilarVehiculo);

        jLabel17.setText("Fecha Alquiler");

        jLabel18.setText("Fecha Entrega");

        bntConfirmarAlquiler.setText("Alquilar");
        bntConfirmarAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntConfirmarAlquilerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jifAlquilarVehiculoLayout = new javax.swing.GroupLayout(jifAlquilarVehiculo.getContentPane());
        jifAlquilarVehiculo.getContentPane().setLayout(jifAlquilarVehiculoLayout);
        jifAlquilarVehiculoLayout.setHorizontalGroup(
            jifAlquilarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifAlquilarVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jifAlquilarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jifAlquilarVehiculoLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(bntConfirmarAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jifAlquilarVehiculoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jifAlquilarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jifAlquilarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 113, Short.MAX_VALUE))
        );
        jifAlquilarVehiculoLayout.setVerticalGroup(
            jifAlquilarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifAlquilarVehiculoLayout.createSequentialGroup()
                .addGroup(jifAlquilarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jifAlquilarVehiculoLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jifAlquilarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jifAlquilarVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(bntConfirmarAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jifAlquilarVehiculoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        desktopPane.add(jifAlquilarVehiculo);
        jifAlquilarVehiculo.setBounds(640, 420, 1054, 589);
        try {
            jifAlquilarVehiculo.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jifInformeAlquiler.setClosable(true);
        jifInformeAlquiler.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifInformeAlquiler.setIconifiable(true);
        jifInformeAlquiler.setMaximizable(true);
        jifInformeAlquiler.setTitle("Informde de Alquiler");
        jifInformeAlquiler.setVisible(false);

        tblInformeAlquiler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Vehiculo", "Matricula", "Fecha de Despacho", "Fecha de Entrega", "Dias de  Alquiler"
            }
        ));
        tblInformeAlquiler.setEnabled(false);
        jScrollPane5.setViewportView(tblInformeAlquiler);

        javax.swing.GroupLayout jifInformeAlquilerLayout = new javax.swing.GroupLayout(jifInformeAlquiler.getContentPane());
        jifInformeAlquiler.getContentPane().setLayout(jifInformeAlquilerLayout);
        jifInformeAlquilerLayout.setHorizontalGroup(
            jifInformeAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifInformeAlquilerLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jifInformeAlquilerLayout.setVerticalGroup(
            jifInformeAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifInformeAlquilerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        desktopPane.add(jifInformeAlquiler);
        jifInformeAlquiler.setBounds(180, 440, 1054, 613);
        try {
            jifInformeAlquiler.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jifRecepcionVehiculo.setClosable(true);
        jifRecepcionVehiculo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifRecepcionVehiculo.setIconifiable(true);
        jifRecepcionVehiculo.setMaximizable(true);
        jifRecepcionVehiculo.setTitle("Recepcion de Vehiculos");
        jifRecepcionVehiculo.setVisible(false);

        txtBuscarMatriculaRecepcionVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarMatriculaRecepcionVehiculoActionPerformed(evt);
            }
        });

        jLabel16.setText("Matricula");

        btnBuscarMatriculaRecepcionVehiculo.setText("Buscar");
        btnBuscarMatriculaRecepcionVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMatriculaRecepcionVehiculoActionPerformed(evt);
            }
        });

        chbCojineria.setText("Cojineria");
        chbCojineria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbCojineriaActionPerformed(evt);
            }
        });

        chbLuces.setText("Luces");

        chbAntena.setText("Antena");

        chbRadio.setText("Radio");

        chbCarroceria.setText("Carroceria");

        chbTapetes.setText("Tapetes");

        chbBotiquin.setText("Botiquin");

        chbKitCarreteras.setText("Kit de Carreteras");

        jLabel19.setText("Km");

        javax.swing.GroupLayout jpRecepcionVehiculoCamionetaLayout = new javax.swing.GroupLayout(jpRecepcionVehiculoCamioneta);
        jpRecepcionVehiculoCamioneta.setLayout(jpRecepcionVehiculoCamionetaLayout);
        jpRecepcionVehiculoCamionetaLayout.setHorizontalGroup(
            jpRecepcionVehiculoCamionetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRecepcionVehiculoCamionetaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jpRecepcionVehiculoCamionetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRecepcionVehiculoCamionetaLayout.createSequentialGroup()
                        .addComponent(txtKmRecpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chbKitCarreteras)
                    .addComponent(chbBotiquin)
                    .addComponent(chbTapetes)
                    .addComponent(chbCarroceria)
                    .addComponent(chbRadio)
                    .addComponent(chbAntena)
                    .addComponent(chbLuces)
                    .addComponent(chbCojineria))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpRecepcionVehiculoCamionetaLayout.setVerticalGroup(
            jpRecepcionVehiculoCamionetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRecepcionVehiculoCamionetaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(chbCojineria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbLuces)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbAntena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbCarroceria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbTapetes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbBotiquin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbKitCarreteras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRecepcionVehiculoCamionetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtKmRecpcion))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jpRecepcionVehiculo.setEnabled(false);

        jScrollPane6.setViewportView(txtpRecepcionVehiculo);

        javax.swing.GroupLayout jpRecepcionVehiculoLayout = new javax.swing.GroupLayout(jpRecepcionVehiculo);
        jpRecepcionVehiculo.setLayout(jpRecepcionVehiculoLayout);
        jpRecepcionVehiculoLayout.setHorizontalGroup(
            jpRecepcionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRecepcionVehiculoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jpRecepcionVehiculoLayout.setVerticalGroup(
            jpRecepcionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRecepcionVehiculoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        btnCalcularValorPagar.setText("Valor a Pagar");
        btnCalcularValorPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularValorPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jifRecepcionVehiculoLayout = new javax.swing.GroupLayout(jifRecepcionVehiculo.getContentPane());
        jifRecepcionVehiculo.getContentPane().setLayout(jifRecepcionVehiculoLayout);
        jifRecepcionVehiculoLayout.setHorizontalGroup(
            jifRecepcionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifRecepcionVehiculoLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jifRecepcionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jifRecepcionVehiculoLayout.createSequentialGroup()
                        .addComponent(jpRecepcionVehiculoCamioneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jifRecepcionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpRecepcionVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jifRecepcionVehiculoLayout.createSequentialGroup()
                                .addComponent(btnCalcularValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(txtValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jifRecepcionVehiculoLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarMatriculaRecepcionVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnBuscarMatriculaRecepcionVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        jifRecepcionVehiculoLayout.setVerticalGroup(
            jifRecepcionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifRecepcionVehiculoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jifRecepcionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarMatriculaRecepcionVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMatriculaRecepcionVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jifRecepcionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpRecepcionVehiculoCamioneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jifRecepcionVehiculoLayout.createSequentialGroup()
                        .addComponent(jpRecepcionVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jifRecepcionVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jifRecepcionVehiculoLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnCalcularValorPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jifRecepcionVehiculoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        desktopPane.add(jifRecepcionVehiculo);
        jifRecepcionVehiculo.setBounds(780, 50, 1054, 585);
        try {
            jifRecepcionVehiculo.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        mnuPrincipal.setMnemonic('f');
        mnuPrincipal.setText("Menu");
        mnuPrincipal.setEnabled(false);

        mnuVehiculosDisponilbes.setMnemonic('o');
        mnuVehiculosDisponilbes.setText("Vehiculos Disponibles");
        mnuVehiculosDisponilbes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVehiculosDisponilbesActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuVehiculosDisponilbes);

        mnuAlquilarVehiculos.setMnemonic('a');
        mnuAlquilarVehiculos.setText("Alquilar Vehiculos");
        mnuAlquilarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAlquilarVehiculosActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuAlquilarVehiculos);

        mnuRecepcionVehiculo.setText("Recepcion de Vehiculo");
        mnuRecepcionVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRecepcionVehiculoActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuRecepcionVehiculo);

        mnuReporteVehiculos.setText("Reporte de Vehiculos");
        mnuReporteVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteVehiculosActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuReporteVehiculos);

        mnuConfiguracionVehiculos.setText("Configuracion de Vehiculos");

        mnuEditarVehiculos.setMnemonic('s');
        mnuEditarVehiculos.setText("Editar/Crear/Eliminar/ Vehiculos");
        mnuEditarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEditarVehiculosActionPerformed(evt);
            }
        });
        mnuConfiguracionVehiculos.add(mnuEditarVehiculos);

        mnuCargarVehiculos.setText("Cargar Vehiculos");
        mnuConfiguracionVehiculos.add(mnuCargarVehiculos);

        mnuPrincipal.add(mnuConfiguracionVehiculos);

        mnuConfiguracionUsuario.setText("Configuracion de usuario");
        mnuPrincipal.add(mnuConfiguracionUsuario);

        mnuCerrarSesion.setText("Cerrar Sesión");
        mnuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCerrarSesionActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuCerrarSesion);

        mnuSalir.setMnemonic('x');
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuPrincipal.add(mnuSalir);

        menuBar.add(mnuPrincipal);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed
//Ingreso del Login----------------------------------------------
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        //Validacion si se ha escrito algo en el user
        if (txtLogin.getText() == null || txtLogin.getText().compareTo("") == 0) {

            JOptionPane.showMessageDialog(this, "Debe diiligenciar el campo de Usuario", "Datos Faltantes", 0);

        } //Validacion si se ha escrito algo en password
        else if (txtPassword.getPassword().length == 0) {

            JOptionPane.showMessageDialog(this, "Debe diiligenciar el password", "Datos Faltantes", 0);
        } //validacion si es un correo electronico Expresion regular 
        else {

            try {
                if (gestionUsuario.validarEmail(txtLogin.getText())) {

                    //Validar que el usuario este REGISTRADO
                    usuarioAutenticado = gestionUsuario.validarUsuario(txtLogin.getText(), txtPassword.getText());
                    if (usuarioAutenticado != null) {

                        gestionVehiculo = new GestionVehiculo();    //cargo las vehiculos del archivo a la lista
                        JOptionPane.showMessageDialog(this, "Bienvenido " + usuarioAutenticado, "Ingresó como "
                                + usuarioAutenticado.getTipoUsuario().getDescripcion(), 2);
                        mnuPrincipal.setEnabled(true);
                        jifLogin.hide();
                        gestionPermisosMnu();   //habilita los menus
                    } else {
                        JOptionPane.showMessageDialog(this, "Error", "Datos de Ingreso Erroneos", 2);

                    }

                }
            } catch (UsuarioException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos Erroneos", 0);
            }

        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void mnuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCerrarSesionActionPerformed
        ocultarJiframes();
        mnuPrincipal.setEnabled(false);
        txtLogin.setText("");
        txtPassword.setText("");
        usuarioAutenticado = null;
        iniciarMenus(false);
        jifLogin.show();
        jifListadoVehiculos.hide();
        jpConfiguracionVehiculo.hide();


    }//GEN-LAST:event_mnuCerrarSesionActionPerformed

    private void pintarLstVehiculos() {

        modeloTblCamionetas.getDataVector().removeAllElements();//
        modeloTblCarros.getDataVector().removeAllElements();
        modeloTblMotos.getDataVector().removeAllElements();
        modeloTblInformeAlquiler.getDataVector().removeAllElements();
//        for (int i = 0; i < gestionVehiculo.getLstVehiculos().size(); i++) {
//            gestionVehiculo.getLstVehiculos().remove(i);//
//        }
        for (AbstractVehiculo vehiculo : gestionVehiculo.getLstVehiculos()) {
            if (vehiculo.getTipoVehiculo().getCodigo() == (byte) 1) {
                //COn Instace of puedo saber si un objeto es instancia de alguna clase EJ...
                //vehiculo instanceof Camioneta
                modeloTblCamionetas.addRow(vehiculo.obtenerArregloObjeto());

            } else if (vehiculo.getTipoVehiculo().getCodigo() == (byte) 2) {

                modeloTblCarros.addRow(vehiculo.obtenerArregloObjeto());
            } else if (vehiculo.getTipoVehiculo().getCodigo() == (byte) 3) {
                modeloTblMotos.addRow(vehiculo.obtenerArregloObjeto());
            }
        }

        tblListadosCamionetas.setModel(modeloTblCamionetas);
        tblListadoCarros.setModel(modeloTblCarros);
        tblListadoMotos.setModel(modeloTblMotos);

        for (InformeAlquiler informeAlquiler : alquilaVehiculo.llenarInformeVehiculos()) {

            modeloTblInformeAlquiler.addRow(informeAlquiler.obtenerArregloObjeto());
        }
        tblInformeAlquiler.setModel(modeloTblInformeAlquiler);

    }

    private void iniciarTablas() {

        gestionVehiculo.llenarVehiculos();
        pintarLstVehiculos();
        verificarCamionetasInactivos();
        verificarCarrosInactivos();
        verificarMotosInactivos();
    }

    private void mnuVehiculosDisponilbesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVehiculosDisponilbesActionPerformed

        iniciarTablas();
        ocultarJiframes();
        jifListadoVehiculos.show();
        tblListadosCamionetas.clearSelection();
        tblListadoCarros.clearSelection();
        tblListadoMotos.clearSelection();
        if (jifListadoVehiculos.isIcon()) {   //SI esta minimizada al presiona en el menu se maximiza
            try {
                jifListadoVehiculos.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(MdiVehiculos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mnuVehiculosDisponilbesActionPerformed

    private void mnuEditarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEditarVehiculosActionPerformed


    }//GEN-LAST:event_mnuEditarVehiculosActionPerformed
    private boolean validarCampoKm() {
        try {
            Integer.parseInt(txtKm.getText());
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validarCampoKmRecepcion() {
        try {
            Integer.parseInt(txtKmRecpcion.getText());
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validarCampoValorAlquiler() {
        try {
            Double.parseDouble(txtValorAlquiler.getText());
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validarCampoCapacidad() {
        try {
            Double.parseDouble(txtValorAlquiler.getText());
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

//Validacion de campos de configurcion y captura de excepciones
    //Los campos numericos deben tener numeros y no letras y el campo de matricula debe terner un formato valido
    private boolean validarCamposConfiguracionVehiculo() throws VehiculosException {

        if (validarCampoKm() && validarCampoValorAlquiler()) {
            if (Integer.parseInt(txtKm.getText()) >= 0 && Double.parseDouble(txtValorAlquiler.getText()) > 0) {

                if (gestionVehiculo.validarMatricula(txtMatricula.getText())) {
                    return true;
                } else {
                    throw new VehiculosException("Debe diligenciar una placa valida");
                }
            }
        } else {
            throw new VehiculosException("Debe diligenciar valores numericos en los campos Km y Valor Alquiler");
        }
        return false;
    }

    private void limpiarCamposConfiguracion() {

        jspCapacidadVehiculo.setValue(0);
        chbExtras.setSelected(false);
        chbCasco.setSelected(false);
        txtMatricula.setText("");
        txtKm.setText("");
        chbDisponibilidad.setSelected(false);
        txtValorAlquiler.setText("");
        tblListadosCamionetas.clearSelection();
        tblListadoCarros.clearSelection();
        tblListadoMotos.clearSelection();

    }


    private void btnAgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVehiculoActionPerformed

        try {
            if (validarCamposConfiguracionVehiculo()) {
                String itemCamioneta = "" + jcbTipoVehiculo.getSelectedItem();
                String itemCarro = "" + jcbTipoVehiculo.getSelectedItem();
                String itemMoto = "" + jcbTipoVehiculo.getSelectedItem();
                String capacidad = "" + jspCapacidadVehiculo.getValue();
                if (itemCamioneta.compareToIgnoreCase("camioneta") == 0 && (Short.parseShort(capacidad) > 0)) {

                    Camioneta camioneta = new Camioneta((new TipoVehiculo("Camioneta", (byte) 1)), (short) jspCapacidadVehiculo.getValue(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!validarCamioneta(camioneta)) {
                        //Convierto el objeto camion en un arreglo de tipo object a traves del metodo y adiciono este arreglo a la tabla

                        modeloTblCamionetas.addRow(camioneta.obtenerArregloObjeto());
                    }
//-------------------------------Validacion de carro---------------------
                } else if (itemCarro.compareToIgnoreCase("carro") == 0) {

                    Carro carro = new Carro((new TipoVehiculo("Carro", (byte) 2)), chbExtras.isSelected(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!validarCarro(carro)) {
                        //Convierto el objeto camion en un arreglo de tipo object a traves del metodo y adiciono este arreglo a la tabla

                        modeloTblCarros.addRow(carro.obtenerArregloObjeto());
                    }
                } //-------------------------------------validacion tipo moto
                else if (itemMoto.compareToIgnoreCase("moto") == 0) {

                    Moto moto = new Moto((new TipoVehiculo("Moto", (byte) 3)), chbCasco.isSelected(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!validarMoto(moto)) {
                        //Convierto el objeto camion en un arreglo de tipo object a traves del metodo y adiciono este arreglo a la tabla

                        modeloTblMotos.addRow(moto.obtenerArregloObjeto());
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La capacidad de la camioneta debe ser mayor que cero", "Datos Erroneos", 0);
                }

            }
        } catch (VehiculosException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos Erroneos", 0);
        }

        limpiarCamposConfiguracion();


    }//GEN-LAST:event_btnAgregarVehiculoActionPerformed

    private void btnEliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVehiculoActionPerformed

        String itemCamioneta = "" + jcbTipoVehiculo.getSelectedItem();
        String itemCarro = "" + jcbTipoVehiculo.getSelectedItem();
        String itemMoto = "" + jcbTipoVehiculo.getSelectedItem();

        if (tblListadosCamionetas.getSelectedRow() != -1) {
            modeloTblCamionetas.removeRow(tblListadosCamionetas.getSelectedRow());
            tblListadosCamionetas.clearSelection();

        } else if (tblListadoCarros.getSelectedRow() != -1) {
            modeloTblCarros.removeRow(tblListadoCarros.getSelectedRow());
            tblListadoCarros.clearSelection();
        } else if (tblListadoMotos.getSelectedRow() != -1) {
            modeloTblMotos.removeRow(tblListadoMotos.getSelectedRow());
            tblListadoMotos.clearSelection();
        } else {
            try {
                if (validarCamposConfiguracionVehiculo()) {

                    if (itemCamioneta.compareToIgnoreCase("camioneta") == 0) {

                        Camioneta camioneta = new Camioneta((new TipoVehiculo("Camioneta", (byte) 1)), (short) jspCapacidadVehiculo.getValue(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {

                            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);
                            if (camioneta.toString().equals(camionetaTabla.toString())) {
                                modeloTblCamionetas.removeRow(i);
                                JOptionPane.showMessageDialog(this, "eliminar archivo", "Dat", 0);
                                break;
                            }
                        }
                    } //Validacion para el tipo carro  ---------------------------------------------------------------
                    else if (itemCarro.compareToIgnoreCase("carro") == 0) {

                        Carro carro = new Carro((new TipoVehiculo("Carro", (byte) 2)), chbExtras.isSelected(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {

                            Carro carroTabla = obtenerObjetoTablaCarro(i);
                            if (carro.toString().equals(carroTabla.toString())) {
                                modeloTblCarros.removeRow(i);
                                JOptionPane.showMessageDialog(this, "eliminar archivo", "Warning", 0);
                                break;
                            }
                        }
                    } //------------------------------------validacion para tipo Moto
                    else if (itemMoto.compareToIgnoreCase("moto") == 0) {

                        Moto moto = new Moto((new TipoVehiculo("Moto", (byte) 3)), chbCasco.isSelected(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {

                            Moto motoTabla = obtenerObjetoTablaMoto(i);
                            if (moto.toString().equals(motoTabla.toString())) {
                                modeloTblMotos.removeRow(i);
                                JOptionPane.showMessageDialog(this, "eliminar archivo", "Warning", 0);
                                break;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Debe diligenciar tipo Y/O Capacidad, casco, Eztra",
                                "Datos Faltantes", 0);
                    }
                    limpiarCamposConfiguracion();
                }
            } catch (VehiculosException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos Erroneos", 0);
            }
        }
        limpiarCamposConfiguracion();
    }//GEN-LAST:event_btnEliminarVehiculoActionPerformed

    private void btnGuardarConfiguracionVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarConfiguracionVehiculoActionPerformed
        escribirArchivoPlanoTablasVehiculos();

    }//GEN-LAST:event_btnGuardarConfiguracionVehiculoActionPerformed

    private void escribirArchivoPlanoTablasVehiculos() {
        EscribirArchivoPlano.borrarArchivo();

        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {

            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);
            EscribirArchivoPlano.escribir(camionetaTabla);

            //COndicion necesaria para eliminar vehiculos de la lista de informe de vehiculos alquilados si se 
            //valida que en la tabla de vehiculos se encuentra disponible
            if (camionetaTabla.isEstado()) {

                for (int j = 0; j < tblInformeAlquiler.getRowCount(); j++) {
                    if (camionetaTabla.getMatricula().equals(modeloTblInformeAlquiler.getValueAt(j, 2))) {
                        modeloTblInformeAlquiler.removeRow(j);
                    }
                }

            }
        }

        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {

            Carro carroTabla = obtenerObjetoTablaCarro(i);
            EscribirArchivoPlano.escribirCarro(carroTabla);

            //COndicion necesaria para eliminar vehiculos de la lista de informe de vehiculos alquilados si se 
            //valida que en la tabla de vehiculos se encuentra disponible
            if (carroTabla.isEstado()) {

                for (int j = 0; j < tblInformeAlquiler.getRowCount(); j++) {
                    if (carroTabla.getMatricula().equals(modeloTblInformeAlquiler.getValueAt(j, 2))) {
                        modeloTblInformeAlquiler.removeRow(j);
                    }
                }

            }

        }

        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {

            Moto motoTabla = obtenerObjetoTablaMoto(i);
            EscribirArchivoPlano.escribirMoto(motoTabla);

            //COndicion necesaria para eliminar vehiculos de la lista de informe de vehiculos alquilados si se 
            //valida que en la tabla de vehiculos se encuentra disponible
            if (motoTabla.isEstado()) {

                for (int j = 0; j < tblInformeAlquiler.getRowCount(); j++) {
                    if (motoTabla.getMatricula().equals(modeloTblInformeAlquiler.getValueAt(j, 2))) {
                        modeloTblInformeAlquiler.removeRow(j);
                    }
                }

            }
        }

        escribirInformeAlquiler();
        JOptionPane.showMessageDialog(null, "Se han guardado los cambios con exito");
        limpiarCamposConfiguracion();
    }


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {
            if (validarCamposConfiguracionVehiculo()) {
                String itemCamioneta = "" + jcbTipoVehiculo.getSelectedItem();
                String itemCarro = "" + jcbTipoVehiculo.getSelectedItem();
                String itemMoto = "" + jcbTipoVehiculo.getSelectedItem();
                String capacidad = "" + jspCapacidadVehiculo.getValue();
                if (itemCamioneta.compareToIgnoreCase("camioneta") == 0 && (Short.parseShort(capacidad) > 0)) {

                    Camioneta camioneta = new Camioneta((new TipoVehiculo("Camioneta", (byte) 1)), (short) jspCapacidadVehiculo.getValue(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!buscarCamioneta(camioneta)) {
                        JOptionPane.showMessageDialog(this, "El vehiculo no se encuentra registrado", "Resultado", 0);
                    }
//-------------------------------Validacion de carro---------------------
                } else if (itemCarro.compareToIgnoreCase("carro") == 0) {

                    Carro carro = new Carro((new TipoVehiculo("Carro", (byte) 2)), chbExtras.isSelected(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!buscarCarro(carro)) {
                        JOptionPane.showMessageDialog(this, "El vehiculo no se encuentra registrado", "Resultado", 0);
                    }
                } //-------------------------------------validacion tipo moto
                else if (itemMoto.compareToIgnoreCase("moto") == 0) {

                    Moto moto = new Moto((new TipoVehiculo("Moto", (byte) 3)), chbCasco.isSelected(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!buscarMoto(moto)) {
                        JOptionPane.showMessageDialog(this, "El vehiculo no se encuentra registrado", "Resultado", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La capacidad de la camioneta debe ser mayor que cero", "Datos Erroneos", 0);
                }
            }
        } catch (VehiculosException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos Erroneos", 0);
        }
        limpiarCamposConfiguracion();
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void verificarCamionetasInactivos() {

        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {
            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);
            if (!gestionVehiculo.validarMatricula(camionetaTabla.getMatricula())) {
                modeloTblCamionetas.setValueAt(false, i, 6);
            } else {
                modeloTblCamionetas.setValueAt(true, i, 6);
            }
        }
    }

    private void verificarCarrosInactivos() {

        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {
            Carro carroTabla = obtenerObjetoTablaCarro(i);
            if (!gestionVehiculo.validarMatricula(carroTabla.getMatricula())) {
                modeloTblCarros.setValueAt(false, i, 6);
            } else {
                modeloTblCarros.setValueAt(true, i, 6);
            }
        }
    }

    private void verificarMotosInactivos() {

        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {
            Moto motoTabla = obtenerObjetoTablaMoto(i);
            if (!gestionVehiculo.validarMatricula(motoTabla.getMatricula())) {
                modeloTblMotos.setValueAt(false, i, 6);
            } else {
                modeloTblMotos.setValueAt(true, i, 6);
            }
        }
    }

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed

        String itemCamioneta = "" + jcbTipoVehiculo.getSelectedItem();
        String itemCarro = "" + jcbTipoVehiculo.getSelectedItem();
        String itemMoto = "" + jcbTipoVehiculo.getSelectedItem();

        if (tblListadosCamionetas.getSelectedRow() != -1) {

            modeloTblCamionetas.setValueAt("Inhabilitado " + modeloTblCamionetas.getValueAt(tblListadosCamionetas.getSelectedRow(), 2), tblListadosCamionetas.getSelectedRow(), 2);
            modeloTblCamionetas.setValueAt(false, tblListadosCamionetas.getSelectedRow(), 4);
            modeloTblCamionetas.setValueAt(false, tblListadosCamionetas.getSelectedRow(), 6);
            tblListadosCamionetas.setSelectionForeground(Color.RED);
            tblListadosCamionetas.clearSelection();

        } else if (tblListadoCarros.getSelectedRow() != -1) {

            modeloTblCarros.setValueAt("Inhabilitado " + modeloTblCarros.getValueAt(tblListadoCarros.getSelectedRow(), 2), tblListadoCarros.getSelectedRow(), 2);
            modeloTblCarros.setValueAt(false, tblListadoCarros.getSelectedRow(), 4);
            modeloTblCarros.setValueAt(false, tblListadoCarros.getSelectedRow(), 6);
            tblListadoCarros.setSelectionForeground(Color.RED);
            tblListadoCarros.clearSelection();

        } else if (tblListadoMotos.getSelectedRow() != -1) {

            modeloTblMotos.setValueAt("Inhabilitado " + modeloTblMotos.getValueAt(tblListadoMotos.getSelectedRow(), 2), tblListadoMotos.getSelectedRow(), 2);
            modeloTblMotos.setValueAt(false, tblListadoMotos.getSelectedRow(), 4);
            modeloTblMotos.setValueAt(false, tblListadoMotos.getSelectedRow(), 6);
            tblListadoMotos.setSelectionForeground(Color.RED);
            tblListadoMotos.clearSelection();
        } else {
            try {
                if (validarCamposConfiguracionVehiculo()) {
                    String capacidad = "" + jspCapacidadVehiculo.getValue();
                    if (itemCamioneta.compareToIgnoreCase("camioneta") == 0 && (Short.parseShort(capacidad) > 0)) {
                        Camioneta camioneta = new Camioneta((new TipoVehiculo("Camioneta", (byte) 1)), (short) jspCapacidadVehiculo.getValue(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {
                            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);
                            if (camioneta.getMatricula().equals(camionetaTabla.getMatricula())) {

                                modeloTblCamionetas.setValueAt("Inhabilitado " + modeloTblCamionetas.getValueAt(i, 2), i, 2);
                                modeloTblCamionetas.setValueAt(false, i, 4);
                                modeloTblCamionetas.setValueAt(false, i, 6);
                                tblListadosCamionetas.setSelectionForeground(Color.RED);
                                JOptionPane.showMessageDialog(this, "Camioneta desactivada", "Dat", 0);
                                break;
                            }
                        }

                    } //Validacion para el tipo carro  ---------------------------------------------------------------
                    else if (itemCarro.compareToIgnoreCase("carro") == 0) {

                        Carro carro = new Carro((new TipoVehiculo("Carro", (byte) 2)), chbExtras.isSelected(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {

                            Carro carroTabla = obtenerObjetoTablaCarro(i);
                            if (carro.getMatricula().equals(carroTabla.getMatricula())) {

                                modeloTblCarros.setValueAt("Inhabilitado " + modeloTblCarros.getValueAt(i, 2), i, 2);
                                modeloTblCarros.setValueAt(false, i, 4);
                                modeloTblCarros.setValueAt(false, i, 6);
                                tblListadoCarros.setSelectionForeground(Color.RED);
                                JOptionPane.showMessageDialog(this, "Carro desactivado", "Dat", 0);
                                break;
                            }
                        }

                    } //------------------------------------validacion para tipo Moto
                    else if (itemMoto.compareToIgnoreCase("moto") == 0) {

                        Moto moto = new Moto((new TipoVehiculo("Moto", (byte) 3)), chbCasco.isSelected(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {

                            Moto motoTabla = obtenerObjetoTablaMoto(i);
                            if (moto.getMatricula().equals(motoTabla.getMatricula())) {

                                modeloTblMotos.setValueAt("Inhabilitado " + modeloTblMotos.getValueAt(i, 2), i, 2);
                                modeloTblMotos.setValueAt(false, i, 4);
                                modeloTblMotos.setValueAt(false, i, 6);
                                tblListadoMotos.setSelectionForeground(Color.RED);
                                JOptionPane.showMessageDialog(this, "Moto desactivada", "Dat", 0);
                                break;
                            }

                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Debe diligenciar tipo Y/O Capacidad, casco, Eztra",
                                "Datos Faltantes", 0);
                    }
                    limpiarCamposConfiguracion();

                }
            } catch (VehiculosException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos Erroneos", 0);
            }
        }

        limpiarCamposConfiguracion();


    }//GEN-LAST:event_btnDesactivarActionPerformed


    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed

        String itemCamioneta = "" + jcbTipoVehiculo.getSelectedItem();
        String itemCarro = "" + jcbTipoVehiculo.getSelectedItem();
        String itemMoto = "" + jcbTipoVehiculo.getSelectedItem();

        if (tblListadosCamionetas.getSelectedRow() != -1) {

            //Divido la cadena de inhabilitado+placa en dos partes para extraer solo la placa
            try {
                String[] datos = modeloTblCamionetas.getValueAt(tblListadosCamionetas.getSelectedRow(), 2).toString().split(" ");
                modeloTblCamionetas.setValueAt(datos[1], tblListadosCamionetas.getSelectedRow(), 2);
                modeloTblCamionetas.setValueAt(true, tblListadosCamionetas.getSelectedRow(), 6);
                tblListadosCamionetas.clearSelection();
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "El vehiculo seleccionado no esta desactivado");
            }

        } else if (tblListadoCarros.getSelectedRow() != -1) {

            //Divido la cadena de inhabilitado+placa en dos partes para extraer solo la placa
            try {
                String[] datos = modeloTblCarros.getValueAt(tblListadoCarros.getSelectedRow(), 2).toString().split(" ");
                modeloTblCarros.setValueAt(datos[1], tblListadoCarros.getSelectedRow(), 2);
                modeloTblCarros.setValueAt(true, tblListadoCarros.getSelectedRow(), 6);
                tblListadoCarros.clearSelection();
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "El vehiculo seleccionado no esta desactivado");
            }

        } else if (tblListadoMotos.getSelectedRow() != -1) {

            //Divido la cadena de inhabilitado+placa en dos partes para extraer solo la placa
            try {
                String[] datos = modeloTblMotos.getValueAt(tblListadoMotos.getSelectedRow(), 2).toString().split(" ");
                modeloTblMotos.setValueAt(datos[1], tblListadoMotos.getSelectedRow(), 2);
                modeloTblMotos.setValueAt(true, tblListadoMotos.getSelectedRow(), 6);
                tblListadoMotos.clearSelection();
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "El vehiculo seleccionado no esta desactivado");
            }
        } else {
            try {
                if (validarCamposConfiguracionVehiculo()) {
                    String capacidad = "" + jspCapacidadVehiculo.getValue();
                    if (itemCamioneta.compareToIgnoreCase("camioneta") == 0 && (Short.parseShort(capacidad) > 0)) {
                        Camioneta camioneta = new Camioneta((new TipoVehiculo("Camioneta", (byte) 1)), (short) jspCapacidadVehiculo.getValue(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {
                            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);

                            if (camionetaTabla.getMatricula().compareTo("Inhabilitado " + camioneta.getMatricula()) == 0) {

                                String[] datos = modeloTblCamionetas.getValueAt(i, 2).toString().split(" ");
                                modeloTblCamionetas.setValueAt(datos[1], i, 2);
                                modeloTblCamionetas.setValueAt(true, i, 6);
                                JOptionPane.showMessageDialog(this, "Camioneta Activada", "Dat", 0);
                                break;
                            }
                        }

                    } //Validacion para el tipo carro  ---------------------------------------------------------------
                    else if (itemCarro.compareToIgnoreCase("carro") == 0) {

                        Carro carro = new Carro((new TipoVehiculo("Carro", (byte) 2)), chbExtras.isSelected(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {

                            Carro carroTabla = obtenerObjetoTablaCarro(i);
                            if (carroTabla.getMatricula().compareTo("Ihabilitado " + carro.getMatricula()) == 0) {

                                String[] datos = modeloTblCarros.getValueAt(i, 2).toString().split(" ");
                                modeloTblCarros.setValueAt(datos[1], i, 2);
                                modeloTblCarros.setValueAt(true, i, 6);
                                JOptionPane.showMessageDialog(this, "Carro Activado", "Dat", 0);
                                break;
                            }
                        }

                    } //------------------------------------validacion para tipo Moto
                    else if (itemMoto.compareToIgnoreCase("moto") == 0) {

                        Moto moto = new Moto((new TipoVehiculo("Moto", (byte) 3)), chbCasco.isSelected(),
                                txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                                Double.parseDouble(txtValorAlquiler.getText()));

                        //For para recorrer todas las filas de la tabla y avaluar cual coincide con elvehiculo ingresado
                        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {

                            Moto motoTabla = obtenerObjetoTablaMoto(i);
                            if (motoTabla.getMatricula().compareTo("Ihabilitado " + moto.getMatricula()) == 0) {

                                String[] datos = modeloTblMotos.getValueAt(i, 2).toString().split(" ");
                                modeloTblMotos.setValueAt(datos[1], i, 2);
                                modeloTblMotos.setValueAt(true, i, 6);
                                JOptionPane.showMessageDialog(this, "Moto Activada", "Dat", 0);
                                break;
                            }

                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "Debe diligenciar tipo Y/O Capacidad, casco, Eztra",
                                "Datos Faltantes", 0);
                    }
                    limpiarCamposConfiguracion();

                }
            } catch (VehiculosException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos Erroneos", 0);
            }
        }
        limpiarCamposConfiguracion();
    }//GEN-LAST:event_btnActivarActionPerformed

    private boolean validarRegistroUsuario() {

        try {
            if (gestionUsuario.validarEmail(txtRegistrarCorreo.getText())) {
                if (txtRegistrarNombre.getText().compareTo("") != 0 && txtRegistarPassword.getText().compareTo("") != 0
                        && txtRegistrarApellido.getText().compareTo("") != 0 && txtRegistrarCedula.getText().compareTo("") != 0) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(this, "Debe diligenciar todos los campos", "Error", 0);
                }
            }
        } catch (UsuarioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 0);
        }
        return false;
    }


    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed

        Usuario usuario = new Usuario(txtRegistrarCorreo.getText(), txtRegistarPassword.getText(),
                new TipoUsuario((byte) 2, "UsuarioGeneral"), txtRegistrarNombre.getText(),
                txtRegistrarApellido.getText(), txtRegistrarCedula.getText());

        if (validarRegistroUsuario()) {

            EscribirArchivoPlano.escribir(usuario);
            gestionUsuario.llenarUsuarios();
            jifRegistrarUsuario.hide();
        }

    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed

        jifRegistrarUsuario.setVisible(true);
        txtRegistarPassword.setVisible(true);
        txtRegistrarNombre.setVisible(true);
        txtRegistrarApellido.setVisible(true);
        txtRegistrarCedula.setVisible(true);
        txtRegistrarCorreo.setVisible(true);

    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void ocultarJiframes() {

        jifAlquilarVehiculo.setVisible(false);
        jifInformeAlquiler.setVisible(false);
        jifListadoVehiculos.setVisible(false);
        jifLogin.setVisible(false);
        jifRecepcionVehiculo.setVisible(false);
        jifRegistrarUsuario.setVisible(false);

    }


    private void mnuAlquilarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAlquilarVehiculosActionPerformed

        modeloAlquilerVehiculo.getDataVector().removeAllElements();//Limpia la tabla para que no se duplique informacion

        iniciarTablas();
        ocultarJiframes();
        jifAlquilarVehiculo.setVisible(true);

        Object filaCamionetas[] = new Object[modeloTblCamionetas.getColumnCount() + 1];
        Object filaCarros[] = new Object[modeloTblCarros.getColumnCount() + 1];
        Object filaMotos[] = new Object[modeloTblMotos.getColumnCount() + 1];

        for (int i = 0; i < modeloTblCamionetas.getRowCount(); i++) {
            if ((boolean) modeloTblCamionetas.getValueAt(i, 4)) {

                for (int j = 0; j < modeloTblCamionetas.getColumnCount(); j++) {
                    filaCamionetas[j] = modeloTblCamionetas.getValueAt(i, j);
                }
                filaCamionetas[7] = false;
                modeloAlquilerVehiculo.addRow(filaCamionetas);
            }
        }
        for (int i = 0; i < modeloTblCarros.getRowCount(); i++) {
            if ((boolean) modeloTblCarros.getValueAt(i, 4)) {
                for (int j = 0; j < modeloTblCarros.getColumnCount(); j++) {
                    filaCarros[j] = modeloTblCarros.getValueAt(i, j);
                }
                filaCarros[7] = false;
                modeloAlquilerVehiculo.addRow(filaCarros);
            }
        }
        for (int i = 0; i < modeloTblMotos.getRowCount(); i++) {
            if ((boolean) modeloTblMotos.getValueAt(i, 4)) {
                for (int j = 0; j < modeloTblMotos.getColumnCount(); j++) {
                    filaMotos[j] = modeloTblMotos.getValueAt(i, j);
                }
                filaMotos[7] = false;
                modeloAlquilerVehiculo.addRow(filaMotos);
            }
        }
        tblAlquilarVehiculo.setModel(modeloAlquilerVehiculo);

    }//GEN-LAST:event_mnuAlquilarVehiculosActionPerformed

    private void calcularDiasAlquiler(int numeroFila) {

        Date fecha = jdFechaInicial.getDate();
        int diaAlquiler = fecha.getDay();

        Date fechaFinal = jdFechaFinal.getDate();
        int diaEntrega = fechaFinal.getDay();

        int diasAlquiler = diaEntrega - diaAlquiler;
        if (diasAlquiler == 0) {
            diasAlquiler = 1;
        }

//        for (Interger numeroFila : vehiculoAlquilar) {
//
//            gestionVehiculo.
//            
//        }
        

        modeloTblInformeAlquiler.addRow(obtenerArregloObjetoInformeAlquiler(numeroFila, diasAlquiler));

////
//        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {
//
//            Carro carroTabla = obtenerObjetoTablaCarro(i);
//            EscribirArchivoPlano.escribirCarro(carroTabla);
//        }
//
//        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {
//
//            Moto motoTabla = obtenerObjetoTablaMoto(i);
//            EscribirArchivoPlano.escribirMoto(motoTabla);
//        }
//        JOptionPane.showMessageDialog(null, "Se han guardado los cambios con exito");
//        limpiarCamposConfiguracion();
    }

    private Object[] obtenerArregloObjetoInformeAlquiler(int numeroFila, int diasAlquiler) {
        Object[] informeAlquiler = {usuarioAutenticado.toString(), devolverVehiculoAlquilado(numeroFila).getTipoVehiculo().getTipoVehiculo(),
            devolverVehiculoAlquilado(numeroFila).getMatricula(), jdFechaInicial.getDate(), jdFechaFinal.getDate(),
            diasAlquiler};
//        EscribirArchivoPlano.escribirInformeAlquiler(informeAlquiler);
        JOptionPane.showMessageDialog(this, "Acaba de alquilar un vehiculo tipo " + informeAlquiler[0] + " de placas "
                + informeAlquiler[2] + "", "Congratulations", 2);
        return informeAlquiler;
    }

    private void bntConfirmarAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConfirmarAlquilerActionPerformed

        //guarda en una lista las filas en donde se presenta true en el campo de alquilar vehiculos 
        vehiculoAlquilar.clear();
        for (int i = 0; i < modeloAlquilerVehiculo.getRowCount(); i++) {

            if ((boolean) modeloAlquilerVehiculo.getValueAt(i, 7)) {
//            numeroFila = tblAlquilarVehiculo.getSelectedRow();
                vehiculoAlquilar.add(i);        //Lista con los numero de las filas en donde estan alquilados los vehicu
            }
        }

        for (Integer numeroFila : vehiculoAlquilar) {
            Usuario usuario = usuarioAutenticado;
            AbstractVehiculo vehiculoAlquilado = devolverVehiculoAlquilado(numeroFila);
            if (vehiculoAlquilado instanceof Camioneta) {
                modeloTblCamionetas.setValueAt(false, numeroFila, 4);
                modeloAlquilerVehiculo.setValueAt(false, numeroFila, 4);
            } else if (vehiculoAlquilado instanceof Carro) {
                modeloTblCarros.setValueAt(false, numeroFila, 4);
                modeloAlquilerVehiculo.setValueAt(false, numeroFila, 4);
            } else if (vehiculoAlquilado instanceof Moto) {
                modeloTblMotos.setValueAt(false, numeroFila, 4);
                modeloAlquilerVehiculo.setValueAt(false, numeroFila, 4);
            }
//            double costoAlquiler = alquilaVehiculo.alquilarVehiculo(vehiculoAlquilado, usuario);
            calcularDiasAlquiler(numeroFila);

        }
        escribirArchivoPlanoTablasVehiculos();  //Actualiza el valor  de la tabla de alquilar quitando de la lista
        //el vehiculo que ya no esta disponible

        escribirInformeAlquiler();

    }//GEN-LAST:event_bntConfirmarAlquilerActionPerformed

    private void escribirInformeAlquiler() {

//     Escribo el vehiculo en la lista de infrome vehiculos y los guardo en un archivo plano
        EscribirArchivoPlano.borrarArchivoInformeVehiculos();
        JOptionPane.showMessageDialog(null, tblInformeAlquiler.getRowCount());
        for (int i = 0; i < tblInformeAlquiler.getRowCount(); i++) {

            Object[] informeAlquiler = obtenerObjetoTablaInformeAlquiler(i);
//            System.out.println(informeAlquiler);
            EscribirArchivoPlano.escribirInformeAlquiler(informeAlquiler);
        }

    }


    private void txtBuscarMatriculaRecepcionVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarMatriculaRecepcionVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarMatriculaRecepcionVehiculoActionPerformed

    private void chbCojineriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbCojineriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbCojineriaActionPerformed

    private void mnuRecepcionVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRecepcionVehiculoActionPerformed
        ocultarJiframes();
        jpRecepcionVehiculo.setVisible(false);
        jifRecepcionVehiculo.setVisible(true);


    }//GEN-LAST:event_mnuRecepcionVehiculoActionPerformed

    private void mnuReporteVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteVehiculosActionPerformed

        iniciarTablas();
        ocultarJiframes();

        jifInformeAlquiler.setVisible(true);

    }//GEN-LAST:event_mnuReporteVehiculosActionPerformed

    private void btnBuscarMatriculaRecepcionVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMatriculaRecepcionVehiculoActionPerformed
//        int numeroFilasTablaInformeAlquiler = 
        for (int j = 0; j < tblInformeAlquiler.getRowCount(); j++) {
            if (txtBuscarMatriculaRecepcionVehiculo.getText().equalsIgnoreCase(modeloTblInformeAlquiler.getValueAt(j, 2).toString())) {
                jpRecepcionVehiculo.setVisible(true);
//                txtValorPagar.setVisible(false);
                txtpRecepcionVehiculo.setText("Vehiculo tipo " + modeloTblInformeAlquiler.getValueAt(j, 1)
                        + " de placas " + modeloTblInformeAlquiler.getValueAt(j, 2));
//                modeloTblInformeAlquiler.removeRow(j);
                //Pregunte por el valor de kilometros con los que recibe el vehiculo
                txtKmRecpcion.setText(JOptionPane.showInputDialog(null, "Ingrese "
                        + "el numero de kilometros con los que recibe el vehiculo"));

                if (validarCampoKmRecepcion()) {
//Si el vehiculo del informe de alquiler registrado es de tipo ----camioneta carro o moto
                    switch ("" + modeloTblInformeAlquiler.getValueAt(j, 1)) {

                        case "Camioneta":
//Comparo la matricula del vehiculo de listados alquilados  con la tabla de camionetas
                            for (int x = 0; x < tblListadosCamionetas.getRowCount(); x++) {
                                if (modeloTblCamionetas.getValueAt(x, 2).equals(modeloTblInformeAlquiler.getValueAt(j, 2))) {
                                    //Si encuentro coincidencia instancio el nuevo vehiculo para abstraer el objeto vehiculo
                                    //************************************ Instancia de Vehiculo***********************************              
                                    AbstractVehiculo vehiculo = new Camioneta(new TipoVehiculo("Camioneta", (byte) 1),
                                            (short) modeloTblCamionetas.getValueAt(x, 1),
                                            modeloTblCamionetas.getValueAt(x, 2).toString(),
                                            (int) modeloTblCamionetas.getValueAt(x, 3),
                                            (boolean) modeloTblCamionetas.getValueAt(x, 4),
                                            (double) modeloTblCamionetas.getValueAt(x, 5));

                                    //**********************************Intancia de Usuario********************************
                                    Usuario usuario = usuarioAutenticado;

                                    //*************************Km recorridos por el vehiculo neesarios para calcular el costo
                                    int kmRecorridos = Integer.parseInt(txtKmRecpcion.getText()) - Integer.parseInt(""
                                            + modeloTblCamionetas.getValueAt(x, 3));
                                    
                                    modeloTblCamionetas.setValueAt(true, x, 4);
                                    modeloTblCamionetas.setValueAt(txtKmRecpcion.getText(), x, 3);
                                    escribirArchivoPlanoTablasVehiculos();
                                    
                                    
                                   double costoAlquiler = alquilaVehiculo.alquilarVehiculo(vehiculo, usuario, kmRecorridos);
                                    

                                     txtValorPagar.setText(""+costoAlquiler);

                                    break;
                                }
                            }

                            break;

                        case "Carro":

                            break;

                        case "Moto":

                            break;

                    }
                }

//                        modeloTblCamionetas.setValueAt(txtKmRecpcion.getText(), j, NORMAL);
            }
        }

    }//GEN-LAST:event_btnBuscarMatriculaRecepcionVehiculoActionPerformed

//    private void calcularValorPagar(double costoAlquiler) {
//
////        txtValorPagar.setText(""+vehiculo.calcularAlquiler(kmRecorridos));
//        System.out.println(vehiculo.calcularAlquiler(kmRecorridos));
//    }


    private void btnCalcularValorPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularValorPagarActionPerformed
        txtValorPagar.setVisible(true);

    }//GEN-LAST:event_btnCalcularValorPagarActionPerformed

    public AbstractVehiculo devolverVehiculoAlquilado(int numeroFila) {

        if (modeloAlquilerVehiculo.getValueAt(numeroFila, 0).toString().compareToIgnoreCase("Camioneta") == 0) {

            AbstractVehiculo camioneta = new Camioneta(new TipoVehiculo("Camioneta", (byte) 1),
                    (short) modeloAlquilerVehiculo.getValueAt(numeroFila, 1),
                    modeloAlquilerVehiculo.getValueAt(numeroFila, 2).toString(),
                    (int) modeloAlquilerVehiculo.getValueAt(numeroFila, 3),
                    (boolean) modeloAlquilerVehiculo.getValueAt(numeroFila, 4),
                    (double) modeloAlquilerVehiculo.getValueAt(numeroFila, 5));
            return camioneta;

        } else if (modeloAlquilerVehiculo.getValueAt(numeroFila, 0).toString().compareToIgnoreCase("Carro") == 0) {

            AbstractVehiculo carro = new Carro(new TipoVehiculo("Carro", (byte) 2),
                    (boolean) modeloAlquilerVehiculo.getValueAt(numeroFila, 1),
                    modeloAlquilerVehiculo.getValueAt(numeroFila, 2).toString(),
                    (int) modeloAlquilerVehiculo.getValueAt(numeroFila, 3),
                    (boolean) modeloAlquilerVehiculo.getValueAt(numeroFila, 4),
                    (double) modeloAlquilerVehiculo.getValueAt(numeroFila, 5));

            return carro;

        } else if (modeloAlquilerVehiculo.getValueAt(numeroFila, 0).toString().compareToIgnoreCase("Moto") == 0) {

            AbstractVehiculo moto = new Moto(new TipoVehiculo("Moto", (byte) 3),
                    (boolean) modeloAlquilerVehiculo.getValueAt(numeroFila, 1),
                    modeloAlquilerVehiculo.getValueAt(numeroFila, 2).toString(),
                    (int) modeloAlquilerVehiculo.getValueAt(numeroFila, 3),
                    (boolean) modeloAlquilerVehiculo.getValueAt(numeroFila, 4),
                    (double) modeloAlquilerVehiculo.getValueAt(numeroFila, 5));

            return moto;
        }
        return null;
    }

    public Camioneta obtenerObjetoTablaCamionetas(int numeroFila) {
        Object[] fila = new Object[6];
        for (int i = 0; i < 6; i++) {//              
            fila[i] = tblListadosCamionetas.getValueAt(numeroFila, i);
        }
        Camioneta camioneta = new Camioneta((new TipoVehiculo("Camioneta", (byte) 1)),
                Short.parseShort("" + fila[1]), "" + fila[2], Integer.parseInt("" + fila[3]),
                Boolean.parseBoolean("" + fila[4]),
                Double.parseDouble("" + fila[5]));
        return camioneta;
    }

    private Carro obtenerObjetoTablaCarro(int numeroFila) {
        Object[] fila = new Object[6];
        for (int i = 0; i < 6; i++) {//              
            fila[i] = tblListadoCarros.getValueAt(numeroFila, i);
        }
        Carro carro = new Carro((new TipoVehiculo("Carro", (byte) 2)),
                Boolean.parseBoolean("" + fila[1]), "" + fila[2], Integer.parseInt("" + fila[3]),
                Boolean.parseBoolean("" + fila[4]),
                Double.parseDouble("" + fila[5]));
        return carro;
    }

    private Moto obtenerObjetoTablaMoto(int numeroFila) {
        Object[] fila = new Object[6];
        for (int i = 0; i < 6; i++) {//              
            fila[i] = tblListadoMotos.getValueAt(numeroFila, i);
        }
        Moto moto = new Moto((new TipoVehiculo("Moto", (byte) 2)),
                Boolean.parseBoolean("" + fila[1]), "" + fila[2], Integer.parseInt("" + fila[3]),
                Boolean.parseBoolean("" + fila[4]),
                Double.parseDouble("" + fila[5]));
        return moto;
    }

    private Object[] obtenerObjetoTablaInformeAlquiler(int numeroFila) {
        Object[] fila = new Object[6];
        for (int i = 0; i < 6; i++) {//              
            fila[i] = tblInformeAlquiler.getValueAt(numeroFila, i);
        }
        Object[] informeAlquiler = {fila[0], fila[1], fila[2], fila[3], fila[4], fila[5]};
        return informeAlquiler;
    }

//Validar si hay una camioneta con la misma placa en la lista
    private boolean validarCamioneta(Camioneta camioneta) {
        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {
            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);
            if (camioneta.getMatricula().compareTo(camionetaTabla.getMatricula()) == 0) {
                try {
                    llamarExcepcionMatriculasIguales(1);
                    return true;
                } catch (VehiculosException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 0);
                }
            }
        }
        return false;
    }

    private boolean validarCarro(Carro carro) {
        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {
            Carro carroTabla = obtenerObjetoTablaCarro(i);
            if (carro.getMatricula().compareTo(carroTabla.getMatricula()) == 0) {
                try {
                    llamarExcepcionMatriculasIguales(2);
                } catch (VehiculosException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 0);
                }
                return true;
            }
        }
        return false;
    }

    private boolean validarMoto(Moto moto) {
        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {
            Moto motoTabla = obtenerObjetoTablaMoto(i);
            if (moto.getMatricula().compareTo(motoTabla.getMatricula()) == 0) {
                try {
                    llamarExcepcionMatriculasIguales(3);
                    return true;
                } catch (VehiculosException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 0);
                }
            }
        }
        return false;
    }

    private void llamarExcepcionMatriculasIguales(int x) throws VehiculosException {

        if (x == 1) {
            throw new VehiculosException("La matricula de la camioneta  se encuentra registrada");
        } else if (x == 2) {
            throw new VehiculosException("La matricula del Carro  se encuentra registrada");
        } else if (x == 3) {
            throw new VehiculosException("La matricula de la moto se encuentra registrada");
        }
    }

    private boolean buscarCamioneta(Camioneta camioneta) {
        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {
            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);
            if (camioneta.getMatricula().compareTo(camionetaTabla.getMatricula()) == 0) {
                tblListadosCamionetas.changeSelection(i, 2, false, false);
                JOptionPane.showMessageDialog(this, "Vehiculo encontrado", "Resultado", 2);
                if (true) {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    private boolean buscarCarro(Carro carro) {
        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {
            Carro carroTabla = obtenerObjetoTablaCarro(i);
            if (carro.getMatricula().compareTo(carroTabla.getMatricula()) == 0) {
                tblListadoCarros.changeSelection(i, 2, false, false);
                JOptionPane.showMessageDialog(this, "Vehiculo encontrado", "Resultado", 2);
                if (true) {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    private boolean buscarMoto(Moto moto) {
        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {
            Moto motoTabla = obtenerObjetoTablaMoto(i);
            if (moto.getMatricula().compareTo(motoTabla.getMatricula()) == 0) {
                tblListadoMotos.changeSelection(i, 2, false, false);
                JOptionPane.showMessageDialog(this, "Vehiculo encontrado", "Resultado", 2);
                if (true) {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    private void iniciarMenus(boolean estado) {

        tblListadosCamionetas.setEnabled(estado);
        tblListadoCarros.setEnabled(estado);
        tblListadoMotos.setEnabled(estado);
        mnuAlquilarVehiculos.setVisible(estado);
        mnuCargarVehiculos.setVisible(estado);
        mnuConfiguracionUsuario.setVisible(estado);
        mnuConfiguracionVehiculos.setVisible(estado);
        mnuEditarVehiculos.setVisible(estado);
        mnuRecepcionVehiculo.setVisible(estado);
        mnuReporteVehiculos.setVisible(estado);
        mnuVehiculosDisponilbes.setVisible(estado);

    }

    private void gestionPermisosMnu() {

        switch (usuarioAutenticado.getTipoUsuario().getCodigo()) {
            //Administrador ---> Habilita el menu
            case 1:
                iniciarMenus(true);
                jpConfiguracionVehiculo.show();
                break;
            case 2:
                iniciarMenus(false);//Uduario general
                mnuVehiculosDisponilbes.setVisible(true);
                jpConfiguracionVehiculo.hide();

                break;
            case 3:
                iniciarMenus(true);

                mnuReporteVehiculos.setVisible(false);
                jpConfiguracionVehiculo.hide();
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MdiVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntConfirmarAlquiler;
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnAgregarVehiculo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarMatriculaRecepcionVehiculo;
    private javax.swing.JButton btnCalcularValorPagar;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnEliminarVehiculo;
    private javax.swing.JButton btnGuardarConfiguracionVehiculo;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JCheckBox chbAntena;
    private javax.swing.JCheckBox chbBotiquin;
    private javax.swing.JCheckBox chbCarroceria;
    private javax.swing.JCheckBox chbCasco;
    private javax.swing.JCheckBox chbCojineria;
    private javax.swing.JCheckBox chbDisponibilidad;
    private javax.swing.JCheckBox chbExtras;
    private javax.swing.JCheckBox chbKitCarreteras;
    private javax.swing.JCheckBox chbLuces;
    private javax.swing.JCheckBox chbRadio;
    private javax.swing.JCheckBox chbTapetes;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> jcbTipoVehiculo;
    private com.toedter.calendar.JDateChooser jdFechaFinal;
    private com.toedter.calendar.JDateChooser jdFechaInicial;
    private javax.swing.JInternalFrame jifAlquilarVehiculo;
    private javax.swing.JInternalFrame jifInformeAlquiler;
    private javax.swing.JInternalFrame jifListadoVehiculos;
    private javax.swing.JInternalFrame jifLogin;
    private javax.swing.JInternalFrame jifRecepcionVehiculo;
    private javax.swing.JInternalFrame jifRegistrarUsuario;
    private javax.swing.JPanel jpConfiguracionVehiculo;
    private javax.swing.JPanel jpRecepcionVehiculo;
    private javax.swing.JPanel jpRecepcionVehiculoCamioneta;
    private javax.swing.JSpinner jspCapacidadVehiculo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuAlquilarVehiculos;
    private javax.swing.JMenuItem mnuCargarVehiculos;
    private javax.swing.JMenuItem mnuCerrarSesion;
    private javax.swing.JMenuItem mnuConfiguracionUsuario;
    private javax.swing.JMenu mnuConfiguracionVehiculos;
    private javax.swing.JMenuItem mnuEditarVehiculos;
    private javax.swing.JMenu mnuPrincipal;
    private javax.swing.JMenuItem mnuRecepcionVehiculo;
    private javax.swing.JMenuItem mnuReporteVehiculos;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuVehiculosDisponilbes;
    private javax.swing.JTable tblAlquilarVehiculo;
    private javax.swing.JTable tblInformeAlquiler;
    private javax.swing.JTable tblListadoCarros;
    private javax.swing.JTable tblListadoMotos;
    private javax.swing.JTable tblListadosCamionetas;
    private javax.swing.JTextField txtBuscarMatriculaRecepcionVehiculo;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtKmRecpcion;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRegistarPassword;
    private javax.swing.JTextField txtRegistrarApellido;
    private javax.swing.JTextField txtRegistrarCedula;
    private javax.swing.JTextField txtRegistrarCorreo;
    private javax.swing.JTextField txtRegistrarNombre;
    private javax.swing.JTextField txtValorAlquiler;
    private javax.swing.JTextField txtValorPagar;
    private javax.swing.JTextPane txtpRecepcionVehiculo;
    // End of variables declaration//GEN-END:variables

}

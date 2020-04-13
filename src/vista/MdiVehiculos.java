package vista;

import Excepciones.UsuarioException;
import Excepciones.VehiculosException;
import controlador.*;
import java.awt.Color;
import java.beans.PropertyVetoException;
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

    private GestionUsuario gestionUsuario;
    private Usuario usuarioAutenticado;
    private GestionVehiculo gestionVehiculo;
    private AbstractVehiculo camioneta;

    public MdiVehiculos() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jifLogin.setTitle("Login");
        jifLogin.setVisible(true);

        jLabel1.setText("User*");

        jLabel2.setText("Password*");

        btnIngresar.setText("Sing in");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnRegistrarse.setText("Sign Up");

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
                .addContainerGap(35, Short.MAX_VALUE))
        );

        desktopPane.add(jifLogin);
        jifLogin.setBounds(50, 30, 700, 370);

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
                .addContainerGap(35, Short.MAX_VALUE))
        );

        desktopPane.add(jifListadoVehiculos);
        jifListadoVehiculos.setBounds(640, 0, 1078, 577);
        try {
            jifListadoVehiculos.setMaximum(true);
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
        mnuPrincipal.add(mnuAlquilarVehiculos);

        mnuRecepcionVehiculo.setText("Recepcion de Vehiculo");
        mnuPrincipal.add(mnuRecepcionVehiculo);

        mnuReporteVehiculos.setText("Reporte de Vehiculos");
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

        gestionUsuario = new GestionUsuario(); //Instancio el control que permite crear la lista llenar usuarios y cargar

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
        mnuPrincipal.setEnabled(false);
        txtLogin.setText("");
        txtPassword.setText("");
        usuarioAutenticado = null;
        iniciarMenus(false);
        jifLogin.show();
        jifListadoVehiculos.hide();
        jpConfiguracionVehiculo.hide();

    }//GEN-LAST:event_mnuCerrarSesionActionPerformed

    private void pintarLstCamionetas() {

        DefaultTableModel modelo = (DefaultTableModel) tblListadosCamionetas.getModel();
        modelo.getDataVector().removeAllElements();
        for (Camioneta camioneta : gestionVehiculo.getLstCamionetas()) {

            modelo.addRow(camioneta.obtenerArregloObjeto());

        }
        tblListadosCamionetas.setModel(modelo);
    }

    private void pintarLstCarros() {

        DefaultTableModel modelo = (DefaultTableModel) tblListadoCarros.getModel();
        modelo.getDataVector().removeAllElements();
        for (Carro carro : gestionVehiculo.getLstCarros()) {

            modelo.addRow(carro.obtenerArregloObjeto());

        }
        tblListadoCarros.setModel(modelo);
    }

    private void pintarLstMotos() {

        DefaultTableModel modelo = (DefaultTableModel) tblListadoMotos.getModel();
        modelo.getDataVector().removeAllElements();
        for (Moto moto : gestionVehiculo.getLstMotos()) {

            modelo.addRow(moto.obtenerArregloObjeto());

        }
        tblListadoMotos.setModel(modelo);
    }


    private void mnuVehiculosDisponilbesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVehiculosDisponilbesActionPerformed

        gestionVehiculo.llenarVehiculos();

        pintarLstCarros();
        pintarLstCamionetas();
        pintarLstMotos();
        jifListadoVehiculos.show();
        verificarCamionetasInactivos();
        verificarCarrosInactivos();
        verificarMotosInactivos();

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
                        DefaultTableModel modelo = (DefaultTableModel) tblListadosCamionetas.getModel();
                        modelo.addRow(camioneta.obtenerArregloObjeto());
                    }
//-------------------------------Validacion de carro---------------------
                } else if (itemCarro.compareToIgnoreCase("carro") == 0) {

                    Carro carro = new Carro((new TipoVehiculo("Carro", (byte) 2)), chbExtras.isSelected(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!validarCarro(carro)) {
                        //Convierto el objeto camion en un arreglo de tipo object a traves del metodo y adiciono este arreglo a la tabla
                        DefaultTableModel modelo = (DefaultTableModel) tblListadoCarros.getModel();
                        modelo.addRow(carro.obtenerArregloObjeto());
                    }
                } //-------------------------------------validacion tipo moto
                else if (itemMoto.compareToIgnoreCase("moto") == 0) {

                    Moto moto = new Moto((new TipoVehiculo("Moto", (byte) 3)), chbCasco.isSelected(),
                            txtMatricula.getText(), Integer.parseInt(txtKm.getText()), chbDisponibilidad.isSelected(),
                            Double.parseDouble(txtValorAlquiler.getText()));
                    if (!validarMoto(moto)) {
                        //Convierto el objeto camion en un arreglo de tipo object a traves del metodo y adiciono este arreglo a la tabla
                        DefaultTableModel modelo = (DefaultTableModel) tblListadoMotos.getModel();
                        modelo.addRow(moto.obtenerArregloObjeto());
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
            DefaultTableModel modelo = (DefaultTableModel) tblListadosCamionetas.getModel();
            modelo.removeRow(tblListadosCamionetas.getSelectedRow());
        } else if (tblListadoCarros.getSelectedRow() != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tblListadoCarros.getModel();
            modelo.removeRow(tblListadoCarros.getSelectedRow());
        } else if (tblListadoMotos.getSelectedRow() != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tblListadoMotos.getModel();
            modelo.removeRow(tblListadoMotos.getSelectedRow());
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

                                DefaultTableModel modelo = (DefaultTableModel) tblListadosCamionetas.getModel();
                                modelo.removeRow(i);
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

                                DefaultTableModel modelo = (DefaultTableModel) tblListadoCarros.getModel();
                                modelo.removeRow(i);
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

                                DefaultTableModel modelo = (DefaultTableModel) tblListadoMotos.getModel();
                                modelo.removeRow(i);
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

        EscribirArchivoPlano.borrarArchivo();

        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {

            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);

            EscribirArchivoPlano.escribir(camionetaTabla);
        }

        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {

            Carro carroTabla = obtenerObjetoTablaCarro(i);

            EscribirArchivoPlano.escribirCarro(carroTabla);
        }

        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {

            Moto motoTabla = obtenerObjetoTablaMoto(i);

            EscribirArchivoPlano.escribirMoto(motoTabla);
        }
        JOptionPane.showMessageDialog(null, "Se han guardado los cambios con exito");
        limpiarCamposConfiguracion();
    }//GEN-LAST:event_btnGuardarConfiguracionVehiculoActionPerformed

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
        DefaultTableModel modelo = (DefaultTableModel) tblListadosCamionetas.getModel();
        for (int i = 0; i < tblListadosCamionetas.getRowCount(); i++) {
            Camioneta camionetaTabla = obtenerObjetoTablaCamionetas(i);
            if (!gestionVehiculo.validarMatricula(camionetaTabla.getMatricula())) {
                modelo.setValueAt(false, i, 6);
            } else {
                modelo.setValueAt(true, i, 6);
            }
        }
    }

    private void verificarCarrosInactivos() {
        DefaultTableModel modelo1 = (DefaultTableModel) tblListadoCarros.getModel();
        for (int i = 0; i < tblListadoCarros.getRowCount(); i++) {
            Carro carroTabla = obtenerObjetoTablaCarro(i);
            if (!gestionVehiculo.validarMatricula(carroTabla.getMatricula())) {
                modelo1.setValueAt(false, i, 6);
            } else {
                modelo1.setValueAt(true, i, 6);
            }
        }
    }

    private void verificarMotosInactivos() {
        DefaultTableModel modelo2 = (DefaultTableModel) tblListadoMotos.getModel();
        for (int i = 0; i < tblListadoMotos.getRowCount(); i++) {
            Moto motoTabla = obtenerObjetoTablaMoto(i);
            if (!gestionVehiculo.validarMatricula(motoTabla.getMatricula())) {
                modelo2.setValueAt(false, i, 6);
            } else {
                modelo2.setValueAt(true, i, 6);
            }
        }
    }

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed

        String itemCamioneta = "" + jcbTipoVehiculo.getSelectedItem();
        String itemCarro = "" + jcbTipoVehiculo.getSelectedItem();
        String itemMoto = "" + jcbTipoVehiculo.getSelectedItem();

        if (tblListadosCamionetas.getSelectedRow() != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tblListadosCamionetas.getModel();
            modelo.setValueAt("Inhabilitado " + modelo.getValueAt(tblListadosCamionetas.getSelectedRow(), 2), tblListadosCamionetas.getSelectedRow(), 2);
            modelo.setValueAt(false, tblListadosCamionetas.getSelectedRow(), 4);
            modelo.setValueAt(false, tblListadosCamionetas.getSelectedRow(), 6);
            tblListadosCamionetas.setSelectionForeground(Color.RED);

        } else if (tblListadoCarros.getSelectedRow() != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tblListadoCarros.getModel();
            modelo.setValueAt("Inhabilitado " + modelo.getValueAt(tblListadoCarros.getSelectedRow(), 2), tblListadoCarros.getSelectedRow(), 2);
            modelo.setValueAt(false, tblListadoCarros.getSelectedRow(), 4);
            modelo.setValueAt(false, tblListadoCarros.getSelectedRow(), 6);
            tblListadoCarros.setSelectionForeground(Color.RED);

        } else if (tblListadoMotos.getSelectedRow() != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tblListadoMotos.getModel();
            modelo.setValueAt("Inhabilitado " + modelo.getValueAt(tblListadoMotos.getSelectedRow(), 2), tblListadoMotos.getSelectedRow(), 2);
            modelo.setValueAt(false, tblListadoMotos.getSelectedRow(), 4);
            modelo.setValueAt(false, tblListadoMotos.getSelectedRow(), 6);
            tblListadoMotos.setSelectionForeground(Color.RED);
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

                                DefaultTableModel modelo = (DefaultTableModel) tblListadosCamionetas.getModel();
                                modelo.setValueAt("Inhabilitado " + modelo.getValueAt(i, 2), i, 2);
                                modelo.setValueAt(false, i, 4);
                                modelo.setValueAt(false, i, 6);
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

                                DefaultTableModel modelo = (DefaultTableModel) tblListadoCarros.getModel();
                                modelo.setValueAt("Inhabilitado " + modelo.getValueAt(i, 2), i, 2);
                                modelo.setValueAt(false, i, 4);
                                modelo.setValueAt(false, i, 6);
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

                                DefaultTableModel modelo = (DefaultTableModel) tblListadoMotos.getModel();
                                modelo.setValueAt("Inhabilitado " + modelo.getValueAt(i, 2), i, 2);
                                modelo.setValueAt(false, i, 4);
                                modelo.setValueAt(false, i, 6);
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
            DefaultTableModel modelo = (DefaultTableModel) tblListadosCamionetas.getModel();
            //Divido la cadena de inhabilitado+placa en dos partes para extraer solo la placa
            try {
                String[] datos = modelo.getValueAt(tblListadosCamionetas.getSelectedRow(), 2).toString().split(" ");
                modelo.setValueAt(datos[1], tblListadosCamionetas.getSelectedRow(), 2);
                modelo.setValueAt(true, tblListadosCamionetas.getSelectedRow(), 6);
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "El vehiculo seleccionado no esta desactivado");
            }

        } else if (tblListadoCarros.getSelectedRow() != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tblListadoCarros.getModel();
            //Divido la cadena de inhabilitado+placa en dos partes para extraer solo la placa
            try {
                String[] datos = modelo.getValueAt(tblListadoCarros.getSelectedRow(), 2).toString().split(" ");
                modelo.setValueAt(datos[1], tblListadoCarros.getSelectedRow(), 2);
                modelo.setValueAt(true, tblListadoCarros.getSelectedRow(), 6);
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "El vehiculo seleccionado no esta desactivado");
            }

        } else if (tblListadoMotos.getSelectedRow() != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tblListadoMotos.getModel();
            //Divido la cadena de inhabilitado+placa en dos partes para extraer solo la placa
            try {
                String[] datos = modelo.getValueAt(tblListadoMotos.getSelectedRow(), 2).toString().split(" ");
                modelo.setValueAt(datos[1], tblListadoMotos.getSelectedRow(), 2);
                modelo.setValueAt(true, tblListadoMotos.getSelectedRow(), 6);
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

                                    DefaultTableModel modelo = (DefaultTableModel) tblListadosCamionetas.getModel();
                                    String[] datos = modelo.getValueAt(i, 2).toString().split(" ");
                                    modelo.setValueAt(datos[1], i, 2);
                                    modelo.setValueAt(true, i, 6);
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

                                DefaultTableModel modelo = (DefaultTableModel) tblListadoCarros.getModel();
                                String[] datos = modelo.getValueAt(i, 2).toString().split(" ");
                                modelo.setValueAt(datos[1], i, 2);
                                modelo.setValueAt(true, i, 6);
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

                                DefaultTableModel modelo = (DefaultTableModel) tblListadoMotos.getModel();
                                String[] datos = modelo.getValueAt(i, 2).toString().split(" ");
                                modelo.setValueAt(datos[1], i, 2);
                                modelo.setValueAt(true, i, 6);
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
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnAgregarVehiculo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnEliminarVehiculo;
    private javax.swing.JButton btnGuardarConfiguracionVehiculo;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JCheckBox chbCasco;
    private javax.swing.JCheckBox chbDisponibilidad;
    private javax.swing.JCheckBox chbExtras;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcbTipoVehiculo;
    private javax.swing.JInternalFrame jifListadoVehiculos;
    private javax.swing.JInternalFrame jifLogin;
    private javax.swing.JPanel jpConfiguracionVehiculo;
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
    private javax.swing.JTable tblListadoCarros;
    private javax.swing.JTable tblListadoMotos;
    private javax.swing.JTable tblListadosCamionetas;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtValorAlquiler;
    // End of variables declaration//GEN-END:variables

}

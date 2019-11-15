package controlcaadi;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JPasswordField;

/**
 *
 * @author César Arturo Rea Reyes
 *
 */
public class Contenedor extends JFrame {

    private String url = "jdbc:mysql://localhost:3306/caadi?zerouseJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user = "root";
    private String pass = "1123581321";
    private Executor executor = Executors.newSingleThreadExecutor();
    private AtomicBoolean initialized = new AtomicBoolean(false);
    private Webcam webcam = Webcam.getDefault();
    private WebcamPanel panel = null;

    public Contenedor() {
        initComponents();
        setTitle("CAADI");
        setLocationRelativeTo(null);
        ErrorID.setVisible(false);
        ErrorTelefono.setVisible(false);
        ErrorNombre.setVisible(false);
        ErrorCarrera.setVisible(false);
        ErrorCarreraOP.setVisible(false);
        labelOP.setVisible(false);
        FieldOP.setVisible(false);
        ErrorTipo.setVisible(false);
        ErrorEntrada.setVisible(false);
        ErrorSalida.setVisible(false);
        ErrorConsulta.setVisible(false);
        ErrorBaja.setVisible(false);
        ErrorIDEX.setVisible(false);
        Error_Entrada.setVisible(false);
        Error_Salida.setVisible(false);
        webcam.setViewSize(WebcamResolution.VGA.getSize());
        panel = new WebcamPanel(webcam, false);
        panel.setPreferredSize(webcam.getViewSize());
        panel.setOpaque(true);
        panel.setBackground(Color.BLACK);
        panel.setBounds(0, 0, 400, 300);
        Camara.add(panel);
        Date_EX.getEditor().setEditable(false);
        Fecha_Inicial.getEditor().setEditable(false);
        Fecha_Final.getEditor().setEditable(false);
        if (initialized.compareAndSet(false, true)) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    panel.start();
                }
            });
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tab1 = new javax.swing.JTabbedPane();
        TabAlta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ID_Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nombre_Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Telefono_Usuario = new javax.swing.JTextField();
        Alta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Correo_Usuario = new javax.swing.JTextField();
        ErrorID = new javax.swing.JLabel();
        ErrorNombre = new javax.swing.JLabel();
        ErrorTelefono = new javax.swing.JLabel();
        ErrorCarrera = new javax.swing.JLabel();
        Test = new javax.swing.JLabel();
        Carrera_Usuario = new javax.swing.JComboBox<>();
        FieldOP = new javax.swing.JTextField();
        labelOP = new javax.swing.JLabel();
        ErrorCarreraOP = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Usuario_Tipo = new javax.swing.JComboBox<>();
        ErrorTipo = new javax.swing.JLabel();
        Camara = new javax.swing.JLayeredPane();
        TomarFoto = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        TabBaja = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ID_Baja = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Nombre_Baja = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Carrera_Baja = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Telefono_Baja = new javax.swing.JTextField();
        Baja = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Correo_Baja = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        Tipo_Baja = new javax.swing.JTextField();
        ErrorBaja = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        TabHoras = new javax.swing.JPanel();
        Tab2 = new javax.swing.JTabbedPane();
        PanelEntrada = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ID_Entrada = new javax.swing.JTextField();
        Entrada = new javax.swing.JButton();
        ErrorEntrada = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Nombre_Entrada = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Tipo_Entrada = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Carrera_Entrada = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        Hora_Entrada = new javax.swing.JTextField();
        ImagenEntrada = new javax.swing.JLabel();
        PanelSalida = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        ID_Salida = new javax.swing.JTextField();
        Salida = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        Nombre_Salida = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Tipo_Salida = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Carrera_Salida = new javax.swing.JTextField();
        ErrorSalida = new javax.swing.JLabel();
        JLabel25 = new javax.swing.JLabel();
        Hora_Salida = new javax.swing.JTextField();
        ImagenSalida = new javax.swing.JLabel();
        PanelExtemporaneo = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        ID_EX = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        RegistrarEX = new javax.swing.JButton();
        HorasEXE = new javax.swing.JTextField();
        MinutosEXE = new javax.swing.JTextField();
        HorasE = new javax.swing.JLabel();
        MinutosE = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        HorasS = new javax.swing.JLabel();
        MinutosS = new javax.swing.JLabel();
        HorasEXS = new javax.swing.JTextField();
        MinutosEXS = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        ImagenEX = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        ErrorIDEX = new javax.swing.JLabel();
        Date_EX = new org.jdesktop.swingx.JXDatePicker();
        Error_Entrada = new javax.swing.JLabel();
        Error_Salida = new javax.swing.JLabel();
        TabConsulta = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        ID_Consulta = new javax.swing.JTextField();
        Consultar = new javax.swing.JButton();
        ErrorConsulta = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Horas_Totales = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        Nombre_Consulta = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        ConsultarFecha = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Horas_Fecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Historial = new javax.swing.JTextArea();
        Fecha_Inicial = new org.jdesktop.swingx.JXDatePicker();
        Fecha_Final = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);

        Tab1.setFocusCycleRoot(true);
        Tab1.setFocusTraversalPolicyProvider(true);
        Tab1.setFocusable(false);

        TabAlta.setFocusCycleRoot(true);
        TabAlta.setFocusTraversalPolicyProvider(true);

        jLabel1.setText("ID Usuario");

        ID_Usuario.setFocusCycleRoot(true);
        ID_Usuario.setFocusTraversalPolicyProvider(true);

        jLabel2.setText("Nombre Completo");

        Nombre_Usuario.setFocusCycleRoot(true);
        Nombre_Usuario.setFocusTraversalPolicyProvider(true);

        jLabel3.setText("Carrera");

        jLabel4.setText("Telefono");

        Telefono_Usuario.setFocusCycleRoot(true);
        Telefono_Usuario.setFocusTraversalPolicyProvider(true);

        Alta.setText("Dar de alta");
        Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaActionPerformed(evt);
            }
        });

        jLabel8.setText("Correo (No obligatorio)");

        Correo_Usuario.setFocusCycleRoot(true);
        Correo_Usuario.setFocusTraversalPolicyProvider(true);

        ErrorID.setForeground(new java.awt.Color(255, 51, 51));
        ErrorID.setText("Verifica esta informacion");

        ErrorNombre.setForeground(new java.awt.Color(255, 51, 51));
        ErrorNombre.setText("Verifica esta informacion");

        ErrorTelefono.setForeground(new java.awt.Color(255, 51, 51));
        ErrorTelefono.setText("Verifica esta informacion");

        ErrorCarrera.setForeground(new java.awt.Color(255, 51, 51));
        ErrorCarrera.setText("Selecciona una opcion");

        Carrera_Usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Elige una opcion---", "Sistemas", "LDII", "FLE-ELE", "LRI", "Logistica Empresarial", "Otra" }));
        Carrera_Usuario.setFocusCycleRoot(true);
        Carrera_Usuario.setFocusTraversalPolicyProvider(true);

        FieldOP.setFocusCycleRoot(true);
        FieldOP.setFocusTraversalPolicyProvider(true);

        labelOP.setText("Carrera");

        ErrorCarreraOP.setForeground(java.awt.Color.red);
        ErrorCarreraOP.setText("No debe ir vacio");

        jLabel12.setText("Tipo");

        Usuario_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Elige una opcion---", "Servicio Social", "Tutor Par", "Practicas Profecionales", "Voluntario(a)" }));
        Usuario_Tipo.setFocusCycleRoot(true);
        Usuario_Tipo.setFocusTraversalPolicyProvider(true);

        ErrorTipo.setForeground(java.awt.Color.red);
        ErrorTipo.setText("Selecciona una opcion");

        javax.swing.GroupLayout CamaraLayout = new javax.swing.GroupLayout(Camara);
        Camara.setLayout(CamaraLayout);
        CamaraLayout.setHorizontalGroup(
            CamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        CamaraLayout.setVerticalGroup(
            CamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        TomarFoto.setText("Tomar Foto");
        TomarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomarFotoActionPerformed(evt);
            }
        });

        foto.setPreferredSize(new java.awt.Dimension(410, 350));

        javax.swing.GroupLayout TabAltaLayout = new javax.swing.GroupLayout(TabAlta);
        TabAlta.setLayout(TabAltaLayout);
        TabAltaLayout.setHorizontalGroup(
            TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabAltaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TomarFoto)
                .addGap(190, 190, 190))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabAltaLayout.createSequentialGroup()
                        .addComponent(Usuario_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ErrorTipo))
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addGroup(TabAltaLayout.createSequentialGroup()
                        .addComponent(Nombre_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ErrorNombre))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(TabAltaLayout.createSequentialGroup()
                        .addComponent(ID_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ErrorID, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabAltaLayout.createSequentialGroup()
                        .addGroup(TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(TabAltaLayout.createSequentialGroup()
                                .addComponent(Carrera_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ErrorCarrera))))
                        .addGap(18, 18, 18)
                        .addGroup(TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOP)
                            .addGroup(TabAltaLayout.createSequentialGroup()
                                .addComponent(FieldOP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ErrorCarreraOP))))
                    .addGroup(TabAltaLayout.createSequentialGroup()
                        .addComponent(Telefono_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ErrorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Correo_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Camara)
                    .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Test, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TabAltaLayout.setVerticalGroup(
            TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabAltaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorID))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorNombre))
                .addGap(18, 18, 18)
                .addGroup(TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabAltaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Usuario_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorTipo))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Telefono_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorTelefono))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Correo_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(labelOP))
                        .addGap(12, 12, 12)
                        .addGroup(TabAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Carrera_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorCarrera)
                            .addComponent(FieldOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorCarreraOP))
                        .addGap(59, 59, 59)
                        .addComponent(Alta)
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addGroup(TabAltaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Test)))
                .addGap(228, 228, 228))
            .addGroup(TabAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Camara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TomarFoto)
                .addGap(43, 43, 43)
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tab1.addTab("Alta Usuario", TabAlta);

        jLabel5.setText("ID Usuario");

        jLabel6.setText("Nombre");

        Nombre_Baja.setEditable(false);

        jLabel7.setText("Carrera");

        Carrera_Baja.setEditable(false);

        jLabel9.setText("Telefono");

        Telefono_Baja.setEditable(false);

        Baja.setText("Dar de baja");
        Baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaActionPerformed(evt);
            }
        });

        jLabel10.setText("Correo");

        Correo_Baja.setEditable(false);

        jLabel23.setText("Tipo");

        Tipo_Baja.setEditable(false);

        ErrorBaja.setForeground(java.awt.Color.red);
        ErrorBaja.setText("Verifica esta informacion");

        imagen.setText("   ");

        javax.swing.GroupLayout TabBajaLayout = new javax.swing.GroupLayout(TabBaja);
        TabBaja.setLayout(TabBajaLayout);
        TabBajaLayout.setHorizontalGroup(
            TabBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabBajaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(TabBajaLayout.createSequentialGroup()
                        .addGroup(TabBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(TabBajaLayout.createSequentialGroup()
                                .addComponent(ID_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ErrorBaja))
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(Nombre_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefono_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Correo_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TabBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Tipo_Baja, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Carrera_Baja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                        .addGroup(TabBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
        );
        TabBajaLayout.setVerticalGroup(
            TabBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabBajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(TabBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabBajaLayout.createSequentialGroup()
                        .addGroup(TabBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorBaja))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(Tipo_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Carrera_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Telefono_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Correo_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 308, Short.MAX_VALUE))
                    .addGroup(TabBajaLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(41, 41, 41)
                .addComponent(Baja)
                .addGap(50, 50, 50))
        );

        Tab1.addTab("Baja Usuario", TabBaja);

        Tab2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tab2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Tab2FocusGained(evt);
            }
        });

        jLabel11.setText("ID");

        Entrada.setText("Registrar Entrada");
        Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaActionPerformed(evt);
            }
        });

        ErrorEntrada.setForeground(java.awt.Color.red);
        ErrorEntrada.setText("Verifica esta informacion ");

        jLabel17.setText("Nombre");

        Nombre_Entrada.setEditable(false);
        Nombre_Entrada.setFocusable(false);

        jLabel18.setText("Tipo");

        Tipo_Entrada.setEditable(false);
        Tipo_Entrada.setFocusable(false);

        jLabel19.setText("Carrera");

        Carrera_Entrada.setEditable(false);
        Carrera_Entrada.setFocusable(false);

        jLabel24.setText("Hora");

        Hora_Entrada.setEditable(false);
        Hora_Entrada.setFocusable(false);

        ImagenEntrada.setText("   ");

        javax.swing.GroupLayout PanelEntradaLayout = new javax.swing.GroupLayout(PanelEntrada);
        PanelEntrada.setLayout(PanelEntradaLayout);
        PanelEntradaLayout.setHorizontalGroup(
            PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addGroup(PanelEntradaLayout.createSequentialGroup()
                        .addComponent(ID_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ErrorEntrada))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel24)
                    .addGroup(PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Hora_Entrada, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Carrera_Entrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(Tipo_Entrada, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nombre_Entrada, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(ImagenEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        PanelEntradaLayout.setVerticalGroup(
            PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEntradaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorEntrada))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(10, 10, 10)
                        .addComponent(Nombre_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tipo_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Carrera_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hora_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Entrada)
                        .addGap(0, 401, Short.MAX_VALUE))
                    .addComponent(ImagenEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Tab2.addTab("Entrada", PanelEntrada);

        jLabel13.setText("ID");

        Salida.setText("Registrar Salida");
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });

        jLabel20.setText("Nombre");

        Nombre_Salida.setEditable(false);

        jLabel21.setText("Tipo");

        Tipo_Salida.setEditable(false);

        jLabel22.setText("Carrera");

        Carrera_Salida.setEditable(false);

        ErrorSalida.setForeground(java.awt.Color.red);
        ErrorSalida.setText("Verifica esta informacion ");

        JLabel25.setText("Hora");

        Hora_Salida.setEditable(false);

        ImagenSalida.setText("   ");

        javax.swing.GroupLayout PanelSalidaLayout = new javax.swing.GroupLayout(PanelSalida);
        PanelSalida.setLayout(PanelSalidaLayout);
        PanelSalidaLayout.setHorizontalGroup(
            PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSalidaLayout.createSequentialGroup()
                        .addComponent(ID_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ErrorSalida))
                    .addComponent(JLabel25)
                    .addGroup(PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Hora_Salida, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Salida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nombre_Salida, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Tipo_Salida, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Carrera_Salida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(ImagenSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        PanelSalidaLayout.setVerticalGroup(
            PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSalidaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorSalida))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nombre_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tipo_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Carrera_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hora_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Salida)
                        .addGap(0, 399, Short.MAX_VALUE))
                    .addComponent(ImagenSalida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Tab2.addTab("Salida", PanelSalida);

        PanelExtemporaneo.setFocusCycleRoot(true);
        PanelExtemporaneo.setFocusTraversalPolicyProvider(true);

        jLabel31.setText("ID");

        jLabel32.setText("Fecha");

        jLabel34.setText("Hora Entrada (En formato de 24 horas)");

        RegistrarEX.setText("Registrar tiempo");
        RegistrarEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarEXActionPerformed(evt);
            }
        });

        HorasE.setText("Horas");

        MinutosE.setText("Minutos");

        jLabel36.setText(":");

        HorasS.setText("Horas");

        MinutosS.setText("Minutos");

        jLabel35.setText("Hora Salida (En formato de 24 horas)");

        ImagenEX.setText("   ");

        jLabel42.setText(":");

        ErrorIDEX.setForeground(java.awt.Color.red);
        ErrorIDEX.setText("Verifica esta informacion");

        Date_EX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date_EXActionPerformed(evt);
            }
        });

        Error_Entrada.setForeground(java.awt.Color.red);
        Error_Entrada.setText("Verifica esta informacion");

        Error_Salida.setForeground(java.awt.Color.red);
        Error_Salida.setText("Verifica esta informacion");

        javax.swing.GroupLayout PanelExtemporaneoLayout = new javax.swing.GroupLayout(PanelExtemporaneo);
        PanelExtemporaneo.setLayout(PanelExtemporaneoLayout);
        PanelExtemporaneoLayout.setHorizontalGroup(
            PanelExtemporaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExtemporaneoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelExtemporaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Date_EX, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegistrarEX)
                    .addGroup(PanelExtemporaneoLayout.createSequentialGroup()
                        .addGroup(PanelExtemporaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanelExtemporaneoLayout.createSequentialGroup()
                                .addComponent(HorasS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(MinutosS))
                            .addGroup(PanelExtemporaneoLayout.createSequentialGroup()
                                .addComponent(HorasEXS, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(MinutosEXS)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error_Salida))
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addGroup(PanelExtemporaneoLayout.createSequentialGroup()
                        .addComponent(ID_EX, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ErrorIDEX))
                    .addGroup(PanelExtemporaneoLayout.createSequentialGroup()
                        .addGroup(PanelExtemporaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(HorasE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(HorasEXE, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelExtemporaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MinutosE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MinutosEXE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Error_Entrada)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(ImagenEX, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        PanelExtemporaneoLayout.setVerticalGroup(
            PanelExtemporaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExtemporaneoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelExtemporaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelExtemporaneoLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelExtemporaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID_EX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorIDEX))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Date_EX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelExtemporaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HorasE)
                            .addComponent(MinutosE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelExtemporaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HorasEXE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MinutosEXE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Error_Entrada))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelExtemporaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HorasS)
                            .addComponent(MinutosS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelExtemporaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HorasEXS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MinutosEXS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Error_Salida))
                        .addGap(30, 30, 30)
                        .addComponent(RegistrarEX)
                        .addGap(0, 390, Short.MAX_VALUE))
                    .addComponent(ImagenEX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Tab2.addTab("Tiempo Extemporaneo", PanelExtemporaneo);

        javax.swing.GroupLayout TabHorasLayout = new javax.swing.GroupLayout(TabHoras);
        TabHoras.setLayout(TabHorasLayout);
        TabHorasLayout.setHorizontalGroup(
            TabHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab2)
        );
        TabHorasLayout.setVerticalGroup(
            TabHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        Tab1.addTab("Registro Horas", TabHoras);

        TabConsulta.setFocusCycleRoot(true);

        jLabel15.setText("ID Usuario");

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        ErrorConsulta.setForeground(java.awt.Color.red);
        ErrorConsulta.setText("Verifica esta informacion");

        jLabel14.setText("Horas Totales");

        Horas_Totales.setEditable(false);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel16.setText("Nombre");

        Nombre_Consulta.setEditable(false);

        jLabel25.setText("Historico");

        ConsultarFecha.setText("Consultar");
        ConsultarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarFechaActionPerformed(evt);
            }
        });

        jLabel26.setText("Fecha Inicial");

        jLabel27.setText("Fecha Final");

        jLabel28.setText("Horas Realizadas");

        Horas_Fecha.setEditable(false);

        Historial.setColumns(20);
        Historial.setRows(5);
        jScrollPane1.setViewportView(Historial);

        Fecha_Inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha_InicialActionPerformed(evt);
            }
        });

        Fecha_Final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha_FinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TabConsultaLayout = new javax.swing.GroupLayout(TabConsulta);
        TabConsulta.setLayout(TabConsultaLayout);
        TabConsultaLayout.setHorizontalGroup(
            TabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabConsultaLayout.createSequentialGroup()
                        .addGroup(TabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TabConsultaLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18))
                    .addGroup(TabConsultaLayout.createSequentialGroup()
                        .addGroup(TabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(Nombre_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TabConsultaLayout.createSequentialGroup()
                                .addGroup(TabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Horas_Totales, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ID_Consulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ErrorConsulta))
                            .addComponent(Consultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 411, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(TabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabConsultaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26))
                    .addGroup(TabConsultaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel27))
                    .addGroup(TabConsultaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28))
                    .addGroup(TabConsultaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Horas_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(Fecha_Inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fecha_Final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(TabConsultaLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(ConsultarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123))
        );
        TabConsultaLayout.setVerticalGroup(
            TabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorConsulta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nombre_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Horas_Totales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Consultar)
                        .addContainerGap())
                    .addComponent(jSeparator2)
                    .addGroup(TabConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(9, 9, 9)
                        .addComponent(Fecha_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Horas_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(ConsultarFecha)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        Tab1.addTab("Consulta Horas", TabConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Tab1, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarFechaActionPerformed
        String fechaI = getFechaI();
        String fechaF = getFechaF();
        if (fechaI.isEmpty()) {
            JOptionPane.showMessageDialog(new PopUp(), "Error en las fechas", "Estos campos deben de estar llenos", JOptionPane.WARNING_MESSAGE);
        }
        if (fechaF.isEmpty()) {
            JOptionPane.showMessageDialog(new PopUp(), "Error en las fechas", "Estos campos deben de estar llenos", JOptionPane.WARNING_MESSAGE);
        }
        try {
            long ms, tiempoMS = 0;
            ResultSet rs;
            Statement stm;
            Connection conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            rs = stm.executeQuery("select * from horas where fecha>='" + fechaI + "' && fecha<='" + fechaF + "'");
            while (rs.next()) {
                String tiempo = rs.getString(6);
                long horas, minutos, segundos;
                segundos = Long.parseLong(tiempo.substring(6));
                minutos = Long.parseLong(tiempo.substring(3, 5));
                horas = Long.parseLong(tiempo.substring(0, 2));
                ms = (horas * 60 * 60 * 1000) + (minutos * 60 * 1000) + (segundos * 1000);
                tiempoMS += ms;
            }
            String nuevoTiempo = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(tiempoMS),
                    TimeUnit.MILLISECONDS.toMinutes(tiempoMS) % TimeUnit.HOURS.toMinutes(1),
                    TimeUnit.MILLISECONDS.toSeconds(tiempoMS) % TimeUnit.MINUTES.toSeconds(1));
            Horas_Fecha.setText(nuevoTiempo);
        } catch (SQLException e) {
            JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
    }//GEN-LAST:event_ConsultarFechaActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        ID_Consulta.requestFocusInWindow();
        ResultSet rs, rs2;
        Statement stm, stm2;
        try {
            long ms = 0l;
            Connection conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            stm2 = conn.createStatement();
            rs = stm.executeQuery("select * from horas" + " where id='" + getIDConsulta() + "'");
            rs2 = stm2.executeQuery("select nombre from usuario where id='" + getIDConsulta() + "'");
            Historial.setText("Fecha" + "\t" + "Horas realizadas" + "\n");
            if (rs2.next()) {
                Nombre_Consulta.setText(rs2.getString(1));
            }
            long tiempoMS = 0l;
            while (rs.next()) {
                try {
                    String tiempo = rs.getString(6);
                    long horas, minutos, segundos;
                    segundos = Long.parseLong(tiempo.substring(6));
                    minutos = Long.parseLong(tiempo.substring(3, 5));
                    horas = Long.parseLong(tiempo.substring(0, 2));
                    ms = (horas * 60 * 60 * 1000) + (minutos * 60 * 1000) + (segundos * 1000);
                    tiempoMS += ms;
                    Historial.append(rs.getString(5) + "\t" + rs.getString(6) + "\n");
                } catch (NullPointerException e) {
                }
            }
            String nuevoTiempo = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(tiempoMS),
                    TimeUnit.MILLISECONDS.toMinutes(tiempoMS) % TimeUnit.HOURS.toMinutes(1),
                    TimeUnit.MILLISECONDS.toSeconds(tiempoMS) % TimeUnit.MINUTES.toSeconds(1));
            Horas_Totales.setText(nuevoTiempo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new PopUp(), "Kabooooooooom", e.getMessage(), JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ConsultarActionPerformed

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        int S;
        try {
            Long ms = 0l;
            ResultSet rs;
            Statement stm;
            Connection conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            rs = stm.executeQuery("select * from usuario" + " where id='" + getIDSalida() + "'");
            if (rs.next()) {
                Nombre_Salida.setText(rs.getString(2));
                Tipo_Salida.setText(rs.getString(3));
                Carrera_Salida.setText(rs.getString(5));
                java.sql.Blob blob = rs.getBlob(7);
                InputStream in = blob.getBinaryStream();
                try {
                    BufferedImage imag = ImageIO.read(in);
                    Image image = imag;
                    ImageIcon icon = new ImageIcon(image);
                    ImagenSalida.setIcon(icon);
                } catch (IOException ex) {
                    Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
                }
                S = JOptionPane.showConfirmDialog(new PopUp(), "Salida de: " + Nombre_Salida.getText(), "Salida", JOptionPane.YES_OPTION); //Si=0, No=1
                if (S == 0) {
                    java.util.Date fecha = new java.util.Date();
                    java.sql.Timestamp horaSQL = new java.sql.Timestamp(fecha.getTime());
                    SimpleDateFormat horaFormato = new SimpleDateFormat("HH:mm:ss");
                    String horaS = horaFormato.format(horaSQL);
                    Long id_fecha = Long.parseLong(fecha().replace("/", "").concat(Long.toString(getIDSalida())));
                    try {
                        if (!horasE()) {
                            String query = "update horas set salida = ? where id_Fecha='" + id_fecha + "'";
                            PreparedStatement Stmt = conn.prepareStatement(query);
                            Stmt.setString(1, horaS);
                            Hora_Salida.setText(horaS);
                            Stmt.executeUpdate();
                            conn.close();
                            registroHoras();
                            JOptionPane.showMessageDialog(new PopUp(), "Salida marcada con exito", "Salida", JOptionPane.INFORMATION_MESSAGE);
                            ID_Salida.setText("");
                            Nombre_Salida.setText("");
                            Tipo_Salida.setText("");
                            Carrera_Salida.setText("");
                            Hora_Salida.setText("");
                            ImagenSalida.setIcon(null);
                        } else {
                            rs = stm.executeQuery("select salida from horas" + " where id_fecha='" + id_fecha + "'");
                            if (rs.next()) {
                                //Tiempo antes del update
                                String tiempo = rs.getString(1);
                                Long horas, minutos, segundos;
                                segundos = Long.parseLong(tiempo.substring(6));
                                minutos = Long.parseLong(tiempo.substring(3, 5));
                                horas = Long.parseLong(tiempo.substring(0, 2));
                                ms = (horas * 3600000) + (minutos * 60000) + (segundos * 1000);
                                String query = "update horas set salida = ? where id_Fecha='" + id_fecha + "'";
                                PreparedStatement Stmt = conn.prepareStatement(query);
                                Stmt.setString(1, horaS);
                                Stmt.executeUpdate();
                                registroHoras();
                            }
                            //Suma de las dos salidas
                            ms += horasExtra();
                            String nuevoTiempo = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(ms),
                                    TimeUnit.MILLISECONDS.toMinutes(ms) % TimeUnit.HOURS.toMinutes(1),
                                    TimeUnit.MILLISECONDS.toSeconds(ms) % TimeUnit.MINUTES.toSeconds(1));
                            String query = "update horas set horas = ? where id_Fecha='" + id_fecha + "'";
                            PreparedStatement Stmt = conn.prepareStatement(query);
                            Stmt.setString(1, nuevoTiempo);
                            Stmt.executeUpdate();
                            conn.close();
                            JOptionPane.showMessageDialog(new PopUp(), "Salida marcada con exito", "Salida", JOptionPane.INFORMATION_MESSAGE);
                            ID_Salida.setText("");
                            Nombre_Salida.setText("");
                            Tipo_Salida.setText("");
                            Carrera_Salida.setText("");
                            Hora_Salida.setText("");
                            ImagenSalida.setIcon(null);
                        }
                    } catch (SQLException e) {
                        JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.WARNING_MESSAGE);
                        JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
                        d.setLocation(600, 400);
                        d.setVisible(true);
                    }
                }
            } else {
                JOptionPane pane = new JOptionPane("Error 404", JOptionPane.WARNING_MESSAGE);
                JDialog d = pane.createDialog(new JFrame(), "No existe esa persona en la base de datos");
                d.setLocation(600, 400);
                d.setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane pane = new JOptionPane(ex.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
    }//GEN-LAST:event_SalidaActionPerformed

    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
        int Opt;
        ResultSet rs;
        Statement stm;
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            rs = stm.executeQuery("select * from usuario" + " where id='" + getIDEntrada() + "'");
            if (rs.next()) {
                Nombre_Entrada.setText(rs.getString(2));
                Tipo_Entrada.setText(rs.getString(3));
                Carrera_Entrada.setText(rs.getString(5));
                java.sql.Blob blob = rs.getBlob(7);
                InputStream in = blob.getBinaryStream();
                try {
                    BufferedImage imag = ImageIO.read(in);
                    Image image = imag;
                    ImageIcon icon = new ImageIcon(image);
                    ImagenEntrada.setIcon(icon);
                } catch (IOException ex) {
                    Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
                }
                Opt = JOptionPane.showConfirmDialog(new PopUp(), "Entrada de: " + Nombre_Entrada.getText(), "Entrada", JOptionPane.YES_OPTION); //Si=0, No=1
                if (Opt == 0) {
                    String fecha = fecha();
                    String hora = hora();
                    Long id_fecha = Long.parseLong(fecha().replace("/", "").concat(Long.toString(getIDEntrada())));
                    try {
                        if (!Repetido()) {
                            String query = "insert into horas (id,fecha,entrada,id_fecha)" + "values (?,?,?,?)";
                            PreparedStatement stmt = conn.prepareStatement(query);
                            stmt.setLong(1, getIDEntrada());
                            stmt.setString(2, fecha);
                            stmt.setString(3, hora);
                            stmt.setLong(4, id_fecha);
                            Hora_Entrada.setText(hora);
                            stmt.execute();
                            conn.close();
                            JOptionPane.showMessageDialog(new PopUp(), "Entrada marcada con exito", "Entrdada", JOptionPane.INFORMATION_MESSAGE);
                            ID_Entrada.setText("");
                            Nombre_Entrada.setText("");
                            Tipo_Entrada.setText("");
                            Carrera_Entrada.setText("");
                            ImagenEntrada.setIcon(null);
                            Hora_Entrada.setText("");

                        } else {
                            String query = "update horas set entrada = ? where id_Fecha='" + id_fecha + "'";
                            PreparedStatement Stmt = conn.prepareStatement(query);
                            Stmt.setString(1, hora);
                            Hora_Entrada.setText(hora);
                            Stmt.executeUpdate();
                            conn.close();
                            JOptionPane.showMessageDialog(new PopUp(), "Entrada marcada con exito", "Entrdada", JOptionPane.INFORMATION_MESSAGE);
                            ID_Entrada.setText("");
                            Nombre_Entrada.setText("");
                            Tipo_Entrada.setText("");
                            Carrera_Entrada.setText("");
                            ImagenEntrada.setIcon(null);
                            Hora_Entrada.setText("");
                        }
                    } catch (SQLException e) {
                        JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.WARNING_MESSAGE);
                        JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
                        d.setLocation(600, 400);
                        d.setVisible(true);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(new PopUp(), "No existe esa persona en la base de datos", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane pane = new JOptionPane(ex.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
    }//GEN-LAST:event_EntradaActionPerformed

    private void BajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaActionPerformed
        int Opt;
        ResultSet rs;
        Statement stm;
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            rs = stm.executeQuery("select * from usuario" + " where id='" + getIDBaja() + "'");
            if (rs.next()) {
                Nombre_Baja.setText(rs.getString(2));
                Tipo_Baja.setText(rs.getString(3));
                Telefono_Baja.setText(rs.getString(5));
                Carrera_Baja.setText(rs.getString(4));
                Correo_Baja.setText(rs.getString(6));
                java.sql.Blob blob = rs.getBlob(7);
                InputStream in = blob.getBinaryStream();
                try {
                    BufferedImage imag = ImageIO.read(in);
                    Image image = imag;
                    ImageIcon icon = new ImageIcon(image);
                    imagen.setIcon(icon);
                } catch (IOException ex) {
                    Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
                }
                Opt = JOptionPane.showConfirmDialog(new PopUp(), "Dar de baja: " + Nombre_Baja.getText(), "Eliminar Usuario", JOptionPane.YES_OPTION);
                //Si=0, No=1
                if (Opt == 0) {
                    JPasswordField pf = new JPasswordField();
                    int pasw = JOptionPane.showConfirmDialog(new PopUp(), pf, "Ingrese la contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (pasw == JOptionPane.OK_OPTION) {
                        String admin = new String(pf.getPassword());
                        if (admin.equals("Kdi2020")) {
                            String query = "delete from usuario where id='" + getIDBaja() + "'";
                            String query2 = "delete from horas where id='" + getIDBaja() + "'";
                            PreparedStatement Stmt = conn.prepareStatement(query);
                            PreparedStatement Stmt2 = conn.prepareStatement(query2);
                            Stmt.executeUpdate();
                            Stmt2.executeUpdate();
                            conn.close();
                            ID_Baja.setText("");
                            Nombre_Baja.setText("");
                            Tipo_Baja.setText("");
                            Telefono_Baja.setText("");
                            Carrera_Baja.setText("");
                            Correo_Baja.setText("");
                            imagen.setIcon(null);
                            JOptionPane.showMessageDialog(new PopUp(), "Se ha eliminado al usuario", "Baja realizada", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(new PopUp(), "Se notificará al personal de este incidente", "Contraseña incorrecta", JOptionPane.WARNING_MESSAGE);
                            ID_Baja.setText("");
                            Nombre_Baja.setText("");
                            Tipo_Baja.setText("");
                            Telefono_Baja.setText("");
                            Carrera_Baja.setText("");
                            Correo_Baja.setText("");
                            imagen.setIcon(null);
                        }
                    }
                } else {
                    ID_Baja.setText("");
                    Nombre_Baja.setText("");
                    Tipo_Baja.setText("");
                    Telefono_Baja.setText("");
                    Carrera_Baja.setText("");
                    Correo_Baja.setText("");
                    imagen.setIcon(null);
                }
            } else {
                JOptionPane.showMessageDialog(new PopUp(), "No existe esa persona en la base de datos", "Error 404", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane pane = new JOptionPane(ex.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
    }//GEN-LAST:event_BajaActionPerformed

    private void TomarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomarFotoActionPerformed

        try {
            BufferedImage image = webcam.getImage();
            //nombre y formato de la imagen de salida
            ImageIO.write(image, "JPG", new File("usuario.jpg"));
            JOptionPane pane = new JOptionPane("Se ha tomado la foto", JOptionPane.INFORMATION_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Exito");
            d.setLocation(600, 400);
            d.setVisible(true);
            BufferedImage i = ImageIO.read(new File("../ControlCaadi/usuario.jpg"));
            foto.setIcon(new ImageIcon(i));
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_TomarFotoActionPerformed

    private void AltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaActionPerformed
        int conf = 3;
        InputStream img = null;
        try {
            img = new FileInputStream("../ControlCaadi/usuario.jpg");
        } catch (FileNotFoundException ex) {
            JOptionPane pane = new JOptionPane("No se encuentra la ruta de la imagen", JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Error en la camara");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
        if (verifica()) { //Si los datos estan correctos, se confirma su alta al sistema
            conf = JOptionPane.showConfirmDialog(new PopUp(), "Agregar al usuario: " + Nombre_Usuario.getText(), "Añadir a la base de datos", JOptionPane.YES_NO_OPTION);
            //Por razones que no comprendo 0=Si, 1=No
        } else {
            JOptionPane pane = new JOptionPane("No se puede dar de alta", JOptionPane.ERROR_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Datos erroneos");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
        if (conf == 0) {
            JPasswordField pf = new JPasswordField();
            int pasw = JOptionPane.showConfirmDialog(new PopUp(), pf, "Ingrese la contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (pasw == JOptionPane.OK_OPTION) {
                String admin = new String(pf.getPassword());
                if (admin.equals("Kdi2020")) {
                    try {
                        Connection conn = DriverManager.getConnection(url, user, pass);
                        String query = "insert into usuario (id, Nombre, Tipo, Telefono,Carrera,Correo,Imagen)" + "values (?,?,?,?,?,?,?)";
                        PreparedStatement stmt = conn.prepareStatement(query);
                        stmt.setString(1, getIdUsuario());
                        stmt.setString(2, getNombre());
                        stmt.setString(3, getTipo());
                        stmt.setLong(4, getTelefono());
                        if (labelOP.isShowing()) {
                            stmt.setString(5, getCarreraOP());
                        } else {
                            stmt.setString(5, getCarrera());
                        }
                        stmt.setString(6, getCorreo());
                        stmt.setBlob(7, img);
                        stmt.execute();
                        conn.close();
                        JOptionPane.showMessageDialog(new PopUp(), "Se ha dado de alta al usuario", "Exito", JOptionPane.INFORMATION_MESSAGE);
                        ID_Usuario.setText("");
                        Nombre_Usuario.setText("");
                        Usuario_Tipo.setSelectedIndex(0);
                        Telefono_Usuario.setText("");
                        Correo_Usuario.setText("");
                        Carrera_Usuario.setSelectedIndex(0);
                        labelOP.setVisible(false);
                        FieldOP.setVisible(false);
                        ErrorCarreraOP.setVisible(false);
                        foto.setIcon(null);
                    } catch (SQLException e) {
                        JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.WARNING_MESSAGE);
                        JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
                        d.setLocation(600, 400);
                        d.setVisible(true);
                    }
                } else {
                    JOptionPane pane = new JOptionPane("Contraseña Incorrecta", JOptionPane.WARNING_MESSAGE);
                    JDialog d = pane.createDialog(new JFrame(), "Se notificará al personal de este incidente");
                    d.setLocation(600, 400);
                    d.setVisible(true);
                    ID_Usuario.setText("");
                    Nombre_Usuario.setText("");
                    Usuario_Tipo.setSelectedIndex(0);
                    Telefono_Usuario.setText("");
                    Correo_Usuario.setText("");
                    Carrera_Usuario.setSelectedIndex(0);
                    labelOP.setVisible(false);
                    FieldOP.setVisible(false);
                    ErrorCarreraOP.setVisible(false);
                    foto.setIcon(null);
                }
            }
        }


    }//GEN-LAST:event_AltaActionPerformed

    private void RegistrarEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarEXActionPerformed
        ErrorIDEX.setVisible(false);
        Error_Entrada.setVisible(false);
        Error_Salida.setVisible(false);
        ResultSet rs, rs2;
        Statement stm, stm2;
        String dif = "";
        try {
            long ID = Long.parseLong(ID_EX.getText());
        } catch (NumberFormatException | NullPointerException e) {
            ErrorIDEX.setVisible(true);
            JOptionPane pane = new JOptionPane("Algo anda mal", JOptionPane.ERROR_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Datos erroneos");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            rs2 = stm.executeQuery("select imagen from usuario" + " where id='" + ID_EX.getText() + "'");
            if (rs2.next()) {
                java.sql.Blob blob = rs2.getBlob(1);
                InputStream in = blob.getBinaryStream();
                try {
                    BufferedImage imag = ImageIO.read(in);
                    Image image = imag;
                    ImageIcon icon = new ImageIcon(image);
                    ImagenEX.setIcon(icon);
                } catch (IOException ex) {
                    Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
                }
                int S = JOptionPane.showConfirmDialog(new PopUp(), "Agregar horas extras a " + ID_EX.getText(), "Registro", JOptionPane.YES_OPTION); //Si=0, No=1
                if (S == 0) {
                    JPasswordField pf = new JPasswordField();
                    int pasw = JOptionPane.showConfirmDialog(new PopUp(), pf, "Ingrese la contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (pasw == JOptionPane.OK_OPTION) {
                        String admin = new String(pf.getPassword());
                        if (admin.equals("Kdi2020")) {
                            String hora_entrada = "";
                            String hora_salida = "";
                            SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
                            String fecha = formater.format(Date_EX.getDate());
                            Long ID = Long.parseLong(ID_EX.getText());
                            Long IDF = Long.parseLong(fecha.replace("/", "").concat(ID_EX.getText()));
                            if (HorasEXE.getText().isEmpty()) {
                                hora_entrada += "00:";
                            } else {
                                int i = Integer.parseInt(HorasEXE.getText());
                                if (i > 24) {
                                    Error_Entrada.setVisible(true);
                                    JOptionPane pane = new JOptionPane("No hay mas de 24 horas al dia ", JOptionPane.WARNING_MESSAGE);
                                    JDialog d = pane.createDialog(new JFrame(), "Error");
                                    d.setLocation(600, 400);
                                    d.setVisible(true);
                                } else {
                                    hora_entrada += HorasEXE.getText() + ":";
                                }
                            }
                            if (MinutosEXE.getText().isEmpty()) {
                                hora_entrada += "00:00";
                            } else {
                                int i = Integer.parseInt(MinutosEXE.getText());
                                if (i >= 60) {
                                    Error_Entrada.setVisible(true);
                                    JOptionPane pane = new JOptionPane("Minutos deben ser menores a 60", JOptionPane.WARNING_MESSAGE);
                                    JDialog d = pane.createDialog(new JFrame(), "Error");
                                    d.setLocation(600, 400);
                                    d.setVisible(true);
                                } else {
                                    hora_entrada += MinutosEXE.getText() + ":00";
                                }
                            }
                            if (HorasEXS.getText().isEmpty()) {
                                hora_salida += "00:";
                            } else {
                                int i = Integer.parseInt(HorasEXS.getText());
                                if (i > 24) {
                                    Error_Salida.setVisible(true);
                                    JOptionPane pane = new JOptionPane("No hay mas de 24 horas al dia", JOptionPane.WARNING_MESSAGE);
                                    JDialog d = pane.createDialog(new JFrame(), "Error");
                                    d.setLocation(600, 400);
                                    d.setVisible(true);
                                } else {
                                    hora_salida += HorasEXS.getText() + ":";
                                }
                            }
                            if (MinutosEXS.getText().isEmpty()) {
                                hora_salida += "00:00";
                            } else {
                                int i = Integer.parseInt(MinutosEXS.getText());
                                if (i >= 60) {
                                    Error_Salida.setVisible(true);
                                    JOptionPane pane = new JOptionPane("Minutos deben ser menores a 60", JOptionPane.WARNING_MESSAGE);
                                    JDialog d = pane.createDialog(new JFrame(), "Error");
                                    d.setLocation(600, 400);
                                    d.setVisible(true);
                                } else {
                                    hora_salida += MinutosEXS.getText() + ":00";
                                }
                            }
                            try {
                                stm2 = conn.createStatement();
                                if (!RepetidoEX()) {
                                    String query = "insert into horas (id_Fecha, id, Entrada, Salida, Fecha, horas) values (?,?,?,?,?,?)";
                                    PreparedStatement stmt = conn.prepareStatement(query);
                                    rs = stm2.executeQuery("select timediff('" + hora_salida + "','" + hora_entrada + "')");
                                    if (rs.next()) {
                                        dif = rs.getString(1);
                                    }
                                    if (!Error_Salida.isVisible() || !Error_Entrada.isVisible()) {
                                        stmt.setLong(1, IDF);
                                        stmt.setLong(2, ID);
                                        stmt.setString(3, hora_entrada);
                                        stmt.setString(4, hora_salida);
                                        stmt.setString(5, fecha);
                                        stmt.setString(6, dif);
                                        stmt.execute();
                                        JOptionPane.showMessageDialog(new PopUp(), "Exito", "Horas agregadas", JOptionPane.INFORMATION_MESSAGE);
                                        conn.close();
                                        ID_EX.setText("");
                                        Date_EX.setDate(null);
                                        HorasEXE.setText("");
                                        MinutosEXE.setText("");
                                        HorasEXS.setText("");
                                        MinutosEXS.setText("");
                                        ImagenEX.setIcon(null);
                                    }
                                } else {
                                    Statement stmtent = conn.createStatement();
                                    ResultSet rsent = stmtent.executeQuery("select entrada from horas where id_Fecha='" + IDF + "'");
                                    if (rsent.next()) {
                                        String entrada = rsent.getString(1);
                                        if (entrada != null) {
                                            if (!Error_Salida.isVisible() || !Error_Entrada.isVisible()) {
                                                String qsalida = "update horas set salida=?, horas = ? where id_Fecha='" + IDF + "'";
                                                PreparedStatement stmt = conn.prepareStatement(qsalida);
                                                stmt.setString(1, hora_salida);
                                                stmt.setString(2, timediff(IDF, hora_salida));
                                                stmt.execute();
                                                conn.close();
                                                JOptionPane.showMessageDialog(new PopUp(), "Exito", "Se agrego la salida", JOptionPane.INFORMATION_MESSAGE);
                                                ID_EX.setText("");
                                                Date_EX.setDate(null);
                                                HorasEXE.setText("");
                                                MinutosEXE.setText("");
                                                HorasEXS.setText("");
                                                MinutosEXS.setText("");
                                                ImagenEX.setIcon(null);
                                            }
                                        } else {
                                            if (!Error_Salida.isVisible() || !Error_Entrada.isVisible()) {
                                                String qsalida = "update horas set entrada= ? , horas = ? where id_Fecha='" + IDF + "'";
                                                PreparedStatement stmt = conn.prepareStatement(qsalida);
                                                stmt.setString(1, hora_entrada);
                                                stmt.setString(2, timediffE(IDF, hora_entrada));
                                                stmt.execute();
                                                conn.close();
                                                JOptionPane.showMessageDialog(new PopUp(), "Exito", "Se agrego la entrada", JOptionPane.INFORMATION_MESSAGE);
                                                ID_EX.setText("");
                                                Date_EX.setDate(null);
                                                HorasEXE.setText("");
                                                MinutosEXE.setText("");
                                                HorasEXS.setText("");
                                                MinutosEXS.setText("");
                                                ImagenEX.setIcon(null);
                                            }
                                        }
                                    }
                                }
                            } catch (SQLException e) {
                                JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.WARNING_MESSAGE);
                                JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
                                d.setLocation(600, 400);
                                d.setVisible(true);
                            }
                        } else {
                            JOptionPane.showMessageDialog(new PopUp(), "Se notificará al personal de este incidente", "Contraseña incorrecta", JOptionPane.WARNING_MESSAGE);
                        }
                    }//Opcion
                }
            } else {
                JOptionPane pane = new JOptionPane("Error 404", JOptionPane.WARNING_MESSAGE);
                JDialog d = pane.createDialog(new JFrame(), "No existe esa persona en la base de datos");
                d.setLocation(600, 400);
                d.setVisible(true);
            }
        } catch (SQLException e) {
            JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
    }//GEN-LAST:event_RegistrarEXActionPerformed

    private void Tab2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Tab2FocusGained
        if (Tab2.getSelectedIndex() == 0) {
            ID_Entrada.requestFocusInWindow();
        }
        if (Tab2.getSelectedIndex() == 1) {
            ID_Salida.requestFocusInWindow();
        }
        if (Tab2.getSelectedIndex() == 2) {
            ID_EX.requestFocusInWindow();
        }
    }//GEN-LAST:event_Tab2FocusGained

    private void Date_EXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date_EXActionPerformed
        SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
        formater.format(Date_EX.getDate());
        Date_EX.setFormats(formater);
    }//GEN-LAST:event_Date_EXActionPerformed

    private void Fecha_InicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha_InicialActionPerformed
        SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
        formater.format(Fecha_Inicial.getDate());
        Fecha_Inicial.setFormats(formater);
    }//GEN-LAST:event_Fecha_InicialActionPerformed

    private void Fecha_FinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha_FinalActionPerformed
        SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
        formater.format(Fecha_Final.getDate());
        Fecha_Final.setFormats(formater);
    }//GEN-LAST:event_Fecha_FinalActionPerformed
    //Obtener todos los datos y verificar la informacion ingresada
    public void Valores() {
        ErrorID.setVisible(false);
        ErrorTelefono.setVisible(false);
        ErrorNombre.setVisible(false);
        ErrorCarrera.setVisible(false);
        ErrorTipo.setVisible(false);
        ErrorCarreraOP.setVisible(false);
        String opt = (String) Carrera_Usuario.getSelectedItem();
        String opt2 = (String) Usuario_Tipo.getSelectedItem();
        String Nombre = Nombre_Usuario.getText();
        String Correo = Correo_Usuario.getText();
        String Carrera = "X";
        String ID = ID_Usuario.getText();

        try {
            long Telefono = Long.parseLong(Telefono_Usuario.getText());
        } catch (NumberFormatException | NullPointerException e) {
            ErrorTelefono.setVisible(true);
        }
        if (ID.isEmpty()) {
            ErrorID.setVisible(true);
        }
        if (Nombre.isEmpty()) {
            ErrorNombre.setVisible(true);
        }
        if ("---Elige una opcion---".equals(opt)) {
            ErrorCarrera.setVisible(true);
        }
        if ("---Elige una opcion---".equals(opt2)) {
            ErrorTipo.setVisible(true);
        }
        if ("Otra".equals(opt)) {
            labelOP.setVisible(true);
            FieldOP.setVisible(true);
        }
        if (labelOP.isShowing()) {
            Carrera = FieldOP.getText();
            if (Carrera.isEmpty()) {
                JOptionPane.showMessageDialog(new PopUp(), "Ingresa el nombre de la carrera", "Nueva Carrera", JOptionPane.WARNING_MESSAGE);
                ErrorCarreraOP.setVisible(true);
            }
        }
    }

    public boolean verifica() {
        Valores();
        if (ErrorID.isShowing() || ErrorNombre.isShowing() || ErrorCarrera.isShowing() || ErrorTelefono.isShowing() || ErrorTipo.isShowing() || ErrorCarreraOP.isShowing()) {
            return false;
        } else {
            return true;
        }
    }

    public long horasExtra() {
        ResultSet rs;
        Statement stm;
        Long ms = 0L;
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            Long id_fecha = Long.parseLong(fecha().replace("/", "").concat(Long.toString(getIDSalida())));
            rs = stm.executeQuery("select horas from horas" + " where id_Fecha='" + id_fecha + "'");
            if (rs.next()) {
                //Nuevo tiempo de salida
                String tiempo = rs.getString(1);
                Long horas, minutos, segundos;
                segundos = Long.parseLong(tiempo.substring(6));
                minutos = Long.parseLong(tiempo.substring(3, 5));
                horas = Long.parseLong(tiempo.substring(0, 2));
                ms = (horas * 60 * 60 * 1000) + (minutos * 60 * 1000) + (segundos * 1000);
            }
        } catch (SQLException e) {
            JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
        return ms;
    }

    public String fecha() {
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            java.util.Date fecha = new java.util.Date();
            java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime());
            SimpleDateFormat fechaFormato = new SimpleDateFormat("yyyy/MM/dd");
            String fechaS = fechaFormato.format(fechaSQL);
            return fechaS;
        } catch (SQLException ex) {
            JOptionPane pane = new JOptionPane(ex.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
        return "";
    }

    public String hora() {
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            java.util.Date fecha = new java.util.Date();
            java.sql.Timestamp horaSQL = new java.sql.Timestamp(fecha.getTime());
            SimpleDateFormat horaFormato = new SimpleDateFormat("HH:mm:ss");
            String horaS = horaFormato.format(horaSQL);
            return horaS;
        } catch (SQLException ex) {
            JOptionPane pane = new JOptionPane(ex.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
        return "";
    }

    public String timediff(Long idf, String salida) {
        String diff = "";
        String entrada = "";
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stm1 = conn.createStatement();
            ResultSet rs = stm1.executeQuery("select entrada from horas" + " where id_Fecha='" + idf + "'");
            Statement stm = conn.createStatement();
            if (rs.next()) {
                entrada = rs.getString(1);
            }
            ResultSet rs1 = stm.executeQuery("select timediff('" + salida + "','" + entrada + "')");
            if (rs1.next()) {
                diff = rs1.getString(1);
            }

        } catch (SQLException e) {
            JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
        return diff;
    }

    public String timediffE(Long idf, String entrada) {
        String diff = "";
        String salida = "";
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stm1 = conn.createStatement();
            ResultSet rs = stm1.executeQuery("select salida from horas" + " where id_Fecha='" + idf + "'");
            Statement stm = conn.createStatement();
            if (rs.next()) {
                salida = rs.getString(1);
            }
            ResultSet rs1 = stm.executeQuery("select timediff('" + salida + "','" + entrada + "')");
            if (rs1.next()) {
                diff = rs1.getString(1);
            }

        } catch (SQLException e) {
            JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
        return diff;
    }

    public boolean RepetidoEX() {
        boolean R = false;
        try {
            SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
            String fecha = formater.format(Date_EX.getDate());
            Long id_fecha = Long.parseLong(fecha.replace("/", "").concat(ID_EX.getText()));
            ResultSet rs;
            Statement stm;
            Connection conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            rs = stm.executeQuery("select * from horas" + " where id_fecha='" + id_fecha + "'");
            if (rs.next()) {
                String id = rs.getString(1);
                R = !(id.isEmpty());
            }
        } catch (SQLException e) {
            JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
        return R;
    }

    public boolean Repetido() {
        boolean R = false;
        try {
            Long id_fecha = Long.parseLong(fecha().replace("/", "").concat(Long.toString(getIDEntrada())));
            ResultSet rs;
            Statement stm;
            Connection conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            rs = stm.executeQuery("select * from horas" + " where id_fecha='" + id_fecha + "'");
            if (rs.next()) {
                String id = rs.getString(1);
                R = !(id.isEmpty());
            }
        } catch (SQLException e) {
            JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
        return R;
    }

    public boolean horasE() {
        boolean R = false;
        try {
            Long id_fecha = Long.parseLong(fecha().replace("/", "").concat(Long.toString(getIDSalida())));
            ResultSet rs;
            Statement stm;
            Connection conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            rs = stm.executeQuery("select horas from horas" + " where id_fecha='" + id_fecha + "'");
            if (rs.next()) {
                String ex = rs.getString(1);
                R = !(ex == null);
            } else {
                JOptionPane pane = new JOptionPane("Este usuario no registró entrada, sus horas no seran registradas al menos que"
                        + " sean ingrensadas manualmente en la pestaña 'Tiempo Extemporaneo'", JOptionPane.WARNING_MESSAGE);
                JDialog d = pane.createDialog(new JFrame(), "ADVERTENCIA");
                d.setLocation(600, 400);
                d.setVisible(true);
            }
        } catch (SQLException e) {
            JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
        return R;
    }

    public void registroHoras() {
        ResultSet rs, rs1;
        Statement stm;
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            Long id_fecha = Long.parseLong(fecha().replace("/", "").concat(Long.toString(getIDSalida())));
            rs = stm.executeQuery("select entrada, salida from horas" + " where id_Fecha='" + id_fecha + "'");
            if (rs.next()) {
                String entrada = rs.getString(1);
                String salida = rs.getString(2);
                Hora_Salida.setText(salida);
                rs1 = stm.executeQuery("select timediff('" + salida + "','" + entrada + "')");
                try {
                    rs1.next();
                    String dif = rs1.getString(1);
                    String query = "update horas set horas = ? where id_Fecha='" + id_fecha + "'";
                    PreparedStatement Stmt = conn.prepareStatement(query);
                    Stmt.setString(1, dif);
                    Stmt.executeUpdate();
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.WARNING_MESSAGE);
                    JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
                    d.setLocation(600, 400);
                    d.setVisible(true);
                }
            }
        } catch (SQLException ex) {
            JOptionPane pane = new JOptionPane(ex.getMessage(), JOptionPane.WARNING_MESSAGE);
            JDialog d = pane.createDialog(new JFrame(), "Kaboooooom");
            d.setLocation(600, 400);
            d.setVisible(true);
        }
    }

    public String getFechaI() {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
        String fecha = formater.format(Fecha_Inicial.getDate());
        return fecha;
    }

    public String getFechaF() {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
        String fecha = formater.format(Fecha_Final.getDate());
        return fecha;
    }

    public String getNombre() {
        return Nombre_Usuario.getText();
    }

    public String getCorreo() {
        return Correo_Usuario.getText();
    }

    public String getCarrera() {
        return (String) Carrera_Usuario.getSelectedItem();
    }

    public String getTipo() {
        return (String) Usuario_Tipo.getSelectedItem();
    }

    public String getCarreraOP() {
        return FieldOP.getText();
    }

    public String getIdUsuario() {
        return ID_Usuario.getText();
    }

    public long getTelefono() {
        return Long.parseLong(Telefono_Usuario.getText());
    }

    public long getIDEntrada() {
        long ent = 0;
        try {
            ent = Long.parseLong(ID_Entrada.getText());
            ErrorEntrada.setVisible(false);
        } catch (NumberFormatException | NullPointerException e) {
            ErrorEntrada.setVisible(true);
        }
        return ent;
    }

    public long getIDBaja() {
        long baja = 0;
        try {
            baja = Long.parseLong(ID_Baja.getText());
            ErrorBaja.setVisible(false);
        } catch (NumberFormatException | NullPointerException e) {
            ErrorBaja.setVisible(true);
        }
        return baja;
    }

    public long getIDSalida() {
        long sal = 0;
        try {
            sal = Long.parseLong(ID_Salida.getText());
            ErrorSalida.setVisible(false);
        } catch (NumberFormatException | NullPointerException e) {
            ErrorSalida.setVisible(true);
        }
        return sal;
    }

    public long getIDConsulta() {
        long consulta = 0;
        try {
            consulta = Long.parseLong(ID_Consulta.getText());
            ErrorConsulta.setVisible(false);
        } catch (NumberFormatException | NullPointerException e) {
            ErrorConsulta.setVisible(true);
        }
        return consulta;
    }

    public class PopUp extends JFrame {

        public void PopUp() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setSize(100, 300);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contenedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alta;
    private javax.swing.JButton Baja;
    private javax.swing.JLayeredPane Camara;
    private javax.swing.JTextField Carrera_Baja;
    private javax.swing.JTextField Carrera_Entrada;
    private javax.swing.JTextField Carrera_Salida;
    private javax.swing.JComboBox<String> Carrera_Usuario;
    private javax.swing.JButton Consultar;
    private javax.swing.JButton ConsultarFecha;
    private javax.swing.JTextField Correo_Baja;
    private javax.swing.JTextField Correo_Usuario;
    private org.jdesktop.swingx.JXDatePicker Date_EX;
    private javax.swing.JButton Entrada;
    private javax.swing.JLabel ErrorBaja;
    private javax.swing.JLabel ErrorCarrera;
    private javax.swing.JLabel ErrorCarreraOP;
    private javax.swing.JLabel ErrorConsulta;
    private javax.swing.JLabel ErrorEntrada;
    private javax.swing.JLabel ErrorID;
    private javax.swing.JLabel ErrorIDEX;
    private javax.swing.JLabel ErrorNombre;
    private javax.swing.JLabel ErrorSalida;
    private javax.swing.JLabel ErrorTelefono;
    private javax.swing.JLabel ErrorTipo;
    private javax.swing.JLabel Error_Entrada;
    private javax.swing.JLabel Error_Salida;
    private org.jdesktop.swingx.JXDatePicker Fecha_Final;
    private org.jdesktop.swingx.JXDatePicker Fecha_Inicial;
    private javax.swing.JTextField FieldOP;
    private javax.swing.JTextArea Historial;
    private javax.swing.JTextField Hora_Entrada;
    private javax.swing.JTextField Hora_Salida;
    private javax.swing.JLabel HorasE;
    private javax.swing.JTextField HorasEXE;
    private javax.swing.JTextField HorasEXS;
    private javax.swing.JLabel HorasS;
    private javax.swing.JTextField Horas_Fecha;
    private javax.swing.JTextField Horas_Totales;
    private javax.swing.JTextField ID_Baja;
    private javax.swing.JTextField ID_Consulta;
    private javax.swing.JTextField ID_EX;
    private javax.swing.JTextField ID_Entrada;
    private javax.swing.JTextField ID_Salida;
    private javax.swing.JTextField ID_Usuario;
    private javax.swing.JLabel ImagenEX;
    private javax.swing.JLabel ImagenEntrada;
    private javax.swing.JLabel ImagenSalida;
    private javax.swing.JLabel JLabel25;
    private javax.swing.JLabel MinutosE;
    private javax.swing.JTextField MinutosEXE;
    private javax.swing.JTextField MinutosEXS;
    private javax.swing.JLabel MinutosS;
    private javax.swing.JTextField Nombre_Baja;
    private javax.swing.JTextField Nombre_Consulta;
    private javax.swing.JTextField Nombre_Entrada;
    private javax.swing.JTextField Nombre_Salida;
    private javax.swing.JTextField Nombre_Usuario;
    private javax.swing.JPanel PanelEntrada;
    private javax.swing.JPanel PanelExtemporaneo;
    private javax.swing.JPanel PanelSalida;
    private javax.swing.JButton RegistrarEX;
    private javax.swing.JButton Salida;
    private javax.swing.JTabbedPane Tab1;
    private javax.swing.JTabbedPane Tab2;
    private javax.swing.JPanel TabAlta;
    private javax.swing.JPanel TabBaja;
    private javax.swing.JPanel TabConsulta;
    private javax.swing.JPanel TabHoras;
    private javax.swing.JTextField Telefono_Baja;
    private javax.swing.JTextField Telefono_Usuario;
    private javax.swing.JLabel Test;
    private javax.swing.JTextField Tipo_Baja;
    private javax.swing.JTextField Tipo_Entrada;
    private javax.swing.JTextField Tipo_Salida;
    private javax.swing.JButton TomarFoto;
    private javax.swing.JComboBox<String> Usuario_Tipo;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel imagen;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelOP;
    // End of variables declaration//GEN-END:variables
}

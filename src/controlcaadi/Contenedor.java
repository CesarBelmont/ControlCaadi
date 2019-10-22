package controlcaadi;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author César Arturo Rea Reyes
 *
 */
public class Contenedor extends javax.swing.JFrame {

    String url = "jdbc:mysql://localhost:3306/caadi?zerouseJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String user = "root";
    String pass = "1123581321";

    public Contenedor() {
        initComponents();
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
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
        jPanel2 = new javax.swing.JPanel();
        fff = new javax.swing.JPanel();
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
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
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
        jPanel6 = new javax.swing.JPanel();
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
        jPanel4 = new javax.swing.JPanel();
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
        Fecha_Inicial = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        Fecha_Final = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        Horas_Fecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Historial = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Usuario");

        jLabel2.setText("Nombre Completo");

        jLabel3.setText("Carrera");

        jLabel4.setText("Telefono");

        Alta.setText("Dar de alta");
        Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaActionPerformed(evt);
            }
        });

        jLabel8.setText("Correo (No obligatorio)");

        ErrorID.setForeground(new java.awt.Color(255, 51, 51));
        ErrorID.setText("Verifica esta informacion");

        ErrorNombre.setForeground(new java.awt.Color(255, 51, 51));
        ErrorNombre.setText("Verifica esta informacion");

        ErrorTelefono.setForeground(new java.awt.Color(255, 51, 51));
        ErrorTelefono.setText("Verifica esta informacion");

        ErrorCarrera.setForeground(new java.awt.Color(255, 51, 51));
        ErrorCarrera.setText("Selecciona una opcion");

        Carrera_Usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Elige una opcion---", "Sistemas", "LDII", "FLE-ELE", "LRI", "Logistica Empresarial", "Otra" }));

        labelOP.setText("Carrera");

        ErrorCarreraOP.setForeground(java.awt.Color.red);
        ErrorCarreraOP.setText("No debe ir vacio");

        jLabel12.setText("Tipo");

        Usuario_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Elige una opcion---", "Servicio Social", "Tutor Par", "Practicas Profecionales" }));

        ErrorTipo.setForeground(java.awt.Color.red);
        ErrorTipo.setText("Selecciona una opcion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Usuario_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ErrorTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Test, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(Alta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Carrera_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ErrorCarrera))
                                    .addComponent(jLabel3))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelOP)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FieldOP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ErrorCarreraOP)))))
                        .addContainerGap(164, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Telefono_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ErrorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(Correo_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ID_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ErrorID, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Nombre_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ErrorNombre)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ID_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorID))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorNombre))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Test)
                                .addGap(37, 37, 37))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Usuario_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ErrorTipo))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Telefono_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelOP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Carrera_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorCarrera)
                    .addComponent(FieldOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorCarreraOP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correo_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 33, Short.MAX_VALUE)
                .addComponent(Alta)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Alta Usuario", jPanel1);

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

        javax.swing.GroupLayout fffLayout = new javax.swing.GroupLayout(fff);
        fff.setLayout(fffLayout);
        fffLayout.setHorizontalGroup(
            fffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(fffLayout.createSequentialGroup()
                        .addComponent(ID_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ErrorBaja))
                    .addGroup(fffLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(Baja, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Carrera_Baja, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Telefono_Baja, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Correo_Baja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Tipo_Baja, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nombre_Baja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        fffLayout.setVerticalGroup(
            fffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorBaja))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tipo_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Carrera_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Telefono_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correo_Baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(Baja)
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("Baja Usuario", fff);

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

        jLabel18.setText("Tipo");

        Tipo_Entrada.setEditable(false);

        jLabel19.setText("Carrera");

        Carrera_Entrada.setEditable(false);

        jLabel24.setText("Hora");

        Hora_Entrada.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(ID_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ErrorEntrada))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel24)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Hora_Entrada, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Carrera_Entrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(Tipo_Entrada, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nombre_Entrada, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(496, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorEntrada))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(10, 10, 10)
                .addComponent(Nombre_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(Entrada)
                .addGap(38, 38, 38))
        );

        jTabbedPane2.addTab("Entrada", jPanel5);

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ID_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ErrorSalida))
                    .addComponent(JLabel25)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Hora_Salida, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Salida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nombre_Salida, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Tipo_Salida, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Carrera_Salida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addContainerGap(496, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(Salida)
                .addGap(38, 38, 38))
        );

        jTabbedPane2.addTab("Salida", jPanel6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro Horas", jPanel3);

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

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel16.setText("Nombre");

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

        Historial.setColumns(20);
        Historial.setRows(5);
        jScrollPane1.setViewportView(Historial);

        jLabel29.setForeground(new java.awt.Color(0, 204, 0));
        jLabel29.setText("aaaa/mm/dd");

        jLabel30.setForeground(new java.awt.Color(0, 204, 0));
        jLabel30.setText("aaaa/mm/dd");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(Nombre_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Horas_Totales, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ID_Consulta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ErrorConsulta))
                            .addComponent(Consultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 172, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel27))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Horas_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Fecha_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Fecha_Inicial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(ConsultarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Consultar)
                        .addContainerGap())
                    .addComponent(jSeparator2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Fecha_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Fecha_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Horas_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(ConsultarFecha)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Consulta Horas", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaActionPerformed
        try {
            int Opt;
            try {
                long baja = getIDBaja();
                ErrorBaja.setVisible(false);
            } catch (NumberFormatException | NullPointerException e) {
                ErrorBaja.setVisible(true);
            }
            ResultSet rs;
            Statement stm;
            try {
                Connection conn = DriverManager.getConnection(url, user, pass);
                stm = conn.createStatement();
                rs = stm.executeQuery("select * from usuario" + " where id='" + getIDBaja() + "'");
                if (rs.next()) {
                    Nombre_Baja.setText(rs.getString(2));
                    Tipo_Baja.setText(rs.getString(3));
                    Telefono_Baja.setText(rs.getString(4));
                    Carrera_Baja.setText(rs.getString(5));
                    Correo_Baja.setText(rs.getString(6));
                    Opt = JOptionPane.showConfirmDialog(new PopUp(), "Dar de baja: " + Nombre_Baja.getText(), "Eliminar Usuario", JOptionPane.YES_OPTION); //Si=0, No=1
                    if (Opt == 0) {
                        String query = "delete from usuario where id='" + getIDBaja() + "'";
                        String query2 = "delete from horas where id='" + getIDBaja() + "'";
                        PreparedStatement Stmt = conn.prepareStatement(query);
                        PreparedStatement Stmt2 = conn.prepareStatement(query2);
                        Stmt.executeUpdate();
                        Stmt2.executeUpdate();
                        conn.close();
                        JOptionPane.showMessageDialog(new PopUp(), "Se ha eliminado al usuario", "Baja realizada", JOptionPane.OK_OPTION);
                    }
                } else {
                    JOptionPane.showMessageDialog(new PopUp(), "No existe esa persona en la base de datos", "Error 404", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(new PopUp(), "Kabooooom", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
            }
            Thread.sleep(5000);
            cls();
        } catch (InterruptedException e) {

        }
    }//GEN-LAST:event_BajaActionPerformed

    private void AltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaActionPerformed
        try {
            int conf = 3;
            if (verifica()) { //Si los datos estan correctos, se confirma su alta al sistema
                conf = JOptionPane.showConfirmDialog(new PopUp(), "Dar de alta", "Agregar al usuario: " + Nombre_Usuario.getText(), JOptionPane.YES_NO_OPTION);
                //Por razones que no comprendo 0=Si, 1=No                
            } else {
                JOptionPane.showMessageDialog(new PopUp(), "Datos erroneos", "No se puede dar de alta", JOptionPane.ERROR_MESSAGE);
            }
            if (conf == 0) {
                try {
                    Connection conn = DriverManager.getConnection(url, user, pass);
                    String query = "insert into usuario (id, Nombre, Tipo, Telefono,Carrera,Correo)" + "values (?,?,?,?,?,?)";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setLong(1, getIdUsuario());
                    stmt.setString(2, getNombre());
                    stmt.setString(3, getTipo());
                    stmt.setLong(4, getTelefono());
                    stmt.setString(5, getCarrera());
                    stmt.setString(6, getCorreo());
                    stmt.execute();
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(new PopUp(), "Kabooooom", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
                }
                ID_Usuario.setText("");
                Nombre_Usuario.setText("");
                Usuario_Tipo.setSelectedIndex(0);
                Telefono_Usuario.setText("");
                Carrera_Usuario.setSelectedIndex(0);
                FieldOP.setText("");
                Correo_Usuario.setText("");
            }
            Thread.sleep(5000);
            cls();
        } catch (InterruptedException e) {

        }

    }//GEN-LAST:event_AltaActionPerformed

    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
        int Opt;
        try {
            long ent = getIDEntrada();
            ErrorEntrada.setVisible(false);
        } catch (NumberFormatException | NullPointerException e) {
            ErrorEntrada.setVisible(true);
        }
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
                        } else {
                            String query = "update horas set entrada = ? where id_Fecha='" + id_fecha + "'";
                            PreparedStatement Stmt = conn.prepareStatement(query);
                            Stmt.setString(1, hora);
                            Hora_Entrada.setText(hora);
                            Stmt.executeUpdate();
                            conn.close();
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(new PopUp(), "Kabooooooooom", "Error 404", JOptionPane.WARNING_MESSAGE);
                        System.err.println(e.getMessage());
                    }
                }
            } else {
                JOptionPane.showMessageDialog(new PopUp(), "No existe esa persona en la base de datos", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(new PopUp(), "Kabooooom", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_EntradaActionPerformed

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        int S;
        try {
            long sal = getIDSalida();
            ErrorSalida.setVisible(false);
        } catch (NumberFormatException | NullPointerException e) {
            ErrorSalida.setVisible(true);
        }
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
                S = JOptionPane.showConfirmDialog(new PopUp(), "Salida de: " + Nombre_Salida.getText(), "Salida", JOptionPane.YES_OPTION); //Si=0, No=1
                if (S == 0) {
                    java.util.Date fecha = new java.util.Date();
                    java.sql.Timestamp horaSQL = new java.sql.Timestamp(fecha.getTime());
                    SimpleDateFormat horaFormato = new SimpleDateFormat("hh:mm:ss");
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
                        } else {
                            rs = stm.executeQuery("select horas from horas" + " where id_fecha='" + id_fecha + "'");
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
                                Hora_Salida.setText(horaS);
                                Stmt.executeUpdate();

                                registroHoras();
                            }
                            //Suma de las dos salidas
                            ms += horasEx();
                            String nuevoTiempo = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(ms),
                                    TimeUnit.MILLISECONDS.toMinutes(ms) % TimeUnit.HOURS.toMinutes(1),
                                    TimeUnit.MILLISECONDS.toSeconds(ms) % TimeUnit.MINUTES.toSeconds(1));
                            String query = "update horas set horas = ? where id_Fecha='" + id_fecha + "'";
                            PreparedStatement Stmt = conn.prepareStatement(query);
                            Stmt.setString(1, nuevoTiempo);
                            Stmt.executeUpdate();
                            conn.close();
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(new PopUp(), "Kabooooooooom", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
                    }

                }
            } else {
                JOptionPane.showMessageDialog(new PopUp(), "No existe esa persona en la base de datos", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new PopUp(), "Kabooooom", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SalidaActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        long consulta = 0;
        ResultSet rs, rs2;
        Statement stm, stm2;
        try {
            consulta = getIDConsulta();
            ErrorConsulta.setVisible(false);
        } catch (NumberFormatException | NullPointerException e) {
            System.err.print(e.getMessage());
            ErrorConsulta.setVisible(true);
        }
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
                String tiempo = rs.getString(6);
                long horas, minutos, segundos;
                segundos = Long.parseLong(tiempo.substring(6));
                minutos = Long.parseLong(tiempo.substring(3, 5));
                horas = Long.parseLong(tiempo.substring(0, 2));
                ms = (horas * 60 * 60 * 1000) + (minutos * 60 * 1000) + (segundos * 1000);
                tiempoMS += ms;

                Historial.append(rs.getString(5) + "\t" + rs.getString(6) + "\n");
            }
            String nuevoTiempo = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(tiempoMS),
                    TimeUnit.MILLISECONDS.toMinutes(tiempoMS) % TimeUnit.HOURS.toMinutes(1),
                    TimeUnit.MILLISECONDS.toSeconds(tiempoMS) % TimeUnit.MINUTES.toSeconds(1));
            Horas_Totales.setText(nuevoTiempo);
        } catch (SQLException e) {
            System.err.print(e.getMessage());
            JOptionPane.showMessageDialog(new PopUp(), "Kabooooooooom", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ConsultarActionPerformed

    private void ConsultarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarFechaActionPerformed
        String fechaI = getFechaI();
        String fechaF = getFechaF();
        if (fechaI.isBlank() || fechaI.isEmpty()) {
            JOptionPane.showMessageDialog(new PopUp(), "Error en las fechas", "Estos campos deben de estar llenos", JOptionPane.WARNING_MESSAGE);
        }
        if (fechaF.isBlank() || fechaF.isEmpty()) {
            JOptionPane.showMessageDialog(new PopUp(), "Error en las fechas", "Estos campos deben de estar llenos", JOptionPane.WARNING_MESSAGE);
        }
        try {
            long ms, tiempoMS = 0;
            ResultSet rs;
            Statement stm;
            Connection conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            rs = stm.executeQuery("select * from horas where fecha>='" + fechaI + "' && fecha<='" + fechaF + "'");
            // select * from horas where fecha>='2019/10/15'&& fecha<='2019/10/18'
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
            JOptionPane.showMessageDialog(new PopUp(), "Kabooooooooom", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
            System.err.println(e.getMessage());
        }

    }//GEN-LAST:event_ConsultarFechaActionPerformed

    public long horasEx() {
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
            JOptionPane.showMessageDialog(new PopUp(), "Kabooooooooom", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
            System.err.println(e.getMessage());
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
            System.err.println(ex.getMessage());
        }
        return "";
    }

    public String hora() {
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            java.util.Date fecha = new java.util.Date();
            java.sql.Timestamp horaSQL = new java.sql.Timestamp(fecha.getTime());
            SimpleDateFormat horaFormato = new SimpleDateFormat("hh:mm:ss");
            String horaS = horaFormato.format(horaSQL);
            return horaS;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return "";

    }

    public class PopUp extends JFrame {

        public void Ventana() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setResizable(false);
            setSize(400, 300);
            getContentPane().setLayout(null);
        }
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
                R = !(id.isBlank() || id.isEmpty());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new PopUp(), "Kabooooooooom", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
            System.err.println(e.getMessage());
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
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new PopUp(), "Kabooooooooom", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
            System.err.println(e.getMessage());
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
                    JOptionPane.showMessageDialog(new PopUp(), "Kabooooooooom", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
                    System.err.println(e.getMessage());
                }
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(new PopUp(), "Kabooooom", "Algo salio mal", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void cls() {
        Nombre_Usuario.setText("");
        Correo_Usuario.setText("");
        Carrera_Usuario.setSelectedIndex(0);
        Usuario_Tipo.setSelectedIndex(0);
        FieldOP.setText("");
        ID_Usuario.setText("");
        Telefono_Usuario.setText("");
        ID_Entrada.setText("");
        Nombre_Entrada.setText("");
        Tipo_Entrada.setText("");
        Carrera_Entrada.setText("");
        Hora_Entrada.setText("");
        ID_Salida.setText("");
        Nombre_Salida.setText("");
        Tipo_Salida.setText("");
        Carrera_Salida.setText("");
        Hora_Salida.setText("");
        ID_Baja.setText("");
        Nombre_Baja.setText("");
        Correo_Baja.setText("");
        Carrera_Baja.setText("");
        Tipo_Baja.setText("");
        Telefono_Baja.setText("");
        ID_Consulta.setText("");
        Nombre_Consulta.setText("");
        Horas_Totales.setText("");
        Historial.setText("");
        Fecha_Inicial.setText("");
        Fecha_Final.setText("");
        Horas_Fecha.setText("");

    }

    public String getFechaI() {
        return Fecha_Inicial.getText();
    }

    public String getFechaF() {
        return Fecha_Final.getText();
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

    public long getIdUsuario() {
        return Long.parseLong(ID_Usuario.getText());
    }

    public long getTelefono() {
        return Long.parseLong(Telefono_Usuario.getText());
    }

    public long getIDEntrada() {
        return Long.parseLong(ID_Entrada.getText());
    }

    public long getIDBaja() {
        return Long.parseLong(ID_Baja.getText());
    }

    public long getIDSalida() {
        return Long.parseLong(ID_Salida.getText());
    }

    public long getIDConsulta() {
        return Long.parseLong(ID_Consulta.getText());
    }

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
        String Carrera = FieldOP.getText();
        try {
            long ID = Long.parseLong(ID_Usuario.getText());
        } catch (NumberFormatException | NullPointerException e) {
            ErrorID.setVisible(true);
        }
        try {
            long Telefono = Long.parseLong(Telefono_Usuario.getText());
        } catch (NumberFormatException | NullPointerException e) {
            ErrorTelefono.setVisible(true);
        }
        if (Nombre.isEmpty() || Nombre.isBlank()) {
            ErrorNombre.setVisible(true);
        }
        if (labelOP.isShowing()) {
            if (Carrera.isBlank() || Carrera.isEmpty()) {
                ErrorCarreraOP.setVisible(true);
                JOptionPane.showMessageDialog(new PopUp(), "Ingresa el nombre de la carrera", "Nueva Carrera", JOptionPane.WARNING_MESSAGE);
            }
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

    }

    public boolean verifica() {
        Valores();
        if (ErrorID.isShowing() || ErrorNombre.isShowing() || ErrorCarrera.isShowing() || ErrorTelefono.isShowing() || ErrorTipo.isShowing() || ErrorCarreraOP.isShowing()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contenedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alta;
    private javax.swing.JButton Baja;
    private javax.swing.JTextField Carrera_Baja;
    private javax.swing.JTextField Carrera_Entrada;
    private javax.swing.JTextField Carrera_Salida;
    private javax.swing.JComboBox<String> Carrera_Usuario;
    private javax.swing.JButton Consultar;
    private javax.swing.JButton ConsultarFecha;
    private javax.swing.JTextField Correo_Baja;
    private javax.swing.JTextField Correo_Usuario;
    private javax.swing.JButton Entrada;
    private javax.swing.JLabel ErrorBaja;
    private javax.swing.JLabel ErrorCarrera;
    private javax.swing.JLabel ErrorCarreraOP;
    private javax.swing.JLabel ErrorConsulta;
    private javax.swing.JLabel ErrorEntrada;
    private javax.swing.JLabel ErrorID;
    private javax.swing.JLabel ErrorNombre;
    private javax.swing.JLabel ErrorSalida;
    private javax.swing.JLabel ErrorTelefono;
    private javax.swing.JLabel ErrorTipo;
    private javax.swing.JTextField Fecha_Final;
    private javax.swing.JTextField Fecha_Inicial;
    private javax.swing.JTextField FieldOP;
    private javax.swing.JTextArea Historial;
    private javax.swing.JTextField Hora_Entrada;
    private javax.swing.JTextField Hora_Salida;
    private javax.swing.JTextField Horas_Fecha;
    private javax.swing.JTextField Horas_Totales;
    private javax.swing.JTextField ID_Baja;
    private javax.swing.JTextField ID_Consulta;
    private javax.swing.JTextField ID_Entrada;
    private javax.swing.JTextField ID_Salida;
    private javax.swing.JTextField ID_Usuario;
    private javax.swing.JLabel JLabel25;
    private javax.swing.JTextField Nombre_Baja;
    private javax.swing.JTextField Nombre_Consulta;
    private javax.swing.JTextField Nombre_Entrada;
    private javax.swing.JTextField Nombre_Salida;
    private javax.swing.JTextField Nombre_Usuario;
    private javax.swing.JButton Salida;
    private javax.swing.JTextField Telefono_Baja;
    private javax.swing.JTextField Telefono_Usuario;
    private javax.swing.JLabel Test;
    private javax.swing.JTextField Tipo_Baja;
    private javax.swing.JTextField Tipo_Entrada;
    private javax.swing.JTextField Tipo_Salida;
    private javax.swing.JComboBox<String> Usuario_Tipo;
    private javax.swing.JPanel fff;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel labelOP;
    // End of variables declaration//GEN-END:variables
}

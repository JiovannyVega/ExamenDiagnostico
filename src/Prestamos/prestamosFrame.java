package Prestamos;

import LogIn.Menu.Menu;
import java.awt.Color;
import javax.swing.ImageIcon;

public class prestamosFrame extends javax.swing.JFrame {
    /**
     * Creates new form materialFrame
     */
    public prestamosFrame() {
        //inicialización de componentes
        initComponents();
        
        
        
        // centra la ventana al medio (850, 450)
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top_panel = new javax.swing.JPanel();
        exit_button = new javax.swing.JLabel();
        minimize_button = new javax.swing.JLabel();
        left_panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Panel_Iniciar = new javax.swing.JPanel();
        Panel_Iniciar1 = new javax.swing.JPanel();
        Button_Login1 = new javax.swing.JLabel();
        return_button = new javax.swing.JLabel();
        tabbed_pane = new javax.swing.JTabbedPane();
        add_tab = new javax.swing.JPanel();
        fill_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Matricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Material = new javax.swing.JTextField();
        Cantidad = new javax.swing.JSpinner();
        btnSolicitar = new javax.swing.JButton();
        update_tab = new javax.swing.JPanel();
        fill_label1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        search_tab = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        materiales_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Material");
        setBackground(new java.awt.Color(62, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top_panel.setBackground(new java.awt.Color(62, 0, 0));
        top_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit_button.setBackground(new java.awt.Color(92, 0, 0));
        exit_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        exit_button.setForeground(new java.awt.Color(255, 255, 255));
        exit_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_button.setText("X");
        exit_button.setOpaque(true);
        exit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_buttonMouseExited(evt);
            }
        });
        top_panel.add(exit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, 20));

        minimize_button.setBackground(new java.awt.Color(92, 0, 0));
        minimize_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        minimize_button.setForeground(new java.awt.Color(255, 255, 255));
        minimize_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize_button.setText("-");
        minimize_button.setOpaque(true);
        minimize_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimize_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimize_buttonMouseExited(evt);
            }
        });
        top_panel.add(minimize_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 30, 20));

        getContentPane().add(top_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 20));

        left_panel.setBackground(new java.awt.Color(92, 0, 0));
        left_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ITSM_Logo_Oficial.png"))); // NOI18N
        left_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 170, 350, 110));

        Panel_Iniciar.setBackground(new java.awt.Color(51, 51, 51));
        Panel_Iniciar.setToolTipText("");
        Panel_Iniciar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Iniciar1.setBackground(new java.awt.Color(51, 51, 51));
        Panel_Iniciar1.setToolTipText("");
        Panel_Iniciar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Login1.setBackground(new java.awt.Color(51, 51, 51));
        Button_Login1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Login1.setForeground(new java.awt.Color(204, 204, 204));
        Button_Login1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Login1.setText("Iniciar sesión");
        Button_Login1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Button_Login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Login1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_Login1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_Login1MouseExited(evt);
            }
        });
        Panel_Iniciar1.add(Button_Login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 270, 40));

        Panel_Iniciar.add(Panel_Iniciar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 270, 40));

        left_panel.add(Panel_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 270, 40));

        return_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-izquierda50x50.png"))); // NOI18N
        return_button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        return_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                return_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                return_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                return_buttonMouseExited(evt);
            }
        });
        left_panel.add(return_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        getContentPane().add(left_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 320, 430));

        tabbed_pane.setBackground(new java.awt.Color(171, 0, 51));
        tabbed_pane.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabbed_pane.setOpaque(true);

        add_tab.setBackground(new java.awt.Color(255, 255, 255));
        add_tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fill_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fill_label.setText("Rellena los campos para solicitar un prestamo");
        add_tab.add(fill_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre del Alumno");
        add_tab.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        Nombre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(171, 0, 51));
        Nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(188, 149, 92)));
        add_tab.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 135, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Matricula");
        add_tab.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        Matricula.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Matricula.setForeground(new java.awt.Color(171, 0, 51));
        Matricula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(188, 149, 92)));
        add_tab.add(Matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 135, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Fecha");
        add_tab.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        Fecha.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Fecha.setForeground(new java.awt.Color(171, 0, 51));
        Fecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(188, 149, 92)));
        add_tab.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 135, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad");
        add_tab.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nombre del material");
        add_tab.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        Material.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Material.setForeground(new java.awt.Color(171, 0, 51));
        Material.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(188, 149, 92)));
        add_tab.add(Material, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 135, -1));
        add_tab.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, -1));

        btnSolicitar.setText("Solicitar");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });
        add_tab.add(btnSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        tabbed_pane.addTab("Prestamos", add_tab);

        update_tab.setBackground(new java.awt.Color(255, 255, 255));
        update_tab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        fill_label1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fill_label1.setText("Registrar ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Nombre");

        jTextField8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(171, 0, 51));
        jTextField8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(188, 149, 92)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Matricula");

        jTextField9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(171, 0, 51));
        jTextField9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(188, 149, 92)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Número de prestamo");

        jTextField10.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(171, 0, 51));
        jTextField10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(188, 149, 92)));

        jLabel12.setText("Fecha de inicio");

        jLabel13.setText("Fecha de fin");

        javax.swing.GroupLayout update_tabLayout = new javax.swing.GroupLayout(update_tab);
        update_tab.setLayout(update_tabLayout);
        update_tabLayout.setHorizontalGroup(
            update_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_tabLayout.createSequentialGroup()
                .addGroup(update_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(update_tabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fill_label1))
                    .addGroup(update_tabLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(update_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(update_tabLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(update_tabLayout.createSequentialGroup()
                                .addGroup(update_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 246, Short.MAX_VALUE))
                            .addGroup(update_tabLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(11, 11, 11)))))
                .addGap(93, 93, 93))
        );
        update_tabLayout.setVerticalGroup(
            update_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_tabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fill_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(update_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addGap(0, 0, 0)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(update_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(0, 0, 0)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addGap(0, 0, 0)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        tabbed_pane.addTab("Registrar", update_tab);

        search_tab.setBackground(new java.awt.Color(255, 255, 255));

        jTextField11.setBackground(new java.awt.Color(255, 255, 255));
        jTextField11.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(171, 0, 51));
        jTextField11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(188, 149, 92)));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero de Prestamo", "Matricula", "Nombre", "Fecha de inicio", "Fecha de fin", "Material", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Presente", "Ausente"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout search_tabLayout = new javax.swing.GroupLayout(search_tab);
        search_tab.setLayout(search_tabLayout);
        search_tabLayout.setHorizontalGroup(
            search_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_tabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(search_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addComponent(jTextField11))
                .addGroup(search_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(search_tabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(search_tabLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton2)))
                .addGap(134, 134, 134)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        search_tabLayout.setVerticalGroup(
            search_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_tabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(search_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(search_tabLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(search_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11)
                            .addComponent(jButton2)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbed_pane.addTab("Historial", search_tab);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(171, 0, 51));
        jTextField12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(188, 149, 92)));

        jButton3.setText("Buscar");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextField13.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(171, 0, 51));
        jTextField13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(188, 149, 92)));

        jButton4.setText("Buscar");

        jTable3.setBackground(new java.awt.Color(255, 255, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Presente", "Ausente"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setBackground(new java.awt.Color(255, 255, 255));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero de Prestamo", "Matricula", "Nombre", "Fecha de inicio", "Fecha de fin", "Material", "Cantidad"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton4)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12)
                    .addComponent(jButton3))
                .addGap(369, 369, 369))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabbed_pane.addTab("Activos", jPanel1);

        getContentPane().add(tabbed_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 530, 370));

        materiales_label.setBackground(new java.awt.Color(92, 0, 0));
        materiales_label.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        materiales_label.setForeground(new java.awt.Color(255, 255, 255));
        materiales_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materiales_label.setText("Prestamos");
        getContentPane().add(materiales_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 20, 540, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_buttonMouseClicked
        // método que permite cerrar el sistema cuando se hace click en el
        // botón de salir
        System.exit(0);
    }//GEN-LAST:event_exit_buttonMouseClicked

    private void exit_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_buttonMouseEntered
        // método que cambia el fondo del botón cuando el usuario pasa el cursor
        exit_button.setBackground(new Color(62,0,0));
    }//GEN-LAST:event_exit_buttonMouseEntered

    private void exit_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_buttonMouseExited
        // método que cambia el fondo del botón cuando el usuario quita el 
        // cursor
        exit_button.setBackground(new Color(92,0,0));
    }//GEN-LAST:event_exit_buttonMouseExited

    private void minimize_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_buttonMouseClicked
        // método que minimiza la ventana del sistema
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimize_buttonMouseClicked

    private void minimize_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_buttonMouseEntered
        // método que cambia el fondo del botón cuando el usuario pasa el cursor
        minimize_button.setBackground(new Color(62,0,0));
    }//GEN-LAST:event_minimize_buttonMouseEntered

    private void minimize_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_buttonMouseExited
        // método que cambia el fondo del botón cuando el usuario quita el 
        // cursor
        minimize_button.setBackground(new Color(92,0,0));
    }//GEN-LAST:event_minimize_buttonMouseExited

    private void Button_Login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Login1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Login1MouseClicked

    private void Button_Login1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Login1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Login1MouseEntered

    private void Button_Login1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Login1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Login1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void return_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_buttonMouseClicked

        LogIn.Menu.Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_return_buttonMouseClicked

    private void return_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_buttonMouseEntered
        // Método que cambia el icono del label cuando el cursor entra
        String iconFileName = return_button.getIcon().toString();
        String fileName = iconFileName.substring(iconFileName.lastIndexOf("/") + 1);
        if ("flecha-izquierda50x50.png".equals(fileName)) {
            return_button.setIcon(new ImageIcon(getClass().getResource("/Imagenes/iflecha-izquierda50x50.png")));
        }
    }//GEN-LAST:event_return_buttonMouseEntered

    private void return_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_buttonMouseExited
        // Método que cambia el icono del label cuando el cursor sale
        String iconFileName = return_button.getIcon().toString();
        String fileName = iconFileName.substring(iconFileName.lastIndexOf("/") + 1);
        if ("iflecha-izquierda50x50.png".equals(fileName)) {
            return_button.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha-izquierda50x50.png")));
        }
    }//GEN-LAST:event_return_buttonMouseExited

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button_Login1;
    private javax.swing.JSpinner Cantidad;
    private javax.swing.JTextField Fecha;
    private javax.swing.JTextField Material;
    private javax.swing.JTextField Matricula;
    private javax.swing.JTextField Nombre;
    private javax.swing.JPanel Panel_Iniciar;
    private javax.swing.JPanel Panel_Iniciar1;
    private javax.swing.JPanel add_tab;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JLabel exit_button;
    private javax.swing.JLabel fill_label;
    private javax.swing.JLabel fill_label1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel left_panel;
    private javax.swing.JLabel materiales_label;
    private javax.swing.JLabel minimize_button;
    private javax.swing.JLabel return_button;
    private javax.swing.JPanel search_tab;
    private javax.swing.JTabbedPane tabbed_pane;
    private javax.swing.JPanel top_panel;
    private javax.swing.JPanel update_tab;
    // End of variables declaration//GEN-END:variables
}

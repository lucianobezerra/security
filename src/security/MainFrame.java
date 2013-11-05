package security;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainFrame extends javax.swing.JFrame {

  public MainFrame() {
    initComponents();
    date1ComboBox.setSelectedItem(Utilities.dateToString(new Date()));
    date2ComboBox.setSelectedItem(Utilities.dateToString(new Date()));
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cryptedField = new javax.swing.JTextField();
        btCopiarSenha = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        date1ComboBox = new CalendarComboBox(true);
        jLabel5 = new javax.swing.JLabel();
        date2ComboBox = new CalendarComboBox(true);
        jLabel6 = new javax.swing.JLabel();
        licenceField = new javax.swing.JTextField();
        btGerarLicenca = new javax.swing.JButton();
        btCopiarChave = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        systemCombobox = new javax.swing.JComboBox();
        jToolBar1 = new javax.swing.JToolBar();
        btFechar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerador de Licença");
        setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Senha:");

        jButton2.setText("Criptografar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Senha Criptografada Gerada:");

        cryptedField.setEditable(false);

        btCopiarSenha.setText("Copiar Texto");
        btCopiarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCopiarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cryptedField, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(btCopiarSenha))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cryptedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCopiarSenha)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Senhas", jPanel1);

        jPanel2.setFont(jPanel2.getFont());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Ultima Utilização do Sistema:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, -1));

        date1ComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        date1ComboBox.setMaximumSize(new java.awt.Dimension(23, 18));
        date1ComboBox.setPreferredSize(new java.awt.Dimension(23, 18));
        date1ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date1ComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(date1ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 10, 230, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Próxima Validade:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, -1, -1));

        date2ComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        date2ComboBox.setMaximumSize(new java.awt.Dimension(23, 18));
        date2ComboBox.setPreferredSize(new java.awt.Dimension(23, 18));
        date2ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date2ComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(date2ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 40, 230, -1));

        jLabel6.setText("Código gerado:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        licenceField.setEditable(false);
        jPanel2.add(licenceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 426, -1));

        btGerarLicenca.setText("Gerar Licença");
        btGerarLicenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarLicencaActionPerformed(evt);
            }
        });
        jPanel2.add(btGerarLicenca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        btCopiarChave.setText("Copiar Texto");
        btCopiarChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCopiarChaveActionPerformed(evt);
            }
        });
        jPanel2.add(btCopiarChave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setText("Sistema:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, -1, -1));

        systemCombobox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        systemCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Presia", "Sgf" }));
        systemCombobox.setMaximumSize(new java.awt.Dimension(23, 18));
        systemCombobox.setMinimumSize(new java.awt.Dimension(23, 18));
        systemCombobox.setPreferredSize(new java.awt.Dimension(23, 18));
        jPanel2.add(systemCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 70, 230, -1));

        jTabbedPane1.addTab("Licenças", jPanel2);

        jToolBar1.setFloatable(false);

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/window-remove-16x16.png"))); // NOI18N
        btFechar.setMnemonic('F');
        btFechar.setText("Fechar");
        btFechar.setMaximumSize(new java.awt.Dimension(80, 40));
        btFechar.setMinimumSize(new java.awt.Dimension(80, 40));
        btFechar.setPreferredSize(new java.awt.Dimension(80, 40));
        btFechar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String x = passwordField.getText();
      if (!x.isEmpty()) {
        cryptedField.setText(Criptografia.criptografar(x));
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btGerarLicencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarLicencaActionPerformed
      Date d1 = Utilities.getFormatedDate((String) date1ComboBox.getSelectedItem());
      Date d2 = Utilities.getFormatedDate((String) date2ComboBox.getSelectedItem());
      SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
      int sistema = systemCombobox.getSelectedIndex();
      String getSistema = null;
      switch(sistema){
        case 0: getSistema = "0000"; break; // Nada Selecionado
        case 1: getSistema = "189x"; break; // Presia
        case 2: getSistema = "981z"; break; // Sgf
      }
      String x = getSistema + "1234567890" + sdf.format(d1) + "1234567890" + sdf.format(d2) + "12345678890"; 
      licenceField.setText(Criptografia.CriptaBase64(x));
    }//GEN-LAST:event_btGerarLicencaActionPerformed

    private void btCopiarChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCopiarChaveActionPerformed
      if (!licenceField.getText().isEmpty()) {
        Clipboard clipBoard;
        clipBoard = getToolkit().getSystemClipboard();
        StringSelection ss = new StringSelection(licenceField.getText());
        clipBoard.setContents(ss, ss);
      }
    }//GEN-LAST:event_btCopiarChaveActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
      System.exit(0);
    }//GEN-LAST:event_btFecharActionPerformed

    private void btCopiarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCopiarSenhaActionPerformed
      if (!cryptedField.getText().isEmpty()) {
        Clipboard clipBoard;
        clipBoard = getToolkit().getSystemClipboard();
        StringSelection ss = new StringSelection(cryptedField.getText());
        clipBoard.setContents(ss, ss);
      }
    }//GEN-LAST:event_btCopiarSenhaActionPerformed

    private void date1ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date1ComboBoxActionPerformed
      // TODO add your handling code here:
      licenceField.setText("");
    }//GEN-LAST:event_date1ComboBoxActionPerformed

    private void date2ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date2ComboBoxActionPerformed
      licenceField.setText("");
    }//GEN-LAST:event_date2ComboBoxActionPerformed
  /**
   * @param args the command line arguments
   */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCopiarChave;
    private javax.swing.JButton btCopiarSenha;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btGerarLicenca;
    private javax.swing.JTextField cryptedField;
    private javax.swing.JComboBox date1ComboBox;
    private javax.swing.JComboBox date2ComboBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField licenceField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JComboBox systemCombobox;
    // End of variables declaration//GEN-END:variables
}

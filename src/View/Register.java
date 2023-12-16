package View;
import Controller.RegisterController;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    public JTextField getTextFieldAlamat() {
        return TextFieldAlamat;
    }

    public void setTextFieldAlamat(JTextField TextFieldAlamat) {
        this.TextFieldAlamat = TextFieldAlamat;
    }

    public JTextField getTextFieldNama() {
        return TextFieldNama;
    }

    public void setTextFieldNama(JTextField TextFieldNama) {
        this.TextFieldNama = TextFieldNama;
    }

    public JTextField getTextFieldUsername() {
        return TextFieldUsername;
    }

    public void setTextFieldUsername(JTextField TextFieldUsername) {
        this.TextFieldUsername = TextFieldUsername;
    }

    public JTextField getTextFieldnoTelp() {
        return TextFieldnoTelp;
    }

    public void setTextFieldnoTelp(JTextField TextFieldnoTelp) {
        this.TextFieldnoTelp = TextFieldnoTelp;
    }

    public JRadioButton getButtonCewe() {
        return buttonCewe;
    }

    public void setButtonCewe(JRadioButton buttonCewe) {
        this.buttonCewe = buttonCewe;
    }

    public JRadioButton getButtonCowo() {
        return buttonCowo;
    }

    public void setButtonCowo(JRadioButton buttonCowo) {
        this.buttonCowo = buttonCowo;
    }

    public JButton getButtonSimpan() {
        return buttonSimpan;
    }

    public void setButtonSimpan(JButton buttonSimpan) {
        this.buttonSimpan = buttonSimpan;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupKelamin = new javax.swing.ButtonGroup();
        Background = new javax.swing.JPanel();
        LabelRegister = new javax.swing.JLabel();
        BGDataAdmin = new javax.swing.JPanel();
        LabelDataAdmin = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        LabelAlamat = new javax.swing.JLabel();
        LabelnoTelp = new javax.swing.JLabel();
        TextFieldAlamat = new javax.swing.JTextField();
        TextFieldNama = new javax.swing.JTextField();
        TextFieldnoTelp = new javax.swing.JTextField();
        LabelKelamin = new javax.swing.JLabel();
        buttonCowo = new javax.swing.JRadioButton();
        buttonCewe = new javax.swing.JRadioButton();
        LabelUsername = new javax.swing.JLabel();
        TextFieldUsername = new javax.swing.JTextField();
        LabelPassword = new javax.swing.JLabel();
        TextFieldPassword = new javax.swing.JTextField();
        buttonSimpan = new javax.swing.JButton();
        namaEmpty = new javax.swing.JLabel();
        alamatEmpty = new javax.swing.JLabel();
        noTelpEmpty = new javax.swing.JLabel();
        jenisKelaminEmpty = new javax.swing.JLabel();
        usernameEmpty = new javax.swing.JLabel();
        passwordEmpty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(0, 0, 0));

        LabelRegister.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        LabelRegister.setForeground(new java.awt.Color(255, 255, 255));
        LabelRegister.setText("Register Admin");

        BGDataAdmin.setBackground(new java.awt.Color(23, 23, 23));

        LabelDataAdmin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        LabelDataAdmin.setForeground(new java.awt.Color(255, 255, 255));
        LabelDataAdmin.setText("Data Admin");

        LabelNama.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelNama.setForeground(new java.awt.Color(255, 255, 255));
        LabelNama.setText("Nama");

        LabelAlamat.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelAlamat.setForeground(new java.awt.Color(255, 255, 255));
        LabelAlamat.setText("Alamat");

        LabelnoTelp.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelnoTelp.setForeground(new java.awt.Color(255, 255, 255));
        LabelnoTelp.setText("no. Telp");

        TextFieldAlamat.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldAlamat.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAlamatActionPerformed(evt);
            }
        });

        TextFieldNama.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldNama.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNamaActionPerformed(evt);
            }
        });

        TextFieldnoTelp.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldnoTelp.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldnoTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldnoTelpActionPerformed(evt);
            }
        });

        LabelKelamin.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelKelamin.setForeground(new java.awt.Color(255, 255, 255));
        LabelKelamin.setText("Jenis Kelamin");

        buttonCowo.setBackground(new java.awt.Color(23, 23, 23));
        groupKelamin.add(buttonCowo);
        buttonCowo.setForeground(new java.awt.Color(255, 255, 255));
        buttonCowo.setText("Laki-Laki");

        buttonCewe.setBackground(new java.awt.Color(23, 23, 23));
        groupKelamin.add(buttonCewe);
        buttonCewe.setForeground(new java.awt.Color(255, 255, 255));
        buttonCewe.setText("Perempuan");

        LabelUsername.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelUsername.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsername.setText("Username");

        TextFieldUsername.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldUsername.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldUsernameActionPerformed(evt);
            }
        });

        LabelPassword.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        LabelPassword.setText("Password");

        TextFieldPassword.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldPassword.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPasswordActionPerformed(evt);
            }
        });

        buttonSimpan.setBackground(new java.awt.Color(48, 48, 48));
        buttonSimpan.setText("Simpan");
        buttonSimpan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        namaEmpty.setBackground(new java.awt.Color(255, 255, 255));
        namaEmpty.setForeground(new java.awt.Color(255, 255, 255));

        alamatEmpty.setBackground(new java.awt.Color(255, 255, 255));
        alamatEmpty.setForeground(new java.awt.Color(255, 255, 255));

        noTelpEmpty.setBackground(new java.awt.Color(255, 255, 255));
        noTelpEmpty.setForeground(new java.awt.Color(255, 255, 255));

        jenisKelaminEmpty.setBackground(new java.awt.Color(255, 255, 255));
        jenisKelaminEmpty.setForeground(new java.awt.Color(255, 255, 255));

        usernameEmpty.setBackground(new java.awt.Color(255, 255, 255));
        usernameEmpty.setForeground(new java.awt.Color(255, 255, 255));

        passwordEmpty.setBackground(new java.awt.Color(255, 255, 255));
        passwordEmpty.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BGDataAdminLayout = new javax.swing.GroupLayout(BGDataAdmin);
        BGDataAdmin.setLayout(BGDataAdminLayout);
        BGDataAdminLayout.setHorizontalGroup(
            BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGDataAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGDataAdminLayout.createSequentialGroup()
                        .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelDataAdmin)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGDataAdminLayout.createSequentialGroup()
                                .addComponent(LabelNama)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaEmpty)
                                    .addComponent(TextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGDataAdminLayout.createSequentialGroup()
                                .addComponent(LabelAlamat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alamatEmpty)
                                    .addComponent(TextFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGDataAdminLayout.createSequentialGroup()
                                .addComponent(LabelnoTelp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noTelpEmpty)
                                    .addComponent(TextFieldnoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(BGDataAdminLayout.createSequentialGroup()
                                .addComponent(LabelKelamin)
                                .addGap(18, 18, 18)
                                .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jenisKelaminEmpty)
                                    .addGroup(BGDataAdminLayout.createSequentialGroup()
                                        .addComponent(buttonCowo)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonCewe)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGDataAdminLayout.createSequentialGroup()
                        .addComponent(LabelUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameEmpty)
                            .addComponent(TextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGDataAdminLayout.createSequentialGroup()
                        .addComponent(LabelPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordEmpty)
                            .addComponent(TextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(BGDataAdminLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BGDataAdminLayout.setVerticalGroup(
            BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGDataAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDataAdmin)
                .addGap(18, 18, 18)
                .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNama)
                    .addComponent(TextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(namaEmpty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAlamat)
                    .addComponent(TextFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(alamatEmpty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelnoTelp)
                    .addComponent(TextFieldnoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noTelpEmpty)
                .addGap(9, 9, 9)
                .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelKelamin)
                    .addComponent(buttonCowo)
                    .addComponent(buttonCewe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenisKelaminEmpty)
                .addGap(13, 13, 13)
                .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsername)
                    .addComponent(TextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(usernameEmpty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BGDataAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPassword)
                    .addComponent(TextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(passwordEmpty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(BGDataAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(LabelRegister)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(LabelRegister)
                .addGap(18, 18, 18)
                .addComponent(BGDataAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAlamatActionPerformed

    private void TextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNamaActionPerformed

    private void TextFieldnoTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldnoTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldnoTelpActionPerformed

    private void TextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldUsernameActionPerformed

    private void TextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPasswordActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        String nama = TextFieldNama.getText();
        String alamat = TextFieldAlamat.getText();
        String notelp = TextFieldnoTelp.getText();
        
        String jeniskelamin = "";
        try {
            if (groupKelamin.getSelection().equals(buttonCowo.getModel())) {
                jeniskelamin = "Laki-Laki";
            } else if (groupKelamin.getSelection().equals(buttonCewe.getModel())) {
                jeniskelamin = "Perempuan";
            }
        } catch (NullPointerException e) {
            jenisKelaminEmpty.setText("Please select one of two");
        }
        if (!jeniskelamin.equals("")){
            jenisKelaminEmpty.setText("");
        }
        
        String username = TextFieldUsername.getText();
        String password = TextFieldPassword.getText();
        RegisterController registerController = new RegisterController();
        int idAdmin = registerController.getNextIdAdmin();
        int idPerson = registerController.getNextIdPerson();
        if (nama.equals("")){
            namaEmpty.setText("This field is required");
        }else if(!nama.equals("")){
            namaEmpty.setText("");
        }
        if (alamat.equals("")){
            alamatEmpty.setText("This field is required");
        }else if (!alamat.equals("")){
            alamatEmpty.setText("");
        }
        if (notelp.equals("")){
            noTelpEmpty.setText("This field is required");
        }else if (!notelp.equals("")){
            noTelpEmpty.setText("");
        }

        if(password.equals("")){
            passwordEmpty.setText("This field is required");
        }else if (!password.equals("")){
            passwordEmpty.setText("");
        }
        if(username.equals("")){
            usernameEmpty.setText("This field is required");
        }else if (!username.equals("")){
            usernameEmpty.setText("");
        }
        if(registerController.usernameTaken(username)){
            usernameEmpty.setText("");
            JOptionPane.showMessageDialog(null, "Username Already Taken");
        }else if (!nama.equals("")&&!alamat.equals("")&&!notelp.equals("")&&!jeniskelamin.equals("")&&!password.equals("")&&!username.equals("")){
            try {
                registerController.insertAdmin(idAdmin,username,password);
                registerController.insertPerson(idPerson, nama, alamat, notelp, jeniskelamin, idAdmin);
                setVisible(false);
                Login login = new Login();
                login.setVisible(true);
                JOptionPane.showMessageDialog(null, "Registration Successful");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Registration Unsuccessfull");
            }
        }
        
    }//GEN-LAST:event_buttonSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGDataAdmin;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel LabelAlamat;
    private javax.swing.JLabel LabelDataAdmin;
    private javax.swing.JLabel LabelKelamin;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelRegister;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JLabel LabelnoTelp;
    private javax.swing.JTextField TextFieldAlamat;
    private javax.swing.JTextField TextFieldNama;
    private javax.swing.JTextField TextFieldPassword;
    private javax.swing.JTextField TextFieldUsername;
    private javax.swing.JTextField TextFieldnoTelp;
    private javax.swing.JLabel alamatEmpty;
    private javax.swing.JRadioButton buttonCewe;
    private javax.swing.JRadioButton buttonCowo;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.ButtonGroup groupKelamin;
    private javax.swing.JLabel jenisKelaminEmpty;
    private javax.swing.JLabel namaEmpty;
    private javax.swing.JLabel noTelpEmpty;
    private javax.swing.JLabel passwordEmpty;
    private javax.swing.JLabel usernameEmpty;
    // End of variables declaration//GEN-END:variables
}

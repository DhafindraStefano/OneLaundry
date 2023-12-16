package View;


import Controller.ItemController;
import Controller.TransactionController;
import Model.ModelCustomer;
import Model.ModelTransaksi;
import java.util.ArrayList;
import javax.swing.JOptionPane;


import Controller.CustomerController;
import Model.ModelItem;
public class TambahTransaksi extends javax.swing.JFrame {

    /**
     * Creates new form TambahTransaksi
     */
    public TambahTransaksi() {
        initComponents();
        TextFieldBerat.setText("0");
        
        cbID.removeAllItems();
        ArrayList<ModelCustomer> listCustomer;
        CustomerController customerController = new CustomerController();
        listCustomer = customerController.getCustomerData();
        ArrayList<ModelCustomer> listCustomerSesuaiAdmin;
        listCustomerSesuaiAdmin = customerController.getCustomerDataSesuaiAdmin(listCustomer, Login.adminId);
        for(ModelCustomer customer : listCustomerSesuaiAdmin){
            int idCustomer =  customer.getIdCustomer();
            String idCustomerStr = ""+idCustomer;
            cbID.addItem(idCustomerStr);
        }
        
        cbItem.removeAllItems();
        ItemController itemController = new ItemController();
        ArrayList<ModelItem> listItems;
        listItems = itemController.getItemData();
        String items=""; 
        for(ModelItem item : listItems){
            items = item.getItem();
            cbItem.addItem(items);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupLayanan = new javax.swing.ButtonGroup();
        groupStatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        LabelTambahDataTransaksi = new javax.swing.JLabel();
        LabelIDPelanggan1 = new javax.swing.JLabel();
        LabelJenisLayanan = new javax.swing.JLabel();
        LabelStatus = new javax.swing.JLabel();
        LabelTgl = new javax.swing.JLabel();
        LabelJenisLayanan2 = new javax.swing.JLabel();
        buttonSimpan = new javax.swing.JButton();
        buttonKembali = new javax.swing.JButton();
        buttonSelesai = new javax.swing.JRadioButton();
        buttonBelumSelesai = new javax.swing.JRadioButton();
        labelDate = new javax.swing.JLabel();
        TextFieldJenisLayanan = new javax.swing.JTextField();
        TextFieldTanggal = new javax.swing.JTextField();
        LabelJenisLayanan4 = new javax.swing.JLabel();
        LabelJenisLayanan5 = new javax.swing.JLabel();
        TextFieldBerat = new javax.swing.JTextField();
        LabelJenisLayanan6 = new javax.swing.JLabel();
        LabelTotalHarga = new javax.swing.JLabel();
        cbID = new javax.swing.JComboBox<>();
        cbItem = new javax.swing.JComboBox<>();
        HargaPerKg = new javax.swing.JLabel();
        layananEmpty = new javax.swing.JLabel();
        statusEmpty = new javax.swing.JLabel();
        tglEmpty = new javax.swing.JLabel();
        beratEmpty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel6.setBackground(new java.awt.Color(23, 23, 23));

        LabelTambahDataTransaksi.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        LabelTambahDataTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        LabelTambahDataTransaksi.setText("Tambah Data Transaksi");

        LabelIDPelanggan1.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelIDPelanggan1.setForeground(new java.awt.Color(255, 255, 255));
        LabelIDPelanggan1.setText("ID Pelanggan");

        LabelJenisLayanan.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelJenisLayanan.setForeground(new java.awt.Color(255, 255, 255));
        LabelJenisLayanan.setText("Jenis Layanan");

        LabelStatus.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelStatus.setForeground(new java.awt.Color(255, 255, 255));
        LabelStatus.setText("Status Pencucian");

        LabelTgl.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelTgl.setForeground(new java.awt.Color(255, 255, 255));
        LabelTgl.setText("Tanggal");

        LabelJenisLayanan2.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelJenisLayanan2.setForeground(new java.awt.Color(255, 255, 255));
        LabelJenisLayanan2.setText("Item");

        buttonSimpan.setBackground(new java.awt.Color(48, 48, 48));
        buttonSimpan.setForeground(new java.awt.Color(255, 255, 255));
        buttonSimpan.setText("Simpan");
        buttonSimpan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonKembali.setBackground(new java.awt.Color(48, 48, 48));
        buttonKembali.setForeground(new java.awt.Color(255, 255, 255));
        buttonKembali.setText("Kembali");
        buttonKembali.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembaliActionPerformed(evt);
            }
        });

        buttonSelesai.setBackground(new java.awt.Color(23, 23, 23));
        groupStatus.add(buttonSelesai);
        buttonSelesai.setForeground(new java.awt.Color(255, 255, 255));
        buttonSelesai.setText("Selesai");

        buttonBelumSelesai.setBackground(new java.awt.Color(23, 23, 23));
        groupStatus.add(buttonBelumSelesai);
        buttonBelumSelesai.setForeground(new java.awt.Color(255, 255, 255));
        buttonBelumSelesai.setText("Belum Selesai");

        labelDate.setBackground(new java.awt.Color(255, 255, 255));
        labelDate.setForeground(new java.awt.Color(255, 255, 255));
        labelDate.setText("YYYY-MM-DD");

        TextFieldJenisLayanan.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldJenisLayanan.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldJenisLayanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldJenisLayananActionPerformed(evt);
            }
        });

        TextFieldTanggal.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldTanggal.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTanggalActionPerformed(evt);
            }
        });

        LabelJenisLayanan4.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelJenisLayanan4.setForeground(new java.awt.Color(255, 255, 255));
        LabelJenisLayanan4.setText("Harga per Kg:");

        LabelJenisLayanan5.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelJenisLayanan5.setForeground(new java.awt.Color(255, 255, 255));
        LabelJenisLayanan5.setText("Berat (Kg)");

        TextFieldBerat.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldBerat.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldBeratActionPerformed(evt);
            }
        });

        LabelJenisLayanan6.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelJenisLayanan6.setForeground(new java.awt.Color(255, 255, 255));
        LabelJenisLayanan6.setText("Total Harga:");

        LabelTotalHarga.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelTotalHarga.setForeground(new java.awt.Color(255, 255, 255));

        cbID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIDActionPerformed(evt);
            }
        });

        cbItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbItemActionPerformed(evt);
            }
        });

        HargaPerKg.setBackground(new java.awt.Color(255, 255, 255));
        HargaPerKg.setForeground(new java.awt.Color(255, 255, 255));

        layananEmpty.setForeground(new java.awt.Color(255, 255, 255));

        statusEmpty.setForeground(new java.awt.Color(255, 255, 255));

        tglEmpty.setForeground(new java.awt.Color(255, 255, 255));

        beratEmpty.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelJenisLayanan6)
                            .addComponent(LabelJenisLayanan5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelTotalHarga)
                            .addComponent(beratEmpty)))
                    .addComponent(LabelTambahDataTransaksi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelStatus)
                            .addComponent(LabelTgl))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(buttonSelesai)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonBelumSelesai))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(statusEmpty)
                                            .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(57, 57, 57))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(buttonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(LabelJenisLayanan4)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(LabelJenisLayanan2)
                                .addGap(77, 77, 77)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglEmpty)
                            .addComponent(HargaPerKg)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelJenisLayanan)
                            .addComponent(LabelIDPelanggan1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextFieldJenisLayanan, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(cbID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(layananEmpty))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTambahDataTransaksi)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelIDPelanggan1)
                    .addComponent(cbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelJenisLayanan)
                    .addComponent(TextFieldJenisLayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layananEmpty)
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonSelesai)
                        .addComponent(buttonBelumSelesai))
                    .addComponent(LabelStatus))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTgl)
                            .addComponent(TextFieldTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(statusEmpty)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDate)
                .addGap(5, 5, 5)
                .addComponent(tglEmpty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelJenisLayanan2)
                    .addComponent(cbItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelJenisLayanan4)
                    .addComponent(HargaPerKg))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelJenisLayanan5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beratEmpty)
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelJenisLayanan6)
                    .addComponent(LabelTotalHarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembaliActionPerformed
        // TODO add your handling code here:
        Home H = new Home();
        setVisible(false);
        H.setVisible(true);
    }//GEN-LAST:event_buttonKembaliActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        Object selectedValueCustomerId = cbID.getSelectedItem();
        String TFidPelanggan = selectedValueCustomerId.toString();
        
        int idPelanggan = Integer.parseInt(TFidPelanggan);
        
        //jenisLayanan
        String jenisLayanan = TextFieldJenisLayanan.getText();
        if(jenisLayanan.equals("")){
            layananEmpty.setText("perlu diisi");
        }else if(!jenisLayanan.equals("")){
            layananEmpty.setText("");
        }
        
        //status pencucian
        String statusPencucian = "";
        try {
            if (groupStatus.getSelection().equals(buttonSelesai.getModel())) {
                statusPencucian = "Selesai";
            } else if (groupStatus.getSelection().equals(buttonBelumSelesai.getModel())) {
                statusPencucian = "Belum Selesai";
            }
        } catch (NullPointerException e) {
            statusEmpty.setText("pilih salah satu");
        }
        if (!statusPencucian.equals("")){
            statusEmpty.setText("");
        }
        
        //tgl
        String tgl = TextFieldTanggal.getText();
        if(tgl.equals("")){
            tglEmpty.setText("perlu diisi");
        }else if(!tgl.equals("")){
            tglEmpty.setText("");
        }
        
        //berat
        String TFHargaPerKg = HargaPerKg.getText();
        int HargaPerKg = Integer.parseInt(TFHargaPerKg);
        String TFBerat = TextFieldBerat.getText();
        float berat = Float.parseFloat(TFBerat);
        if(berat == 0){
            beratEmpty.setText("tidak boleh 0");
        }else if(berat != 0){
            beratEmpty.setText("");
        }
        
        ModelTransaksi modelTransaksi = new ModelTransaksi();
        float totalF = modelTransaksi.HitungHarga(HargaPerKg, berat);
        String total = Float.toString(totalF);
        LabelTotalHarga.setText(total);

        
        ItemController itemController = new ItemController();
        Object SelectedValueItem = cbItem.getSelectedItem();
        String itemName = SelectedValueItem.toString();
        int idItem = itemController.getIdItem(itemName);
        
        TransactionController transactionController = new TransactionController();
        int idTransaksi = transactionController.getNextIdTransaksi();
        String noTransaksi = "T"+idTransaksi;
        
        String beratString = berat+" Kg";
        
        if(!jenisLayanan.equals("")&&!statusPencucian.equals("")&&!tgl.equals("")
                &&berat != 0){
            try{
                transactionController.insertTransaksi(idTransaksi, noTransaksi, jenisLayanan, statusPencucian, totalF, idPelanggan, idItem,Login.adminId, beratString, tgl);
                JOptionPane.showMessageDialog(null, "Berhasil Menambah Transaksi");
                Home H = new Home();
                setVisible(false);
                H.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal Menambah Transaksi");
            }
        }
        
//        if(transactionController.adaTransaksi(idTransaksi)){
//            JOptionPane.showMessageDialog(null, "Berhasil Menambah Transaksi");
//        }else{
//            JOptionPane.showMessageDialog(null, "Gagal Menambah Transaksi");
//        }
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void TextFieldJenisLayananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldJenisLayananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldJenisLayananActionPerformed

    private void TextFieldTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldTanggalActionPerformed

    private void TextFieldBeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldBeratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldBeratActionPerformed

    private void cbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIDActionPerformed

    private void cbItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbItemActionPerformed
        // TODO add your handling code here:
        if (cbItem != null && cbItem.getSelectedItem() != null) {
            Object selectedItem = cbItem.getSelectedItem();
            String item = selectedItem.toString();
            ItemController itemController = new ItemController();
            int hargaPerKgInt = itemController.getHargaPerKg(item);
            String hargaPerKgStr = ""+hargaPerKgInt;
            HargaPerKg.setText(hargaPerKgStr);
        }
        
    }//GEN-LAST:event_cbItemActionPerformed

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
            java.util.logging.Logger.getLogger(TambahTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HargaPerKg;
    private javax.swing.JLabel LabelIDPelanggan1;
    private javax.swing.JLabel LabelJenisLayanan;
    private javax.swing.JLabel LabelJenisLayanan2;
    private javax.swing.JLabel LabelJenisLayanan4;
    private javax.swing.JLabel LabelJenisLayanan5;
    private javax.swing.JLabel LabelJenisLayanan6;
    private javax.swing.JLabel LabelStatus;
    private javax.swing.JLabel LabelTambahDataTransaksi;
    private javax.swing.JLabel LabelTgl;
    private javax.swing.JLabel LabelTotalHarga;
    private javax.swing.JTextField TextFieldBerat;
    private javax.swing.JTextField TextFieldJenisLayanan;
    private javax.swing.JTextField TextFieldTanggal;
    private javax.swing.JLabel beratEmpty;
    private javax.swing.JRadioButton buttonBelumSelesai;
    private javax.swing.JButton buttonKembali;
    private javax.swing.JRadioButton buttonSelesai;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JComboBox<String> cbID;
    private javax.swing.JComboBox<String> cbItem;
    private javax.swing.ButtonGroup groupLayanan;
    private javax.swing.ButtonGroup groupStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel layananEmpty;
    private javax.swing.JLabel statusEmpty;
    private javax.swing.JLabel tglEmpty;
    // End of variables declaration//GEN-END:variables
}

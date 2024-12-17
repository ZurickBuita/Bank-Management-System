package bank.management.system;

import javax.swing.JOptionPane;
import java.sql.*;
import Database.ConnectionProvider;

public class SignUpFrame extends javax.swing.JFrame {

    public SignUpFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNationality = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAccountNo = new javax.swing.JTextField();
        passConfirmPin = new javax.swing.JPasswordField();
        passPin = new javax.swing.JPasswordField();
        cmb_gender = new javax.swing.JComboBox<>();
        txtMiddleName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(203, 217, 243));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(911, 74));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIGN UP");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/BAMS_Img (4).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        btnReturn.setBackground(new java.awt.Color(0, 102, 102));
        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrowBack1.png"))); // NOI18N
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 109, 122, 36));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Last Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 35));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Confirm PIN:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, 30));

        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 230, 35));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Gender:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 60, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("First Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 30));
        jPanel1.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 163, 230, 35));

        btnSave.setBackground(new java.awt.Color(0, 102, 102));
        btnSave.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 150, 50));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("PIN:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Address:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 20));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 230, 35));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Nationality:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, 20));
        jPanel1.add(txtNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 230, 35));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Mobile No:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, 30));
        jPanel1.add(txtMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 230, 40));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Account No:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, 30));

        txtAccountNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtAccountNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 230, 35));
        jPanel1.add(passConfirmPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 230, 40));
        jPanel1.add(passPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 230, 40));

        cmb_gender.setForeground(new java.awt.Color(102, 102, 102));
        cmb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Male", "Female" }));
        cmb_gender.setFocusable(false);
        jPanel1.add(cmb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 230, 30));
        jPanel1.add(txtMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 230, 35));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Middle Name:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(927, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAccountNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String fname, lname, mname, gender, address, mobileNo, nationality, accountNo, pin, confirmPin;
        int customerId;

        fname = txtFname.getText();
        lname = txtLname.getText();
        mname = txtMiddleName.getText();
        address = txtAddress.getText();
        mobileNo = txtMobileNo.getText();
        nationality = txtNationality.getText();
        accountNo = txtAccountNo.getText();
        pin = new String(passPin.getPassword());
        confirmPin = new String(passConfirmPin.getPassword());
        gender = cmb_gender.getSelectedItem().toString();

        if (fname.isEmpty() || lname.isEmpty()
                || mname.isEmpty() || address.isEmpty()
                || mobileNo.isEmpty() || nationality.isEmpty()
                || accountNo.isEmpty() || pin.isEmpty()
                || confirmPin.isEmpty() || gender.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Fill all the fields");
        } else if (!(mobileNo.matches("^[0-9]*$")) && !(mobileNo.length() == 11)) {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number. Please enter only 11 numeric character.");
        } else if (!(accountNo.matches("^[0-9]*$")) && !(accountNo.length() == 8)) {
            JOptionPane.showMessageDialog(null, "Error: Invalid Account Number!");
        } else if (!(pin.matches("^[0-9]*$")) && !(pin.length() == 6)) {
            JOptionPane.showMessageDialog(null, "Invalid PIN. Please enter only atleast 6 numeric character.");
        } else if (!pin.equals(confirmPin)) {
            JOptionPane.showMessageDialog(null, "Error: PIN mismatch!");
        }

        try {
            Connection con = ConnectionProvider.getCon();
            String selectQuery = "SELECT * FROM `customer` WHERE accountNo = ?";
            PreparedStatement ps = con.prepareStatement(selectQuery);
            ps.setString(1, accountNo);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                JOptionPane.showMessageDialog(null, "Account number already exists.");
            } else {
                Statement st = con.createStatement();
                // create new account
                String insertQuery = "INSERT INTO `customer`(`customerFname`, `middleName`, `customerLname`, `gender`, `nationality`, `mobileNo`, `accountNo`, `pin`) "
                        + "VALUES('" + fname + "','" + mname + "','" + lname + "','" + gender + "','" + nationality + "','" + mobileNo + "','" + accountNo + "','" + pin + "')";

                int x = st.executeUpdate(insertQuery);

                JOptionPane.showMessageDialog(null, "Your account is sucessfully created");

                String selectQuery1 = "SELECT customerId FROM customer WHERE accountNo = ?";
                PreparedStatement ps1 = con.prepareStatement(selectQuery1);
                ps1.setString(1, accountNo);
                ResultSet rs1 = ps1.executeQuery();

                // get the customerId that recentlty added
                if (rs1.next()) {
                    customerId = rs1.getInt("customerId");

                    String insertQuery1 = "INSERT INTO `balance`(`customerId`) VALUES ('" + customerId + "')";
                    int result = st.executeUpdate(insertQuery1);

                    if (result == 0) {
                        System.out.println("Customer ID successfully inserted from Balance Table");
                    }
                }

                con.close();

                LoginFrame LF = new LoginFrame();
                LF.setVisible(true);
                dispose();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        HomeFrame HF = new HomeFrame();
        HF.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passConfirmPin;
    private javax.swing.JPasswordField passPin;
    private javax.swing.JTextField txtAccountNo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtNationality;
    // End of variables declaration//GEN-END:variables
}

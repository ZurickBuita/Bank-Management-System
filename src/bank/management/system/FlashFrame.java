package bank.management.system;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FlashFrame extends javax.swing.JFrame {

   
    public FlashFrame() {
        initComponents();
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        prgFlash = new javax.swing.JProgressBar();
        lblLoading = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(203, 217, 243));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prgFlash.setBackground(new java.awt.Color(153, 153, 153));
        prgFlash.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        prgFlash.setForeground(new java.awt.Color(204, 204, 204));
        prgFlash.setStringPainted(true);
        jPanel1.add(prgFlash, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 448, 627, 42));

        lblLoading.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lblLoading.setText("Loading...");
        jPanel1.add(lblLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 420, 70, 22));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/BAMS_Img2.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("WELCOME TO BANK MANAGEMENT SYSTEM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(927, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
       FlashFrame FF = new FlashFrame();
       HomeFrame HF = new HomeFrame();
       FF.setVisible(true);
       
       for (int i = 0; i <= 100; i++) {
           try {
               Thread.sleep(15);
               prgFlash.setValue(i);
               
               if (i % 2 == 0) {
                   lblLoading.setText("Loading..");
               } else {
                   lblLoading.setText("Loading...");
               }
               
               if (i == 100) {
                    HF.setVisible(true);
                    FF.dispose();
               }
           } catch (InterruptedException ex) {
               Logger.getLogger(FlashFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblLogo;
    public static javax.swing.JProgressBar prgFlash;
    // End of variables declaration//GEN-END:variables
}

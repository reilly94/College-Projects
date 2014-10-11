/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapplication;

/**
 *
 * @author x12112267
 */
public class Appointments extends javax.swing.JFrame {

    /**
     * Creates new form Appointments
     */
    public Appointments() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        headerLB = new javax.swing.JLabel();
        nameLB = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        idLB = new javax.swing.JLabel();
        emailLB = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        promptLB = new javax.swing.JLabel();
        service1RB = new javax.swing.JRadioButton();
        service3RB = new javax.swing.JRadioButton();
        service4RB = new javax.swing.JRadioButton();
        service2RB = new javax.swing.JRadioButton();
        submitBTN = new javax.swing.JButton();
        homeBTN = new javax.swing.JButton();
        naviBarLB = new javax.swing.JLabel();
        wrapperLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerLB.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        headerLB.setForeground(new java.awt.Color(255, 255, 255));
        headerLB.setText("Make an Appointment");
        headerLB.setBounds(80, 20, 240, 50);
        jLayeredPane1.add(headerLB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nameLB.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nameLB.setForeground(new java.awt.Color(255, 255, 255));
        nameLB.setText("Name: ");
        nameLB.setBounds(40, 110, 50, 15);
        jLayeredPane1.add(nameLB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        nameTF.setBounds(120, 110, 240, 20);
        jLayeredPane1.add(nameTF, javax.swing.JLayeredPane.DEFAULT_LAYER);

        idLB.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        idLB.setForeground(new java.awt.Color(255, 255, 255));
        idLB.setText("Student ID: ");
        idLB.setBounds(40, 150, 70, 15);
        jLayeredPane1.add(idLB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        emailLB.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        emailLB.setForeground(new java.awt.Color(255, 255, 255));
        emailLB.setText("Email: ");
        emailLB.setBounds(40, 180, 60, 15);
        jLayeredPane1.add(emailLB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        idTF.setBounds(120, 150, 240, 20);
        jLayeredPane1.add(idTF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        emailTF.setBounds(120, 180, 240, 20);
        jLayeredPane1.add(emailTF, javax.swing.JLayeredPane.DEFAULT_LAYER);

        promptLB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        promptLB.setForeground(new java.awt.Color(255, 255, 255));
        promptLB.setText("Select a service you would like to discuss:");
        promptLB.setBounds(40, 230, 270, 15);
        jLayeredPane1.add(promptLB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        service1RB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        service1RB.setForeground(new java.awt.Color(255, 255, 255));
        service1RB.setText("Dyslexia Screening");
        service1RB.setOpaque(false);
        service1RB.setBounds(40, 270, 170, 23);
        jLayeredPane1.add(service1RB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        service3RB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        service3RB.setForeground(new java.awt.Color(255, 255, 255));
        service3RB.setText("Brain Training ");
        service3RB.setOpaque(false);
        service3RB.setBounds(220, 270, 160, 23);
        jLayeredPane1.add(service3RB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        service4RB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        service4RB.setForeground(new java.awt.Color(255, 255, 255));
        service4RB.setText("Proof Reading services");
        service4RB.setOpaque(false);
        service4RB.setBounds(220, 300, 160, 23);
        jLayeredPane1.add(service4RB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        service2RB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        service2RB.setForeground(new java.awt.Color(255, 255, 255));
        service2RB.setText("Harvard Style Referencing ");
        service2RB.setOpaque(false);
        service2RB.setBounds(40, 300, 170, 23);
        jLayeredPane1.add(service2RB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        submitBTN.setText("Submit request");
        submitBTN.setBounds(150, 360, 110, 40);
        jLayeredPane1.add(submitBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        homeBTN.setIcon(new javax.swing.ImageIcon("H:\\Semester 2\\Object Orientated Programming\\Team C OOP Project\\Images\\LearningSupportApp\\png\\HomeButtonLbl.fw.png")); // NOI18N
        homeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBTNActionPerformed(evt);
            }
        });
        homeBTN.setBounds(170, 440, 50, 50);
        jLayeredPane1.add(homeBTN, javax.swing.JLayeredPane.DEFAULT_LAYER);

        naviBarLB.setIcon(new javax.swing.ImageIcon("H:\\Semester 2\\Object Orientated Programming\\Team C OOP Project\\Images\\LearningSupportApp\\jpeg\\navigationBar.jpg")); // NOI18N
        naviBarLB.setBounds(0, 430, 400, 70);
        jLayeredPane1.add(naviBarLB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        wrapperLB.setIcon(new javax.swing.ImageIcon("H:\\Semester 2\\Object Orientated Programming\\Team C OOP Project\\Images\\LearningSupportApp\\jpeg\\App background.jpg")); // NOI18N
        wrapperLB.setOpaque(true);
        wrapperLB.setBounds(0, 0, 400, 500);
        jLayeredPane1.add(wrapperLB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBTNActionPerformed
       MainPage myMainPage = new MainPage();
       myMainPage.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_homeBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Appointments().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLB;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel headerLB;
    private javax.swing.JButton homeBTN;
    private javax.swing.JLabel idLB;
    private javax.swing.JTextField idTF;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel nameLB;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel naviBarLB;
    private javax.swing.JLabel promptLB;
    private javax.swing.JRadioButton service1RB;
    private javax.swing.JRadioButton service2RB;
    private javax.swing.JRadioButton service3RB;
    private javax.swing.JRadioButton service4RB;
    private javax.swing.JButton submitBTN;
    private javax.swing.JLabel wrapperLB;
    // End of variables declaration//GEN-END:variables
}

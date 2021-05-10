package hms070501;
import javax.swing.*;
public class dashboard extends JFrame {
    public dashboard() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_patient = new javax.swing.JButton();
        add_data = new javax.swing.JButton();
        patient_his = new javax.swing.JButton();
        data_update = new javax.swing.JButton();
        info = new javax.swing.JButton();
        signout = new javax.swing.JButton();
        dashboard_bg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_patient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_patient.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\add_patient.png")); // NOI18N
        add_patient.setText("Add Patient");
        add_patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_patientActionPerformed(evt);
            }
        });
        getContentPane().add(add_patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 80, 209, -1));

        add_data.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_data.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\add_data.png")); // NOI18N
        add_data.setText("Add Diagonistic Data");
        getContentPane().add(add_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 139, -1, -1));

        patient_his.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_his.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\patient_hist.png")); // NOI18N
        patient_his.setText("Patient History");
        getContentPane().add(patient_his, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 209, 209, -1));

        data_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        data_update.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\update_data.png")); // NOI18N
        data_update.setText("Update Patient Data");
        getContentPane().add(data_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 268, 209, -1));

        info.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        info.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\hospital_info.png")); // NOI18N
        info.setText("Hospital Info");
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 209, -1));

        signout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signout.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\logout.png")); // NOI18N
        signout.setText("Sign Out");
        signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutActionPerformed(evt);
            }
        });
        getContentPane().add(signout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 209, -1));

        dashboard_bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\home_bg.jpg")); // NOI18N
        getContentPane().add(dashboard_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutActionPerformed
        int x=JOptionPane.showConfirmDialog(null,"Confirm Signing Out:","Select",JOptionPane.YES_NO_OPTION);
        if (x==0){
            setVisible(false);
            new signin().setVisible(true);
        }
    }//GEN-LAST:event_signoutActionPerformed
    private void add_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_patientActionPerformed
        new add_patient().setVisible(true);
    }//GEN-LAST:event_add_patientActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }}} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new dashboard().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_data;
    private javax.swing.JButton add_patient;
    private javax.swing.JButton dashboard_bg;
    private javax.swing.JButton data_update;
    private javax.swing.JButton info;
    private javax.swing.JButton patient_his;
    private javax.swing.JButton signout;
    // End of variables declaration//GEN-END:variables
}
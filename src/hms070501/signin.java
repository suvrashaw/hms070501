package hms070501;
import javax.swing.*;
public class signin extends JFrame {
    public signin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username_label = new javax.swing.JLabel();
        pass_label = new javax.swing.JLabel();
        signin = new javax.swing.JButton();
        pass_field = new javax.swing.JPasswordField();
        close = new javax.swing.JButton();
        username_field = new javax.swing.JTextField();
        signin_bg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_label.setText("Username");
        getContentPane().add(username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, -1, -1));

        pass_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pass_label.setText("Password");
        getContentPane().add(pass_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, -1, -1));

        signin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signin.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\signin.png")); // NOI18N
        signin.setText("Sign In");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        getContentPane().add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, -1, -1));

        pass_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(pass_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 250, -1));

        close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\close.png")); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 490, -1, -1));

        username_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(username_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 250, -1));

        signin_bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\login_bg.PNG")); // NOI18N
        getContentPane().add(signin_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        int x=JOptionPane.showConfirmDialog(null,"Confirm Closing of Project:","Select",JOptionPane.YES_NO_OPTION);
        if (x==0)
            System.exit(0);
    }//GEN-LAST:event_closeActionPerformed
    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        if (username_field.getText().equals("suvra") && pass_field.getText().equals("shaw")){
            setVisible(false);
            new dashboard().setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(null,"Wrong Credentials");
    }//GEN-LAST:event_signinActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }}} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new signin().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JPasswordField pass_field;
    private javax.swing.JLabel pass_label;
    private javax.swing.JButton signin;
    private javax.swing.JButton signin_bg;
    private javax.swing.JTextField username_field;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
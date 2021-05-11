package hms070501;
import javax.swing.*;
public class add_patient extends JFrame {
    public add_patient() {
        initComponents();
    } @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        save = new javax.swing.JButton();
        patient_id = new javax.swing.JLabel();
        patient_name = new javax.swing.JLabel();
        patient_contact = new javax.swing.JLabel();
        patient_age = new javax.swing.JLabel();
        patient_sex = new javax.swing.JLabel();
        patient_blood_group = new javax.swing.JLabel();
        patient_illness = new javax.swing.JLabel();
        patient_contact_field = new javax.swing.JTextField();
        patient_name_field = new javax.swing.JTextField();
        patient_id_field = new javax.swing.JTextField();
        patient_age_field = new javax.swing.JTextField();
        patient_blood_group_field = new javax.swing.JTextField();
        patient_illness_field = new javax.swing.JTextField();
        patient_sex_select = new javax.swing.JComboBox<>();
        close = new javax.swing.JButton();
        add_patient_bg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\submit.png")); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        patient_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_id.setText("Patient ID");
        getContentPane().add(patient_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 86, -1));

        patient_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_name.setText("Name");
        getContentPane().add(patient_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 86, -1));

        patient_contact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_contact.setText("Mobile No.");
        getContentPane().add(patient_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 86, -1));

        patient_age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_age.setText("Age");
        getContentPane().add(patient_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 86, -1));

        patient_sex.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_sex.setText("Sex");
        getContentPane().add(patient_sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 86, -1));

        patient_blood_group.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_blood_group.setText("Blood Group");
        getContentPane().add(patient_blood_group, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        patient_illness.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_illness.setText("Any Major Disease Suffered?");
        getContentPane().add(patient_illness, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        patient_contact_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_contact_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 172, -1));

        patient_name_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 172, -1));

        patient_id_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_id_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 172, -1));

        patient_age_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_age_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 172, -1));

        patient_blood_group_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_blood_group_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 172, -1));

        patient_illness_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_illness_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 270, -1));

        patient_sex_select.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_sex_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Preffered not to say" }));
        getContentPane().add(patient_sex_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 170, -1));

        close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\close.png")); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        add_patient_bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\add new patient background.jpg")); // NOI18N
        getContentPane().add(add_patient_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String patientID=patient_id_field.getText();
        String patientNAME=patient_name_field.getText();
        String patientNO=patient_contact_field.getText();
        String patientAGE=patient_age_field.getText();
        String patientSEX=patient_id_field.getText();
        String patientBG=(String)patient_sex_select.getSelectedItem();
        String majorDISEASE=patient_illness_field.getText();
        try { java.sql.Connection con=sql.conn.getCon();
            java.sql.Statement st=con.createStatement();
            st.executeUpdate("Updste patient values('"+patientID+"','"+patientNAME+"','"+patientNO+"','"+patientAGE+"','"+patientSEX+"','"+patientBG+"','"+majorDISEASE+"')");
            JOptionPane.showMessageDialog(null,"UPDATE");
            setVisible(false);
            new add_patient().setVisible(true);
        } catch(java.sql.SQLException e) {
            JOptionPane.showMessageDialog(null,"ENTER DATA IN CORRECT FORMAT");
        }
    }//GEN-LAST:event_saveActionPerformed
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        setVisible(false);     
    }//GEN-LAST:event_closeActionPerformed
    public static void main(String args[]) {
        try { for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }}} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } java.awt.EventQueue.invokeLater(() -> {
            new add_patient().setVisible(true);
        });}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_patient_bg;
    private javax.swing.JButton close;
    private javax.swing.JLabel patient_age;
    private javax.swing.JTextField patient_age_field;
    private javax.swing.JLabel patient_blood_group;
    private javax.swing.JTextField patient_blood_group_field;
    private javax.swing.JLabel patient_contact;
    private javax.swing.JTextField patient_contact_field;
    private javax.swing.JLabel patient_id;
    private javax.swing.JTextField patient_id_field;
    private javax.swing.JLabel patient_illness;
    private javax.swing.JTextField patient_illness_field;
    private javax.swing.JLabel patient_name;
    private javax.swing.JTextField patient_name_field;
    private javax.swing.JLabel patient_sex;
    private javax.swing.JComboBox<String> patient_sex_select;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
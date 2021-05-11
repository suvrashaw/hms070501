package hms070501;
import javax.swing.*;
public class data_update extends JFrame {
    public data_update() {
        initComponents();
    } @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JButton();
        patient_illness = new javax.swing.JLabel();
        patient_illness_field = new javax.swing.JTextField();
        patient_blood_group = new javax.swing.JLabel();
        patient_blood_group_field = new javax.swing.JTextField();
        patient_sex = new javax.swing.JLabel();
        patient_age = new javax.swing.JLabel();
        patient_sex_field = new javax.swing.JTextField();
        patient_contact_field = new javax.swing.JTextField();
        patient_contact = new javax.swing.JLabel();
        patient_name = new javax.swing.JLabel();
        patient_name_field = new javax.swing.JTextField();
        patient_id_field = new javax.swing.JTextField();
        patient_id = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        patient_age_field = new javax.swing.JTextField();
        patient_age_field2 = new javax.swing.JTextField();
        patient_age_field3 = new javax.swing.JTextField();
        patient_sex_select = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\close.png")); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 341, -1, -1));

        patient_illness.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_illness.setText("Any Major Disease Suffered?");
        getContentPane().add(patient_illness, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 289, -1, -1));

        patient_illness_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_illness_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 319, 270, -1));

        patient_blood_group.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_blood_group.setText("Blood Group");
        getContentPane().add(patient_blood_group, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 249, -1, -1));

        patient_blood_group_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_blood_group_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 249, 172, -1));

        patient_sex.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_sex.setText("Sex");
        getContentPane().add(patient_sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 209, 86, -1));

        patient_age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_age.setText("Age");
        getContentPane().add(patient_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 159, 86, -1));

        patient_sex_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_sex_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 172, -1));

        patient_contact_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_contact_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 119, 172, -1));

        patient_contact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_contact.setText("Mobile No.");
        getContentPane().add(patient_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 119, 86, -1));

        patient_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_name.setText("Name");
        getContentPane().add(patient_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 79, 86, -1));

        patient_name_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 79, 172, -1));

        patient_id_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_id_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 39, 172, -1));

        patient_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_id.setText("Patient ID");
        getContentPane().add(patient_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 38, 86, -1));

        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 38, -1, -1));

        update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\submit.png")); // NOI18N
        update.setText("Save");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 341, -1, -1));

        patient_age_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_age_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 159, 172, -1));

        patient_age_field2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_age_field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 159, 172, -1));

        patient_age_field3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_age_field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 159, 172, -1));

        patient_sex_select.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_sex_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Preffered not to say" }));
        getContentPane().add(patient_sex_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String patientID=patient_id_field.getText();
        try { java.sql.Connection con=sql.conn.getCon();
            java.sql.Statement st=con.createStatement();
            java.sql.ResultSet rs = st.executeQuery("select *from patient where patientID='"+patientID+"'");
            if(rs.next()){ patient_id_field.setEditable(false);
                patient_id_field.setText(rs.getString(2));
                patient_name_field.setText(rs.getString(2));
                patient_contact_field.setText(rs.getString(3));
                patient_sex_field.setText(rs.getString(4));
                patient_id_field.setText(rs.getString(5));
                patient_sex_select.setSelectedItem(rs.getString(5)); //patient_sex_field.setText(rs.getString(6));
                patient_illness_field.setText(rs.getString(7));
            }} catch (java.sql.SQLException e) {
            JOptionPane.showMessageDialog(null,"ID DOES NOT EXISTS !!");
        }
    }//GEN-LAST:event_searchActionPerformed
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String patientID=patient_id_field.getText();
        String patientNAME=patient_name_field.getText();
        String patientNO=patient_contact_field.getText();
        String patientAGE=patient_age_field.getText();
        String patientSEX=patient_id_field.getText();
        String patientBG=(String)patient_sex_select.getSelectedItem();
        String majorDISEASE=patient_illness_field.getText();
        try { java.sql.Connection con=sql.conn.getCon();
            java.sql.Statement st=con.createStatement();
            st.executeUpdate("updste patient set name='"+patientNAME+"',contactNUMBER='"+patientNO+"',age='"+patientAGE+"',sex='"+patientSEX+"',bloodGROUP='"+patientBG+"',anyMajorDisease='"+majorDISEASE+"'");
            setVisible(false);
            new data_update().setVisible(true);
        } catch(java.sql.SQLException e){
            JOptionPane.showMessageDialog(null,"PLZ ENTER DATA IN CORRECT FORMAT");
        }
    }//GEN-LAST:event_updateActionPerformed
    public static void main(String args[]) {
        try { for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }}} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } java.awt.EventQueue.invokeLater(() -> {
            new data_update().setVisible(true);
        });}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JLabel patient_age;
    private javax.swing.JTextField patient_age_field;
    private javax.swing.JTextField patient_age_field2;
    private javax.swing.JTextField patient_age_field3;
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
    private javax.swing.JTextField patient_sex_field;
    private javax.swing.JComboBox<String> patient_sex_select;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

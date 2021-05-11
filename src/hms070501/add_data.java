package hms070501;
import javax.swing.*;
public class add_data extends JFrame {
    public int flag=0;
    public add_data() {
        initComponents();
        ward_type.setVisible(false);
        ward_type_select.setVisible(false);
    } @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patient_id = new javax.swing.JLabel();
        patient_id_field = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        symptoms = new javax.swing.JLabel();
        symptoms_field = new javax.swing.JTextField();
        diagnosis_field = new javax.swing.JTextField();
        diagnosis = new javax.swing.JLabel();
        medicines_field = new javax.swing.JTextField();
        medicines = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        close = new javax.swing.JButton();
        ward_type = new javax.swing.JLabel();
        ward_type_select = new javax.swing.JComboBox<>();
        ward = new javax.swing.JLabel();
        ward_select = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        add_data_bg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patient_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patient_id.setText("Patient ID");
        getContentPane().add(patient_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 37, -1, -1));

        patient_id_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_id_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 34, 170, -1));

        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 33, -1, -1));

        symptoms.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        symptoms.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        symptoms.setText("Symptoms");
        getContentPane().add(symptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        symptoms_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(symptoms_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 170, -1));

        diagnosis_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(diagnosis_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 170, -1));

        diagnosis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        diagnosis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diagnosis.setText("Diagnosis");
        getContentPane().add(diagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 71, -1));

        medicines_field.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(medicines_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 170, -1));

        medicines.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        medicines.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        medicines.setText("Medicines");
        medicines.setToolTipText("");
        getContentPane().add(medicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 71, -1));

        save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\submit.png")); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\close.png")); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        ward_type.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ward_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ward_type.setText("Ward Type");
        ward_type.setToolTipText("");
        getContentPane().add(ward_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 95, -1));

        ward_type_select.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ward_type_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Single", "Dual" }));
        getContentPane().add(ward_type_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 170, -1));

        ward.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ward.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ward.setText("Need a Ward?");
        ward.setToolTipText("");
        getContentPane().add(ward, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        ward_select.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ward_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        ward_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ward_selectActionPerformed(evt);
            }
        });
        getContentPane().add(ward_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 170, -1));

        table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 649, 50));

        add_data_bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\add new patient background.jpg")); // NOI18N
        getContentPane().add(add_data_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (flag==1){ String patientID = patient_id_field.getText();
            String SYMPToms = symptoms_field.getText();
            String DIAGnosis = diagnosis_field.getText();
            String MEDicines = medicines_field.getText();
            String Ward=(String)ward_select.getSelectedItem();
            String wardTYPE = "";
            if (ward_select.getSelectedItem()=="Yes")wardTYPE=(String)ward_type_select.getSelectedItem();
            try { java.sql.Connection con=sql.conn.getCon();
                java.sql.Statement st=con.createStatement();
                st.executeQuery("Updste report values('"+patientID+"','"+SYMPToms+"','"+DIAGnosis+"','"+MEDicines+"','"+Ward+"','"+wardTYPE+"')");
                JOptionPane.showMessageDialog(null,"UPDATE SUCCESSFUL !!");
                setVisible(false);
                new add_data().setVisible(true);
            } catch(java.sql.SQLException e) {
            JOptionPane.showMessageDialog(this,e);
            }} else {
            JOptionPane.showMessageDialog(null,"EMPTY PATIENT FIELD !!");
        }
    }//GEN-LAST:event_saveActionPerformed
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed
    private void ward_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ward_selectActionPerformed
        if(ward_select.getSelectedItem()=="Yes"){
            ward_type.setVisible(true);
            ward_type_select.setVisible(true);
        } else {
            ward_type.setVisible(false);
            ward_type_select.setVisible(false);
        }
    }//GEN-LAST:event_ward_selectActionPerformed
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String patientID = patient_id_field.getText();
        try{ java.sql.Connection con=sql.conn.getCon();
            java.sql.Statement st=con.createStatement();
            java.sql.ResultSet rs = st.executeQuery("select *from patient where patientID='"+patientID+"'");
            table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            if(rs.first()) { //INVERSEIF
                patient_id_field.setEditable(false);
                flag = 1;
            } else JOptionPane.showMessageDialog(null,"ID DOES NOT EXISTS !!");
        } catch(java.sql.SQLException e){
            JOptionPane.showMessageDialog(null,"CONNECTION ERROR !!");
        }
    }//GEN-LAST:event_searchActionPerformed
    public static void main(String args[]) {
        try { for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }}} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } java.awt.EventQueue.invokeLater(() -> {
            new add_data().setVisible(true);});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_data_bg;
    private javax.swing.JButton close;
    private javax.swing.JLabel diagnosis;
    private javax.swing.JTextField diagnosis_field;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medicines;
    private javax.swing.JTextField medicines_field;
    private javax.swing.JLabel patient_id;
    private javax.swing.JTextField patient_id_field;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JLabel symptoms;
    private javax.swing.JTextField symptoms_field;
    private javax.swing.JTable table;
    private javax.swing.JLabel ward;
    private javax.swing.JComboBox<String> ward_select;
    private javax.swing.JLabel ward_type;
    private javax.swing.JComboBox<String> ward_type_select;
    // End of variables declaration//GEN-END:variables
}
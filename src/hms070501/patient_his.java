package hms070501;
import javax.swing.*;
public class patient_his extends JFrame {
    public patient_his() {
        initComponents();
    } @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        chart = new javax.swing.JTable();
        patient_his_bg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
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

        chart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(chart);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 660, 240));

        patient_his_bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\SUVRA\\Downloads\\images\\add new patient background.jpg")); // NOI18N
        getContentPane().add(patient_his_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try { java.sql.Connection con=sql.conn.getCon();
            java.sql.Statement st=con.createStatement();
            java.sql.ResultSet rs = st.executeQuery("select *from patient inner join patintreport where patient.patientID=patientreport.patientID");
            chart.setAutoResizeMode(chart.AUTO_RESIZE_OFF);
            chart.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        } catch (java.sql.SQLException e){
            JOptionPane.showMessageDialog(null,"CONNECTION ERROR !!");
        }
    }//GEN-LAST:event_formComponentShown
    public static void main(String args[]) {
        try { for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }}} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient_his.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } java.awt.EventQueue.invokeLater(() -> {
            new patient_his().setVisible(true);
        });}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable chart;
    private javax.swing.JButton close;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton patient_his_bg;
    // End of variables declaration//GEN-END:variables
}
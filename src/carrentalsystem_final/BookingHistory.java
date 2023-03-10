/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem_final;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vistokartika
 */
public class BookingHistory extends javax.swing.JFrame {
    
    public void DisplayRentals(){
        String username = null,fullname = null;
        try{
            String filePath = "/Users/vistokartika/Desktop/YEAR2SEM1/Object Oriented Development with Java/TUGAS/CarRentalSystem_FinaLLL/Name.txt";
            File myObj = new File(filePath);
            BufferedReader br= new BufferedReader(new FileReader(myObj));
            String line=br.readLine().trim();
            String[] dataRow = line.split(",");
            username = dataRow[0];
            
        }catch (Exception ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            String filePath = "/Users/vistokartika/Desktop/YEAR2SEM1/Object Oriented Development with Java/TUGAS/CarRentalSystem_FinaLLL/Customer.txt";
            File myObj = new File(filePath);
            BufferedReader br= new BufferedReader(new FileReader(myObj));
            Object[] accountLists = br.lines().toArray();
            for(int i = 0; i < accountLists.length; i++) {
                String line = accountLists[i].toString().trim();
                String[] dataRow = line.split(",");
                if(dataRow[0].equals(username)){
                    fullname = dataRow[3];
                }
            }
        }catch (Exception ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            System.out.println(username);
            System.out.println(fullname);
            String filePath = "/Users/vistokartika/Desktop/YEAR2SEM1/Object Oriented Development with Java/TUGAS/CarRentalSystem_FinaLLL/carrentalsystem_final.RentalsDAO";
            File myObj = new File(filePath);
            BufferedReader br= new BufferedReader(new FileReader(myObj));
            String firstline=br.readLine().trim();
            firstline=br.readLine().trim();
            firstline=br.readLine().trim();
            String[] columnsName = firstline.split(",");
            DefaultTableModel myTableModel = (DefaultTableModel)tableRentals2.getModel();
            myTableModel.setColumnIdentifiers(columnsName);
            Object[] tableLines = br.lines().toArray();
            if (myTableModel.getRowCount() > 0) {
            for (int i = myTableModel.getRowCount() - 1; i > -1; i--) {
            myTableModel.removeRow(i);
            }
            }
            
            for(int i=0;i<tableLines.length;i++){
            String line = tableLines[i].toString().trim();
            String[] dataRow = line.split("`");
            if(dataRow[1].equals(username)){
                myTableModel.addRow(dataRow);
                }
            }
            } catch (Exception ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public BookingHistory() {
        initComponents();
        DisplayRentals();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tableRentals2 = new javax.swing.JTable();
        BackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableRentals2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Registration", "Brand", "Model", "Status"
            }
        ));
        tableRentals2.setRowHeight(25);
        tableRentals2.setShowGrid(true);
        tableRentals2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRentals2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableRentals2);

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Booking History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BackBtn)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(280, 280, 280))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(BackBtn)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableRentals2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRentals2MouseClicked

    }//GEN-LAST:event_tableRentals2MouseClicked

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        CustomerDetails OPEN = new CustomerDetails();
        OPEN.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BookingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableRentals2;
    // End of variables declaration//GEN-END:variables
}

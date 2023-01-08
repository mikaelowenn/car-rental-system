/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem_final;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vistokartika
 */
public class ConfirmBooking extends javax.swing.JFrame {

    public void DisplayBookingStatus(){
        try{
            String filePath = "/Users/vistokartika/Desktop/YEAR2SEM1/Object Oriented Development with Java/TUGAS/CarRentalSystem_FinaLLL/Booking.txt";
            File myObj = new File(filePath);
            BufferedReader br= new BufferedReader(new FileReader(myObj));
            String[] columnsName = {"Registration No", "Name", "Duration","Fees","Booking Status"};
            DefaultTableModel myTableModel = (DefaultTableModel)tableBookingStatus.getModel();
            myTableModel.setColumnIdentifiers(columnsName);
            Object[] tableLines = br.lines().toArray();
            if (myTableModel.getRowCount() > 0) {
            for (int i = myTableModel.getRowCount() - 1; i > -1; i--) {
            myTableModel.removeRow(i);
            }
            }
            
            for(int i=0;i<tableLines.length;i++){
            String line = tableLines[i].toString().trim();
            String[] dataRow = line.split(",");
            myTableModel.addRow(dataRow);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void WriteBookingStatus(){
        
        try {
                String RegNumRec,CustNameRec,DurationRec,FeesRec,BookingStatusRec;
                File file = new File("Booking.txt"); //Create file klo filenya g ada
                FileReader fr = new FileReader(file);
                BufferedReader br=new BufferedReader(fr);
		int myIndex = tableBookingStatus.getSelectedRow();	
                DefaultTableModel model = (DefaultTableModel)tableBookingStatus.getModel();
                RegNumRec=String.valueOf(model.getValueAt(myIndex, 0));
                CustNameRec=String.valueOf(model.getValueAt(myIndex, 1));
                DurationRec=String.valueOf(model.getValueAt(myIndex, 2));
                FeesRec=String.valueOf(model.getValueAt(myIndex, 3));
                BookingStatusRec=String.valueOf(model.getValueAt(myIndex, 4));
                Object []lines = br.lines().toArray();
                if (model.getRowCount() > 0) {
                for (int i = model.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
                }
                 }
                FileWriter fw = new FileWriter(file, false); //true supaya ga overwrite
		PrintWriter pw = new PrintWriter(fw); //Key of Call
							
                pw.println(RegNumRec+","+CustNameRec+","+DurationRec+","+FeesRec+","+ BookingStatusRec);
		pw.close();
            }
        
            catch (IOException e1) {
                e1.printStackTrace();
                JOptionPane.showMessageDialog(null, "Hmm, something wrong there!");
            }
        
                /*
        try {
                String RegNumRec,CustNameRec,DurationRec,FeesRec,BookingStatusRec;
                String tempFile="temp.txt";
                String filepath="/Users/vistokartika/Desktop/YEAR2SEM1/Object Oriented Development with Java/TUGAS/CarRentalSystem_Final/Booking.txt";
                File oldfile = new File(filepath); //Create file klo filenya g ada
                File newfile= new File(tempFile);
		int myIndex = tableBookingStatus.getSelectedRow();	
                DefaultTableModel model = (DefaultTableModel)tableBookingStatus.getModel();
                RegNumRec=String.valueOf(model.getValueAt(myIndex, 0));
                CustNameRec=String.valueOf(model.getValueAt(myIndex, 1));
                DurationRec=String.valueOf(model.getValueAt(myIndex, 2));
                FeesRec=String.valueOf(model.getValueAt(myIndex, 3));
                BookingStatusRec=String.valueOf(model.getValueAt(myIndex, 4));
                
                FileWriter fw = new FileWriter(tempFile, true); //true supaya ga overwrite
                BufferedWriter bw =new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw); //Key of Call
						
                pw.println(RegNumRec+","+CustNameRec+","+DurationRec+","+FeesRec+","+ BookingStatusRec);
                pw.flush();
		pw.close();
                oldfile.delete();
                File dump = new File(filepath);
                newfile.renameTo(dump);
            }
        
            catch (IOException e1) {
                e1.printStackTrace();
                JOptionPane.showMessageDialog(null, "Hmm, something wrong there!");
            }
        */
        }
        
    public ConfirmBooking() {
        initComponents();
        DisplayBookingStatus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableBookingStatus = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableBookingStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration No", "Name", "Duration", "Fees", "Booking Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableBookingStatus.setRowHeight(25);
        tableBookingStatus.setShowGrid(true);
        tableBookingStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBookingStatusMouseClicked(evt);
            }
        });
        tableBookingStatus.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tableBookingStatusInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tableBookingStatus);

        jButton1.setText("Confirm Booking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableBookingStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBookingStatusMouseClicked
        String s="Ready To Use";
        DefaultTableModel model = (DefaultTableModel)tableBookingStatus.getModel();
        int MyIndex = tableBookingStatus.getSelectedRow();
        model.setValueAt(s, MyIndex, 4);
    }//GEN-LAST:event_tableBookingStatusMouseClicked

    private void tableBookingStatusInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tableBookingStatusInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tableBookingStatusInputMethodTextChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        WriteBookingStatus();
        JOptionPane.showMessageDialog(rootPane, "Confirm Booking Successful!");
        
        new AdminMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       AdminMenu OPEN = new AdminMenu();
       OPEN.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBookingStatus;
    // End of variables declaration//GEN-END:variables
}

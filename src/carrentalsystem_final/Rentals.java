/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem_final;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author vistokartika
 */
public class Rentals extends javax.swing.JFrame {
    public String[] type = new String [15];
   
    public void DisplayRentals(){
        try{
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
            String[] newDataRow = {dataRow[0], dataRow[1],dataRow[2],dataRow[3],dataRow[4],dataRow[5],dataRow[6],dataRow[7],dataRow[8]};
            myTableModel.addRow(newDataRow);
            }
            } catch (Exception ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void DisplayCars(){
        try{
            String filePath = "/Users/vistokartika/Desktop/YEAR2SEM1/Object Oriented Development with Java/TUGAS/CarRentalSystem_FinaLLL/carrentalsystem_final.CarsDAO";
            File myObj = new File(filePath);
            BufferedReader br= new BufferedReader(new FileReader(myObj));
            String firstline=br.readLine().trim();
            firstline=br.readLine().trim();
            firstline=br.readLine().trim();
            String[] columnsName = firstline.split(",");
            DefaultTableModel myTableModel = (DefaultTableModel)tableCars2.getModel();
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
            myTableModel.addRow(dataRow);
            }
            } catch (Exception ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void DeleteCars(){
        TextFileORM textFileORM = new TextFileORM();
        textFileORM.addTable(new CarsDAO());
        try {
            textFileORM.connect();
            TableRecordDeleter tableRecordDeleter = textFileORM.getTableRecordDeleter();
            int MyIndex = tableCars2.getSelectedRow();
            int temp = Integer.parseInt(tableCars2.getValueAt(MyIndex,0).toString());
            tableRecordDeleter.deleteRecordById(new CarsDAO(), temp);
            DisplayCars();
                    } catch (Exception ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
                    }
    
    }
    
    private void setName()
    {
        try{
            String filePath = "Customer.txt";
            File myObj = new File(filePath);
            BufferedReader br= new BufferedReader(new FileReader(myObj));
            /*
            DefaultTableModel myTableModel = (DefaultTableModel)tableCustomers.getModel();
            myTableModel.setColumnIdentifiers(columnsName);
            */
            Object[] tableLines = br.lines().toArray();
            
            for(int i=0;i<tableLines.length;i++){
            String line = tableLines[i].toString().trim();
            String[] dataRow = line.split(",");
            CustNameCb.addItem(dataRow[0]);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      
    public void WriteBookingStatus(String RegNumRec, String CustNameRec, int DurationRec, int FeesRec, String BookingStatusRec){
        try {
//                String RegNumRec,CustNameRec,DurationRec,FeesRec,BookingStatusRec;
                File file = new File("Booking.txt"); //Create file klo filenya g ada
//                DefaultTableModel model2 = (DefaultTableModel)tableCars2.getModel();
//                int myIndex = tableCars2.getSelectedRow();	
//                RegNumRec=RegNumTb.getText();
//                CustNameRec=CustNameCb.getSelectedItem().toString();
//                DurationRec=DurationTb.getText();
//                System.out.println(myIndex);
//                FeesRec= tableCars2.getValueAt(0, 5).toString();

                
                BookingStatusRec="Pending";
                
                FileWriter fw = new FileWriter(file, true); //true supaya ga overwrite
		PrintWriter pw = new PrintWriter(fw); //Key of Call
							
                pw.println(RegNumRec+","+CustNameRec+","+DurationRec+ "," +FeesRec + "," + BookingStatusRec);
		pw.close();
            }
        
            catch (IOException e1) {
                e1.printStackTrace();
                JOptionPane.showMessageDialog(null, "Hmm, something wrong there!");
            }
    }
        
    public Rentals() {
        initComponents();
        DisplayCars();
        DisplayRentals();
        setName();
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        popupMenu3 = new java.awt.PopupMenu();
        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil2 = new org.jdatepicker.util.JDatePickerUtil();
        sqlDateModel1 = new org.jdatepicker.impl.SqlDateModel();
        dateComponentFormatter1 = new org.jdatepicker.impl.DateComponentFormatter();
        demoBundle1 = new datechooser.demo.locale.DemoBundle();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRentals1 = new javax.swing.JTable();
        RegNumTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        RentBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ResetBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCars2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DurationTb = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableRentals2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        CustNameCb = new javax.swing.JComboBox<>();
        StatusCb = new javax.swing.JComboBox<>();
        BackBtn = new javax.swing.JButton();
        RentBtn1 = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        popupMenu3.setLabel("popupMenu3");

        tableRentals1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Registration", "Brand", "Model", "Status"
            }
        ));
        tableRentals1.setRowHeight(25);
        tableRentals1.setShowGrid(true);
        tableRentals1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRentals1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableRentals1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegNumTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegNumTbActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("Registration");

        RentBtn.setForeground(new java.awt.Color(204, 0, 51));
        RentBtn.setText("Rent");
        RentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Cars Rental");

        ResetBtn.setForeground(new java.awt.Color(204, 0, 51));
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Cars List");

        tableCars2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Registration", "Brand", "Model", "Status"
            }
        ));
        tableCars2.setRowHeight(25);
        tableCars2.setShowGrid(true);
        tableCars2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCars2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCars2);

        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("Duration");

        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("Status");

        jLabel11.setForeground(new java.awt.Color(204, 0, 51));
        jLabel11.setText("Customer Name");

        DurationTb.setText("00");

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

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 51));
        jLabel13.setText("Rented Cars List");

        StatusCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Booked" }));

        BackBtn.setForeground(new java.awt.Color(204, 0, 51));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        RentBtn1.setForeground(new java.awt.Color(204, 0, 51));
        RentBtn1.setText("Next");
        RentBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RegNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CustNameCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(StatusCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DurationTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RentBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel13)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CustNameCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StatusCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DurationTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RentBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void RegNumTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegNumTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegNumTbActionPerformed

    private void tableCars2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCars2MouseClicked
        DefaultTableModel model2 = (DefaultTableModel)tableCars2.getModel();
        int myIndex = tableCars2.getSelectedRow();
        RegNumTb.setText(model2.getValueAt(myIndex, 1).toString());
        StatusCb.setSelectedItem("Available");
        
        
    }//GEN-LAST:event_tableCars2MouseClicked

    private void RentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentBtnActionPerformed
        TextFileORM textFileORM = new TextFileORM();
        
        textFileORM.addTable(new RentalsDAO());
        //TULIS
        try{
            textFileORM.connect();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            int myIndex = tableCars2.getSelectedRow();
            RentalsDAO newRecord2 = new RentalsDAO();            
            newRecord2.setRegNum(tableCars2.getValueAt(myIndex,1).toString());
            newRecord2.setCustName(CustNameCb.getSelectedItem().toString());          
            newRecord2.setBrand(tableCars2.getValueAt(myIndex, 2).toString());
            newRecord2.setModel(tableCars2.getValueAt(myIndex, 3).toString());
            newRecord2.setStatus(StatusCb.getItemAt(1));
            newRecord2.setDuration(Integer.parseInt(DurationTb.getText()));
            newRecord2.setFees(Integer.parseInt(tableCars2.getValueAt(myIndex, 5).toString())); 
            
            newRecord2.setLocalTime(now.toString());
            
           
            
            TableWriter tableWriter = textFileORM.getTableWriter();
            tableWriter.writeNew(newRecord2);
            

                    DeleteCars();
                    DisplayRentals();
                    WriteBookingStatus(newRecord2.RegNum, newRecord2.CustName, newRecord2.Duration, newRecord2.Fees, "Pening");
        }catch (Exception ex) {
            Logger.getLogger(Rentals.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RentBtnActionPerformed

    private void tableRentals1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRentals1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableRentals1MouseClicked

    private void tableRentals2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRentals2MouseClicked
        
        
    }//GEN-LAST:event_tableRentals2MouseClicked

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        new AdminMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void RentBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentBtn1ActionPerformed
        int myIndex = tableRentals2.getSelectedRow();
        String regnum,name,brand,model;
        int duration,fees,total;
        /*
        regnum=RegNumTb.getText();
        name=CustNameCb.getSelectedItem().toString();
        duration=Integer.parseInt(DurationTb.getText());
        fees=Integer.parseInt(FeesTb.getText());
        */
        regnum=tableRentals2.getValueAt(myIndex,4).toString();
        name=tableRentals2.getValueAt(myIndex,1).toString();
        brand=tableRentals2.getValueAt(myIndex, 2).toString();
        model=tableRentals2.getValueAt(myIndex,3).toString();
        duration=Integer.parseInt(tableRentals2.getValueAt(myIndex,7).toString());
        fees=Integer.parseInt(tableRentals2.getValueAt(myIndex,8).toString());
        total=duration * fees;
        
        
                        
        new PaymentMenu(regnum,name, brand,model,duration,fees, total).setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_RentBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rentals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rentals().setVisible(true);
                        Cars carObj = new Cars();
                        carObj.DisplayCars();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JComboBox<String> CustNameCb;
    private javax.swing.JTextField DurationTb;
    private javax.swing.JTextField RegNumTb;
    private javax.swing.JButton RentBtn;
    private javax.swing.JButton RentBtn1;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JComboBox<String> StatusCb;
    private org.jdatepicker.impl.DateComponentFormatter dateComponentFormatter1;
    private datechooser.demo.locale.DemoBundle demoBundle1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    private java.awt.PopupMenu popupMenu3;
    private org.jdatepicker.impl.SqlDateModel sqlDateModel1;
    private javax.swing.JTable tableCars2;
    private javax.swing.JTable tableRentals1;
    private javax.swing.JTable tableRentals2;
    // End of variables declaration//GEN-END:variables
}

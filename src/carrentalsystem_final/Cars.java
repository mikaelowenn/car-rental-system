/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem_final;
import java.io.BufferedReader;
import java.io.File; 
import java.io.FileReader;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author vistokartika
 */
public class Cars extends javax.swing.JFrame {
    
    public void DisplayCars(){
        try{
            String filePath = "/Users/vistokartika/Desktop/YEAR2SEM1/Object Oriented Development with Java/TUGAS/CarRentalSystem_FinaLLL/carrentalsystem_final.CarsDAO";
            File myObj = new File(filePath);
            BufferedReader br= new BufferedReader(new FileReader(myObj));
            String firstline=br.readLine().trim();
            firstline=br.readLine().trim();
            firstline=br.readLine().trim();
            String[] columnsName = firstline.split(",");
            DefaultTableModel myTableModel = (DefaultTableModel)tableCars.getModel();
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
            /*
            TableReader tableReader = textFileORM.getTableReader();

            BaseClass[] cars = tableReader.readAll(new CarsDAO());

            for (BaseClass upcastedCar: cars){
                System.out.println( ( (CarsDAO)upcastedCar).toString() );
                
        }
            
            
            
            
           */ 
        } catch (Exception ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * Creates new form Cars
     */
    public Cars() {
        initComponents(); 
        init();
        DisplayCars();

        
                
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        FeesTb = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RegNumTb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BrandTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ModelTb = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCars = new javax.swing.JTable();
        BackBtn = new javax.swing.JButton();
        FeesTb1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        jLabel12.setForeground(new java.awt.Color(204, 0, 51));
        jLabel12.setText("Fees (Per Hour)");

        FeesTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeesTbActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Manage Cars");

        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Reg. No");

        RegNumTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegNumTbActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Brand");

        BrandTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandTbActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Model");

        SaveBtn.setForeground(new java.awt.Color(204, 0, 51));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        EditBtn.setForeground(new java.awt.Color(204, 0, 51));
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setForeground(new java.awt.Color(204, 0, 51));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

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

        tableCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableCars.setRowHeight(25);
        tableCars.setShowGrid(true);
        tableCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCarsMouseClicked(evt);
            }
        });
        tableCars.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tableCarsInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tableCars);

        BackBtn.setForeground(new java.awt.Color(204, 0, 51));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        FeesTb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeesTb1ActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(204, 0, 51));
        jLabel13.setText("Fees (Per Hour)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(49, 49, 49)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(BrandTb, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModelTb, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(FeesTb1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BrandTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModelTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FeesTb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void init(){
        DisplayCars();
        
    }
    
    
    private void RegNumTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegNumTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegNumTbActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        TextFileORM textFileORM = new TextFileORM();
        
        textFileORM.addTable(new CarsDAO());
        try{
            //TULIS
            textFileORM.connect();
            CarsDAO newRecord = new CarsDAO();
            newRecord.setRegNum(RegNumTb.getText());
            newRecord.setBrand(BrandTb.getText());
            newRecord.setModel(ModelTb.getText());
            newRecord.setStatus("Availlable");
            newRecord.setFees(Integer.parseInt(FeesTb1.getText()));
            
            
            TableWriter tableWriter = textFileORM.getTableWriter();
            tableWriter.writeNew(newRecord);
            DisplayCars();
        
        } catch (Exception ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
        CarsDAO objCars1 = new CarsDAO();
        objCars1.setRegNum(RegNumTb.getText());
        objCars1.setBrand(BrandTb.getText());
        objCars1.setModel(ModelTb.getText());  
        objCars1.setStatus("Available");
        if (objCars1.getRegNum().isEmpty() || objCars1.getBrand().isEmpty() || objCars1.getModel().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill all the details");
            
        }else{
            
            
        
        
        try{
            FileWriter cardata = new FileWriter("Cars.txt",true);
            cardata.write(objCars1.getRegNum() + ":");
            cardata.write(objCars1.getBrand() + ":");
            cardata.write(objCars1.getModel() + ":" );
            cardata.write(objCars1.getStatus());
            cardata.write(System.getProperty( "line.separator" ));
            cardata.close();
            
            } catch(IOException e){ 
            System.out.println("Error has occured");
            e.printStackTrace();
            
        }
            
            JOptionPane.showMessageDialog(this, "Register Successful");
            DisplayCars();
            
       } 
        */
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void BrandTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandTbActionPerformed

    private void tableCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCarsMouseClicked
        DefaultTableModel model = (DefaultTableModel)tableCars.getModel();
        int MyIndex = tableCars.getSelectedRow();
        RegNumTb.setText(model.getValueAt(MyIndex, 1).toString());
        BrandTb.setText(model.getValueAt(MyIndex, 2).toString());
        ModelTb.setText(model.getValueAt(MyIndex, 3).toString());
        FeesTb1.setText(model.getValueAt(MyIndex, 5).toString());
        
    }//GEN-LAST:event_tableCarsMouseClicked

    private void tableCarsInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tableCarsInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tableCarsInputMethodTextChanged

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        TextFileORM textFileORM = new TextFileORM();
        textFileORM.addTable(new CarsDAO());
        int myIndex = tableCars.getSelectedRow();
        try{
            textFileORM.connect();
        CarsDAO carToWrite = new CarsDAO();
        TableWriter tableWriter = textFileORM.getTableWriter();
        int MyIndex = tableCars.getSelectedRow();
        if (tableCars.getSelectionModel().isSelectionEmpty()){
           JOptionPane.showMessageDialog(this, "Please choose the car to be updated");
        }
        else{
            
        int temp = Integer.parseInt(tableCars.getValueAt(MyIndex,0).toString());
        carToWrite.setId(temp);
        carToWrite.setFees(Integer.parseInt(tableCars.getValueAt(myIndex, 5).toString()));
        carToWrite.RegNum = RegNumTb.getText();
        carToWrite.Brand = BrandTb.getText();
        carToWrite.Model = ModelTb.getText();
        carToWrite.Fees=carToWrite.getFees();
        carToWrite.Status= "Available";
        
        
        tableWriter.writeToID(carToWrite);
        JOptionPane.showMessageDialog(this, "Edit Succcessful");
        DisplayCars();
        }
        } catch (Exception ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*
        CarsDAO objCars1 = new CarsDAO();
        DefaultTableModel model = (DefaultTableModel) this.tableCars.getModel();
        objCars1.setRegNum(RegNumTb.getText());
        objCars1.setBrand(BrandTb.getText());
        objCars1.setModel(ModelTb.getText());  
        objCars1.setStatus("Available");
        if (objCars1.getRegNum().isEmpty() || objCars1.getBrand().isEmpty() || objCars1.getModel().isEmpty() ||objCars1.getStatus().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please choose the car to be updated");
            
        }else{
     
        try{
            FileWriter cardata = new FileWriter("Cars.txt",true);
            cardata.append(objCars1.getRegNum() + ":");
            cardata.append(objCars1.getBrand() + ":");
            cardata.append(objCars1.getModel() + ":" );
            cardata.append(objCars1.getStatus());
            cardata.append(System.getProperty( "line.separator" ));
            
            cardata.write("RegNo,Brand,Model,Status");
            cardata.write(System.getProperty( "line.separator" ));
            for(int row = 0; row < model.getRowCount(); row++) {
            for(int column = 0; column < model.getColumnCount(); column++) {
                cardata.write(model.getValueAt(row, column) + ":");
            }
            cardata.write(System.getProperty( "line.separator" ));   
        }
        
        cardata.close();
            cardata.close();
            
            
            JOptionPane.showMessageDialog(this, "Update Successful");
        }catch(IOException ex){
            System.out.println("Error has occurred");
            ex.printStackTrace();
        }
        }*/
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        TextFileORM textFileORM = new TextFileORM();
        textFileORM.addTable(new CarsDAO());
        try {
            textFileORM.connect();
            TableRecordDeleter tableRecordDeleter = textFileORM.getTableRecordDeleter();
            int MyIndex = tableCars.getSelectedRow();
            int temp = Integer.parseInt(tableCars.getValueAt(MyIndex,0).toString());
            if (tableCars.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "Please choose the car to be deleted");
            }
            else{
            tableRecordDeleter.deleteRecordById(new CarsDAO(), temp);
            }
            JOptionPane.showMessageDialog(this, "Delete Successful");
            DisplayCars();
            Reset();
                    } catch (Exception ex) {
            Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
            
            /*
            CarsDAO objCars1 = new CarsDAO();
            DefaultTableModel model = (DefaultTableModel) this.tableCars.getModel();
            int[] rows = tableCars.getSelectedRows();
            for(int i=0;i<rows.length;i++){
            model.removeRow(rows[i]-i);
            
            }
            
            try{
            FileWriter cardata = new FileWriter("Cars.txt",false);
            cardata.write("RegNo,Brand,Model,Status");
            cardata.write(System.getProperty( "line.separator" ));
            for(int row = 0; row < model.getRowCount(); row++) {
            for(int column = 0; column < model.getColumnCount(); column++) {
            cardata.write(model.getValueAt(row, column) + ":");
            }
            cardata.write(System.getProperty( "line.separator" ));
            }
            
            cardata.close();
            } catch(IOException e){
            System.out.println("Error has occured");
            e.printStackTrace();
            }
            */
            /*
            try{
            BufferedReader br= new BufferedReader(new FileReader(myObj));
            String firstline=br.readLine().trim();
            String[] columnsName = firstline.split(",");
            DefaultTableModel myTableModel = (DefaultTableModel)tableCars.getModel();
            myTableModel.setColumnIdentifiers(columnsName);
            Object[] tableLines = br.lines().toArray();
            if (myTableModel.getRowCount() > 0) {
            for (int i = myTableModel.getRowCount() - 1; i > -1; i--) {
            myTableModel.removeRow(i);
            }
            }
            
            for(int i=0;i<tableLines.length;i++){
            String line = tableLines[i].toString().trim();
            String[] dataRow = line.split(":");
            myTableModel.addRow(dataRow);
            }
            }catch(IOException e){ 
            System.out.println("Error has occured");
            e.printStackTrace();
            }
            /*
            
            */

        }
    }//GEN-LAST:event_DeleteBtnActionPerformed
    private void Reset(){
        RegNumTb.setText("");
        BrandTb.setText("");
        ModelTb.setText("");
        FeesTb.setText("");
                
        
    }
    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        Reset();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        new AdminMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void FeesTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeesTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeesTbActionPerformed

    private void FeesTb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeesTb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeesTb1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField BrandTb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField FeesTb;
    private javax.swing.JTextField FeesTb1;
    private javax.swing.JTextField ModelTb;
    private javax.swing.JTextField RegNumTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCars;
    // End of variables declaration//GEN-END:variables

    
    
        
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;



import csse_dekstop_application.Procurement_Impl;
import csse_dekstop_application.Procurement_Interface;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Lahiru Lakruwan
 */
public class Requisition extends javax.swing.JFrame {

    /**
     * Creates new form Requisition
     */
    public Requisition() {
        initComponents();
         Procurement_Interface procurement = (Procurement_Interface) new Procurement_Impl();

        Constants.Constants.requestionIdDataarray1 =   procurement.getRequestionIds();
        System.out.println(Constants.Constants.requestionIdDataarray1);
       JSONArray jsonArr = new JSONArray(Constants.Constants.requestionIdDataarray1); 
        
         for (int requisitionIdsjson = 0; requisitionIdsjson < jsonArr.length(); requisitionIdsjson++) 
              {
                       JSONObject object = jsonArr.getJSONObject(requisitionIdsjson);
                       String requestionId = object.getString("ItemID");
                                   
                       requestionIdComboBox.addItem(requestionId);
               }

         Constants.Constants.getSuppliernames = procurement.getSuppliernames();
           System.out.println(Constants.Constants.getSuppliernames);
       JSONArray jsonArr1 = new JSONArray(Constants.Constants.getSuppliernames); 
        
         for (int supplierNames = 0; supplierNames < jsonArr1.length();supplierNames++) 
              {
                       JSONObject object = jsonArr1.getJSONObject(supplierNames);
                       String getSupplierName = object.getString("username");
                                   
                       suppliercombobox.addItem(getSupplierName );
               }
                                
      
         
        
    }
  
    
    
    
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        requestionIdComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reqIdItems = new javax.swing.JTable();
        approverRequisition = new javax.swing.JButton();
        searchbtn1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        suppliercombobox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addressline2 = new javax.swing.JTextField();
        addressline1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Requireddate = new com.toedter.calendar.JCalendar();
        othertxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        placeorderbtn = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Approve  Requisition ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Requisition Ids");

        requestionIdComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                requestionIdComboBoxPopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        requestionIdComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestionIdComboBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                requestionIdComboBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                requestionIdComboBoxMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                requestionIdComboBoxMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                requestionIdComboBoxMouseReleased(evt);
            }
        });
        requestionIdComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestionIdComboBoxActionPerformed(evt);
            }
        });
        requestionIdComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                requestionIdComboBoxKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Item List");

        reqIdItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item_ID", "Item_Description", "Item_Quantity", "Item_AgreedPrice"
            }
        ));
        jScrollPane1.setViewportView(reqIdItems);
        if (reqIdItems.getColumnModel().getColumnCount() > 0) {
            reqIdItems.getColumnModel().getColumn(3).setResizable(false);
        }

        approverRequisition.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        approverRequisition.setText("Approve Requisition ");
        approverRequisition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approverRequisitionActionPerformed(evt);
            }
        });

        searchbtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchbtn1.setText("SEARCH");
        searchbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtn1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Supplier Details");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Supplier");

        suppliercombobox.setEnabled(false);
        suppliercombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliercomboboxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Address Line 2");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Address Line 1");

        addressline2.setEnabled(false);

        addressline1.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Required Date");

        othertxt.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("        Other");

        placeorderbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        placeorderbtn.setText("Place Order  ");
        placeorderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeorderbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(approverRequisition))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(requestionIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(searchbtn1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(othertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(addressline1)
                                                .addComponent(addressline2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(211, 211, 211))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)
                                                .addComponent(suppliercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(Requireddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(placeorderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestionIdComboBox)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(approverRequisition)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Requireddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suppliercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressline1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressline2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(othertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(placeorderbtn)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void requestionIdComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestionIdComboBoxActionPerformed
                    
         
    }//GEN-LAST:event_requestionIdComboBoxActionPerformed

    private void requestionIdComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_requestionIdComboBoxKeyPressed
        // TODO add your handling code here:
         
         
    }//GEN-LAST:event_requestionIdComboBoxKeyPressed

    private void requestionIdComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestionIdComboBoxMouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_requestionIdComboBoxMouseClicked

    private void requestionIdComboBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestionIdComboBoxMouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_requestionIdComboBoxMouseExited

    private void requestionIdComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestionIdComboBoxMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_requestionIdComboBoxMousePressed

    private void requestionIdComboBoxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestionIdComboBoxMouseReleased
        // TODO add your handling code here:
     
    }//GEN-LAST:event_requestionIdComboBoxMouseReleased

    private void requestionIdComboBoxPopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_requestionIdComboBoxPopupMenuCanceled
        // TODO add your handling code here:
       
    }//GEN-LAST:event_requestionIdComboBoxPopupMenuCanceled

    private void requestionIdComboBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestionIdComboBoxMouseEntered
        // TODO add your handling code here:
      
                                
       
       
        
        
    }//GEN-LAST:event_requestionIdComboBoxMouseEntered
          /*
           Approve the Requisition Ids
         */
    private void approverRequisitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approverRequisitionActionPerformed
        
         
       String requestidcomboboxvalue = requestionIdComboBox.getSelectedItem().toString();
                                        
        
        
          Procurement_Interface procurement = (Procurement_Interface) new Procurement_Impl();
          
                JSONArray ja = new JSONArray();  
		JSONObject jo = new JSONObject();  
               
          
          
            int row = reqIdItems.getRowCount();
            int column = 1;
                for (int number = 0; number < row; number++) {
                        
                                jo.put("reqID", requestidcomboboxvalue);
                                jo.put("itemDescription", reqIdItems.getValueAt(number, column));
                                jo.put("username","Guest");
                                jo.put("itemPrice", reqIdItems.getValueAt(number, column+2));
                                jo.put("itemQty",reqIdItems.getValueAt(number, column+1) );
                                 System.out.println(reqIdItems.getValueAt(number, column));
                                 ja.put(jo);
                  }
            
       String status   = procurement.approveReq(ja);
      JOptionPane.showMessageDialog(this,status);
      
        JSONObject object =  new JSONObject(status);
        String responsenewstatus = object.getString("status");
        
        
        if(responsenewstatus.equals("APPROVE"))
        {
                Requireddate.enable();
               placeorderbtn.enable();
            System.out.println(responsenewstatus);
               suppliercombobox.enable();
               addressline1.enable();
               addressline2.enable();
               othertxt.enable();
           
               
               
        }
       
     
    }//GEN-LAST:event_approverRequisitionActionPerformed
         /**
          * when search button press all item details in relavant reqution id  are display in the table
          * 
          */
    private void searchbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtn1ActionPerformed
        // TODO add your handling code here:
      String searchbtnvalue = requestionIdComboBox.getSelectedItem().toString();
        
          Procurement_Interface procurement = (Procurement_Interface) new Procurement_Impl();

          
      Constants.Constants.getitemsbyreqId   =   procurement.getItemByReqNumbers(searchbtnvalue);
       JSONArray jsonArr = new JSONArray(Constants.Constants.getitemsbyreqId);
              String[] columnNames = {"Item_ID", "Item_Description","Item_Quantity","Item_AgreedPrice"};
               DefaultTableModel model = new DefaultTableModel(columnNames, 0); 
              for (int iteminfojsonobject = 0; iteminfojsonobject < jsonArr.length(); iteminfojsonobject++) 
              {
                       JSONObject object = jsonArr.getJSONObject(iteminfojsonobject);
                       String Item_Id = object.getString("ItemID");
                       String Item_Description = object.getString("Item_Description");
                       int Item_Quantity = object.getInt("Item_Quantity");
                       int Item_AgreedPrice = object.getInt("Item_AgreedPrice");
                                           
                       
                     model.addRow(new Object[] { Item_Id ,Item_Description , Item_Quantity,Item_AgreedPrice });
                 
               }
                reqIdItems.setModel(model);
    }//GEN-LAST:event_searchbtn1ActionPerformed

    private void suppliercomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliercomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suppliercomboboxActionPerformed

    /**
     * place order the details 
     * 
     */
    
    private void placeorderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeorderbtnActionPerformed
        // TODO add your handling code here:
        
         String searchbtnvalue = requestionIdComboBox.getSelectedItem().toString();
         String supplierName =  suppliercombobox.getSelectedItem().toString();
         String addressLine1 = addressline1.getText().toString();
         String addressLine2  = addressline2.getText().toString();
         String other = othertxt.getText().toString();
         String requiredDate = Requireddate.getDate().toString();
         
         
         Procurement_Interface procurement = (Procurement_Interface) new Procurement_Impl();

         Constants.Constants.getplaceorderresponse =  procurement.placePurchaseOrder(searchbtnvalue,supplierName,addressLine1,addressLine2,other,requiredDate);
        
         JSONObject object =  new JSONObject(Constants.Constants.getplaceorderresponse);
        String responsenewstatus = object.getString("result");
          JOptionPane.showMessageDialog(this,responsenewstatus);
        
        
    }//GEN-LAST:event_placeorderbtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Requisition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Requisition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Requisition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Requisition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Requisition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar Requireddate;
    private javax.swing.JTextField addressline1;
    private javax.swing.JTextField addressline2;
    private javax.swing.JButton approverRequisition;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField othertxt;
    private javax.swing.JButton placeorderbtn;
    private javax.swing.JTable reqIdItems;
    private javax.swing.JComboBox requestionIdComboBox;
    private javax.swing.JButton searchbtn1;
    private javax.swing.JComboBox suppliercombobox;
    // End of variables declaration//GEN-END:variables
}

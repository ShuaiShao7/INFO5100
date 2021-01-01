/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Supplier;

import Business.Enterprise.Enterprise;
import Business.Order.Order;
import Business.Order.WarehouseOrder;
import Business.Organization.Organization;
import Business.Organization.TruckDriverOrganization;
import Business.Organization.WarehouseOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tczho
 */
public class WarehouseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private WarehouseOrganization warehouseOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form WarehouseJPanel
     */
    public WarehouseJPanel(JPanel userProcessContainer, UserAccount userAccount, WarehouseOrganization warehouseOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.warehouseOrganization = warehouseOrganization;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) WarehouseJTable.getModel();
        model.setRowCount(0);
       
        for (Order order : userAccount.getOrderDirectory().getOrderList()){
            Object[] row = new Object[3];
            
            row[0] = ((WarehouseOrder) order);
            row[1] = ((WarehouseOrder) order).getStoreContent();
            row[2] = ((WarehouseOrder) order).getQuanity();
            
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WarehouseJTable = new javax.swing.JTable();
        AddStorageInformationBTN = new javax.swing.JButton();
        storeContentJTextField = new javax.swing.JTextField();
        backjButton1 = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        quanityJTextField = new javax.swing.JTextField();
        addressJTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 167, 62));
        jPanel1.setLayout(null);

        valueLabel.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        valueLabel.setText("<value>");
        jPanel1.add(valueLabel);
        valueLabel.setBounds(241, 138, 158, 26);

        WarehouseJTable.setBackground(new java.awt.Color(255, 102, 0));
        WarehouseJTable.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        WarehouseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Address", "Content", "Quanity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(WarehouseJTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(357, 200, 623, 149);

        AddStorageInformationBTN.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        AddStorageInformationBTN.setText("Submit");
        AddStorageInformationBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStorageInformationBTNActionPerformed(evt);
            }
        });
        jPanel1.add(AddStorageInformationBTN);
        AddStorageInformationBTN.setBounds(602, 637, 96, 45);

        storeContentJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeContentJTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(storeContentJTextField);
        storeContentJTextField.setBounds(751, 504, 146, 26);

        backjButton1.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(backjButton1);
        backjButton1.setBounds(1067, 48, 114, 45);

        DeleteBTN.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        DeleteBTN.setText("Delete");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBTN);
        DeleteBTN.setBounds(866, 355, 114, 45);
        jPanel1.add(quanityJTextField);
        quanityJTextField.setBounds(751, 562, 146, 26);

        addressJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressJTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(addressJTextField1);
        addressJTextField1.setBounds(751, 432, 146, 26);

        jLabel3.setText("KG");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(909, 567, 17, 16);

        jLabel1.setFont(new java.awt.Font("Silom", 0, 24)); // NOI18N
        jLabel1.setText("Warehouse List");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(555, 133, 200, 31);

        jLabel33.setFont(new java.awt.Font("Nanum Brush Script", 1, 80)); // NOI18N
        jLabel33.setText("Are You Hungry");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(463, 0, 403, 93);

        enterpriseLabel1.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        enterpriseLabel1.setText("EnterPrise :");
        jPanel1.add(enterpriseLabel1);
        enterpriseLabel1.setBounds(114, 135, 121, 30);

        jLabel16.setFont(new java.awt.Font("Wingdings 3", 0, 36)); // NOI18N
        jLabel16.setText("c");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(634, 560, 34, 42);

        jLabel4.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel4.setText("Quality");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(480, 576, 69, 24);

        jLabel15.setFont(new java.awt.Font("Wingdings 3", 0, 36)); // NOI18N
        jLabel15.setText("c");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(634, 488, 34, 42);

        jLabel7.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel7.setText("Stuff");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(480, 504, 49, 24);

        jLabel14.setFont(new java.awt.Font("Wingdings 3", 0, 36)); // NOI18N
        jLabel14.setText("c");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(634, 424, 34, 26);

        jLabel8.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel8.setText("Address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(480, 432, 77, 24);

        jLabel9.setFont(new java.awt.Font("Nanum Brush Script", 0, 24)); // NOI18N
        jLabel9.setText("Take-Away Service");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(878, 64, 155, 29);

        jLabel254.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel254.setText("h");
        jPanel1.add(jLabel254);
        jLabel254.setBounds(410, 740, 19, 21);

        jLabel255.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel255.setText("h");
        jPanel1.add(jLabel255);
        jLabel255.setBounds(430, 450, 19, 21);

        jLabel256.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel256.setText("h");
        jPanel1.add(jLabel256);
        jLabel256.setBounds(150, 500, 19, 21);

        jLabel257.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel257.setText("h");
        jPanel1.add(jLabel257);
        jLabel257.setBounds(250, 470, 19, 21);

        jLabel258.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel258.setText("h");
        jPanel1.add(jLabel258);
        jLabel258.setBounds(530, 710, 19, 21);

        jLabel259.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel259.setText("h");
        jPanel1.add(jLabel259);
        jLabel259.setBounds(330, 580, 19, 21);

        jLabel260.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel260.setText("h");
        jPanel1.add(jLabel260);
        jLabel260.setBounds(80, 680, 19, 21);

        jLabel261.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel261.setText("h");
        jPanel1.add(jLabel261);
        jLabel261.setBounds(860, 660, 19, 21);

        jLabel262.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel262.setText("h");
        jPanel1.add(jLabel262);
        jLabel262.setBounds(80, 300, 19, 21);

        jLabel263.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel263.setText("h");
        jPanel1.add(jLabel263);
        jLabel263.setBounds(230, 660, 19, 21);

        jLabel264.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel264.setText("h");
        jPanel1.add(jLabel264);
        jLabel264.setBounds(80, 440, 19, 21);

        jLabel265.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel265.setText("h");
        jPanel1.add(jLabel265);
        jLabel265.setBounds(390, 110, 19, 21);

        jLabel266.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel266.setText("h");
        jPanel1.add(jLabel266);
        jLabel266.setBounds(150, 350, 19, 21);

        jLabel267.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel267.setText("h");
        jPanel1.add(jLabel267);
        jLabel267.setBounds(150, 350, 19, 21);

        jLabel268.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel268.setText("h");
        jPanel1.add(jLabel268);
        jLabel268.setBounds(210, 50, 19, 21);

        jLabel269.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel269.setText("h");
        jPanel1.add(jLabel269);
        jLabel269.setBounds(850, 120, 19, 21);

        jLabel270.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel270.setText("h");
        jPanel1.add(jLabel270);
        jLabel270.setBounds(1040, 260, 19, 21);

        jLabel271.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel271.setText("h");
        jPanel1.add(jLabel271);
        jLabel271.setBounds(230, 240, 19, 21);

        jLabel272.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel272.setText("h");
        jPanel1.add(jLabel272);
        jLabel272.setBounds(1220, 210, 19, 21);

        jLabel273.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel273.setText("h");
        jPanel1.add(jLabel273);
        jLabel273.setBounds(1210, 530, 19, 21);

        jLabel274.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel274.setText("h");
        jPanel1.add(jLabel274);
        jLabel274.setBounds(1250, 70, 19, 21);

        jLabel275.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel275.setText("h");
        jPanel1.add(jLabel275);
        jLabel275.setBounds(1080, 160, 19, 21);

        jLabel276.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel276.setText("h");
        jPanel1.add(jLabel276);
        jLabel276.setBounds(1080, 160, 19, 21);

        jLabel277.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel277.setText("h");
        jPanel1.add(jLabel277);
        jLabel277.setBounds(1230, 370, 19, 21);

        jLabel278.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel278.setText("h");
        jPanel1.add(jLabel278);
        jLabel278.setBounds(1070, 730, 19, 21);

        jLabel279.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel279.setText("h");
        jPanel1.add(jLabel279);
        jLabel279.setBounds(1250, 640, 19, 21);

        jLabel280.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel280.setText("h");
        jPanel1.add(jLabel280);
        jLabel280.setBounds(1060, 410, 19, 21);

        jLabel281.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel281.setText("h");
        jPanel1.add(jLabel281);
        jLabel281.setBounds(880, 770, 19, 21);

        jLabel282.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel282.setText("h");
        jPanel1.add(jLabel282);
        jLabel282.setBounds(1060, 570, 19, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1321, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddStorageInformationBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStorageInformationBTNActionPerformed
        String address = addressJTextField1.getText();
        String content = storeContentJTextField.getText();
        String quanity = quanityJTextField.getText() + "KG";
        
         addressJTextField1.setBorder(new LineBorder(new Color(128,128,128)));
         jLabel8.setForeground(Color.BLACK);
         storeContentJTextField.setBorder(new LineBorder(new Color(128,128,128)));
         jLabel7.setForeground(Color.BLACK);
         quanityJTextField.setBorder(new LineBorder(new Color(128,128,128)));
         jLabel4.setForeground(Color.BLACK);
        if(address==null||address.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Address cannot be empty!");
            addressJTextField1.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel8.setForeground(Color.RED);
            return;
        }
        
         if(content==null||content.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Content cannot be empty!");
            storeContentJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel7.setForeground(Color.RED);
            return;
        }
         
         try{
            Integer.parseInt(quanityJTextField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input a valid quantity!");
             quanityJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.RED);
            return;
        }
         
        WarehouseOrder order = new WarehouseOrder();
        order.setStoreContent(content);
        order.setWarehouseAddress(address);
        order.setQuanity(quanity);

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof TruckDriverOrganization){
                org = organization;
                break;
            }
        }
        if(org != null){
            //org.getOrderDirectory().getOrderList().add(order);
            userAccount.getOrderDirectory().getOrderList().add(order);
            populateTable();
        }
        addressJTextField1.setText("");
        storeContentJTextField.setText("");
        quanityJTextField.setText("");

    }//GEN-LAST:event_AddStorageInformationBTNActionPerformed

    private void storeContentJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeContentJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storeContentJTextFieldActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        int selectedRow = WarehouseJTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete this daily delivery task??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                WarehouseJTable.getValueAt(selectedRow, 0);
                Order order = (Order)WarehouseJTable.getValueAt(selectedRow, 0);
                userAccount.getOrderDirectory().deleteOrder(order);
            }
            populateTable();
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_DeleteBTNActionPerformed

    private void addressJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressJTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStorageInformationBTN;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JTable WarehouseJTable;
    private javax.swing.JTextField addressJTextField1;
    private javax.swing.JButton backjButton1;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quanityJTextField;
    private javax.swing.JTextField storeContentJTextField;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
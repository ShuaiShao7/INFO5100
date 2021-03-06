/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Supplier;

import Business.AreYouHungrySystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.TruckDriverOrder;
import Business.Organization.Organization;
import Business.Organization.TruckDriverOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tczho
 */
public class TruckDriverJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private TruckDriverOrganization truckDriverOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private AreYouHungrySystem system;
    /**
     * Creates new form TruckDriverJPanel
     */
    

    public TruckDriverJPanel(JPanel userProcessContainer, UserAccount userAccount, TruckDriverOrganization truckDriverOrganization, Enterprise enterprise, AreYouHungrySystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.truckDriverOrganization = truckDriverOrganization;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.system = system;
        valueLabel.setText(enterprise.getName());
        populateTable();
        populateComboBox();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) DailyDeliveryJTable.getModel();
        model.setRowCount(0);
       
        //userAccount.setOrderDirectory(new OrderDirectory());
        for (Order order : userAccount.getOrderDirectory().getOrderList()){
            Object[] row = new Object[2];
            
            row[0] = ((TruckDriverOrder) order);
            row[1] = ((TruckDriverOrder) order).getDeliveryContent();
            
            model.addRow(row);
        }
    }
    
    private void populateComboBox() {
        Network inNetwork = null;
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        for(Network outNetwork: system.getNetworkList()){
            if(outNetwork.getName().equals("Boston")){
                inNetwork = outNetwork;
            }
        }
        
        for(Enterprise outEnterprise: inNetwork.getEnterpriseDirectory().getEnterpriseList()){
            if(outEnterprise.getEnterpriseType().toString().equals("Resturant")){
                inEnterprise = outEnterprise;
            }
        }
        
        for(Organization outOrganization: inEnterprise.getOrganizationDirectory().getOrganizationList()){
            //System.out.println(outOrganization.getName());
            if(outOrganization.getName().equals("Resturant Name")){
                inOrganization = outOrganization;
            }
        }
        
        resturantNameComboBox.removeAllItems();
        for (UserAccount ua : inOrganization.getUserAccountDirectory().getUserAccountList()) {
            resturantNameComboBox.addItem(ua.getUsername());
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
        DailyDeliveryJTable = new javax.swing.JTable();
        AddDailyTaskBTN = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        dailyContentJTextField1 = new javax.swing.JTextField();
        resturantNameComboBox = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 167, 62));
        jPanel1.setLayout(null);

        valueLabel.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        valueLabel.setText("<value>");
        jPanel1.add(valueLabel);
        valueLabel.setBounds(269, 104, 158, 26);

        DailyDeliveryJTable.setBackground(new java.awt.Color(255, 102, 0));
        DailyDeliveryJTable.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        DailyDeliveryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Resturant", "Content"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DailyDeliveryJTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(463, 209, 588, 116);

        AddDailyTaskBTN.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        AddDailyTaskBTN.setText("Submit");
        AddDailyTaskBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDailyTaskBTNActionPerformed(evt);
            }
        });
        jPanel1.add(AddDailyTaskBTN);
        AddDailyTaskBTN.setBounds(720, 570, 111, 45);

        backjButton1.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(backjButton1);
        backjButton1.setBounds(1220, 40, 114, 50);

        DeleteBTN.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        DeleteBTN.setText("Delete");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBTN);
        DeleteBTN.setBounds(967, 343, 92, 45);

        dailyContentJTextField1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dailyContentJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyContentJTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(dailyContentJTextField1);
        dailyContentJTextField1.setBounds(850, 490, 146, 28);

        resturantNameComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resturantNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        resturantNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resturantNameComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(resturantNameComboBox);
        resturantNameComboBox.setBounds(850, 420, 146, 27);

        jLabel33.setFont(new java.awt.Font("Nanum Brush Script", 1, 80)); // NOI18N
        jLabel33.setText("Are You Hungry");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(574, 0, 403, 93);

        enterpriseLabel.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        jPanel1.add(enterpriseLabel);
        enterpriseLabel.setBounds(136, 101, 127, 30);

        jLabel1.setFont(new java.awt.Font("Silom", 0, 24)); // NOI18N
        jLabel1.setText("Truck Driver Daily Task");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(600, 140, 290, 31);

        jLabel3.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel3.setText("Delivery Stuff");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(510, 490, 135, 24);

        jLabel6.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel6.setText("Resturant");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(510, 420, 97, 24);

        jLabel15.setFont(new java.awt.Font("Wingdings 3", 0, 36)); // NOI18N
        jLabel15.setText("c");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(750, 480, 34, 42);

        jLabel14.setFont(new java.awt.Font("Wingdings 3", 0, 36)); // NOI18N
        jLabel14.setText("c");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(750, 420, 34, 42);

        jLabel8.setFont(new java.awt.Font("Nanum Brush Script", 0, 24)); // NOI18N
        jLabel8.setText("Take-Away Service");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(989, 64, 155, 29);

        jButton1.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jButton1.setText("View Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1043, 691, 176, 45);

        jLabel219.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel219.setText("h");
        jPanel1.add(jLabel219);
        jLabel219.setBounds(190, 200, 19, 21);

        jLabel220.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel220.setText("h");
        jPanel1.add(jLabel220);
        jLabel220.setBounds(370, 250, 19, 21);

        jLabel221.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel221.setText("h");
        jPanel1.add(jLabel221);
        jLabel221.setBounds(90, 310, 19, 21);

        jLabel222.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel222.setText("h");
        jPanel1.add(jLabel222);
        jLabel222.setBounds(100, 700, 19, 21);

        jLabel223.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel223.setText("h");
        jPanel1.add(jLabel223);
        jLabel223.setBounds(70, 50, 19, 21);

        jLabel224.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel224.setText("h");
        jPanel1.add(jLabel224);
        jLabel224.setBounds(500, 90, 19, 21);

        jLabel225.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel225.setText("h");
        jPanel1.add(jLabel225);
        jLabel225.setBounds(280, 30, 19, 21);

        jLabel226.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel226.setText("h");
        jPanel1.add(jLabel226);
        jLabel226.setBounds(290, 500, 19, 21);

        jLabel227.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel227.setText("h");
        jPanel1.add(jLabel227);
        jLabel227.setBounds(670, 370, 19, 21);

        jLabel228.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel228.setText("h");
        jPanel1.add(jLabel228);
        jLabel228.setBounds(220, 370, 19, 21);

        jLabel229.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel229.setText("h");
        jPanel1.add(jLabel229);
        jLabel229.setBounds(260, 630, 19, 21);

        jLabel230.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel230.setText("h");
        jPanel1.add(jLabel230);
        jLabel230.setBounds(710, 710, 19, 21);

        jLabel231.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel231.setText("h");
        jPanel1.add(jLabel231);
        jLabel231.setBounds(120, 510, 19, 21);

        jLabel232.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel232.setText("h");
        jPanel1.add(jLabel232);
        jLabel232.setBounds(1300, 570, 19, 21);

        jLabel233.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel233.setText("h");
        jPanel1.add(jLabel233);
        jLabel233.setBounds(900, 740, 19, 21);

        jLabel234.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel234.setText("h");
        jPanel1.add(jLabel234);
        jLabel234.setBounds(350, 720, 19, 21);

        jLabel235.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel235.setText("h");
        jPanel1.add(jLabel235);
        jLabel235.setBounds(1200, 650, 19, 21);

        jLabel236.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel236.setText("h");
        jPanel1.add(jLabel236);
        jLabel236.setBounds(1160, 300, 19, 21);

        jLabel237.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel237.setText("h");
        jPanel1.add(jLabel237);
        jLabel237.setBounds(930, 630, 19, 21);

        jLabel238.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel238.setText("h");
        jPanel1.add(jLabel238);
        jLabel238.setBounds(1320, 340, 19, 21);

        jLabel239.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel239.setText("h");
        jPanel1.add(jLabel239);
        jLabel239.setBounds(1070, 150, 19, 21);

        jLabel240.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel240.setText("h");
        jPanel1.add(jLabel240);
        jLabel240.setBounds(1350, 430, 19, 21);

        jLabel241.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel241.setText("h");
        jPanel1.add(jLabel241);
        jLabel241.setBounds(1200, 420, 19, 21);

        jLabel242.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel242.setText("h");
        jPanel1.add(jLabel242);
        jLabel242.setBounds(1130, 530, 19, 21);

        jLabel243.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel243.setText("h");
        jPanel1.add(jLabel243);
        jLabel243.setBounds(850, 90, 19, 21);

        jLabel244.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel244.setText("h");
        jPanel1.add(jLabel244);
        jLabel244.setBounds(1250, 180, 19, 21);

        jLabel245.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel245.setText("h");
        jPanel1.add(jLabel245);
        jLabel245.setBounds(1070, 150, 19, 21);

        jLabel246.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel246.setText("h");
        jPanel1.add(jLabel246);
        jLabel246.setBounds(1070, 150, 19, 21);

        jLabel247.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel247.setText("h");
        jPanel1.add(jLabel247);
        jLabel247.setBounds(800, 460, 19, 21);

        jLabel248.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel248.setText("h");
        jPanel1.add(jLabel248);
        jLabel248.setBounds(460, 460, 19, 21);

        jLabel249.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel249.setText("h");
        jPanel1.add(jLabel249);
        jLabel249.setBounds(540, 600, 19, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1422, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddDailyTaskBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDailyTaskBTNActionPerformed
        String resturantName = resturantNameComboBox.getSelectedItem().toString();
        String content = dailyContentJTextField1.getText();
        dailyContentJTextField1.setBorder(new LineBorder(new Color(128,128,128)));
        jLabel3.setForeground(Color.BLACK);
        if(content==null||content.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Content cannot be empty!");
            dailyContentJTextField1.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setForeground(Color.RED);
            return;
        }
        
        TruckDriverOrder order = new TruckDriverOrder();
        order.setDeliveryContent(content);
        order.setResturant(resturantName);
        
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
        
    }//GEN-LAST:event_AddDailyTaskBTNActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        int selectedRow = DailyDeliveryJTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete this daily delivery task??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                DailyDeliveryJTable.getValueAt(selectedRow, 0);
                Order order = (Order)DailyDeliveryJTable.getValueAt(selectedRow, 0);
                userAccount.getOrderDirectory().deleteOrder(order);
            }
            populateTable();
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_DeleteBTNActionPerformed

    private void resturantNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resturantNameComboBoxActionPerformed
        
    }//GEN-LAST:event_resturantNameComboBoxActionPerformed

    private void dailyContentJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyContentJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dailyContentJTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TruckSupplyJPanel panel = new TruckSupplyJPanel(userProcessContainer, userAccount, system);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("TruckSupplyJPanel", panel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDailyTaskBTN;
    private javax.swing.JTable DailyDeliveryJTable;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton backjButton1;
    private javax.swing.JTextField dailyContentJTextField1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> resturantNameComboBox;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}

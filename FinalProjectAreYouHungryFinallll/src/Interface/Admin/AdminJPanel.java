/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Admin;

import Business.AreYouHungrySystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author tczho
 */
public class AdminJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    AreYouHungrySystem areYouHungrySystem;
    
    public AdminJPanel(JPanel userProcessContainer, AreYouHungrySystem areYouHungrySystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.areYouHungrySystem = areYouHungrySystem;
        populateTree();
    }
    
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        ArrayList<Network> networkList=areYouHungrySystem.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        
        Network network;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            networkNode=new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);
            
            enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
            for(int j=0; j<enterpriseList.size();j++){
                enterprise=enterpriseList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                for(int k=0;k<organizationList.size();k++){
                    organization=organizationList.get(i);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 167, 62));

        jTree.setBackground(new java.awt.Color(255, 102, 0));
        jTree.setFont(new java.awt.Font("Silom", 0, 12)); // NOI18N
        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 541, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 167, 62));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel1.setText("Selected Node:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(48, 173, 144, 24);

        lblSelectedNode.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        lblSelectedNode.setText("<View_selected_node>");
        jPanel2.add(lblSelectedNode);
        lblSelectedNode.setBounds(210, 177, 169, 19);

        btnManageNetwork.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageNetwork);
        btnManageNetwork.setBounds(461, 316, 293, 50);

        btnManageEnterprise.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageEnterprise);
        btnManageEnterprise.setBounds(461, 396, 293, 50);

        btnManageAdmin.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        btnManageAdmin.setText("Manage Enterprise Admin");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageAdmin);
        btnManageAdmin.setBounds(461, 476, 293, 50);

        jLabel33.setFont(new java.awt.Font("Nanum Brush Script", 1, 80)); // NOI18N
        jLabel33.setText("Are You Hungry");
        jPanel2.add(jLabel33);
        jLabel33.setBounds(232, 0, 403, 93);

        jLabel3.setFont(new java.awt.Font("Nanum Brush Script", 0, 24)); // NOI18N
        jLabel3.setText("Take-Away Service");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(647, 64, 155, 29);

        jLabel6.setFont(new java.awt.Font("Wingdings 3", 0, 24)); // NOI18N
        jLabel6.setText("u");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(422, 323, 21, 29);

        jLabel7.setFont(new java.awt.Font("Wingdings 3", 0, 24)); // NOI18N
        jLabel7.setText("u");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(422, 403, 21, 29);

        jLabel8.setFont(new java.awt.Font("Wingdings 3", 0, 24)); // NOI18N
        jLabel8.setText("u");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(422, 483, 21, 29);

        jLabel10.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel10.setText("h");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(100, 70, 19, 21);

        jLabel11.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel11.setText("h");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(110, 250, 19, 21);

        jLabel12.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel12.setText("h");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(260, 270, 19, 21);

        jLabel13.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel13.setText("h");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(190, 350, 19, 21);

        jLabel14.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel14.setText("h");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(50, 330, 19, 21);

        jLabel15.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel15.setText("h");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(540, 160, 19, 21);

        jLabel16.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel16.setText("h");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(920, 70, 19, 21);

        jLabel17.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel17.setText("h");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(270, 470, 19, 21);

        jLabel18.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel18.setText("h");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(580, 240, 19, 21);

        jLabel19.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel19.setText("h");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(290, 570, 19, 21);

        jLabel20.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel20.setText("h");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(100, 610, 19, 21);

        jLabel21.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel21.setText("h");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(610, 610, 19, 21);

        jLabel22.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel22.setText("h");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(270, 690, 19, 21);

        jLabel23.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel23.setText("h");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(780, 290, 19, 21);

        jLabel24.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel24.setText("h");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(120, 490, 19, 21);

        jLabel25.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel25.setText("h");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(920, 170, 19, 21);

        jLabel26.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel26.setText("h");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(970, 330, 19, 21);

        jLabel27.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel27.setText("h");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(920, 430, 19, 21);

        jLabel28.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel28.setText("h");
        jPanel2.add(jLabel28);
        jLabel28.setBounds(710, 160, 19, 21);

        jLabel29.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel29.setText("h");
        jPanel2.add(jLabel29);
        jLabel29.setBounds(510, 720, 19, 21);

        jLabel30.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel30.setText("h");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(910, 530, 19, 21);

        jLabel31.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel31.setText("h");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(930, 710, 19, 21);

        jLabel32.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel32.setText("h");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(790, 620, 19, 21);

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged

        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        ManageNetworkJPanel manageNetworkJPanel=new ManageNetworkJPanel(userProcessContainer, areYouHungrySystem);
        userProcessContainer.add("manageNetworkJPanel",manageNetworkJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        ManageEnterpriseJPanel manageEnterpriseJPanel=new ManageEnterpriseJPanel(userProcessContainer, areYouHungrySystem);
        userProcessContainer.add("manageEnterpriseJPanel",manageEnterpriseJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel=new ManageEnterpriseAdminJPanel(userProcessContainer, areYouHungrySystem);
        userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}

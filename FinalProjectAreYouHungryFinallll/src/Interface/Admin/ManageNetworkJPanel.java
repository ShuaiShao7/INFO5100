/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Admin;

import Business.AreYouHungrySystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tczho
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private AreYouHungrySystem system;

    ManageNetworkJPanel(JPanel userProcessContainer, AreYouHungrySystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        populateNetworkTable();
    }
    
    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network.getName();
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

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Silom", 0, 24)); // NOI18N
        jLabel5.setText("Manage Network");

        setBackground(new java.awt.Color(255, 167, 62));
        setLayout(null);

        networkJTable.setBackground(new java.awt.Color(255, 102, 0));
        networkJTable.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(366, 204, 586, 135);

        jLabel1.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel1.setText("City");
        add(jLabel1);
        jLabel1.setBounds(500, 370, 39, 35);
        add(nameJTextField);
        nameJTextField.setBounds(730, 370, 124, 35);

        submitJButton.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(610, 440, 96, 45);

        backJButton.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(1254, 48, 97, 45);

        jLabel33.setFont(new java.awt.Font("Nanum Brush Script", 1, 80)); // NOI18N
        jLabel33.setText("Are You Hungry");
        add(jLabel33);
        jLabel33.setBounds(463, 0, 403, 93);

        jLabel8.setFont(new java.awt.Font("Nanum Brush Script", 0, 24)); // NOI18N
        jLabel8.setText("Take-Away Service");
        add(jLabel8);
        jLabel8.setBounds(878, 64, 155, 29);

        jLabel6.setFont(new java.awt.Font("Silom", 0, 24)); // NOI18N
        jLabel6.setText("Manage Network");
        add(jLabel6);
        jLabel6.setBounds(558, 133, 224, 31);

        jLabel7.setFont(new java.awt.Font("Wingdings 3", 0, 36)); // NOI18N
        jLabel7.setText("c");
        add(jLabel7);
        jLabel7.setBounds(630, 370, 34, 35);

        jLabel19.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel19.setText("h");
        add(jLabel19);
        jLabel19.setBounds(170, 630, 19, 21);

        jLabel20.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel20.setText("h");
        add(jLabel20);
        jLabel20.setBounds(240, 440, 19, 21);

        jLabel21.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel21.setText("h");
        add(jLabel21);
        jLabel21.setBounds(360, 770, 19, 21);

        jLabel22.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel22.setText("h");
        add(jLabel22);
        jLabel22.setBounds(1250, 270, 19, 21);

        jLabel23.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel23.setText("h");
        add(jLabel23);
        jLabel23.setBounds(860, 480, 19, 21);

        jLabel24.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel24.setText("h");
        add(jLabel24);
        jLabel24.setBounds(230, 730, 19, 21);

        jLabel25.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel25.setText("h");
        add(jLabel25);
        jLabel25.setBounds(110, 510, 19, 21);

        jLabel26.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel26.setText("h");
        add(jLabel26);
        jLabel26.setBounds(1160, 590, 19, 21);

        jLabel27.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel27.setText("h");
        add(jLabel27);
        jLabel27.setBounds(890, 610, 19, 21);

        jLabel28.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel28.setText("h");
        add(jLabel28);
        jLabel28.setBounds(660, 760, 19, 21);

        jLabel29.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel29.setText("h");
        add(jLabel29);
        jLabel29.setBounds(1020, 380, 19, 21);

        jLabel30.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel30.setText("h");
        add(jLabel30);
        jLabel30.setBounds(1020, 530, 19, 21);

        jLabel31.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel31.setText("h");
        add(jLabel31);
        jLabel31.setBounds(930, 720, 19, 21);

        jLabel32.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel32.setText("h");
        add(jLabel32);
        jLabel32.setBounds(1260, 650, 19, 21);

        jLabel34.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel34.setText("h");
        add(jLabel34);
        jLabel34.setBounds(310, 570, 19, 21);

        jLabel35.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel35.setText("h");
        add(jLabel35);
        jLabel35.setBounds(710, 660, 19, 21);

        jLabel36.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel36.setText("h");
        add(jLabel36);
        jLabel36.setBounds(110, 800, 19, 21);

        jLabel37.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel37.setText("h");
        add(jLabel37);
        jLabel37.setBounds(480, 710, 19, 21);

        jLabel38.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel38.setText("h");
        add(jLabel38);
        jLabel38.setBounds(480, 710, 19, 21);

        jLabel39.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel39.setText("h");
        add(jLabel39);
        jLabel39.setBounds(1210, 770, 19, 21);

        jLabel40.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel40.setText("h");
        add(jLabel40);
        jLabel40.setBounds(1060, 660, 19, 21);

        jLabel41.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel41.setText("h");
        add(jLabel41);
        jLabel41.setBounds(1100, 30, 19, 21);

        jLabel42.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel42.setText("h");
        add(jLabel42);
        jLabel42.setBounds(1120, 420, 19, 21);

        jLabel43.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel43.setText("h");
        add(jLabel43);
        jLabel43.setBounds(1100, 330, 19, 21);

        jLabel44.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel44.setText("h");
        add(jLabel44);
        jLabel44.setBounds(670, 90, 19, 21);

        jLabel45.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel45.setText("h");
        add(jLabel45);
        jLabel45.setBounds(190, 80, 19, 21);

        jLabel46.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel46.setText("h");
        add(jLabel46);
        jLabel46.setBounds(1100, 180, 19, 21);

        jLabel47.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel47.setText("h");
        add(jLabel47);
        jLabel47.setBounds(230, 370, 19, 21);

        jLabel48.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel48.setText("h");
        add(jLabel48);
        jLabel48.setBounds(460, 140, 19, 21);

        jLabel49.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel49.setText("h");
        add(jLabel49);
        jLabel49.setBounds(70, 50, 19, 21);

        jLabel50.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel50.setText("h");
        add(jLabel50);
        jLabel50.setBounds(70, 190, 19, 21);

        jLabel51.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel51.setText("h");
        add(jLabel51);
        jLabel51.setBounds(50, 380, 19, 21);

        jLabel52.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel52.setText("h");
        add(jLabel52);
        jLabel52.setBounds(160, 260, 19, 21);

        jLabel53.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel53.setText("h");
        add(jLabel53);
        jLabel53.setBounds(260, 180, 19, 21);

        jLabel54.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel54.setText("h");
        add(jLabel54);
        jLabel54.setBounds(420, 410, 20, 21);

        jLabel55.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel55.setText("h");
        add(jLabel55);
        jLabel55.setBounds(520, 490, 19, 21);

        jLabel56.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel56.setText("h");
        add(jLabel56);
        jLabel56.setBounds(570, 590, 19, 21);

        jLabel57.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel57.setText("h");
        add(jLabel57);
        jLabel57.setBounds(1260, 150, 19, 21);
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        String name = nameJTextField.getText();
        nameJTextField.setBorder(new LineBorder(new Color(128,128,128)));
        jLabel1.setForeground(Color.BLACK);

        if(name==null||name.equals(""))
        {
            nameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel1.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "NetWork Name cannot be empty!");
            return;
        }
        Network network = system.createAndAddNetwork();
        network.setName(name);

        populateNetworkTable();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminJPanel adminJPanel = (AdminJPanel) component;
        adminJPanel.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable networkJTable;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.NormalAdmin;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
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
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    private JPanel container;
    private Enterprise enterprise;
    private UserAccountDirectory userAccountDirectory;
    /**
     * Creates new form ManageUserAccountJPanel
     */

    ManageUserAccountJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = userProcessContainer;
        
        popOrganizationComboBox();
        popData();
    }
    
    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
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

        backjButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        createUserJButton = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        roleJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 167, 62));
        setLayout(null);

        backjButton1.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1);
        backjButton1.setBounds(1122, 48, 114, 45);

        userJTable.setBackground(new java.awt.Color(255, 102, 0));
        userJTable.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(337, 178, 634, 133);

        jLabel33.setFont(new java.awt.Font("Nanum Brush Script", 1, 80)); // NOI18N
        jLabel33.setText("Are You Hungry");
        add(jLabel33);
        jLabel33.setBounds(463, 0, 425, 93);

        jLabel3.setFont(new java.awt.Font("Silom", 0, 24)); // NOI18N
        jLabel3.setText("Manage User Account");
        add(jLabel3);
        jLabel3.setBounds(502, 107, 278, 31);

        jLabel7.setFont(new java.awt.Font("Nanum Brush Script", 0, 24)); // NOI18N
        jLabel7.setText("Take-Away Service");
        add(jLabel7);
        jLabel7.setBounds(900, 64, 155, 29);

        jLabel1.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel1.setText("User Name");
        add(jLabel1);
        jLabel1.setBounds(452, 524, 104, 24);

        nameJTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(nameJTextField);
        nameJTextField.setBounds(728, 520, 146, 28);

        createUserJButton.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        createUserJButton.setText("Submit");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton);
        createUserJButton.setBounds(605, 669, 96, 45);

        DeleteBTN.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        DeleteBTN.setText("Delete");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });
        add(DeleteBTN);
        DeleteBTN.setBounds(879, 329, 92, 45);

        roleJComboBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });
        add(roleJComboBox);
        roleJComboBox.setBounds(728, 464, 146, 27);

        jLabel4.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel4.setText("Role");
        add(jLabel4);
        jLabel4.setBounds(452, 464, 42, 24);

        organizationJComboBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox);
        organizationJComboBox.setBounds(728, 405, 146, 27);

        jLabel5.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel5.setText("Organization");
        add(jLabel5);
        jLabel5.setBounds(452, 405, 126, 24);

        passwordJTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(passwordJTextField);
        passwordJTextField.setBounds(728, 587, 146, 28);

        jLabel2.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        add(jLabel2);
        jLabel2.setBounds(452, 589, 95, 24);

        jLabel13.setFont(new java.awt.Font("Wingdings 3", 0, 36)); // NOI18N
        jLabel13.setText("c");
        add(jLabel13);
        jLabel13.setBounds(635, 401, 34, 34);

        jLabel16.setFont(new java.awt.Font("Wingdings 3", 0, 36)); // NOI18N
        jLabel16.setText("c");
        add(jLabel16);
        jLabel16.setBounds(635, 583, 34, 42);

        jLabel15.setFont(new java.awt.Font("Wingdings 3", 0, 36)); // NOI18N
        jLabel15.setText("c");
        add(jLabel15);
        jLabel15.setBounds(635, 510, 34, 42);

        jLabel14.setFont(new java.awt.Font("Wingdings 3", 0, 36)); // NOI18N
        jLabel14.setText("c");
        add(jLabel14);
        jLabel14.setBounds(635, 453, 34, 42);

        jLabel156.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel156.setText("h");
        add(jLabel156);
        jLabel156.setBounds(270, 70, 19, 20);

        jLabel157.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel157.setText("h");
        add(jLabel157);
        jLabel157.setBounds(70, 80, 19, 20);

        jLabel158.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel158.setText("h");
        add(jLabel158);
        jLabel158.setBounds(280, 400, 19, 20);

        jLabel159.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel159.setText("h");
        add(jLabel159);
        jLabel159.setBounds(190, 200, 19, 20);

        jLabel160.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel160.setText("h");
        add(jLabel160);
        jLabel160.setBounds(800, 320, 19, 20);

        jLabel161.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel161.setText("h");
        add(jLabel161);
        jLabel161.setBounds(210, 490, 19, 20);

        jLabel162.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel162.setText("h");
        add(jLabel162);
        jLabel162.setBounds(80, 170, 19, 20);

        jLabel163.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel163.setText("h");
        add(jLabel163);
        jLabel163.setBounds(1070, 170, 19, 20);

        jLabel164.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel164.setText("h");
        add(jLabel164);
        jLabel164.setBounds(510, 340, 19, 20);

        jLabel165.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel165.setText("h");
        add(jLabel165);
        jLabel165.setBounds(830, 720, 19, 20);

        jLabel166.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel166.setText("h");
        add(jLabel166);
        jLabel166.setBounds(1040, 510, 19, 20);

        jLabel167.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel167.setText("h");
        add(jLabel167);
        jLabel167.setBounds(1260, 540, 19, 20);

        jLabel168.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel168.setText("h");
        add(jLabel168);
        jLabel168.setBounds(1140, 560, 19, 20);

        jLabel169.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel169.setText("h");
        add(jLabel169);
        jLabel169.setBounds(340, 760, 19, 20);

        jLabel170.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel170.setText("h");
        add(jLabel170);
        jLabel170.setBounds(990, 680, 19, 20);

        jLabel171.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel171.setText("h");
        add(jLabel171);
        jLabel171.setBounds(80, 770, 19, 20);

        jLabel172.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel172.setText("h");
        add(jLabel172);
        jLabel172.setBounds(640, 790, 19, 20);

        jLabel173.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel173.setText("h");
        add(jLabel173);
        jLabel173.setBounds(80, 530, 19, 20);

        jLabel174.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel174.setText("h");
        add(jLabel174);
        jLabel174.setBounds(240, 600, 19, 20);

        jLabel175.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel175.setText("h");
        add(jLabel175);
        jLabel175.setBounds(1260, 120, 19, 20);

        jLabel176.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel176.setText("h");
        add(jLabel176);
        jLabel176.setBounds(1080, 350, 19, 20);

        jLabel177.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel177.setText("h");
        add(jLabel177);
        jLabel177.setBounds(1280, 420, 19, 20);

        jLabel178.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel178.setText("h");
        add(jLabel178);
        jLabel178.setBounds(1200, 360, 19, 20);

        jLabel179.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel179.setText("h");
        add(jLabel179);
        jLabel179.setBounds(950, 810, 19, 20);

        jLabel180.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel180.setText("h");
        add(jLabel180);
        jLabel180.setBounds(1140, 780, 19, 20);

        jLabel181.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel181.setText("h");
        add(jLabel181);
        jLabel181.setBounds(90, 420, 19, 20);

        jLabel182.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel182.setText("h");
        add(jLabel182);
        jLabel182.setBounds(160, 330, 19, 20);

        jLabel183.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel183.setText("h");
        add(jLabel183);
        jLabel183.setBounds(1200, 660, 19, 20);

        jLabel184.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel184.setText("h");
        add(jLabel184);
        jLabel184.setBounds(1170, 250, 19, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        int selectedRow = userJTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete this user account??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                userJTable.getValueAt(selectedRow, 0);
                UserAccount userAccount = (UserAccount)userJTable.getValueAt(selectedRow, 0);

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    organization.getUserAccountDirectory().deleteUserAccount(userAccount);
                }
                popData();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_DeleteBTNActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();

        nameJTextField.setBorder(new LineBorder(new Color(128,128,128)));
        jLabel1.setForeground(Color.BLACK);
        passwordJTextField.setBorder(new LineBorder(new Color(128,128,128)));
        jLabel2.setForeground(Color.BLACK);

        if(userName==null||userName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Username cannot be empty!");
            nameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel1.setForeground(Color.RED);
            return;
        }
        if(password==null||password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Password cannot be empty!");
            passwordJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.RED);
            return;
        }

        for(UserAccount account1 : organization.getUserAccountDirectory().getUserAccountList()){
            if(account1.getUsername().equals(userName) ){
                JOptionPane.showMessageDialog(null,"UserName Already exists!");
                nameJTextField.setText("");
                passwordJTextField.setText("");
                nameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
                jLabel1.setForeground(Color.RED);
                return;
            }
        }
        organization.getUserAccountDirectory().createUserAcount(userName, password, role);
        nameJTextField.setText("");
        passwordJTextField.setText("");
        popData();
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}

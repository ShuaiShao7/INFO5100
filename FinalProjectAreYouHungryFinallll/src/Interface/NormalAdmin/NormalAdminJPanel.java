/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.NormalAdmin;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author tczho
 */
public class NormalAdminJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;

    public NormalAdminJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        EnterpriseLabel.setText(enterprise.getName());
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
        manageUserBTN = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        EnterpriseLabel = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 167, 62));
        jPanel1.setLayout(null);

        manageUserBTN.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        manageUserBTN.setText("Manage User");
        manageUserBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserBTNActionPerformed(evt);
            }
        });
        jPanel1.add(manageUserBTN);
        manageUserBTN.setBounds(570, 340, 280, 50);

        manageOrganizationJButton.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageOrganizationJButton);
        manageOrganizationJButton.setBounds(570, 230, 270, 50);

        enterpriseLabel.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        jPanel1.add(enterpriseLabel);
        enterpriseLabel.setBounds(230, 130, 120, 30);

        EnterpriseLabel.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        EnterpriseLabel.setText("<value>");
        jPanel1.add(EnterpriseLabel);
        EnterpriseLabel.setBounds(360, 130, 130, 30);

        jLabel33.setFont(new java.awt.Font("Nanum Brush Script", 1, 80)); // NOI18N
        jLabel33.setText("Are You Hungry");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(440, 0, 403, 93);

        jLabel7.setFont(new java.awt.Font("Nanum Brush Script", 0, 24)); // NOI18N
        jLabel7.setText("Take-Away Service");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(860, 50, 155, 29);

        jLabel9.setFont(new java.awt.Font("Wingdings 3", 0, 24)); // NOI18N
        jLabel9.setText("u");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(520, 250, 21, 29);

        jLabel10.setFont(new java.awt.Font("Wingdings 3", 0, 24)); // NOI18N
        jLabel10.setText("u");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(520, 350, 21, 29);

        jLabel162.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel162.setText("h");
        jPanel1.add(jLabel162);
        jLabel162.setBounds(310, 320, 19, 20);

        jLabel163.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel163.setText("h");
        jPanel1.add(jLabel163);
        jLabel163.setBounds(160, 280, 19, 20);

        jLabel164.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel164.setText("h");
        jPanel1.add(jLabel164);
        jLabel164.setBounds(420, 300, 19, 20);

        jLabel165.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel165.setText("h");
        jPanel1.add(jLabel165);
        jLabel165.setBounds(100, 440, 19, 20);

        jLabel166.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel166.setText("h");
        jPanel1.add(jLabel166);
        jLabel166.setBounds(1070, 510, 19, 20);

        jLabel167.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel167.setText("h");
        jPanel1.add(jLabel167);
        jLabel167.setBounds(240, 540, 19, 20);

        jLabel168.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel168.setText("h");
        jPanel1.add(jLabel168);
        jLabel168.setBounds(560, 570, 19, 20);

        jLabel169.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel169.setText("h");
        jPanel1.add(jLabel169);
        jLabel169.setBounds(300, 420, 19, 20);

        jLabel170.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel170.setText("h");
        jPanel1.add(jLabel170);
        jLabel170.setBounds(930, 550, 19, 20);

        jLabel171.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel171.setText("h");
        jPanel1.add(jLabel171);
        jLabel171.setBounds(1020, 140, 19, 20);

        jLabel172.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel172.setText("h");
        jPanel1.add(jLabel172);
        jLabel172.setBounds(470, 460, 19, 20);

        jLabel173.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel173.setText("h");
        jPanel1.add(jLabel173);
        jLabel173.setBounds(390, 590, 19, 20);

        jLabel174.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel174.setText("h");
        jPanel1.add(jLabel174);
        jLabel174.setBounds(970, 430, 19, 20);

        jLabel175.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel175.setText("h");
        jPanel1.add(jLabel175);
        jLabel175.setBounds(490, 100, 19, 20);

        jLabel176.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel176.setText("h");
        jPanel1.add(jLabel176);
        jLabel176.setBounds(610, 130, 19, 20);

        jLabel177.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel177.setText("h");
        jPanel1.add(jLabel177);
        jLabel177.setBounds(1170, 130, 19, 20);

        jLabel178.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel178.setText("h");
        jPanel1.add(jLabel178);
        jLabel178.setBounds(70, 40, 19, 20);

        jLabel179.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel179.setText("h");
        jPanel1.add(jLabel179);
        jLabel179.setBounds(820, 140, 19, 20);

        jLabel180.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel180.setText("h");
        jPanel1.add(jLabel180);
        jLabel180.setBounds(90, 180, 19, 20);

        jLabel181.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel181.setText("h");
        jPanel1.add(jLabel181);
        jLabel181.setBounds(300, 50, 19, 20);

        jLabel182.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel182.setText("h");
        jPanel1.add(jLabel182);
        jLabel182.setBounds(1130, 420, 19, 20);

        jLabel183.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel183.setText("h");
        jPanel1.add(jLabel183);
        jLabel183.setBounds(1000, 290, 19, 20);

        jLabel184.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel184.setText("h");
        jPanel1.add(jLabel184);
        jLabel184.setBounds(740, 480, 19, 20);

        jLabel185.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel185.setText("h");
        jPanel1.add(jLabel185);
        jLabel185.setBounds(760, 290, 19, 20);

        jLabel186.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel186.setText("h");
        jPanel1.add(jLabel186);
        jLabel186.setBounds(1100, 230, 19, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1257, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserBTNActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel manageUserAccountJPanel = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", manageUserAccountJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserBTNActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory(), enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EnterpriseLabel;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton manageUserBTN;
    // End of variables declaration//GEN-END:variables
}

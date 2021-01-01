/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.AreYouHungrySystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Order.CustomerOrder;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tczho
 */
public class CustomerRankJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CustomerOrder order;
    private AreYouHungrySystem system;
    private DB4OUtil db4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form CustomerRankJPanel
     */
    CustomerRankJPanel(JPanel userProcessContainer, CustomerOrder order, AreYouHungrySystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.order = order;
        this.system = system;
        
        populateCombobox();
    }
    
    public void populateCombobox(){
        rankCombobox.removeAllItems();
        for(Integer i = 5; i >0; i--){
            rankCombobox.addItem(i.toString());
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

        rankCombobox = new javax.swing.JComboBox<>();
        feedBackJTextField = new javax.swing.JTextField();
        backjButton1 = new javax.swing.JButton();
        SubmitRankBTN = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 167, 62));
        setLayout(null);

        rankCombobox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        rankCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(rankCombobox);
        rankCombobox.setBounds(686, 178, 104, 27);

        feedBackJTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(feedBackJTextField);
        feedBackJTextField.setBounds(680, 270, 307, 196);

        backjButton1.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1);
        backjButton1.setBounds(1143, 48, 114, 45);

        SubmitRankBTN.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        SubmitRankBTN.setText("Submit");
        SubmitRankBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitRankBTNActionPerformed(evt);
            }
        });
        add(SubmitRankBTN);
        SubmitRankBTN.setBounds(657, 547, 111, 45);

        jLabel33.setFont(new java.awt.Font("Nanum Brush Script", 1, 80)); // NOI18N
        jLabel33.setText("Are You Hungry");
        add(jLabel33);
        jLabel33.setBounds(463, 0, 403, 93);

        jLabel4.setFont(new java.awt.Font("Silom", 0, 24)); // NOI18N
        jLabel4.setText("Evaluation ");
        add(jLabel4);
        jLabel4.setBounds(562, 122, 144, 31);

        jLabel5.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel5.setText("Rank");
        add(jLabel5);
        jLabel5.setBounds(497, 171, 129, 38);

        jLabel6.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel6.setText("Feedback");
        add(jLabel6);
        jLabel6.setBounds(497, 269, 129, 38);

        jLabel7.setFont(new java.awt.Font("Hannotate SC", 2, 14)); // NOI18N
        jLabel7.setText("Your Evaluation Drives us Better !");
        add(jLabel7);
        jLabel7.setBounds(686, 477, 217, 20);

        jLabel8.setFont(new java.awt.Font("Nanum Brush Script", 0, 24)); // NOI18N
        jLabel8.setText("Take-Away Service");
        add(jLabel8);
        jLabel8.setBounds(878, 61, 155, 29);

        jLabel95.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel95.setText("h");
        add(jLabel95);
        jLabel95.setBounds(240, 280, 19, 20);

        jLabel96.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel96.setText("h");
        add(jLabel96);
        jLabel96.setBounds(140, 450, 19, 20);

        jLabel97.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel97.setText("h");
        add(jLabel97);
        jLabel97.setBounds(190, 70, 19, 20);

        jLabel98.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel98.setText("h");
        add(jLabel98);
        jLabel98.setBounds(580, 440, 19, 20);

        jLabel99.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel99.setText("h");
        add(jLabel99);
        jLabel99.setBounds(200, 360, 19, 20);

        jLabel100.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel100.setText("h");
        add(jLabel100);
        jLabel100.setBounds(200, 590, 19, 20);

        jLabel101.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel101.setText("h");
        add(jLabel101);
        jLabel101.setBounds(610, 220, 19, 20);

        jLabel102.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel102.setText("h");
        add(jLabel102);
        jLabel102.setBounds(1280, 310, 19, 20);

        jLabel103.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel103.setText("h");
        add(jLabel103);
        jLabel103.setBounds(90, 230, 19, 20);

        jLabel104.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel104.setText("h");
        add(jLabel104);
        jLabel104.setBounds(290, 450, 19, 20);

        jLabel105.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel105.setText("h");
        add(jLabel105);
        jLabel105.setBounds(860, 630, 19, 20);

        jLabel106.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel106.setText("h");
        add(jLabel106);
        jLabel106.setBounds(530, 620, 19, 20);

        jLabel107.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel107.setText("h");
        add(jLabel107);
        jLabel107.setBounds(340, 570, 19, 20);

        jLabel108.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel108.setText("h");
        add(jLabel108);
        jLabel108.setBounds(1200, 610, 19, 20);

        jLabel109.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel109.setText("h");
        add(jLabel109);
        jLabel109.setBounds(1110, 350, 19, 20);

        jLabel110.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel110.setText("h");
        add(jLabel110);
        jLabel110.setBounds(970, 550, 19, 20);

        jLabel111.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel111.setText("h");
        add(jLabel111);
        jLabel111.setBounds(940, 130, 19, 20);

        jLabel112.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel112.setText("h");
        add(jLabel112);
        jLabel112.setBounds(1340, 180, 19, 20);

        jLabel113.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel113.setText("h");
        add(jLabel113);
        jLabel113.setBounds(1210, 460, 19, 20);

        jLabel114.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel114.setText("h");
        add(jLabel114);
        jLabel114.setBounds(1160, 140, 19, 20);

        jLabel115.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel115.setText("h");
        add(jLabel115);
        jLabel115.setBounds(1330, 50, 19, 20);

        jLabel116.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel116.setText("h");
        add(jLabel116);
        jLabel116.setBounds(1160, 260, 19, 20);

        jLabel117.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel117.setText("h");
        add(jLabel117);
        jLabel117.setBounds(60, 30, 19, 20);

        jLabel118.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel118.setText("h");
        add(jLabel118);
        jLabel118.setBounds(370, 170, 19, 20);

        jLabel119.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel119.setText("h");
        add(jLabel119);
        jLabel119.setBounds(270, 130, 19, 20);

        jLabel120.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel120.setText("h");
        add(jLabel120);
        jLabel120.setBounds(430, 340, 19, 20);

        jLabel121.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel121.setText("h");
        add(jLabel121);
        jLabel121.setBounds(430, 480, 19, 20);

        jLabel122.setFont(new java.awt.Font("Wingdings", 0, 18)); // NOI18N
        jLabel122.setText("h");
        add(jLabel122);
        jLabel122.setBounds(370, 20, 19, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void SubmitRankBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitRankBTNActionPerformed
        CustomerOrder rankOrder = order;
        int rank = Integer.parseInt(rankCombobox.getSelectedItem().toString());
        
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a"); 
        Date date = new Date();
        
        
        String feedback = feedBackJTextField.getText();
//        if(!feedBackJTextField.getText().equals("")){
//            feedback = feedBackJTextField.getText();
            rankOrder.setFeedback(feedback);
       // }
        rankOrder.setRank(rank);
        db4OUtil.storeSystem(system);
        
        JOptionPane.showMessageDialog(null, "You have successfully give your feedback on this order!!!");
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_SubmitRankBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitRankBTN;
    private javax.swing.JButton backjButton1;
    private javax.swing.JTextField feedBackJTextField;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JComboBox<String> rankCombobox;
    // End of variables declaration//GEN-END:variables
}

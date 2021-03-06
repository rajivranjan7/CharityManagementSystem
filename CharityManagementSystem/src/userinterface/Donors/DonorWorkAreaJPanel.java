/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Donors;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author nanditasharma
 */
public class DonorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form IndividualDonarJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    Network network;
    Enterprise enterprise;
    public DonorWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem, UserAccount account, Network network, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.account = account;
        this.network = network;
        this.enterprise = enterprise;
        String firstLetter = account.getEmployee().getName().substring(0, 1);
        String remainingLetters = account.getEmployee().getName().substring(1, account.getEmployee().getName().length());

        firstLetter = firstLetter.toUpperCase();
        String name = firstLetter + remainingLetters;
        lblDonarName.setText("Welcome "+ name);
        
        ImageIcon iconLogo = new ImageIcon("UserCapture.jpg");
        // In init() method write this code
       jLabel2.setIcon(iconLogo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDonarName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAnimalWelfare = new javax.swing.JButton();
        btnEducation = new javax.swing.JButton();
        btnFunds = new javax.swing.JButton();
        btnDisaster = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        lblDonarName.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        lblDonarName.setForeground(new java.awt.Color(2, 55, 108));
        lblDonarName.setText("Welcome Donor");
        add(lblDonarName);
        lblDonarName.setBounds(350, 220, 183, 32);

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 55, 108));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Your generous donation is helping in making our world a better place for everyone.");
        add(jLabel1);
        jLabel1.setBounds(340, 300, 720, 24);

        btnAnimalWelfare.setBackground(new java.awt.Color(2, 55, 108));
        btnAnimalWelfare.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAnimalWelfare.setForeground(new java.awt.Color(255, 255, 255));
        btnAnimalWelfare.setText("Donate Animal Welfare Kit");
        btnAnimalWelfare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimalWelfareActionPerformed(evt);
            }
        });
        add(btnAnimalWelfare);
        btnAnimalWelfare.setBounds(350, 400, 340, 80);

        btnEducation.setBackground(new java.awt.Color(2, 55, 108));
        btnEducation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEducation.setForeground(new java.awt.Color(255, 255, 255));
        btnEducation.setText("Donate Education Kit");
        btnEducation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEducationActionPerformed(evt);
            }
        });
        add(btnEducation);
        btnEducation.setBounds(350, 500, 340, 80);

        btnFunds.setBackground(new java.awt.Color(2, 55, 108));
        btnFunds.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFunds.setForeground(new java.awt.Color(255, 255, 255));
        btnFunds.setText("Donate Funds");
        btnFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFundsActionPerformed(evt);
            }
        });
        add(btnFunds);
        btnFunds.setBounds(350, 700, 340, 80);

        btnDisaster.setBackground(new java.awt.Color(2, 55, 108));
        btnDisaster.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDisaster.setForeground(new java.awt.Color(255, 255, 255));
        btnDisaster.setText("Donate Disaster Kit");
        btnDisaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisasterActionPerformed(evt);
            }
        });
        add(btnDisaster);
        btnDisaster.setBounds(350, 600, 340, 80);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)));
        add(jLabel2);
        jLabel2.setBounds(20, 50, 300, 280);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PictureUI/Thank you Donor.PNG"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(820, 380, 850, 410);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnimalWelfareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimalWelfareActionPerformed
        // TODO add your handling code here:
        DonateAnimalWelfareKit panel = new DonateAnimalWelfareKit(account, network, enterprise);
        panel.setVisible(true);
    }//GEN-LAST:event_btnAnimalWelfareActionPerformed

    private void btnEducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEducationActionPerformed
        // TODO add your handling code here:
        DonateEducationKit panel = new DonateEducationKit(account, network, enterprise);
        panel.setVisible(true);
    }//GEN-LAST:event_btnEducationActionPerformed

    private void btnFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFundsActionPerformed
        // TODO add your handling code here:
        DonateFunds panel = new DonateFunds(account, network, enterprise);
        panel.setVisible(true);
    }//GEN-LAST:event_btnFundsActionPerformed

    private void btnDisasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisasterActionPerformed
        // TODO add your handling code here:
        DonateDisasterKit panel = new DonateDisasterKit(account, network, enterprise);
        panel.setVisible(true);
    }//GEN-LAST:event_btnDisasterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnimalWelfare;
    private javax.swing.JButton btnDisaster;
    private javax.swing.JButton btnEducation;
    private javax.swing.JButton btnFunds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDonarName;
    // End of variables declaration//GEN-END:variables
}

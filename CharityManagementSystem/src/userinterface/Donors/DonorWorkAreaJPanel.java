/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Donors;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
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

        lblDonarName.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        lblDonarName.setText("Welcome Donor");

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 0, 18)); // NOI18N
        jLabel1.setText("Your generous donation is helping in making our world a better place for everyone");

        btnAnimalWelfare.setText("Donate Animal Welfare Kit");
        btnAnimalWelfare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimalWelfareActionPerformed(evt);
            }
        });

        btnEducation.setText("Donate Education Kit");
        btnEducation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEducationActionPerformed(evt);
            }
        });

        btnFunds.setText("Donate funds");
        btnFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFundsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(lblDonarName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(btnAnimalWelfare))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(btnEducation))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(btnFunds)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblDonarName)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addComponent(btnAnimalWelfare)
                .addGap(39, 39, 39)
                .addComponent(btnEducation)
                .addGap(39, 39, 39)
                .addComponent(btnFunds)
                .addContainerGap(179, Short.MAX_VALUE))
        );
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnimalWelfare;
    private javax.swing.JButton btnEducation;
    private javax.swing.JButton btnFunds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDonarName;
    // End of variables declaration//GEN-END:variables
}

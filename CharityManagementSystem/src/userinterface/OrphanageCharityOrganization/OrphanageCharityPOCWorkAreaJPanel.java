/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.OrphanageCharityOrganization;

import userinterface.AnimalWelfareCharityOrganization.*;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.Organization.AnimalWelfareCharityOrganization;
import Business.Organization.AnimalWelfareKitInventoryManagementOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.AnimalWelfareCharityOrganization;
import Business.Organization.OrphanageCharityOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AnimalWelfareKitInventoryRequest;
import Business.WorkQueue.CommerceFinanceRequest;
import Business.WorkQueue.DonorRegistrationRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prabs
 */
public class OrphanageCharityPOCWorkAreaJPanel extends javax.swing.JPanel {

    private UserAccount account;
    private Enterprise enterprise;
    private Organization organization;
    private OrphanageCharityOrganization orphanageWelfareCharityOrg;
    private Network network;
    /**
     * Creates new form AnimalWelfareCharityPOCWorkAreaJPanel
     */
    public OrphanageCharityPOCWorkAreaJPanel(UserAccount account, Enterprise enterprise, Organization organization, Network network) {
        initComponents();
        this.account =account;
        this.enterprise = enterprise;
        this.organization =organization;
        this.network = network;
        this.orphanageWelfareCharityOrg = (OrphanageCharityOrganization) organization;
        txtTotalFunds.setText(String.valueOf(orphanageWelfareCharityOrg.getTotalFunds()));
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblFunds = new javax.swing.JTable();
        jLabelInventoryOverview = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTotalFunds = new javax.swing.JTextField();
        jLabelIncomingKit1 = new javax.swing.JLabel();

        tblFunds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Date", "Funds", "Donor Name", "Source", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFunds);
        if (tblFunds.getColumnModel().getColumnCount() > 0) {
            tblFunds.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabelInventoryOverview.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelInventoryOverview.setText("Total Donations collected for Orphanage Charity Organization");

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Orphanage Charity Admin");

        jLabel1.setText("Total Funds");

        jLabelIncomingKit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelIncomingKit1.setText("Incoming Funds");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelIncomingKit1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 765, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabelInventoryOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelIncomingKit1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jLabelInventoryOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(402, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFunds.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblFunds.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Donated")) {
                JOptionPane.showMessageDialog(null, "Please wait until Finance Team acceptance.");
                return;
            }
            else if (request.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            }
            else if (request.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected.");
                return;
            }
            else {
                if (request instanceof CommerceFinanceRequest) {
                    CommerceFinanceRequest fundRequest = (CommerceFinanceRequest) tblFunds.getValueAt(selectedRow, 0);
                    double amount = fundRequest.getAmount();
                    double totalFunds = orphanageWelfareCharityOrg.getTotalFunds() + amount;
                    orphanageWelfareCharityOrg.setTotalFunds(totalFunds);
                    txtTotalFunds.setText(String.valueOf(orphanageWelfareCharityOrg.getTotalFunds()));
                }
                request.setReceiver(account);
                request.setStatus("Completed");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is completed and funds added to the organization");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Choose a request to accept.");
            return;
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFunds.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblFunds.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Donated")) {
                JOptionPane.showMessageDialog(null, "Please wait until Finance Team acceptance");
                return;
            }
            else if (request.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            }
            else if (request.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected.");
                return;
            }
            else {
                request.setReceiver(account);
                request.setStatus("Rejected");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is rejected");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Choose a request to reject.");
            return;
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIncomingKit1;
    private javax.swing.JLabel jLabelInventoryOverview;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFunds;
    private javax.swing.JTextField txtTotalFunds;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblFunds.getModel();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        model.setRowCount(0);

        if (organization.getWorkQueue() == null) {
            organization.setWorkQueue(new WorkQueue());
        }
        for (WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()) {

            if (workRequest instanceof CommerceFinanceRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = formatter.format(((CommerceFinanceRequest) workRequest).getRequestDate());
                row[2] = ((CommerceFinanceRequest) workRequest).getAmount();
                row[3] = ((CommerceFinanceRequest) workRequest).getDonorName();
                row[4] = ((CommerceFinanceRequest) workRequest).getDonorType();
                row[5] = ((CommerceFinanceRequest) workRequest).getStatus();

                model.addRow(row);
            }
        }
        
        

    }

}

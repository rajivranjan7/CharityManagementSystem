/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.AnimalWelfareKitInventoryManagementOrganization;

import userinterface.AnimalWelfareCharityOrganization.*;
import Business.Enterprise.Enterprise;
import Business.Organization.AnimalWelfareCharityOrganization;
import Business.Organization.AnimalWelfareKitInventoryManagementOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.AnimalWelfareCharityOrganization;
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
public class AnimalWelfareKitInventoryManagerWorkAreaJPanel extends javax.swing.JPanel {

    private UserAccount account;
    private Enterprise enterprise;
    private Organization organization;
    private AnimalWelfareKitInventoryManagementOrganization animalWelfareInventoryOrg;
    /**
     * Creates new form AnimalWelfareCharityPOCWorkAreaJPanel
     */
    public AnimalWelfareKitInventoryManagerWorkAreaJPanel(UserAccount account, Enterprise enterprise, Organization organization) {
        initComponents();
        this.account =account;
        this.enterprise = enterprise;
        this.organization =organization;
        this.animalWelfareInventoryOrg = (AnimalWelfareKitInventoryManagementOrganization) organization;
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
        tblKits = new javax.swing.JTable();
        jLabelIncomingKit = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();

        tblKits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Date", "Quantity", "Donor Name", "Source", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblKits);
        if (tblKits.getColumnModel().getColumnCount() > 0) {
            tblKits.getColumnModel().getColumn(0).setMinWidth(0);
            tblKits.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblKits.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabelIncomingKit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelIncomingKit.setText("Incoming Kits");

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
        jLabelTitle.setText("Animal Welfare Kit Inventory Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelIncomingKit, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabelIncomingKit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(503, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblKits.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblKits.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already completed.");
                return;
            }
            else if (request.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected.");
                return;
            }
            else if (request.getStatus().equalsIgnoreCase("Forwarded to Charity Organization")) {
                JOptionPane.showMessageDialog(null, "Request is already forwarded to the charity organization.");
                return;
            }
            else {
                if (request instanceof AnimalWelfareKitInventoryRequest) {
                    AnimalWelfareKitInventoryRequest fundRequest = (AnimalWelfareKitInventoryRequest) tblKits.getValueAt(selectedRow, 0);
//                    
//                    int quantity = fundRequest.getQuanity();
//                    int totalKits = animalWelfareInventoryOrg.getTotalKits() + quantity;
//                    animalWelfareInventoryOrg.setTotalKits(totalKits);
//                    txtTotalKits.setText(String.valueOf(animalWelfareInventoryOrg.getTotalKits()));
                }
                request.setReceiver(account);
                request.setStatus("Forwarded to Charity Organization");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is forwarded to the charity organization");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Choose a request to accept.");
            return;
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblKits.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblKits.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Forwarded to Charity Organization")) {
                JOptionPane.showMessageDialog(null, "Request is already forwarded to Charity Organization");
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
    private javax.swing.JLabel jLabelIncomingKit;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKits;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblKits.getModel();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        model.setRowCount(0);

        if (organization.getWorkQueue() == null) {
            organization.setWorkQueue(new WorkQueue());
        }
        for (WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()) {

            if (workRequest instanceof AnimalWelfareKitInventoryRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = formatter.format(((AnimalWelfareKitInventoryRequest) workRequest).getRequestDate());
                row[2] = ((AnimalWelfareKitInventoryRequest) workRequest).getQuanity();
                row[3] = ((AnimalWelfareKitInventoryRequest) workRequest).getDonorName();
                row[4] = ((AnimalWelfareKitInventoryRequest) workRequest).getDonorType();
                row[5] = ((AnimalWelfareKitInventoryRequest) workRequest).getStatus();

                model.addRow(row);
            }
        }

    }

}

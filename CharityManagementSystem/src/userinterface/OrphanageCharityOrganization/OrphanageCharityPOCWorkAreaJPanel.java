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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(2, 55, 108));
        setLayout(null);

        tblFunds.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
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
            tblFunds.getColumnModel().getColumn(0).setMinWidth(0);
            tblFunds.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblFunds.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(80, 220, 943, 177);

        jLabelInventoryOverview.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelInventoryOverview.setForeground(new java.awt.Color(2, 55, 108));
        jLabelInventoryOverview.setText("Total Donations collected for Orphanage Charity Organization");
        add(jLabelInventoryOverview);
        jLabelInventoryOverview.setBounds(240, 510, 645, 37);

        btnAccept.setBackground(new java.awt.Color(2, 55, 108));
        btnAccept.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept);
        btnAccept.setBounds(730, 410, 140, 40);

        btnReject.setBackground(new java.awt.Color(2, 55, 108));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject);
        btnReject.setBounds(880, 410, 140, 40);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(2, 55, 108));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Orphanage Charity Admin");
        add(jLabelTitle);
        jLabelTitle.setBounds(20, 30, 1180, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 55, 108));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Total Funds");
        add(jLabel1);
        jLabel1.setBounds(330, 590, 110, 30);

        txtTotalFunds.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtTotalFunds);
        txtTotalFunds.setBounds(470, 590, 231, 30);

        jLabelIncomingKit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelIncomingKit1.setForeground(new java.awt.Color(2, 55, 108));
        jLabelIncomingKit1.setText("Incoming Funds");
        add(jLabelIncomingKit1);
        jLabelIncomingKit1.setBounds(80, 180, 178, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\prabs\\Pictures\\Charity Pics\\orphange pic.PNG")); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(1060, 140, 610, 480);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-manager-64.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 110, 100);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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

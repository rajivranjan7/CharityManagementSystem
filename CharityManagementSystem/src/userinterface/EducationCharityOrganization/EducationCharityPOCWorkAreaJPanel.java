/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.EducationCharityOrganization;

import userinterface.AnimalWelfareCharityOrganization.*;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.Organization.AnimalWelfareCharityOrganization;
import Business.Organization.AnimalWelfareKitInventoryManagementOrganization;
import Business.Organization.EducationCharityOrganization;
import Business.Organization.EducationKitInventoryManagementOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.AnimalWelfareCharityOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AnimalWelfareKitInventoryRequest;
import Business.WorkQueue.CommerceFinanceRequest;
import Business.WorkQueue.DonorRegistrationRequest;
import Business.WorkQueue.EducationWelfareKitInventoryRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prabs
 */
public class EducationCharityPOCWorkAreaJPanel extends javax.swing.JPanel {

    private UserAccount account;
    private Enterprise enterprise;
    private Organization organization;
    private EducationCharityOrganization educationCharityOrg;
    private EducationKitInventoryManagementOrganization educationInventoryOrg;
    private Network network;
    /**
     * Creates new form AnimalWelfareCharityPOCWorkAreaJPanel
     */
    public EducationCharityPOCWorkAreaJPanel(UserAccount account, Enterprise enterprise, Organization organization, Network network) {
        initComponents();
        this.account =account;
        this.enterprise = enterprise;
        this.organization =organization;
        this.network = network;
        this.educationCharityOrg = (EducationCharityOrganization) organization;
        txtTotalFunds.setText(String.valueOf(educationCharityOrg.getTotalFunds()));
        for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
            if(e.getEnterpriseType() == Enterprise.EnterpriseType.InventoryManagementDirectory){
                for(Organization org : e.getOrganizationDirectory().getOrganizationList()){
                    if(org.getType() == Organization.Type.EducationKitInventoryManagementOrganization){
                        this.educationInventoryOrg = (EducationKitInventoryManagementOrganization) org;
                    }}}}
        
        txtTotalKits.setText(String.valueOf(educationCharityOrg.getTotalKits()));
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
        jLabelIncomingKit = new javax.swing.JLabel();
        jLabelInventoryOverview = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTotalFunds = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKits = new javax.swing.JTable();
        jLabelIncomingKit1 = new javax.swing.JLabel();
        jLabelInventoryOverview1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalKits = new javax.swing.JTextField();
        btnAccept1 = new javax.swing.JButton();
        btnReject1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
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
        jScrollPane1.setBounds(120, 140, 940, 177);

        jLabelIncomingKit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelIncomingKit.setForeground(new java.awt.Color(2, 55, 108));
        jLabelIncomingKit.setText("Incoming Kits");
        add(jLabelIncomingKit);
        jLabelIncomingKit.setBounds(120, 500, 178, 37);

        jLabelInventoryOverview.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelInventoryOverview.setForeground(new java.awt.Color(2, 55, 108));
        jLabelInventoryOverview.setText("Total Donations collected for Education Charity Organization");
        add(jLabelInventoryOverview);
        jLabelInventoryOverview.setBounds(120, 390, 645, 37);

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
        btnAccept.setBounds(933, 330, 130, 36);

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
        btnReject.setBounds(793, 330, 130, 36);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(2, 55, 108));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Education Charity Admin");
        add(jLabelTitle);
        jLabelTitle.setBounds(120, 20, 940, 35);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 55, 108));
        jLabel1.setText("Total Funds");
        add(jLabel1);
        jLabel1.setBounds(220, 440, 93, 22);
        add(txtTotalFunds);
        txtTotalFunds.setBounds(330, 440, 231, 22);

        tblKits.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
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
        jScrollPane2.setViewportView(tblKits);
        if (tblKits.getColumnModel().getColumnCount() > 0) {
            tblKits.getColumnModel().getColumn(0).setMinWidth(0);
            tblKits.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblKits.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        add(jScrollPane2);
        jScrollPane2.setBounds(120, 540, 950, 175);

        jLabelIncomingKit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelIncomingKit1.setForeground(new java.awt.Color(2, 55, 108));
        jLabelIncomingKit1.setText("Incoming Funds");
        add(jLabelIncomingKit1);
        jLabelIncomingKit1.setBounds(120, 100, 178, 37);

        jLabelInventoryOverview1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelInventoryOverview1.setForeground(new java.awt.Color(2, 55, 108));
        jLabelInventoryOverview1.setText("Total Kits Donations collected for Education Charity Organization");
        add(jLabelInventoryOverview1);
        jLabelInventoryOverview1.setBounds(120, 770, 645, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 55, 108));
        jLabel2.setText("Total Kits");
        add(jLabel2);
        jLabel2.setBounds(240, 820, 75, 22);
        add(txtTotalKits);
        txtTotalKits.setBounds(330, 820, 240, 22);

        btnAccept1.setBackground(new java.awt.Color(2, 55, 108));
        btnAccept1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAccept1.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept1.setText("Accept");
        btnAccept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccept1ActionPerformed(evt);
            }
        });
        add(btnAccept1);
        btnAccept1.setBounds(933, 730, 140, 36);

        btnReject1.setBackground(new java.awt.Color(2, 55, 108));
        btnReject1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReject1.setForeground(new java.awt.Color(255, 255, 255));
        btnReject1.setText("Reject");
        btnReject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReject1ActionPerformed(evt);
            }
        });
        add(btnReject1);
        btnReject1.setBounds(793, 730, 130, 36);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-avatar-64 (20).png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 110, 90);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFunds.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblFunds.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Requested")) {
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
                    double totalFunds = educationCharityOrg.getTotalFunds() + amount;
                    educationCharityOrg.setTotalFunds(totalFunds);
                    txtTotalFunds.setText(String.valueOf(educationCharityOrg.getTotalFunds()));
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

    private void btnAccept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccept1ActionPerformed
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
                
                if (request instanceof EducationWelfareKitInventoryRequest) {
                    EducationWelfareKitInventoryRequest fundRequest = (EducationWelfareKitInventoryRequest) tblKits.getValueAt(selectedRow, 0);
                    
                    int quantity = fundRequest.getQuanity();
                    int totalKits = educationCharityOrg.getTotalKits() + quantity;
                    educationCharityOrg.setTotalKits(totalKits);
                    txtTotalKits.setText(String.valueOf(educationCharityOrg.getTotalKits()));
                }
                request.setReceiver(account);
                request.setStatus("Completed");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is completed");
            }
            else {
                JOptionPane.showMessageDialog(null, "Please wait until Inventory team acceptance.");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Choose a request to accept.");
            return;
        }
    }//GEN-LAST:event_btnAccept1ActionPerformed

    private void btnReject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReject1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblKits.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblKits.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Donated")) {
                JOptionPane.showMessageDialog(null, "Please wait until Inventory Team acceptance");
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
    }//GEN-LAST:event_btnReject1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAccept1;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnReject1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelIncomingKit;
    private javax.swing.JLabel jLabelIncomingKit1;
    private javax.swing.JLabel jLabelInventoryOverview;
    private javax.swing.JLabel jLabelInventoryOverview1;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFunds;
    private javax.swing.JTable tblKits;
    private javax.swing.JTextField txtTotalFunds;
    private javax.swing.JTextField txtTotalKits;
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
        
        DefaultTableModel model1 = (DefaultTableModel) tblKits.getModel();

        model1.setRowCount(0);

        if (organization.getWorkQueue() == null) {
            organization.setWorkQueue(new WorkQueue());
        }
        
        for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
            if(e.getEnterpriseType() == EnterpriseType.InventoryManagementDirectory){
                for(Organization org : e.getOrganizationDirectory().getOrganizationList()){
                    if(org.getType() == Organization.Type.EducationKitInventoryManagementOrganization){
                        for (WorkRequest workRequest : org.getWorkQueue().getWorkRequestList()) {

                           if (workRequest instanceof EducationWelfareKitInventoryRequest) {
                            Object[] row = new Object[model1.getColumnCount()];
                            row[0] = workRequest;
                            row[1] = formatter.format(((EducationWelfareKitInventoryRequest) workRequest).getRequestDate());
                            row[2] = ((EducationWelfareKitInventoryRequest) workRequest).getQuanity();
                            row[3] = ((EducationWelfareKitInventoryRequest) workRequest).getDonorName();
                            row[4] = ((EducationWelfareKitInventoryRequest) workRequest).getDonorType();
                            row[5] = ((EducationWelfareKitInventoryRequest) workRequest).getStatus();

                            model1.addRow(row);
                        }
                    }
                    }
                }
            }
        }
        

    }


}

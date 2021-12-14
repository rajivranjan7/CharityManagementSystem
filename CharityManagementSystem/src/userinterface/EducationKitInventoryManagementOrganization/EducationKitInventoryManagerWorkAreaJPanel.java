/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.EducationKitInventoryManagementOrganization;

import userinterface.AnimalWelfareKitInventoryManagementOrganization.*;
import userinterface.AnimalWelfareCharityOrganization.*;
import Business.Enterprise.Enterprise;
import Business.Organization.AnimalWelfareCharityOrganization;
import Business.Organization.AnimalWelfareKitInventoryManagementOrganization;
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
public class EducationKitInventoryManagerWorkAreaJPanel extends javax.swing.JPanel {

    private UserAccount account;
    private Enterprise enterprise;
    private Organization organization;
    private EducationKitInventoryManagementOrganization educationWelfareInventoryOrg;
    /**
     * Creates new form AnimalWelfareCharityPOCWorkAreaJPanel
     */
    public EducationKitInventoryManagerWorkAreaJPanel(UserAccount account, Enterprise enterprise, Organization organization) {
        initComponents();
        this.account =account;
        this.enterprise = enterprise;
        this.organization =organization;
        this.educationWelfareInventoryOrg = (EducationKitInventoryManagementOrganization) organization;
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
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

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
        jScrollPane1.setViewportView(tblKits);
        if (tblKits.getColumnModel().getColumnCount() > 0) {
            tblKits.getColumnModel().getColumn(0).setMinWidth(0);
            tblKits.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblKits.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(80, 250, 1075, 177);

        jLabelIncomingKit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelIncomingKit.setForeground(new java.awt.Color(2, 55, 108));
        jLabelIncomingKit.setText("Incoming Kits");
        add(jLabelIncomingKit);
        jLabelIncomingKit.setBounds(80, 200, 178, 37);

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
        btnAccept.setBounds(1030, 450, 123, 36);

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
        btnReject.setBounds(900, 450, 123, 36);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(2, 55, 108));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Education Kit Inventory Admin");
        add(jLabelTitle);
        jLabelTitle.setBounds(70, 40, 1080, 35);

        jLabel9.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(2, 55, 108));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Welcome Admin");
        add(jLabel9);
        jLabel9.setBounds(0, 130, 1210, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-avatar-64 (8).png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 110, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PictureUI/ico-hero-coin-charity-1.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(300, 460, 920, 510);
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
                    EducationWelfareKitInventoryRequest fundRequest = (EducationWelfareKitInventoryRequest) tblKits.getValueAt(selectedRow, 0);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
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

            if (workRequest instanceof EducationWelfareKitInventoryRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = formatter.format(((EducationWelfareKitInventoryRequest) workRequest).getRequestDate());
                row[2] = ((EducationWelfareKitInventoryRequest) workRequest).getQuanity();
                row[3] = ((EducationWelfareKitInventoryRequest) workRequest).getDonorName();
                row[4] = ((EducationWelfareKitInventoryRequest) workRequest).getDonorType();
                row[5] = ((EducationWelfareKitInventoryRequest) workRequest).getStatus();

                model.addRow(row);
            }
        }

    }

}

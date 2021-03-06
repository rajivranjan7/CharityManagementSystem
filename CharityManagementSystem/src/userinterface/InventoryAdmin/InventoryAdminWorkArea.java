/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.InventoryAdmin;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AnimalWelfareKitInventoryManagerRole;
import Business.Role.DisasterReliefKitInventoryManagerRole;
import Business.Role.EducationKitInventoryManagerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AnimalWelfareKitInventoryRequest;
import Business.WorkQueue.DisasterWelfareKitInventoryRequest;
import Business.WorkQueue.DonorRegistrationRequest;
import Business.WorkQueue.EducationWelfareKitInventoryRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author prabs
 */
public class InventoryAdminWorkArea extends javax.swing.JPanel {

    private static JPanel container;
    private static EcoSystem system;
    private static Network network;
    private static Enterprise enterprise;
    private static UserAccount account;
    
     JFreeChart jchart;
    
    /**
     * Creates new form InventoryAdminWorkArea
     */
    public InventoryAdminWorkArea(JPanel container, EcoSystem system, Network network, Enterprise enterprise, UserAccount account) {
        initComponents();
        this.container = container;
        this.system = system;
        this.network = network;
        this.enterprise = enterprise;
        this.account = account;
        populateOrganizationTable();
        populateOrganizationTypes();
        //populateWorkRequestTable();
        populateTable();
        populateBarGraph();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganizationList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxOrgType = new javax.swing.JComboBox();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAddOrganization = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboBoxRole = new javax.swing.JComboBox();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        lblDonarName1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDonarName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWorkQueue = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonDownloadReport = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanelReport = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 55, 108));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Inventory Admin");
        add(jLabel7);
        jLabel7.setBounds(18, 11, 1116, 67);

        jTabbedPane1.setForeground(new java.awt.Color(2, 55, 108));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 900));
        jPanel1.setLayout(null);

        jScrollPane1.setForeground(new java.awt.Color(2, 55, 108));

        tblOrganizationList.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)))));
        tblOrganizationList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Organization Name", "Organization Type", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganizationList);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 1109, 194);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 55, 108));
        jLabel1.setText("Organization List");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 120, 180, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 55, 108));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Organization Type");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 410, 170, 40);

        comboBoxOrgType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxOrgType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrgTypeActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxOrgType);
        comboBoxOrgType.setBounds(430, 410, 220, 40);
        jPanel1.add(txtUsername);
        txtUsername.setBounds(430, 600, 220, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 55, 108));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Organization Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 540, 180, 40);

        btnAddOrganization.setBackground(new java.awt.Color(2, 55, 108));
        btnAddOrganization.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrganization.setText("Add Organization");
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddOrganization);
        btnAddOrganization.setBounds(430, 770, 220, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 55, 108));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 610, 130, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 55, 108));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(230, 670, 120, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 55, 108));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Role");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 470, 90, 40);

        comboBoxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboBoxRole);
        comboBoxRole.setBounds(430, 470, 220, 40);
        jPanel1.add(txtName);
        txtName.setBounds(430, 540, 220, 40);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(430, 670, 220, 40);

        btnDelete.setBackground(new java.awt.Color(2, 55, 108));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(970, 360, 150, 40);

        lblDonarName1.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        lblDonarName1.setForeground(new java.awt.Color(2, 55, 108));
        lblDonarName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonarName1.setText("Welcome Inventory Admin");
        jPanel1.add(lblDonarName1);
        lblDonarName1.setBounds(10, 70, 1109, 32);

        jTabbedPane1.addTab("Manage Organization", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        lblDonarName.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        lblDonarName.setForeground(new java.awt.Color(2, 55, 108));
        lblDonarName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonarName.setText("Welcome Inventory Admin");
        jPanel2.add(lblDonarName);
        lblDonarName.setBounds(10, 73, 1109, 32);

        tblWorkQueue.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
        tblWorkQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Request Date", "Organization Type", "Quantity", "Donor Name", "Donor Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblWorkQueue);
        if (tblWorkQueue.getColumnModel().getColumnCount() > 0) {
            tblWorkQueue.getColumnModel().getColumn(0).setMinWidth(0);
            tblWorkQueue.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblWorkQueue.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 150, 1109, 148);

        jButton1.setBackground(new java.awt.Color(2, 55, 108));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Accept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(830, 330, 140, 40);

        jButton2.setBackground(new java.awt.Color(2, 55, 108));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reject ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(990, 330, 130, 40);

        jButtonDownloadReport.setBackground(new java.awt.Color(2, 55, 108));
        jButtonDownloadReport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDownloadReport.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDownloadReport.setText("Download");
        jButtonDownloadReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDownloadReportActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDownloadReport);
        jButtonDownloadReport.setBounds(95, 578, 130, 40);

        jPanelReport.setLayout(new javax.swing.BoxLayout(jPanelReport, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelReport, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelReport, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(274, 485, 741, 344);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(2, 55, 108));
        jLabel9.setText("Inventory List");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 120, 180, 22);

        jTabbedPane1.addTab("Manage work request", jPanel2);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 96, 1200, 898);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-avatar-64 (14).png"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(0, 0, 110, 90);
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxOrgTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOrgTypeActionPerformed
        // TODO add your handling code here:
        Organization.Type type = (Organization.Type) comboBoxOrgType.getSelectedItem();
        if(type == Organization.Type.AnimalWelfareKitInventoryManagementOrganization){
            comboBoxRole.removeAllItems();
            comboBoxRole.addItem(Role.RoleType.AnimalWelfareKitInventoryManagerRole);
        }
        else if(type == Organization.Type.DisasterReliefKitInventoryManagementOrganization){
            comboBoxRole.removeAllItems();
            comboBoxRole.addItem(Role.RoleType.DisasterReliefKitInventoryManagerRole);
        }
        else if(type == Organization.Type.EducationKitInventoryManagementOrganization){
            comboBoxRole.removeAllItems();
            comboBoxRole.addItem(Role.RoleType.EducationKitInventoryManagerRole);
        }
        
    }//GEN-LAST:event_comboBoxOrgTypeActionPerformed

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed
        // TODO add your handling code here:
        String name = txtUsername.getText().trim();
        Organization.Type type = (Organization.Type) comboBoxOrgType.getSelectedItem();
        if(!name.isEmpty()){
            Organization org = enterprise.getOrganizationDirectory().createOrganization(type, txtName.getText());
            if (type == Organization.Type.AnimalWelfareKitInventoryManagementOrganization) {
                System.out.println("AnimalWelfareKitInventoryManagementOrganization");
                if(org.getType() == Organization.Type.AnimalWelfareKitInventoryManagementOrganization){
                    Employee emp = org.getEmployeeDirectory().createEmployee(txtName.getText());
                    UserAccount ua1 = org.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), emp, new AnimalWelfareKitInventoryManagerRole());

                }
            }
            else if (type == Organization.Type.DisasterReliefKitInventoryManagementOrganization) {
                System.out.println("DisasterReliefKitInventoryManagementOrganization");
                if(org.getType() == Organization.Type.DisasterReliefKitInventoryManagementOrganization){
                    Employee emp = org.getEmployeeDirectory().createEmployee(txtName.getText());
                    UserAccount ua1 = org.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), emp, new DisasterReliefKitInventoryManagerRole());

                }
            }
            else if (type == Organization.Type.EducationKitInventoryManagementOrganization) {
                System.out.println("EducationKitInventoryManagementOrganization");
                if(org.getType() == Organization.Type.EducationKitInventoryManagementOrganization){
                    Employee emp = org.getEmployeeDirectory().createEmployee(txtName.getText());
                    UserAccount ua1 = org.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), emp, new EducationKitInventoryManagerRole());

                }
            }
            

            JOptionPane.showMessageDialog(null, "Organization Successfully Created");
            txtUsername.setText("");
            txtPassword.setText("");
            txtName.setText("");
            comboBoxOrgType.setSelectedIndex(0);

        } else{
            JOptionPane.showMessageDialog(null, "Enter Organization name");
        }
        populateOrganizationTable();
    }//GEN-LAST:event_btnAddOrganizationActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        boolean flag = true;
        int selectedRow = tblOrganizationList.getSelectedRow();
        if(selectedRow<0){
            flag=false;
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
        }
        if(flag){
            DefaultTableModel tableModel = (DefaultTableModel) tblOrganizationList.getModel();
            Object org = tableModel.getValueAt(selectedRow, 0 );
            Organization.Type type = (Organization.Type) tableModel.getValueAt(selectedRow, 1 );
            ArrayList<Organization> orgList = enterprise.getOrganizationDirectory().getOrganizationList();
            for(int i = 0; i < enterprise.getOrganizationDirectory().getOrganizationList().size(); i++){
                if((orgList.get(i).getName() == String.valueOf(org)) && (orgList.get(i).getType() == type)){
                    enterprise.getOrganizationDirectory().getOrganizationList().remove(i);
                    populateOrganizationTable();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkQueue.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblWorkQueue.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Forwarded to Charity Organization")) {
                JOptionPane.showMessageDialog(null, "Request already forwarded.");
                return;
            }
            else if (request.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected");
                return;
            }
            else {
                request.setReceiver(account);
                request.setStatus("Forwarded to Charity Organization");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is forwarded to Charity Organization");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Choose a request to approve.");
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkQueue.getSelectedRow();

        if (selectedRow >= 0) {
            WorkRequest request = (WorkRequest) tblWorkQueue.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Forwarded to Charity Organization")) {
                JOptionPane.showMessageDialog(null, "Request already forwarded.");
                return;
            }
            else if (request.getStatus().equalsIgnoreCase("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already rejected");
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonDownloadReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDownloadReportActionPerformed
        // TODO add your handling code here:
         try {
            int width = 640;
            int height = 480;
            File BarChart = new File("ReportInventory.jpeg");
            ChartUtilities.saveChartAsJPEG(BarChart, jchart, width, height);
            JOptionPane.showMessageDialog(null, "Report has been downloaded successfully!");
        } catch (IOException ex) {
            Logger.getLogger("Exception");
        } 
    }//GEN-LAST:event_jButtonDownloadReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox comboBoxOrgType;
    private javax.swing.JComboBox comboBoxRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonDownloadReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDonarName;
    private javax.swing.JLabel lblDonarName1;
    private javax.swing.JTable tblOrganizationList;
    private javax.swing.JTable tblWorkQueue;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateOrganizationTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrganizationList.getModel();
        
        model.setRowCount(0);
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if(e.getName() == enterprise.getName()){
                for(Organization org : e.getOrganizationDirectory().getOrganizationList()){
                Object[] row = new Object[4];
                row[0] = org.getName();
                row[1] = org.getType();
                for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                    if(ua.getRole().toString().equals(Role.RoleType.AnimalWelfareKitInventoryManagerRole.toString())){
                        row[2] = ua.getUsername();
                        row[3] = ua.getPassword();
                    }
                    else if(ua.getRole().toString().equals(Role.RoleType.DisasterReliefKitInventoryManagerRole.toString())){
                        row[2] = ua.getUsername();
                        row[3] = ua.getPassword();
                    }
                    else if(ua.getRole().toString().equals(Role.RoleType.EducationKitInventoryManagerRole.toString())){
                        row[2] = ua.getUsername();
                        row[3] = ua.getPassword();
                    }
                }
                model.addRow(row);
            }
            }
        }
    }

    private void populateOrganizationTypes() {
        comboBoxOrgType.removeAllItems();
        comboBoxOrgType.addItem(Organization.Type.AnimalWelfareKitInventoryManagementOrganization);
        comboBoxOrgType.addItem(Organization.Type.DisasterReliefKitInventoryManagementOrganization);
        comboBoxOrgType.addItem(Organization.Type.EducationKitInventoryManagementOrganization);
    }

    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblWorkQueue.getModel();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        model.setRowCount(0);

        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (org.getWorkQueue() == null) {
                org.setWorkQueue(new WorkQueue());
            }
            for (WorkRequest workRequest : org.getWorkQueue().getWorkRequestList()) {

            if (workRequest instanceof AnimalWelfareKitInventoryRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = formatter.format(((AnimalWelfareKitInventoryRequest) workRequest).getRequestDate());
                row[2] = ((AnimalWelfareKitInventoryRequest) workRequest).getOrgType();
                row[3] = ((AnimalWelfareKitInventoryRequest) workRequest).getQuanity();
                row[4] = ((AnimalWelfareKitInventoryRequest) workRequest).getDonorName();
                row[5] = ((AnimalWelfareKitInventoryRequest) workRequest).getDonorType();
                row[6] = ((AnimalWelfareKitInventoryRequest) workRequest).getStatus();

                model.addRow(row);
            }
            else if (workRequest instanceof DisasterWelfareKitInventoryRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = formatter.format(((DisasterWelfareKitInventoryRequest) workRequest).getRequestDate());
                row[2] = ((DisasterWelfareKitInventoryRequest) workRequest).getOrgType();
                row[3] = ((DisasterWelfareKitInventoryRequest) workRequest).getQuanity();
                row[4] = ((DisasterWelfareKitInventoryRequest) workRequest).getDonorName();
                row[5] = ((DisasterWelfareKitInventoryRequest) workRequest).getDonorType();
                row[6] = ((DisasterWelfareKitInventoryRequest) workRequest).getStatus();

                model.addRow(row);
            }
            else if (workRequest instanceof EducationWelfareKitInventoryRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = formatter.format(((EducationWelfareKitInventoryRequest) workRequest).getRequestDate());
                row[2] = ((EducationWelfareKitInventoryRequest) workRequest).getOrgType();
                row[3] = ((EducationWelfareKitInventoryRequest) workRequest).getQuanity();
                row[4] = ((EducationWelfareKitInventoryRequest) workRequest).getDonorName();
                row[5] = ((EducationWelfareKitInventoryRequest) workRequest).getDonorType();
                row[6] = ((EducationWelfareKitInventoryRequest) workRequest).getStatus();

                model.addRow(row);
            }
        }
    }
        
        

    }

    private void populateBarGraph() {
        DefaultTableModel dtm = (DefaultTableModel) tblWorkQueue.getModel();
        int rowCount = dtm.getRowCount();
        //System.out.println("Rowcount + "+ rowCount);
        int count=0;
        double awkits = 0.0;
        double drkits = 0.0;
        double ekits = 0.0;
        double okits = 0.0;
        while(count<rowCount){
            if(tblWorkQueue.getValueAt(count, 2).toString().contains("nimal")){
                awkits += Double.parseDouble(tblWorkQueue.getValueAt(count, 3).toString());
            }
            if(tblWorkQueue.getValueAt(count, 2).toString().contains("isaster")){
                drkits += Double.parseDouble(tblWorkQueue.getValueAt(count, 3).toString());
            }
            if(tblWorkQueue.getValueAt(count, 2).toString().contains("cation")){
                ekits += Double.parseDouble(tblWorkQueue.getValueAt(count, 3).toString());
            }
            if(tblWorkQueue.getValueAt(count, 2).toString().contains("rphan")){
                okits += Double.parseDouble(tblWorkQueue.getValueAt(count, 3).toString());
            }
            count++;
        }
        System.out.println("AW: " + awkits);
        System.out.println("DR: " + drkits);
        System.out.println("E: " + ekits);
        System.out.println("O: " + okits);

        DefaultCategoryDataset data = new DefaultCategoryDataset();

        data.setValue(awkits, "TotalKits", "Animal Welfare");
        data.setValue(drkits, "TotalKits", "Disaster Relief");
        data.setValue(ekits, "TotalKits", "Education");
        data.setValue(okits, "TotalKits", "Orphanage");
        jchart = ChartFactory.createBarChart3D("Total Kit Donations", "Organization", "Funds", data, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);

//        ChartFrame chartframe = new ChartFrame("Total Donations Record", jchart,true);
//        chartframe.setVisible(true);
//        chartframe.setSize(500,400);
        ChartPanel chartPanel = new ChartPanel(jchart);

        jPanelReport.removeAll();
        jPanelReport.add(chartPanel);
        jPanelReport.updateUI();
        System.out.println("Kits Chart Created");
        
    } 
}

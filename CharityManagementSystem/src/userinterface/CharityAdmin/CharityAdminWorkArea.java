/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CharityAdmin;

import userinterface.Donors.*;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AnimalWelfareCharityOrganization;
import Business.Organization.DisasterReliefCharityOrganization;
import Business.Organization.EducationCharityOrganization;
import Business.Organization.Organization;
import Business.Organization.OrphanageCharityOrganization;
import Business.Role.AnimalWelfareCharityPOCRole;
import Business.Role.DisasterReliefCharityPOCRole;
import Business.Role.DonorIndividualRole;
import Business.Role.EducationCharityPOCRole;
import Business.Role.OrphanageCharityPOCRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonorRegistrationRequest;
import Business.WorkQueue.WorkRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nanditasharma
 */
public class CharityAdminWorkArea extends javax.swing.JPanel {

    private static JPanel container;
    private static EcoSystem system;
    private static Network network;
    private static Enterprise enterprise;
    /**
     * Creates new form DonorAdminWorkArea
     */
    public CharityAdminWorkArea(JPanel container, EcoSystem system, Network network, Enterprise enterprise) {
        initComponents();

        this.container = container;
        this.system = system;
        this.network = network;
        this.enterprise = enterprise;
        populateOrganizationTable();
        populateOrganizationTypes();
        populateDonationsTable();
    }
    
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
                    if(ua.getRole().toString().equals(Role.RoleType.AnimalWelfareCharityPOCRole.toString())){
                        row[2] = ua.getUsername();
                        row[3] = ua.getPassword();
                    }
                    else if(ua.getRole().toString().equals(Role.RoleType.EducationCharityPOCRole.toString())){
                        row[2] = ua.getUsername();
                        row[3] = ua.getPassword();
                    }
                    else if(ua.getRole().toString().equals(Role.RoleType.OrphanageCharityPOCRole.toString())){
                        row[2] = ua.getUsername();
                        row[3] = ua.getPassword();
                    }
                    else if(ua.getRole().toString().equals(Role.RoleType.DisasterReliefCharityPOCRole.toString())){
                        row[2] = ua.getUsername();
                        row[3] = ua.getPassword();
                    }
                }
                model.addRow(row);
            }
            }
        }
    }

    public void populateOrganizationTypes() {
        comboBoxOrgType.removeAllItems();
        comboBoxOrgType.addItem(Organization.Type.AnimalWelfareCharityOrganization);
        comboBoxOrgType.addItem(Organization.Type.EducationCharityOrganization);
        comboBoxOrgType.addItem(Organization.Type.OrphanageCharityOrganization);
        comboBoxOrgType.addItem(Organization.Type.DisasterReliefCharityOrganization);
    }
    
    private void populateDonationsTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblDonations.getModel();
        model.setRowCount(0);
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if(e.getName() == enterprise.getName()){
                for(Organization org : e.getOrganizationDirectory().getOrganizationList()){
                    Organization.Type type = org.getType();
                    Object[] row = new Object[3];
                    row[0] = org.getName();
                    if(type == Organization.Type.AnimalWelfareCharityOrganization){
                        row[1] = ((AnimalWelfareCharityOrganization) org).getTotalFunds();
                        row[2] = ((AnimalWelfareCharityOrganization) org).getTotalKits();
                    }
                    else if(type == Organization.Type.DisasterReliefCharityOrganization){
                        row[1] = ((DisasterReliefCharityOrganization) org).getTotalFunds();
                        row[2] = ((DisasterReliefCharityOrganization) org).getTotalKits();
                    }
                    else if(type == Organization.Type.EducationCharityOrganization){
                        row[1] = ((EducationCharityOrganization) org).getTotalFunds();
                        row[2] = ((EducationCharityOrganization) org).getTotalKits();
                    }
                    else if(type == Organization.Type.OrphanageCharityOrganization){
                        row[1] = ((OrphanageCharityOrganization) org).getTotalFunds();
                        row[2] = ((OrphanageCharityOrganization) org).getTotalKits();
                    }

                    model.addRow(row);
                }
                    
                }
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
        jPanel2 = new javax.swing.JPanel();
        lblDonarName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonations = new javax.swing.JTable();

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

        jLabel1.setText("Organization List");

        jLabel2.setText("Organization Type");

        comboBoxOrgType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxOrgType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrgTypeActionPerformed(evt);
            }
        });

        jLabel3.setText("Organization Name");

        btnAddOrganization.setText("Add Organization");
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });

        jLabel4.setText("Username");

        jLabel5.setText("Password");

        jLabel6.setText("Role");

        comboBoxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(btnAddOrganization)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxOrgType, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboBoxRole, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)))
                        .addGap(0, 154, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboBoxOrgType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(comboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(btnAddOrganization)
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Manage Organization", jPanel1);

        lblDonarName.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        lblDonarName.setText("Welcome Charity Admin");

        tblDonations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Organization Name", "Total Funds", "Total Kits"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDonations);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(lblDonarName)
                .addContainerGap(247, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblDonarName)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Collected Donations", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed
        // TODO add your handling code here:
        String name = txtUsername.getText().trim();
        Organization.Type type = (Organization.Type) comboBoxOrgType.getSelectedItem();
        if(!name.isEmpty()){
                Organization org = enterprise.getOrganizationDirectory().createOrganization(type, txtName.getText());
                if (type == Organization.Type.AnimalWelfareCharityOrganization) {
                System.out.println("AnimalWelfareCharityOrganization");
                    if(org.getType() == Organization.Type.AnimalWelfareCharityOrganization){
                        Employee emp = org.getEmployeeDirectory().createEmployee(txtName.getText());
                        UserAccount ua1 = org.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), emp, new AnimalWelfareCharityPOCRole());

                    }
                }
                else if (type == Organization.Type.DisasterReliefCharityOrganization) {
                System.out.println("DisasterReliefCharityOrganization");
                    if(org.getType() == Organization.Type.DisasterReliefCharityOrganization){
                        Employee emp = org.getEmployeeDirectory().createEmployee(txtName.getText());
                        UserAccount ua1 = org.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), emp, new DisasterReliefCharityPOCRole());

                    }
                }
                else if (type == Organization.Type.EducationCharityOrganization) {
                System.out.println("EducationCharityOrganization");
                    if(org.getType() == Organization.Type.EducationCharityOrganization){
                        Employee emp = org.getEmployeeDirectory().createEmployee(txtName.getText());
                        UserAccount ua1 = org.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), emp, new EducationCharityPOCRole());

                    }
                }
                else if (type == Organization.Type.OrphanageCharityOrganization) {
                System.out.println("OrphanageCharityOrganization");
                    if(org.getType() == Organization.Type.OrphanageCharityOrganization){
                        Employee emp = org.getEmployeeDirectory().createEmployee(txtName.getText());
                        UserAccount ua1 = org.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), emp, new OrphanageCharityPOCRole());

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

    private void comboBoxOrgTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOrgTypeActionPerformed
        // TODO add your handling code here:
        Organization.Type type = (Organization.Type) comboBoxOrgType.getSelectedItem();
        if(type == Organization.Type.AnimalWelfareCharityOrganization){
            comboBoxRole.removeAllItems();
            comboBoxRole.addItem(Role.RoleType.AnimalWelfareCharityPOCRole);
        }
        else if(type == Organization.Type.DisasterReliefCharityOrganization){
            comboBoxRole.removeAllItems();
            comboBoxRole.addItem(Role.RoleType.DisasterReliefCharityPOCRole);
        }
        else if(type == Organization.Type.EducationCharityOrganization){
            comboBoxRole.removeAllItems();
            comboBoxRole.addItem(Role.RoleType.EducationCharityPOCRole);
        }
        else if(type == Organization.Type.OrphanageCharityOrganization){
            comboBoxRole.removeAllItems();
            comboBoxRole.addItem(Role.RoleType.OrphanageCharityPOCRole);
        }
    }//GEN-LAST:event_comboBoxOrgTypeActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox comboBoxOrgType;
    private javax.swing.JComboBox comboBoxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDonarName;
    private javax.swing.JTable tblDonations;
    private javax.swing.JTable tblOrganizationList;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

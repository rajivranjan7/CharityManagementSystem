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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonations = new javax.swing.JTable();
        lblDonarName2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganizationList = new javax.swing.JTable();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jTabbedPane1.setForeground(new java.awt.Color(2, 55, 108));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        tblDonations.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
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

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 170, 900, 148);

        lblDonarName2.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        lblDonarName2.setForeground(new java.awt.Color(2, 55, 108));
        lblDonarName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonarName2.setText("Welcome Charity Admin");
        jPanel2.add(lblDonarName2);
        lblDonarName2.setBounds(10, 70, 1109, 32);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 55, 108));
        jLabel8.setText("Donations List");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 130, 180, 22);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PictureUI/Charity work.jpg"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(90, 330, 1030, 580);

        jTabbedPane1.addTab("Collected Donations", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        tblOrganizationList.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108))));
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
        jScrollPane1.setBounds(20, 170, 895, 150);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 55, 108));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Organization Type");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 430, 190, 22);

        comboBoxOrgType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxOrgType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxOrgType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrgTypeActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxOrgType);
        comboBoxOrgType.setBounds(470, 430, 260, 40);

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtUsername);
        txtUsername.setBounds(470, 640, 260, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 55, 108));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Organization Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 580, 190, 22);

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
        btnAddOrganization.setBounds(470, 790, 260, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 55, 108));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 650, 140, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 55, 108));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 720, 140, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 55, 108));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Role");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 510, 110, 22);

        comboBoxRole.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboBoxRole);
        comboBoxRole.setBounds(470, 500, 260, 40);

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtName);
        txtName.setBounds(470, 570, 260, 40);

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtPassword);
        txtPassword.setBounds(470, 710, 260, 40);

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
        btnDelete.setBounds(790, 350, 120, 40);

        lblDonarName1.setFont(new java.awt.Font("Marker Felt", 1, 24)); // NOI18N
        lblDonarName1.setForeground(new java.awt.Color(2, 55, 108));
        lblDonarName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonarName1.setText("Welcome Charity Admin");
        jPanel1.add(lblDonarName1);
        lblDonarName1.setBounds(10, 70, 1109, 32);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 55, 108));
        jLabel1.setText("Organization List");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 130, 180, 22);

        jTabbedPane1.addTab("Manage Organization", jPanel1);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 90, 1040, 920);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 55, 108));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Charity Admin");
        add(jLabel7);
        jLabel7.setBounds(18, 11, 1116, 67);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-avatar-64 (5).png"))); // NOI18N
        add(jLabel9);
        jLabel9.setBounds(0, 0, 90, 90);
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
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDonarName1;
    private javax.swing.JLabel lblDonarName2;
    private javax.swing.JTable tblDonations;
    private javax.swing.JTable tblOrganizationList;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

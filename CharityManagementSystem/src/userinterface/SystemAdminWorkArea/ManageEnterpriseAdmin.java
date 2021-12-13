/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Network.Network;
import Business.Role.AnimalWelfareCharityPOCRole;
import Business.Role.AnimalWelfareKitInventoryManagerRole;
import Business.Role.CharityAdminRole;
import Business.Role.CommerceFinanceTeamLedgerRole;
import Business.Role.DisasterReliefCharityPOCRole;
import Business.Role.DonorAdminRole;
import Business.Role.DonorCSRSupervisorRole;
import Business.Role.DonorIndividualRole;
import Business.Role.EducationCharityPOCRole;
import Business.Role.EventManagementCoordinatorRole;
import Business.Role.EventManagementVolunteerRole;
import Business.Role.OrphanageCharityPOCRole;
import Business.Role.Role;
import Business.Role.Role.RoleType;
import Business.UserAccount.UserAccount;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Role.FinanceAdminRole;

/**
 *
 * @author nanditasharma
 */
public class ManageEnterpriseAdmin extends javax.swing.JFrame {

    private static JPanel container;
    private static EcoSystem system;
    /**
     * Creates new form ManageEnterpriseAdmin
     */
    public ManageEnterpriseAdmin(JPanel container, EcoSystem system) {
        initComponents();
        this.container = container;
        this.system = system;
            populateTable();
        populateNetworkComboBox();
        setLocationRelativeTo(null);
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEnterpriseAdmin.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[5];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getRole();
                    row[3] = userAccount.getUsername();
                    row[4] = userAccount.getPassword();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        comboBoxNetwork.removeAllItems();
        comboBoxEnterprise.removeAllItems();
        comboBoxRole.removeAllItems();

        
        for (Network network : system.getNetworkList()){
            comboBoxNetwork.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        comboBoxEnterprise.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            comboBoxEnterprise.addItem(enterprise);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterpriseAdmin = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAddEnterpriseAdmin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        comboBoxNetwork = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboBoxEnterprise = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboBoxRole = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 55, 108));
        jLabel1.setText("Manage Enterprise Admin");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 80, 439, 47);

        btnBack.setBackground(new java.awt.Color(2, 55, 108));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PictureUI/Back Arrow.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(10, 17, 150, 60);

        tblEnterpriseAdmin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(2, 55, 108)));
        tblEnterpriseAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Enterprise", "Network", "Role", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEnterpriseAdmin.setToolTipText("");
        jScrollPane1.setViewportView(tblEnterpriseAdmin);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(90, 160, 849, 201);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 55, 108));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Network");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(290, 420, 130, 40);

        btnAddEnterpriseAdmin.setBackground(new java.awt.Color(2, 55, 108));
        btnAddEnterpriseAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddEnterpriseAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEnterpriseAdmin.setText("Add Admin");
        btnAddEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEnterpriseAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddEnterpriseAdmin);
        btnAddEnterpriseAdmin.setBounds(490, 810, 250, 50);

        btnCancel.setBackground(new java.awt.Color(2, 55, 108));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);
        btnCancel.setBounds(490, 890, 250, 50);

        comboBoxNetwork.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNetworkActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxNetwork);
        comboBoxNetwork.setBounds(490, 420, 250, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 55, 108));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Enterprise");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 470, 140, 40);

        comboBoxEnterprise.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEnterpriseActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxEnterprise);
        comboBoxEnterprise.setBounds(490, 470, 250, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 55, 108));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 590, 120, 40);

        txtName.setBackground(new java.awt.Color(225, 225, 225));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtName);
        txtName.setBounds(490, 590, 250, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 55, 108));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Username");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 650, 140, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 55, 108));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(280, 710, 140, 40);

        txtUsername.setBackground(new java.awt.Color(225, 225, 225));
        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtUsername);
        txtUsername.setBounds(490, 650, 250, 40);

        txtPassword.setBackground(new java.awt.Color(225, 225, 225));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtPassword);
        txtPassword.setBounds(490, 710, 250, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 55, 108));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Role");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 520, 110, 40);

        comboBoxRole.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboBoxRole);
        comboBoxRole.setBounds(490, 520, 250, 40);

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
        btnDelete.setBounds(820, 370, 120, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PictureUI/entry_administrator.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1000, 30, 680, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEnterpriseAdminActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise = (Enterprise) comboBoxEnterprise.getSelectedItem();
        Role selectedRole = (Role) comboBoxRole.getSelectedItem();
        
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getText());
        String name = txtName.getText();
        if(username.isEmpty() || password.isEmpty() || name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all fields", "Warning", JOptionPane.WARNING_MESSAGE);
        } else{
            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        
            if (system.checkIfUserIsUnique(username)) {
                UserAccount account = null;
                if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.CharityDirectory) {
                    for(Role role : enterprise.getSupportedRole()){
                        if(role.toString().equals(RoleType.CharityAdminRole.toString()) && selectedRole.toString().equals(RoleType.CharityAdminRole.toString())){
                            account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
                            break;
                        }
                        
                    }
                    
                } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.EventManagementDirectory) {
                    for(Role role : enterprise.getSupportedRole()){
                        if(role.toString().equals(RoleType.EventManagementCoordinatorRole.toString()) && selectedRole.toString().equals(RoleType.EventManagementCoordinatorRole.toString())){
                            account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
                            break;
                        }
                        
                    }
                } 
                else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.FinanceManagementDirectory) {
                    account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new FinanceAdminRole());
                } 
                else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.InventoryManagementDirectory) {
                    for(Role role : enterprise.getSupportedRole()){
                        if(role.toString().equals(RoleType.InventoryAdminRole.toString()) && selectedRole.toString().equals(RoleType.InventoryAdminRole.toString())){
                            account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
                            break;
                        }
                        
                    }
                    
                } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.DonorDirectory) {
                    for(Role role : enterprise.getSupportedRole()){
                        if(role.toString().equals(RoleType.DonorAdminRole.toString()) && selectedRole.toString().equals(RoleType.DonorAdminRole.toString())){
                            account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
                            break;
                        }
                        
                    }
                }
                txtUsername.setText("");
                txtPassword.setText("");
                txtName.setText("");
                JOptionPane.showMessageDialog(null, "Account created sucessfully");
                populateTable();
            }else {
                JOptionPane.showMessageDialog(null, "Please enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddEnterpriseAdminActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void comboBoxNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNetworkActionPerformed
        // TODO add your handling code here:
        Network network = (Network) comboBoxNetwork.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_comboBoxNetworkActionPerformed

    private void comboBoxEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEnterpriseActionPerformed
        // TODO add your handling code here:
        Enterprise e = (Enterprise) comboBoxEnterprise.getSelectedItem();
        if (e != null){
            populateRoleComboBox(e);
        }
    }//GEN-LAST:event_comboBoxEnterpriseActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        boolean flag = true;
        int selectedRow = tblEnterpriseAdmin.getSelectedRow();
        if(selectedRow<0){
            flag=false;
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
        }
        if(flag){
            DefaultTableModel tableModel = (DefaultTableModel) tblEnterpriseAdmin.getModel();
            Object enterprise = tableModel.getValueAt(selectedRow, 0 );
            Object network = tableModel.getValueAt(selectedRow, 1 );
            Object role = tableModel.getValueAt(selectedRow, 2 );
            Object username = tableModel.getValueAt(selectedRow, 3 );
            for(Network n : system.getNetworkList()){
                if(n.getName().equals(String.valueOf(network))){
                    for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                        int uaSize = e.getUserAccountDirectory().getUserAccountList().size();
                        ArrayList<UserAccount> uaList = e.getUserAccountDirectory().getUserAccountList();
                        for(int i = 0; i < uaSize; i++){
                        if(uaList.get(i).getUsername() == String.valueOf(username)){
                            e.getUserAccountDirectory().getUserAccountList().remove(i);
                            populateTable();
                            break;
                        }
                    }
                    }
                }
            } 
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void populateRoleComboBox(Enterprise e){
        comboBoxRole.removeAllItems();
        EnterpriseType et = e.getEnterpriseType();
        
        Network network = (Network) comboBoxNetwork.getSelectedItem(); 
        
            
            if(et == EnterpriseType.EventManagementDirectory){
                comboBoxRole.addItem(e.getSupportedRole().get(0));
                
            }
            else if(et == EnterpriseType.CharityDirectory){
                comboBoxRole.addItem(e.getSupportedRole().get(0));
                
            }
            else if(et == EnterpriseType.DonorDirectory){
                comboBoxRole.addItem(e.getSupportedRole().get(0));
                
            }
            else if(et == EnterpriseType.FinanceManagementDirectory){
                comboBoxRole.addItem(e.getSupportedRole().get(0));
                
            }
            else if(et == EnterpriseType.InventoryManagementDirectory){
                comboBoxRole.addItem(e.getSupportedRole().get(0));
                
            }
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageEnterpriseAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEnterpriseAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEnterpriseAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEnterpriseAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEnterpriseAdmin(container, system).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEnterpriseAdmin;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox comboBoxEnterprise;
    private javax.swing.JComboBox comboBoxNetwork;
    private javax.swing.JComboBox comboBoxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEnterpriseAdmin;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

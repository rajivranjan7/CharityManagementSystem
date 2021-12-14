/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AnimalWelfareKitInventoryManagerRole;
import Business.Role.CharityAdminRole;
import Business.Role.CommerceFinanceTeamLedgerRole;
import Business.Role.DisasterReliefKitInventoryManagerRole;
import Business.Role.DonorIndividualRole;
import Business.Role.DonorAdminRole;
import Business.Role.DonorCSRSupervisorRole;
import Business.Role.EducationKitInventoryManagerRole;
import Business.Role.DisasterReliefCharityPOCRole;
import Business.Role.EducationCharityPOCRole;
import Business.Role.AnimalWelfareCharityPOCRole;
import Business.Role.InventoryAdminRole;
import Business.Role.OrphanageCharityPOCRole;
import static Business.Role.Role.RoleType.InventoryAdminRole;
import Business.Role.SystemAdminRole;
import Business.Role.FinanceAdminRole;
import userinterface.FinanceTeam.CommerceFinanceTeamAdminWorkAreaJPanel;

//import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import userinterface.AnimalWelfareCharityOrganization.AnimalWelfareCharityPOCWorkAreaJPanel;
import userinterface.AnimalWelfareKitInventoryManagementOrganization.AnimalWelfareKitInventoryManagerWorkAreaJPanel;
import userinterface.CharityAdmin.CharityAdminWorkArea;
import userinterface.DisasterReliefCharityOrganization.DisasterReliefCharityPOCWorkAreaJPanel;
import userinterface.DisasterReliefKitInventoryManagementOrganization.DisasterReliefKitInventoryManagerWorkAreaJPanel;
import userinterface.Donors.DonorWorkAreaJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import userinterface.DonorRegistration.DonorRegistrationJPanel;
import userinterface.Donors.DonorAdminWorkArea;
import userinterface.EducationCharityOrganization.EducationCharityPOCWorkAreaJPanel;
import userinterface.EducationKitInventoryManagementOrganization.EducationKitInventoryManagerWorkAreaJPanel;
import userinterface.FinanceTeam.CommerceFinanceTeamLedgerWorkAreaJPanel;
import userinterface.InventoryAdmin.InventoryAdminWorkArea;
import userinterface.OrphanageCharityOrganization.OrphanageCharityPOCWorkAreaJPanel;

/**
 *
 * @author rajiv
 */
public class MainJFrame extends javax.swing.JFrame {

    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccount userAccount;
    Enterprise enterprise;
    Organization organization;
    Network network;
    /**
     * Creates new form MainJFrame
     */

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        EcoSystem.setInstance(system);
        this.setSize(1680, 1050);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        loginError = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(311, 645));
        jPanel1.setLayout(null);

        loginJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PictureUI/login logout button 1.jpg"))); // NOI18N
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginJButton);
        loginJButton.setBounds(60, 425, 165, 50);

        userNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(userNameJTextField);
        userNameJTextField.setBounds(60, 260, 165, 40);
        jPanel1.add(passwordField);
        passwordField.setBounds(61, 356, 165, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PictureUI/icons8-user-30.png"))); // NOI18N
        jLabel1.setText("Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 200, 140, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PictureUI/icons8-password-30.png"))); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 310, 140, 40);
        jPanel1.add(loginJLabel);
        loginJLabel.setBounds(305, 253, 0, 0);

        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PictureUI/login logout button 2.jpg"))); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutJButton);
        logoutJButton.setBounds(60, 500, 165, 50);

        loginError.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(loginError);
        loginError.setBounds(226, 384, 0, 0);

        btnRegister.setBackground(new java.awt.Color(255, 0, 0));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister);
        btnRegister.setBounds(60, 590, 165, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PictureUI/donate.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 310, 1000);

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(null);

        jLabel4.setFont(new java.awt.Font("MS Gothic", 3, 60)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PictureUI/cms TITLE.PNG"))); // NOI18N
        container.add(jLabel4);
        jLabel4.setBounds(80, 700, 1520, 290);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PictureUI/Capture.PNG"))); // NOI18N
        container.add(jLabel3);
        jLabel3.setBounds(250, -210, 1700, 1310);

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String userName = userNameJTextField.getText();
        String password = new String(passwordField.getPassword());

        userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        enterprise = null;
        organization = null;
        network = null;

        if (userAccount == null) {
            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = e.getUserAccountDirectory().authenticateUser(userName, password);
                    network = n;
                    if (userAccount == null) {
                        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = org.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                enterprise = e;
                                organization = org;
                                network = n;
                                break;
                            }
                        }

                    } else {
                        enterprise = e;
                        break;
                    }
                    if (organization != null) {
                        break;
                    }
                }
                if (enterprise != null) {
                    break;
                }
            }
        }
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            container.setVisible(true);
            logoutJButton.setEnabled(true);
            userNameJTextField.setEnabled(false);
            passwordField.setEnabled(false);
            loginJButton.setEnabled(false);
            btnRegister.setEnabled(false);
            userNameJTextField.setText("");
            passwordField.setText("");
            changePanel();
        }
        

    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        dB4OUtil.storeSystem(system);
        logoutJButton.setEnabled(false);
        logoutJButton.setText("Logout");
        btnRegister.setEnabled(true);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        userNameJTextField.setText("");
        passwordField.setText("");
        jSplitPane1.setRightComponent(container);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        DonorRegistrationJPanel panel = new DonorRegistrationJPanel(container, system);
        jSplitPane1.setRightComponent(panel);
        container.setVisible(true);
            logoutJButton.setEnabled(true);
            logoutJButton.setText("Back to home");
            userNameJTextField.setEnabled(false);
            passwordField.setEnabled(false);
            loginJButton.setEnabled(false);
            btnRegister.setEnabled(false);
            userNameJTextField.setText("");
            passwordField.setText("");
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void changePanel() {

        if (userAccount != null && userAccount.getRole() != null) {
            String greetings = "Hi";
            if (userAccount.getRole() instanceof SystemAdminRole) {
                greetings = greetings + " " + userAccount.getUsername();
                SystemAdminWorkAreaJPanel admin = new SystemAdminWorkAreaJPanel(container, system);
                jSplitPane1.setRightComponent(admin);
            } 
            else if(userAccount.getRole() instanceof DonorAdminRole) {
                DonorAdminWorkArea panel = new DonorAdminWorkArea(container, system, network, enterprise, userAccount);
                jSplitPane1.setRightComponent(panel);
            } 
            else if(userAccount.getRole() instanceof DonorCSRSupervisorRole) {
                DonorWorkAreaJPanel panel = new DonorWorkAreaJPanel(container, system, userAccount, network, enterprise);
                jSplitPane1.setRightComponent(panel);
            }
            else if(userAccount.getRole() instanceof DonorIndividualRole) {
                DonorWorkAreaJPanel panel = new DonorWorkAreaJPanel(container, system, userAccount, network, enterprise);
                jSplitPane1.setRightComponent(panel);
            }
            else if(userAccount.getRole() instanceof CharityAdminRole) {
                CharityAdminWorkArea panel = new CharityAdminWorkArea( container, system, network, enterprise);
                jSplitPane1.setRightComponent(panel);
            } 
            else if(userAccount.getRole() instanceof AnimalWelfareCharityPOCRole) {
                AnimalWelfareCharityPOCWorkAreaJPanel panel = new AnimalWelfareCharityPOCWorkAreaJPanel(userAccount,enterprise,organization, network);
                jSplitPane1.setRightComponent(panel);
            }
            else if(userAccount.getRole() instanceof DisasterReliefCharityPOCRole) {
                DisasterReliefCharityPOCWorkAreaJPanel panel = new DisasterReliefCharityPOCWorkAreaJPanel(userAccount,enterprise,organization, network);
                jSplitPane1.setRightComponent(panel);
            }
            else if(userAccount.getRole() instanceof EducationCharityPOCRole) {
                EducationCharityPOCWorkAreaJPanel panel = new EducationCharityPOCWorkAreaJPanel(userAccount,enterprise,organization, network);
                jSplitPane1.setRightComponent(panel);
            }
            else if(userAccount.getRole() instanceof OrphanageCharityPOCRole) {
                OrphanageCharityPOCWorkAreaJPanel panel = new OrphanageCharityPOCWorkAreaJPanel(userAccount,enterprise,organization, network);
                jSplitPane1.setRightComponent(panel);
            }
            else if(userAccount.getRole() instanceof InventoryAdminRole) {
                InventoryAdminWorkArea panel = new InventoryAdminWorkArea(container, system, network, enterprise, userAccount);
                jSplitPane1.setRightComponent(panel);
            }
            else if(userAccount.getRole() instanceof AnimalWelfareKitInventoryManagerRole) {
                AnimalWelfareKitInventoryManagerWorkAreaJPanel panel = new AnimalWelfareKitInventoryManagerWorkAreaJPanel(userAccount,enterprise,organization);
                jSplitPane1.setRightComponent(panel);
            }
            else if(userAccount.getRole() instanceof DisasterReliefKitInventoryManagerRole) {
                DisasterReliefKitInventoryManagerWorkAreaJPanel panel = new DisasterReliefKitInventoryManagerWorkAreaJPanel(userAccount,enterprise,organization);
                jSplitPane1.setRightComponent(panel);
            }
            else if(userAccount.getRole() instanceof EducationKitInventoryManagerRole) {
                EducationKitInventoryManagerWorkAreaJPanel panel = new EducationKitInventoryManagerWorkAreaJPanel(userAccount,enterprise,organization);
                jSplitPane1.setRightComponent(panel);
            }
            else if(userAccount.getRole() instanceof FinanceAdminRole) {
                CommerceFinanceTeamAdminWorkAreaJPanel panel = new CommerceFinanceTeamAdminWorkAreaJPanel(container, system, network, enterprise, userAccount);
                jSplitPane1.setRightComponent(panel);
            }
            else if(userAccount.getRole() instanceof CommerceFinanceTeamLedgerRole) {
                CommerceFinanceTeamLedgerWorkAreaJPanel panel = new CommerceFinanceTeamLedgerWorkAreaJPanel(container, system, network, enterprise, userAccount);
                jSplitPane1.setRightComponent(panel);
            }
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel loginError;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}

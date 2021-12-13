/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Organization.CommerceFinanceManagementOrganization;
import javax.swing.JPanel;
//import userinterface.CommerceFinanceTeamWorkArea.CommerceFinanceTeamLedgerWorkAreaJPanel;

/**
 *
 * @author rajiv
 */
public class CommerceFinanceTeamLedgerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        //return new CommerceFinanceTeamLedgerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network, business);
        return null;
    }
    
    @Override
    public String toString(){
        return (Role.RoleType.CommerceFinanceTeamLedgerRole.getValue());
    }
}
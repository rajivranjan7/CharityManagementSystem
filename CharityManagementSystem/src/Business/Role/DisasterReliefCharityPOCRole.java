/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DisasterReliefCharityOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
//import userinterface.DisasterReliefCharityWorkArea.DisasterReliefCharityPOCWorkAreaJPanel;

/**
 *
 * @author rajiv
 */
public class DisasterReliefCharityPOCRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        //return new DisasterReliefCharityPOCWorkAreaJPanel(userProcessContainer, account, organization, enterprise, network, business);
        return null;
    }
    
    @Override
    public String toString(){
        return (Role.RoleType.DisasterReliefCharityPOCRole.getValue());
    }
}

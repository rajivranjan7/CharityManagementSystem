/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.*;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author rajiv
 */
public class CommerceFinanceManagementOrganization extends Organization {
    private String name;
    
    private String commerceFinanaceManagementName;
    
     public CommerceFinanceManagementOrganization(String name) {
        super(name);
        this.name = name;
        commerceFinanaceManagementName = name;

    }

    public String getCommerceFinanaceManagementName() {
        return commerceFinanaceManagementName;
    }

    public void setCommerceFinanaceManagementName(String commerceFinanaceManagementName) {
        this.commerceFinanaceManagementName = commerceFinanaceManagementName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CommerceFinanceTeamLedgerRole());
        return roles;
    }
    
    @Override
    public Organization.Type getType() {
        return Organization.Type.CommerceFinanaceManagementOrganization;
    } 
}

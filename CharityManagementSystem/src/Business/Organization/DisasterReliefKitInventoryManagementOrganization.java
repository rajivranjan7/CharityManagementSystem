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
public class DisasterReliefKitInventoryManagementOrganization extends Organization {
    private String name;
    
    private String disasterReliefKitInventoryManagementName;
    
     public DisasterReliefKitInventoryManagementOrganization(String name) {
        super(name);
        this.name = name;
        disasterReliefKitInventoryManagementName = name;

    }

    public String getDisasterReliefKitInventoryManagementName() {
        return disasterReliefKitInventoryManagementName;
    }

    public void setDisasterReliefKitInventoryManagementName(String disasterReliefKitInventoryManagementName) {
        this.disasterReliefKitInventoryManagementName = disasterReliefKitInventoryManagementName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DisasterReliefKitInventoryManagerRole());
        return roles;
    }
    
    @Override
    public Organization.Type getType() {
        return Organization.Type.DisasterReliefKitInventoryManagementOrganization;
    } 
}

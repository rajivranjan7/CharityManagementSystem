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
    private double totalFunds;
    private int totalKits;
    
    public double addFunds(double funds){
        return totalFunds + funds;
    }
    
    public void addKits(int kits){
        int total = totalKits + kits;
        setTotalKits(total);
    }

    public double getTotalFunds() {
        return totalFunds;
    }

    public void setTotalFunds(double totalFunds) {
        this.totalFunds = totalFunds;
    }

    public int getTotalKits() {
        return totalKits;
    }

    public void setTotalKits(int totalKits) {
        this.totalKits = totalKits;
    }
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

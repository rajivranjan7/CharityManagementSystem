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
public class AnimalWelfareKitInventoryManagementOrganization extends Organization {
    private String name;
    
    private String animalWelfareKitInventoryManagementName;
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
    
     public AnimalWelfareKitInventoryManagementOrganization(String name) {
        super(name);
        this.name = name;
        animalWelfareKitInventoryManagementName = name;

    }

    public String getAnimalWelfareKitInventoryManagementName() {
        return animalWelfareKitInventoryManagementName;
    }

    public void setAnimalWelfareKitInventoryManagementName(String animalWelfareKitInventoryManagementName) {
        this.animalWelfareKitInventoryManagementName = animalWelfareKitInventoryManagementName;
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AnimalWelfareKitInventoryManagerRole());
        return roles;
    }
    
    @Override
    public Organization.Type getType() {
        return Organization.Type.AnimalWelfareKitInventoryManagementOrganization;
    } 
}

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
public class OrphanageCharityOrganization extends Organization {
    private String name;
    
    private String orphanageCharityName;
    private double totalFunds;
    private int totalKits;
    
    public double addFunds(double funds){
        return totalFunds + funds;
    }
    
    public int addKits(int kits){
        return totalKits + kits;
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
    
     public OrphanageCharityOrganization(String name) {
        super(name);
        this.name = name;
        orphanageCharityName = name;

    }

    public String getOrphanageCharityName() {
        return orphanageCharityName;
    }

    public void setOrphanageCharityName(String orphanageCharityName) {
        this.orphanageCharityName = orphanageCharityName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OrphanageCharityPOCRole());
        return roles;
    }
    
    @Override
    public Organization.Type getType() {
        return Organization.Type.OrphanageCharityOrganization;
    } 
}

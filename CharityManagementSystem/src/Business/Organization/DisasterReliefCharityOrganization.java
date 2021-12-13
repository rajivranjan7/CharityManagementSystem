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
public class DisasterReliefCharityOrganization extends Organization {
    private String name;
    
    private String disasterReliefCharityName;
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
     public DisasterReliefCharityOrganization(String name) {
        super(name);
        this.name = name;
        disasterReliefCharityName = name;

    }

    public String getDisasterReliefCharityName() {
        return disasterReliefCharityName;
    }

    public void setDisasterReliefCharityName(String disasterReliefCharityName) {
        this.disasterReliefCharityName = disasterReliefCharityName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DisasterReliefCharityPOCRole());
        return roles;
    }
    
    @Override
    public Organization.Type getType() {
        return Organization.Type.DisasterReliefCharityOrganization;
    } 
}

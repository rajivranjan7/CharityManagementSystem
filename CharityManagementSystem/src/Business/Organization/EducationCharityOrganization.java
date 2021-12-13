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
public class EducationCharityOrganization extends Organization {
    private String name;
    
    private String educationCharityName;
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
     public EducationCharityOrganization(String name) {
        super(name);
        this.name = name;
        educationCharityName = name;

    }

    public String getEducationCharityName() {
        return educationCharityName;
    }

    public void setEducationCharityName(String educationCharityName) {
        this.educationCharityName = educationCharityName;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EducationCharityPOCRole());
        return roles;
    }
    
    @Override
    public Organization.Type getType() {
        return Organization.Type.EducationCharityOrganization;
    } 
}

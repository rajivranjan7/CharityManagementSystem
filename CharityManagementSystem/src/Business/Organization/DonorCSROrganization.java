/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DonorCSRSupervisorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nanditasharma
 */
public class DonorCSROrganization extends Organization {
    private String name;
    private String donorCSR;

    public DonorCSROrganization(String name) {
        super(name);
        this.name=name;
        donorCSR=name;
    }

    public String getDonorCSR() {
        return donorCSR;
    }

    public void setDonorCSR(String donorCSR) {
        this.donorCSR = donorCSR;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new DonorCSRSupervisorRole());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.DonorCSR;
    } 
}

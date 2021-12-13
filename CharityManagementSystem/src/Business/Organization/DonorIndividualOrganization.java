/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DonorIndividualRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nanditasharma
 */
public class DonorIndividualOrganization extends Organization {
    private String name;
    private String donor;

    public DonorIndividualOrganization(String name) {
        super(name);
        this.name=name;
        donor=name;
    }

    public String getDonor() {
        return donor;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new DonorIndividualRole());
        return roles;
    }
       @Override
    public Type getType() {
        return Organization.Type.DonorIndividual;
    } 
}

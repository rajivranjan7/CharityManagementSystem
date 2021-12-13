/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.DonorAdminRole;
import Business.Role.DonorCSRSupervisorRole;
import Business.Role.DonorIndividualRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nanditasharma
 */
public class DonorDirectory extends Enterprise {

    public DonorDirectory(String name) {
        super(name, Enterprise.EnterpriseType.DonorDirectory);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new DonorAdminRole());
        roles.add(new DonorIndividualRole());
        roles.add(new DonorCSRSupervisorRole());
        return roles;
    }
}

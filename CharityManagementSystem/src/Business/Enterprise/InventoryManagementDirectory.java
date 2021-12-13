/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.AnimalWelfareKitInventoryManagerRole;
import Business.Role.DisasterReliefKitInventoryManagerRole;
import Business.Role.EducationKitInventoryManagerRole;
import Business.Role.InventoryAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rajiv
 */
public class InventoryManagementDirectory extends Enterprise {

    public InventoryManagementDirectory(String name) {
        super(name, Enterprise.EnterpriseType.InventoryManagementDirectory);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new InventoryAdminRole());
        roles.add(new AnimalWelfareKitInventoryManagerRole());
        roles.add(new DisasterReliefKitInventoryManagerRole());
        roles.add(new EducationKitInventoryManagerRole());
        return roles;
    }
}

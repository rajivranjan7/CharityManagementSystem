/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.EventManagementCoordinatorRole;
import Business.Role.EventManagementVolunteerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rajiv
 */
public class EventManagementDirectory extends Enterprise {

    public EventManagementDirectory(String name) {
        super(name, Enterprise.EnterpriseType.EventManagementDirectory);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new EventManagementCoordinatorRole());
        roles.add(new EventManagementVolunteerRole());
        return roles;
    }
}
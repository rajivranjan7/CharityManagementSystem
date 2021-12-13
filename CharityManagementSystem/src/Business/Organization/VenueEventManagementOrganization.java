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
public class VenueEventManagementOrganization extends Organization {
    private String name;
    
    private String venueEventManagementName;
    
     public VenueEventManagementOrganization(String name) {
        super(name);
        this.name = name;
        venueEventManagementName = name;

    }

    public String getVenueEventManagementName() {
        return venueEventManagementName;
    }

    public void setVenueEventManagementName(String venueEventManagementName) {
        this.venueEventManagementName = venueEventManagementName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EventManagementCoordinatorRole());
        roles.add(new EventManagementVolunteerRole());
        return roles;
    }
    
    @Override
    public Organization.Type getType() {
        return Organization.Type.VenueEventManagementOrganization;
    } 
}

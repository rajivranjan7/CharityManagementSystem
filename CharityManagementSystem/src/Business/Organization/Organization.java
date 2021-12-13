/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author rajiv
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;
    public ArrayList<Role> roles;
    private Type type;

    public enum Type {
        AnimalWelfareCharityOrganization("Animal Welfare Charity Organization"),
        DisasterReliefCharityOrganization("Disaster Relief Charity Organization"),
        EducationCharityOrganization("Education Charity Organization"),
        OrphanageCharityOrganization("Orphanage Charity Organization"),
        AnimalWelfareKitInventoryManagementOrganization("Animal Welfare Kit Inventory Management Organization"),
        DisasterReliefKitInventoryManagementOrganization("Disaster Relief Kit Inventory Management Organization"),
        EducationKitInventoryManagementOrganization("Education Kit Inventory Management Organization"),
        CommerceFinanaceManagementOrganization("Commercial Finanace Management Organization"),
        VenueEventManagementOrganization("Venue Event Management Organization"),
        DonorCSR("CSR Donor Organization"),
        DonorIndividual("Individual Donor Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        roles = new ArrayList<Role>();
        counter += 1;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}

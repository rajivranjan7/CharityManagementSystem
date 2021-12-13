/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author rajiv
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Organization organization;
    private WorkQueue workQueue;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        CharityDirectory("Charity/ Non-governmental Organization Directory"), 
        EventManagementDirectory("Event Management Directory"),
        FinanceManagementDirectory("Finance Management Directory"), 
        InventoryManagementDirectory("Inventory Management Directory"),
        DonorDirectory("Donor Directory");

        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
}
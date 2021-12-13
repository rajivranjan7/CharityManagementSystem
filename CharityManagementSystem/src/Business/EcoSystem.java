/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
//import Business.Enterprise.*;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import Business.Network.Network;

/**
 *
 * @author rajiv
 */
//public class EcoSystem extends Organization {
//
//    private static EcoSystem business;
//    private ArrayList<Network> networkList;
//    private EnterpriseDirectory enterpriseDirectory;
//    private RestaurantDirectory restaurantDirectory;
//    private CustomerDirectory customerDirectory;
//    private DeliveryManDirectory deliveryManDirectory;
//    private Charity charityDirectory;
//    private Donors donorsDirectory;
//    private FinanceManagement financeManagementDirectory;
//    private InventoryManagement inventoryManagementDirectory;
//    private EventManagement eventManagementDirectory;
//     Charity charityDirectory, Donors donorsDirectory, 
//            FinanceManagement financeManagementDirectory,
//            InventoryManagement inventoryManagementDirectory,
//            EventManagement eventManagementDirectory
//    private EcoSystem() {
//        super(null);
//        charityDirectory = new Charity();
//        donorsDirectory = new 
//        financeManagementDirectory = new
//        inventoryManagementDirectory = new 
//        eventManagementDirectory = new 
//    }
//
//    public static EcoSystem getBusiness() {
//        return business;
//    }
//
//    public static void setBusiness(EcoSystem business) {
//        EcoSystem.business = business;
//    }
//
//    public EnterpriseDirectory getEnterpriseDirectory() {
//        return enterpriseDirectory;
//    }
//
//    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
//        this.enterpriseDirectory = enterpriseDirectory;
//    }
//
//    public Charity getCharityDirectory() {
//        return charityDirectory;
//    }
//
//    public void setCharityDirectory(Charity charityDirectory) {
//        this.charityDirectory = charityDirectory;
//    }
//
//    public Donors getDonorsDirectory() {
//        return donorsDirectory;
//    }
//
//    public void setDonorsDirectory(Donors donorsDirectory) {
//        this.donorsDirectory = donorsDirectory;
//    }
//
//    public FinanceManagement getFinanceManagementDirectory() {
//        return financeManagementDirectory;
//    }
//
//    public void setFinanceManagementDirectory(FinanceManagement financeManagementDirectory) {
//        this.financeManagementDirectory = financeManagementDirectory;
//    }
//
//    public InventoryManagement getInventoryManagementDirectory() {
//        return inventoryManagementDirectory;
//    }
//
//    public void setInventoryManagementDirectory(InventoryManagement inventoryManagementDirectory) {
//        this.inventoryManagementDirectory = inventoryManagementDirectory;
//    }
//
//    public EventManagement getEventManagementDirectory() {
//        return eventManagementDirectory;
//    }
//
//    public void setEventManagementDirectory(EventManagement eventManagementDirectory) {
//        this.eventManagementDirectory = eventManagementDirectory;
//    }
//
//    public ArrayList<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(ArrayList<Role> roles) {
//        this.roles = roles;
//    }
//
//  
//    
//    
//    
//    public static EcoSystem getInstance() {
//        if (business == null) {
//            business = new EcoSystem();
//        }
//        return business;
//    }
//
//    public static void setInstance(EcoSystem ecosystem) {
//        business = ecosystem;
//    }
//
//    //@Override
//    public ArrayList<Role> getSupportedRole() {
//        ArrayList<Role> roleList = new ArrayList<Role>();
//        roleList.add(new SystemAdminRole());
//        return roleList;
//    }
//
//
//    public boolean checkIfUserIsUnique(String userName) {
//        //
//        return false;
//    }
//}
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
    }

    public static void setInstance(EcoSystem system) {
        business = system;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public boolean checkIfUserIsUnique(String userName) {
        return checkIfUserIsUnique(userName, business);
    }

    public boolean checkIfUserIsUnique(String userName, EcoSystem ecoSys) {
        if (ecoSys == null) {
            System.out.println("Business does not exist!!");
        }
        for (Network network : ecoSys.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equalsIgnoreCase(userName)) {
                        return false;
                    }
                }
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equalsIgnoreCase(userName)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;

    }

    public boolean isUnique(String name) {
        for (Network network : networkList) {
            if (network.getName().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }
}

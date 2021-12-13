/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;

/**
 *
 * @author nandita
 */
public class DonorRegistrationRequest extends WorkRequest{
    
    private Network network;
    private Enterprise enterprise;
    private Organization.Type orgType;
    private String name;
    private String userName;
    private String userPassword;
    private String userEmailId;
    private String userAddress;
    private String userContact;
    private String contactCarrierName;

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getContactCarrierName() {
        return contactCarrierName;
    }

    public void setContactCarrierName(String contactCarrierName) {
        this.contactCarrierName = contactCarrierName;
    }
    
    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization.Type getOrgType() {
        return orgType;
    }

    public void setOrgType(Organization.Type orgType) {
        this.orgType = orgType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public String getUserCity() {
        return userAddress;
    }

    public void setUserCity(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    
    
}

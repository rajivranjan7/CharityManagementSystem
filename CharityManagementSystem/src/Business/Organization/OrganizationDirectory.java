/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author rajiv
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    /*
        AnimalWelfareCharityOrganization("Animal Welfare Charity Organization"),
        DisasterReliefCharityOrganization("Disaster Relief Charity Organization"),
        EducationCharityOrganization("Education Charity Organization"),
        OrphanageCharityOrganization("Orphanage Charity Organization"),
        AnimalWelfareKitInventoryManagementOrganization("Animal Welfare Kit Inventory Management Organization"),
        DisasterReliefKitInventoryManagementOrganization("Disaster Relief Kit Inventory Management Organization"),
        EducationKitInventoryManagementOrganization("Education Kit Inventory Management Organization"),
        CommerceFinanceManagementOrganization("Commercial Finanace Management Organization"),
        VenueEventManagementOrganization("Venue Event Management Organization");
    */
    public Organization createOrganization(Type type, String name) {
        Organization organization = null;
        if (type.getValue().equals(Type.AnimalWelfareCharityOrganization.getValue())) {
            organization = new AnimalWelfareCharityOrganization(name);
            AnimalWelfareCharityOrganization animalWelfareCharityName = (AnimalWelfareCharityOrganization) organization;
            animalWelfareCharityName.setAnimalWelfareCharityName(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DisasterReliefCharityOrganization.getValue())) {
            organization = new DisasterReliefCharityOrganization(name);
            DisasterReliefCharityOrganization disasterReliefCharityName = (DisasterReliefCharityOrganization) organization;
            disasterReliefCharityName.setDisasterReliefCharityName(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.AnimalWelfareKitInventoryManagementOrganization.getValue())) {
            organization = new AnimalWelfareKitInventoryManagementOrganization(name);
            AnimalWelfareKitInventoryManagementOrganization animalWelfareKitInventoryManagementName = (AnimalWelfareKitInventoryManagementOrganization) organization;
            animalWelfareKitInventoryManagementName.setAnimalWelfareKitInventoryManagementName(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.CommerceFinanaceManagementOrganization.getValue())) {
            organization = new CommerceFinanceManagementOrganization(name);
            CommerceFinanceManagementOrganization commerceFinanaceManagementName = (CommerceFinanceManagementOrganization) organization;
            commerceFinanaceManagementName.setCommerceFinanaceManagementName(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DisasterReliefKitInventoryManagementOrganization.getValue())) {
            organization = new DisasterReliefKitInventoryManagementOrganization(name);
            DisasterReliefKitInventoryManagementOrganization disasterReliefKitInventoryManagementName = (DisasterReliefKitInventoryManagementOrganization) organization;
            disasterReliefKitInventoryManagementName.setDisasterReliefKitInventoryManagementName(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.EducationCharityOrganization.getValue())) {
            organization = new EducationCharityOrganization(name);
            EducationCharityOrganization educationCharityName = (EducationCharityOrganization) organization;
            educationCharityName.setEducationCharityName(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.EducationKitInventoryManagementOrganization.getValue())) {
            organization = new EducationKitInventoryManagementOrganization(name);
            EducationKitInventoryManagementOrganization educationKitInventoryManagementName = (EducationKitInventoryManagementOrganization) organization;
            educationKitInventoryManagementName.setEducationKitInventoryManagementName(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.OrphanageCharityOrganization.getValue())) {
            organization = new OrphanageCharityOrganization(name);
            OrphanageCharityOrganization orphanageCharityName = (OrphanageCharityOrganization) organization;
            orphanageCharityName.setOrphanageCharityName(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.VenueEventManagementOrganization.getValue())) {
            organization = new VenueEventManagementOrganization(name);
            VenueEventManagementOrganization venueEventManagementName = (VenueEventManagementOrganization) organization;
            venueEventManagementName.setVenueEventManagementName(name);
            organizationList.add(organization);
        }  else if (type.getValue().equals(Type.DonorCSR.getValue())) {
            organization = new DonorCSROrganization(name);
            DonorCSROrganization donorCSR = (DonorCSROrganization) organization;
            donorCSR.setDonorCSR(name);
            organizationList.add(organization);
        }   else if (type.getValue().equals(Type.DonorIndividual.getValue())) {
            organization = new DonorIndividualOrganization(name);
            DonorIndividualOrganization donorIndividual = (DonorIndividualOrganization) organization;
            donorIndividual.setDonor(name);
            organizationList.add(organization);
        } 

        return organization;
    }
}
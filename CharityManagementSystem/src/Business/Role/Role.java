/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author rajiv
 */
public abstract class Role {

    public enum RoleType {
        SystemAdminRole("System Administrator"),
        AnimalWelfareCharityPOCRole("Animal WelfareCharity POC"),
        DisasterReliefCharityPOCRole("Disaster Relief WelfareCharity POC"),
        EducationCharityPOCRole("Education Charity POC"),
        OrphanageCharityPOCRole("Orphanage Charity POC"),
        AnimalWelfareKitInventoryManagerRole("Animal Welfare Kit Inventory Manager"),
        DisasterReliefKitInventoryManagerRole("Disaster Relief Kit Inventory Manager"),
        EducationKitInventoryManagerRole("Education Kit Inventory Manager"),
        EventManagementCoordinatorRole("Event Management Co-ordiantor"),
        EventManagementVolunteerRole("Event Management Volunteer"),
        CommerceFinanceTeamLedgerRole("Finance Ledger"),
        DonorCSRSupervisorRole("CSR Supervisor"),
        DonorIndividualRole("Donor"),
        CharityAdminRole("Charity Admin"),
        DonorAdminRole("Donar Admin"),
        InventoryAdminRole("Inventory Admin");

        private String value;

        private RoleType(String value) {
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

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Network network,
            EcoSystem ecoSystem);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}

package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.CharityAdminRole;
import Business.Role.DonorAdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rajiv
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        //Networks
//        Network n1 = system.createAndAddNetwork();
//        n1.setName("Boston");
//        Network n2 = system.createAndAddNetwork();
//        n2.setName("California");
        //Boston network Enterprises
//        Enterprise e1 = n1.getEnterpriseDirectory().createAndAddEnterprise("Boston Donors", Enterprise.EnterpriseType.DonorDirectory);
//        Enterprise e2 = n1.getEnterpriseDirectory().createAndAddEnterprise("Boston Education Charity", Enterprise.EnterpriseType.CharityDirectory);
//        Enterprise e3 = n1.getEnterpriseDirectory().createAndAddEnterprise("Boston Orphanage Charity", Enterprise.EnterpriseType.CharityDirectory);
//        Enterprise e4 = n1.getEnterpriseDirectory().createAndAddEnterprise("Boston Event Management Enterprise", Enterprise.EnterpriseType.EventManagementDirectory);
//        Enterprise e5 = n1.getEnterpriseDirectory().createAndAddEnterprise("Boston Finance Enterprise", Enterprise.EnterpriseType.FinanceManagementDirectory);
//        Enterprise e6 = n1.getEnterpriseDirectory().createAndAddEnterprise("Boston Inventory Enterprise", Enterprise.EnterpriseType.InventoryManagementDirectory);
//        //California network Enterprises
//        Enterprise e7 = n2.getEnterpriseDirectory().createAndAddEnterprise("California Donors", Enterprise.EnterpriseType.DonorDirectory);
//        Enterprise e8 = n2.getEnterpriseDirectory().createAndAddEnterprise("California Education Charity", Enterprise.EnterpriseType.CharityDirectory);
//        Enterprise e9 = n2.getEnterpriseDirectory().createAndAddEnterprise("California Orphanage Charity", Enterprise.EnterpriseType.CharityDirectory);
//        Enterprise e10 = n2.getEnterpriseDirectory().createAndAddEnterprise("California Event Management Enterprise", Enterprise.EnterpriseType.EventManagementDirectory);
//        Enterprise e11 = n2.getEnterpriseDirectory().createAndAddEnterprise("California Finance Enterprise", Enterprise.EnterpriseType.FinanceManagementDirectory);
//        Enterprise e12 = n2.getEnterpriseDirectory().createAndAddEnterprise("California Inventory Enterprise", Enterprise.EnterpriseType.InventoryManagementDirectory);



        //Employees
//        Employee emp1 = e1.getEmployeeDirectory().createEmployee("Nandita Sharma");
//        //UserAccounts
//        UserAccount acc1 = e1.getUserAccountDirectory().createUserAccount("donor_admin", "admin", emp1, new DonorAdminRole());
        
        
        return system;
    }

}

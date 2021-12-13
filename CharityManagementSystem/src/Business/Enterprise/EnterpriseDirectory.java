/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author rajiv
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.CharityDirectory) {
            enterprise = new CharityDirectory(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.EventManagementDirectory) {
            enterprise = new EventManagementDirectory(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.FinanceManagementDirectory) {
            enterprise = new FinanceManagementDirectory(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.InventoryManagementDirectory) {
            enterprise = new InventoryManagementDirectory(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.DonorDirectory) {
            enterprise = new DonorDirectory(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.CommerceFinanceTeamLedgerRole;
import Business.Role.Role;
import java.util.ArrayList;
import Business.Role.FinanceAdminRole;

/**
 *
 * @author rajiv
 */
public class FinanceManagementDirectory extends Enterprise {

    public FinanceManagementDirectory(String name) {
        super(name, Enterprise.EnterpriseType.FinanceManagementDirectory);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new FinanceAdminRole());
        roles.add(new CommerceFinanceTeamLedgerRole());
        return roles;
    }
}

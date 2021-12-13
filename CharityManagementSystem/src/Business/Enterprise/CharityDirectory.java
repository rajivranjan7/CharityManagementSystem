/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.AnimalWelfareCharityPOCRole;
import Business.Role.CharityAdminRole;
import Business.Role.DisasterReliefCharityPOCRole;
import Business.Role.EducationCharityPOCRole;
import Business.Role.OrphanageCharityPOCRole;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author rajiv
 */
public class CharityDirectory extends Enterprise {

    private WorkQueue workQueue;
    public CharityDirectory(String name) {
        super(name, Enterprise.EnterpriseType.CharityDirectory);
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        roles = new ArrayList<Role>();
        roles.add(new CharityAdminRole());
        roles.add(new AnimalWelfareCharityPOCRole());
        roles.add(new DisasterReliefCharityPOCRole());
        roles.add(new EducationCharityPOCRole());
        roles.add(new OrphanageCharityPOCRole());
        return roles;
    }
}

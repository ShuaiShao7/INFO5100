/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.AreYouHungrySystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TruckDriverOrganization;
import Business.UserAccount.UserAccount;
import Interface.Supplier.TruckDriverJPanel;
import javax.swing.JPanel;

/**
 *
 * @author tczho
 */
public class TruckDriverRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AreYouHungrySystem system) {
        return new TruckDriverJPanel(userProcessContainer, account, (TruckDriverOrganization)organization,enterprise, system);
    }
}

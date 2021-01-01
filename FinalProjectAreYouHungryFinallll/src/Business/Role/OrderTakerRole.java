/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.AreYouHungrySystem;
import Business.Enterprise.Enterprise;
import Business.Organization.OrderTakerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.NormalAdmin.NormalAdminJPanel;
import Interface.Resturant.OrderTakerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author tczho
 */
public class OrderTakerRole  extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AreYouHungrySystem system) {
        return new OrderTakerJPanel(userProcessContainer, enterprise, account, system,(OrderTakerOrganization)organization);
    }
}

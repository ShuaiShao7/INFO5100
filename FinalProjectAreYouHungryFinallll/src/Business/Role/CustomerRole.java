/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.AreYouHungrySystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.Admin.AdminJPanel;
import Interface.Customer.CustomerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author tczho
 */
public class CustomerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AreYouHungrySystem business) {
        return new CustomerJPanel(userProcessContainer, enterprise, account, business);
    }
}

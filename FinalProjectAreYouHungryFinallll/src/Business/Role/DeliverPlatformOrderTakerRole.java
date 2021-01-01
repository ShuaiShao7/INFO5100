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
import Interface.Customer.CustomerJPanel;
import Interface.DeliveryPlatform.DeliverPlatformOrderTakerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author tczho
 */
public class DeliverPlatformOrderTakerRole extends Role {
        
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AreYouHungrySystem business) {
        return new DeliverPlatformOrderTakerJPanel(userProcessContainer, account, business);
    }
}

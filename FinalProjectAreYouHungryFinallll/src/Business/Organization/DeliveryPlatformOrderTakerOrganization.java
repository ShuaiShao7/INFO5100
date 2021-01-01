/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeliverPlatformOrderTakerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tczho
 */
public class DeliveryPlatformOrderTakerOrganization extends Organization{
    public DeliveryPlatformOrderTakerOrganization() {
        super(Type.DeliveryPlatformOrderTaker.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliverPlatformOrderTakerRole());
        return roles;
    }
}

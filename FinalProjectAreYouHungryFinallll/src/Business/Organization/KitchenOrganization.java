/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ResturantNameRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tczho
 */
public class KitchenOrganization extends Organization{
    
    public KitchenOrganization() {
        super(Type.ResturantName.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ResturantNameRole());
        return roles;
    }
}

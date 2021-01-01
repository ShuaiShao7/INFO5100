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
import javax.swing.JPanel;

/**
 *
 * @author tczho
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Customer("Customer"),
        Warehouse("Warehouse"), TruckDriver("Truck Driver"),
        ResturantName("Resturant Name"),OrderTaker("Order Taker"),
        DeliveryPlatformOrderTaker("Delivery Platform Order Taker"),Deliveryman("Deliveryman");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            AreYouHungrySystem business);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

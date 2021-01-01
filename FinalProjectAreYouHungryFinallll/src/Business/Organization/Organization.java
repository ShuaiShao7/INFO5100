/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Order.OrderDirectory;
import Business.Role.Role;
import Business.User.UserDirectory;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author tczho
 */
public abstract class Organization {
    
    private String name;
    private OrderDirectory orderDirectory;
    private UserAccountDirectory userAccountDirectory;
    private UserDirectory userDirectory;
    private int organizationID;
    private static int counter = 0;
    
    public enum Type{
        Customer("Customer"), 
        Warehouse("Warehouse"), TruckDriver("Truck Driver"),
        ResturantName("Resturant Name"),OrderTaker("Order Taker"),
        DeliveryPlatformOrderTaker("Delivery Platform Order Taker"),Deliveryman("Deliveryman");
        private String value;
        private Type(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
    }
    
    public Organization (String name) {
        this.name = name;
        orderDirectory = new OrderDirectory();
        userDirectory = new UserDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory(){
        return userAccountDirectory;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }


    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}

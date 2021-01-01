/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Order.OrderDirectory;
import Business.Role.Role;
import Business.User.User;

/**
 *
 * @author tczho
 */
public class UserAccount {
    
    private String username;
    private String password;
    private User user;
    private Role role;
    private OrderDirectory orderDirectory;
    
    public UserAccount(){
        orderDirectory = new OrderDirectory();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }
    
    @Override
    public String toString() {
        return username;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
}

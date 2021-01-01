/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.ArrayList;

/**
 *
 * @author tczho
 */
public class UserDirectory {
    
    private ArrayList<User> userList;
    
    public UserDirectory(){
        userList = new ArrayList();
    }
    
    public User createUser(String name){
        User user = new User();
        user.setName(name);
        userList.add(user);
        return user;
    }
    
    public ArrayList<User> getUserList(){
        return userList;
    }
}

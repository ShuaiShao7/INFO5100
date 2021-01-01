/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.SystemAdminRole;
import Business.User.User;
import Business.UserAccount.UserAccount;

/**
 *
 * @author tczho
 */
public class ConfigureASystem {
    
    public static AreYouHungrySystem configure(){
        AreYouHungrySystem system = AreYouHungrySystem.getInstance();
        
        User user = system.getUserDirectory().createUser("SA");
        
        UserAccount userAccount = system.getUserAccountDirectory().createUserAcount("SA", "SA", new SystemAdminRole());
        
        return system;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tczho
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList<>();
    }
    
    public ArrayList<UserAccount> getUserAccountList(){
        return userAccountList;
    }
    
    public UserAccount authenticateUser (String username, String password){
        for(UserAccount account : userAccountList){
            if(account.getUsername().equals(username) && account.getPassword().equals(password)){
                return account;
            }
        }
        return null;
    }
    
    public UserAccount createUserAcount(String username, String password, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void deleteUserAccount(UserAccount userAccount){
        userAccountList.remove(userAccount);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author tczho
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type==Enterprise.EnterpriseType.Customer){
            enterprise = new CustomerEnterpise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.DeliveryPlatform){
            enterprise = new DeliveryPlatformEnterpise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Resturant){
            enterprise = new ResturantEnterpise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Supplier){
            enterprise = new SupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public void deleteEnterprise(Enterprise enterprise){
        enterpriseList.remove(enterprise);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author tczho
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.DeliveryPlatformOrderTaker.getValue())){
            organization = new DeliveryPlatformOrderTakerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Deliveryman.getValue())){
            organization = new DeliverymanOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.ResturantName.getValue())){
            organization = new KitchenOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.OrderTaker.getValue())){
            organization = new OrderTakerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.TruckDriver.getValue())){
            organization = new TruckDriverOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.Warehouse.getValue())){
            organization = new WarehouseOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}

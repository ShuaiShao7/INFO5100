/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

/**
 *
 * @author tczho
 */
public class TruckDriverOrder extends Order{
    private String deliveryContent;
    
    private String resturant;

    public String getDeliveryContent() {
        return deliveryContent;
    }

    public void setDeliveryContent(String deliveryContent) {
        this.deliveryContent = deliveryContent;
    }


    public String getResturant() {
        return resturant;
    }

    public void setResturant(String resturant) {
        this.resturant = resturant;
    }
    
    @Override
    public String toString() {
        return resturant;
    }
}

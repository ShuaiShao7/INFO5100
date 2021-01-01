/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author tczho
 */
public abstract class Order {
    
    private UserAccount sender;
    private UserAccount receiver;
    private int status;//1-Customer order food, 2-Resturant accept, 3-Deliveryman set, 4-Completed order, -2-Resturant denied, -5-Platform denied.
    private Date orderStartDate;
    private Date orderCompleteDate;
    private String orderContent;
    
    
    public Order(){
        orderStartDate = new Date();
        //orderCompleteDate = new Date();
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(Date orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    public Date getOrderCompleteDate() {
        return orderCompleteDate;
    }

    public void setOrderCompleteDate(Date orderCompleteDate) {
        this.orderCompleteDate = orderCompleteDate;
    }

//    @Override
//    public String toString() {
//        return receiver.getUsername();
//    }
    
}

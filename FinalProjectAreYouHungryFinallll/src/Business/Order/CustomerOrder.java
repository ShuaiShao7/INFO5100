/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.Date;

/**
 *
 * @author tczho
 */
public class CustomerOrder extends Order{
    private String resturantName;
    private int rank;
    private String feedback;
    private double totalPrice;
    

    
    
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    

    public String getResturantName() {
        return resturantName;
    }

    public void setResturantName(String resturantName) {
        this.resturantName = resturantName;
    }
    
    @Override
    public String toString() {
        return resturantName;
    }
}

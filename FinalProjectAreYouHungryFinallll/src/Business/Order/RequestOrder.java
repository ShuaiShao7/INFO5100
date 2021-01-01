/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.Date;

/**
 *
 * @author SS
 */
public class RequestOrder extends Order{
    private String Content;
    private int status;
    private Date sendDate;
    private String truck;
    private String ResName;
    private Date ArriveDate;

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getTruck() {
        return truck;
    }

    public void setTruck(String truck) {
        this.truck = truck;
    }

    public String getResName() {
        return ResName;
    }

    public void setResName(String ResName) {
        this.ResName = ResName;
    }

    public Date getArriveDate() {
        return ArriveDate;
    }

    public void setArriveDate(Date ArriveDate) {
        this.ArriveDate = ArriveDate;
    }
       @Override
    public String toString() {
        return Content;
    }
    
}

package org.neo.shopping_cart.vo;

/**
 * Created by NeoJiang on 29/6/2019.
 *
 * Accept post request body having orderID inside
 */
public class OrderObject{
    private String orderID;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
}

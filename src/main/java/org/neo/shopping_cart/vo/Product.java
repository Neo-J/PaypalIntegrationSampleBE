package org.neo.shopping_cart.vo;

/**
 * Created by NeoJiang on 30/6/2019.
 */
public class Product {

    private String id;
    private String imgURL;
    private int unitPrice;
    private String details;

    public Product(String id, String imgURL, int unitPrice, String details) {
        this.id = id;
        this.imgURL = imgURL;
        this.unitPrice = unitPrice;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

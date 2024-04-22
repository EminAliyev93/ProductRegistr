/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Emin.Aliyev
 */
public class Product {
    private int barcode;
    private String name;
    private int quantity ;
    private double price;

    public Product() {
    }

    public Product(int barcode, String name, int quantity, double price) {
        this.barcode = barcode;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    @Override
    public String toString() {
        return "barcode=" + barcode + ", name=" + name + ", quantity=" + quantity + ", price=" + price +".azn";
    }
     
}

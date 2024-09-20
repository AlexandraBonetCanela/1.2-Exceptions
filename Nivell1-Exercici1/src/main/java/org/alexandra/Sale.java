package org.alexandra;

import java.util.ArrayList;

public class Sale {
    private double totalPrice;
    private ArrayList<Product> products;

    public Sale() {
        this.totalPrice = 0.0;
        this.products = new ArrayList<>();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public double calculateTotal() throws EmptySaleException {
        if(products.isEmpty()){
            throw new EmptySaleException("You first need to add products to the basket in order to process the order");
        } else{
            for(Product p : products){
                totalPrice += p.getPrice();
            }
            return totalPrice;
        }
    }
}

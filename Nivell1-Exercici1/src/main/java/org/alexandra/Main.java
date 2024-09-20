package org.alexandra;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.println("Alexandra Bonet - Excepcions: Nivell 1 Exercici 1");

        //1.Calculating total price of a sale with two products
        Product chips = new Product("Chips", 1.5);
        System.out.println("Creating product: " + chips.getName() + " price: " + chips.getPrice());

        Product coke = new Product("Coke", 2.0);
        System.out.println("Creating product: " + coke.getName() + " price: " + coke.getPrice());

        Sale saleWithProducts = new Sale();

        System.out.println("Adding products to first sale...");
        saleWithProducts.addProduct(chips);
        saleWithProducts.addProduct(coke);

        calculateTotalSale(saleWithProducts);
        System.out.println("First sale Total Price: "+ saleWithProducts.getTotalPrice());

        //2.Calculating total price of a sale with no products
        Sale saleWithoutProducts = new Sale();

        System.out.println("Calculating Second sale Total Price...");
        calculateTotalSale(saleWithoutProducts);

        //3.Accessing to the nonexistent third product of the first order
        System.out.println("Trying to access nonexistent third product in first sale...");
        accessProductInSale(saleWithProducts, 2);
    }

    public static void calculateTotalSale(Sale sale){
        try{
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void accessProductInSale(Sale sale, int position){
        try{
            System.out.println(sale.getProducts().get(position).getName());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
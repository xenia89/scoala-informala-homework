package main.java.shop.entities;

public class PurchaseManager {
    /**
     * Customer tries to buy product.
     *
     * @param product that is sold
     * @param customer buyer
     */
    public static void processPurchase(Product product, Customer customer) throws Exception {

        if (product.getQuantity() < 1) {
            throw new Exception("No more " + product.getName() + " available");
        } else if (customer.getBalance() < product.getPrice()) {
           throw new Exception("You do not have enough money to buy this product!");
        } else if ((product.getRestriction().equals("Adult") && customer.getAge() < 18)) {
            System.out.println("You are too young to buy this product!");
            return;
        } else if (product instanceof FoodProduct) {
            FoodProduct food = (FoodProduct) product;
            if (food.isExpired()) {
                System.out.println("The product is expired!");
                return;
            }
        }

        //take money from customer
        customer.setBalance(customer.getBalance() - product.getPrice());
        //decrease the quantity
        product.setQuantity(product.getQuantity()-1);

        System.out.println("Customer : "+customer.getName() +" purchased "+product.getName());
    }
}

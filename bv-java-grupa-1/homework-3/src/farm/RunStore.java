package farm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class RunStore {
    private static String ReadInputString(Scanner scanner, String x){
        System.out.println(x);
        return scanner.nextLine();
    }
    private static double ReadInputDouble(Scanner scanner, String x){
        System.out.println(x);
        String input=scanner.nextLine();
        return Double.parseDouble(input);
    }
    private static int ReadInputInt(Scanner scanner, String x){
        System.out.println(x);
        String input=scanner.nextLine();
        return Integer.parseInt(input);
    }
    public  static void printStock(Stock storeStock){
        System.out.println("Stock ");
        for (StockItem item:storeStock.stockList){
            item.product.printProduct();
            System.out.println("quantity "+item.number);

        }
    }
    private static void printOrders(List<Order> orderList){
        System.out.println("Order list ");
        for(Order order:orderList){
            order.printOrder();
        }
    }
    private static void printOrdersByDay(List<Order> orderList, String date) {
        System.out.println("Order list for " + date + " is ");
        for (Order order : orderList) {
            if (order.orderDate.equals(date)) {
                order.printOrder();
            }
        }
    }
        public static void main(String[] args){
            int userInput=-1;
            Scanner scanner=new Scanner (System.in);
            Stock storeStock=new Stock();
            List<Order>orderList= new ArrayList<>();
            int nrOfProducts=0;

            while(userInput!=4){
                System.out.println("1. Create product and add it to stock");
                System.out.println("2. Sell product");
                System.out.println("3. Display daily sales report");
                System.out.println("4.Exit");
                try {
                    userInput = ReadInputInt(scanner,"Enter your choice ");
                    if (userInput == 1) {
                        nrOfProducts++;
                        String name = ReadInputString(scanner,"Enter Product Name");
                        double price = ReadInputDouble(scanner,"enter Product's Price ");
                        String productValidityDate = ReadInputString(scanner,"Enter product's validity date");
                        double weight = ReadInputDouble(scanner,"enter product's weight");
                        int productQuantity = ReadInputInt(scanner,"enter product quantity");
                        System.out.println("1.Animal");
                        System.out.println("2.Vegetal");
                        int productType = ReadInputInt(scanner,"choose product type");
                        if (productType == 1) {
                            String storageTemp = ReadInputString(scanner,"enter product storage temperature ");
                            Product animalProduct = new AnimalProduct(price, productValidityDate, weight, nrOfProducts, name, storageTemp);
                            StockItem newItem = new StockItem(animalProduct, productQuantity);
                            storeStock.addItemToStock(newItem);
                        } else {
                            List<String> vitaminList = new ArrayList<>();
                            int nrVitamins = ReadInputInt(scanner,"enter number of vitamins ");
                            int p = 0;
                            while (p < nrVitamins) {
                                String vitamin = ReadInputString(scanner,"enter vitamin name");
                                vitaminList.add(vitamin);
                                p++;
                            }
                            Product vegetalProduct = new VegetalProduct(price, productValidityDate, weight, nrOfProducts, name, vitaminList);
                            StockItem newItem = new StockItem(vegetalProduct, productQuantity);
                            storeStock.addItemToStock(newItem);
                        }
                    } else if (userInput == 2) {
                        printStock(storeStock);
                        int productId = ReadInputInt(scanner,"enter product id ");
                        int quantity = ReadInputInt(scanner,"enter product quantity ");
                        int storeQuantity = storeStock.getProductQuantity(productId);
                        if (storeQuantity == -1)
                            System.out.println("product is not in stock ");
                         else
                             if (quantity <= storeQuantity) {
                            storeStock.sellProduct(productId, quantity);

                        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                        Date date = new Date();
                        String orderDate = dateFormat.format(date).toString();
                        System.out.println(orderDate);
                        Order newOrder = new Order(productId, quantity, orderDate);
                        orderList.add(newOrder);
                        printOrders(orderList);
                    }
                    else
                        System.out.println("Not enough products");
                    }
                   else   if (userInput == 3) {
                        String date = ReadInputString(scanner,"Input date to search");
                        printOrdersByDay(orderList, date);
                    } else if (userInput == 4) {
                        System.out.println("we will exit the program");
                    } else {
                        System.out.println("Wrong input. Please try again.");
                    }
                   System.out.println("Your choice is: "+userInput);

                }
                catch(Exception e){
                    System.out.println("error ocurred"+e.getMessage());
                }
        printStock(storeStock);
                printOrders(orderList);
    }
    }
}
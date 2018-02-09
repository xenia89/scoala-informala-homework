package farm;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    protected List<StockItem> stockList;

    public Stock() {
        stockList = new ArrayList<StockItem>();
    }

    public void addItemToStock(StockItem newItem) {
        stockList.add(newItem);
    }

    public int getProductQuantity(int productId) {
        for (StockItem item : stockList) {
            System.out.println("Product id " + item.product.id + " quantity" + item.number);
            if (item.product.id == productId)
                return item.number;
        }
        return -1;
    }

    public boolean sellProduct(int productId, int quantity) {
        for (StockItem item : stockList) {
            if (item.product.id == productId) {
                if (quantity <= item.number) {
                    item.number = item.number - quantity;
                    System.out.println("Sole item, new quantity " + item.number);
                    return true;
                } else {
                    System.out.println("Not enough product in stock" + quantity + ">" + item.number);
                    return false;
                }
            }
        }
        return false;
    }
}
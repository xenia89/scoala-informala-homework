package farm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStock {

    @Test
    public void test1() {
        Stock testStock = new Stock();
        Product product = new AnimalProduct(2.0, "21/09/2018", 3, 1, "cheese", "2.0C");
        StockItem testItem = new StockItem(product, 2);
        testStock.addItemToStock(testItem);
        testStock.sellProduct(product.id, 1);
        assertEquals(testStock.stockList.get(0).number, 1);
    }

    @Test
    public void test2() {
        Stock testStock=new Stock();
        Product product=new AnimalProduct(2,"20/10/2018",3,1,"cheese","21C");
        StockItem testItem=new StockItem(product,1);
        testStock.addItemToStock(testItem);

        assertEquals(testStock.sellProduct(product.id,2),false);
    }
}


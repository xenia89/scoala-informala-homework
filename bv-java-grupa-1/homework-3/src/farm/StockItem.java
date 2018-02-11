package farm;

public class StockItem {
    protected Product product;
    protected int number;
    public StockItem(Product product, int prodNumber){
        this.product=product;
        this.number=prodNumber;
    }
}

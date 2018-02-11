package farm;

public class Order {
    protected int productId;
    protected int quantity;
    protected String orderDate;
    public Order(int productId, int quantity, String orderDate){
        this.productId=productId;
        this.quantity=quantity;
        this.orderDate=orderDate;
    }
    public void printOrder(){
        System.out.println("Product number is "+productId+" quantity "+quantity+" date "+orderDate);
    }
}

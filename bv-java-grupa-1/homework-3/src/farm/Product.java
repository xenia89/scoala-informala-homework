package farm;

public abstract class Product {
    protected double price;
    protected String validity_date;
    protected double weight;
    protected int id;
    protected String name;
    public abstract void printProduct();
    public abstract void sellProduct();
}

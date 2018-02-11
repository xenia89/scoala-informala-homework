package farm;

public class AnimalProduct extends Product {
    protected String storageTemp;
    public AnimalProduct(double price, String validity_date, double weight, int id, String name, String storageTemp ){
        this.price=price;
        this.validity_date=validity_date;
        this.weight=weight;
        this.id=id;
        this.name=name;
        this.storageTemp=storageTemp;
    }
    public void printProduct(){
        System.out.println("Animal product number is "+ id+ " is "+ name+" price "+price+" weight "+weight+" validity Date "+validity_date+" Storage temperature "+ storageTemp);
    }
    public void sellProduct(){

    }

}

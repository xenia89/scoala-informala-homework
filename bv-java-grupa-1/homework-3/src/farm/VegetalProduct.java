package farm;

import java.util.List;

public class VegetalProduct extends Product {
    protected List<String> vitamins;
    public VegetalProduct(double price, String validity_date, double weight, int id, String name, List<String>vitamin_list){
        this.price=price;
        this.validity_date=validity_date;
        this.weight=weight;
        this.id=id;
        this.name=name;
        vitamins=vitamin_list;
    }
    public void printVitaminList(){
        System.out.println("Vitamins are: ");
        for(String v:vitamins){
            System.out.println(v+" ");
        }
    }
    public void printProduct(){
        System.out.println("Vegetal product number "+ id + " is "+ name+ " price is "+ price+" weight "+ weight + " validity date "+ validity_date);
        printVitaminList();
    }
    public void sellProduct(){

    }
}

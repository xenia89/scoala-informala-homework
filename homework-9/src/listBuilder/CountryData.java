package listBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountryData {

    private String name;
    private Map<String, String> pairs=new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Map<String, String> getPair() {
        return pairs;
    }

    public void setPair(Map<String, String> pair) {
        this.pairs = pair;
    }


    public CountryData(String name){
        this.name=name;
    }
    public CountryData(String name, Map<String,String>pairs){
        this.name=name;
        this.pairs=pairs;
    }

    public void addPairs(String year, String value){
        pairs.put(year,value);
    }
    public void printPairs(){
        Map<String,String>treeMap=new TreeMap<>(pairs);
        for(String s:treeMap.keySet()){
            System.out.println(s+":"+pairs.get(s)+",");
        }
    }
    @Override
    public String toString(){
        return "name of the country is: "+name  +pairs;
    }
}

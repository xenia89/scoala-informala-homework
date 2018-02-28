package listBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        URL example = new URL("https://openei.org/doe-opendata/dataset/a7fea769-691d-4536-8ed3-471e993a2445/resource/86c50aa8-e40f-4859-b52e-29bb10166456/download/populationbycountry19802010millions.csv");
        String[]years={};
        List<CountryData>currentCountryData=new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(example.openStream()))) {
            String inputLine;
            int num=0;
            while ((inputLine = in.readLine()) != null) {
                if(num==0) {
                    years = inputLine.split(",");
                }
                else{
                    String[]array=inputLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                    String name=array[0] ;
                    CountryData newCountryData=new CountryData(name);
                    currentCountryData.add(newCountryData);
                    for(int i=1;i<array.length;i++){
                        newCountryData.addPairs(years[i],array[i]);
                    }
                }
                num++;
                }
               /* for(CountryData c:currentCountryData){
                    System.out.println(c.getName());
                    c.printPairs();
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("input a country's name to search");
        String givenName=scanner.nextLine();
        for(CountryData c:currentCountryData){
            if(c.getName().equals(givenName)){
                System.out.println(c.getName());
                c.printPairs();
            }
        }
    }
}

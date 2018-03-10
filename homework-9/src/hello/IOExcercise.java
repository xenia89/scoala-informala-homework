package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class IOExcercise {

    public static void main(String[] args) throws MalformedURLException {
        URL example=new URL("https://openei.org/doe-opendata/dataset/a7fea769-691d-4536-8ed3-471e993a2445/resource/86c50aa8-e40f-4859-b52e-29bb10166456/download/populationbycountry19802010millions.csv");
        try(BufferedReader in=new BufferedReader(new InputStreamReader(example.openStream()))) {

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

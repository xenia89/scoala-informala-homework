package converter;

import java.util.Scanner;

public class Degrees {
    public static void main(String[] args) {
        System.out.println("What is you body degree?(In Fahrenheit)");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double newTemp = turnToCelsius(x);
        System.out.println("Your body temperature in Celsius is: " + newTemp + " degrees");
        if (newTemp > 37) {
            System.out.println("You are ill!");
        }
    }

    /**
     * This method converts a given temperature from Fahrenheit to Celsius.
     * @param x-the given temperature in Fahrenheit
     * @return the temperature in Celsius
     */
    public static double turnToCelsius(int x){
        double temp;
        temp= (x-32) *0.5556;
        return temp;
    }
}


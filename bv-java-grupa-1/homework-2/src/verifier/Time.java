package verifier;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        System.out.println("What time is it?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert hour");
        int a = scanner.nextInt();
        System.out.println("insert minutes");
        int b = scanner.nextInt();
        if (validHour(a) && validMinutes(b)) {
            System.out.println(" The time is hh: " + a + " mm: "+ b );
        } else {
            System.out.println("The time is incorrect");
        }
    }

    /**
     * This method checks if the hour is valid by placing it in a certain interval between min and max.
     * @param hh- the given hour
     * @return true if the given nr is a valid hour, else it returns false
     */
    public static boolean validHour(int hh){
        if(validNumber(hh, 1, 12)){
            return true;
        }
        else{
            return false;
        }

    }

    /**
     * This method check if the minutes are valid by placing teh number in a certain interval between min and max.
     * @param mm- the given minutes
     * @return true if the given nr is a valid nr for minutes, else it returns false
     */
    public static boolean validMinutes(int mm) {
        if(validNumber(mm, 0,59)){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * This method validates if a certain nr partains to an interval between min and max.
     * @param x- the given nr we want to check
     * @param min-the lower limit of the interval
     * @param max-the upper limit of the interval
     * @return- true if the nr is between min and max, else it returns false
     */
    public static boolean validNumber(int x, int min , int max){
        if(x>=min && x<=max ){
            return true;
        }
        else{
            return false;
        }
    }
}

package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsExercise {
    public static boolean validateCNP(String cnp) {
        if (cnp.length() != 13) {
            return false;
        } else for (int j = 0; j < cnp.length(); j++) {
            if (!isDigit(cnp.charAt(j))) return false;
        }
        int an = Integer.parseInt(cnp.substring(1, 3));
        int luna = Integer.parseInt(cnp.substring(3, 5));
        int ziua = Integer.parseInt(cnp.substring(5, 7));
        if (!validNumber(an, 30, 99)) {
            if (!validNumber(an, 0, 18)) {
                return false;
            }
            if (!validNumber(luna, 1, 12)) {
                return false;
            }
            if (!validNumber(ziua, 1, 31)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    public static boolean validNumber(int x, int min, int max) {
        if (x >= min && x <= max) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int nr = 0;
        List<Person> enumerare = new ArrayList<>();
        enumerare.add(new Person("Eddie", "1570203030014", true, "20/01/2017"));
        enumerare.add(new Person("Susannah", "2890203030014", false, "none"));
        enumerare.add(new Person("Roland", "1880614170029", true, "03/03/2013"));
        enumerare.add(new Person("Sophie","2490210030016",true, "02/01/2000"));
        enumerare.add(new Person("Steven","1801210030025",false,"none"));
        enumerare.add(new Person("Mordred","1771010040018", true,"21/07/2003"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert the Cnp");
        String inputCnp = scanner.nextLine();
        if (!validateCNP(inputCnp)) {
            System.out.println("The Cnp is not valid");
        } else {
            for (Person p : enumerare) {
                if ((p.getCnp().contains(inputCnp))) {
                    System.out.println(p);
                    nr++;
                }
            }
            if(nr==0){
                System.out.println("Person does not exist");
                }
            }
        }
    }







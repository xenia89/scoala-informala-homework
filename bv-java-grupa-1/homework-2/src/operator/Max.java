package operator;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number");
        int a = scanner.nextInt();
        System.out.println("Insert second number");
        int b = scanner.nextInt();
        System.out.println("Insert third number");
        int c = scanner.nextInt();
        int myMax=getMax(a,getMax(b,c));
        System.out.println("The maximum is: " + myMax);
    }

    /**
     * This method dispays the maximal of 2 given numbers.
     * @param x: input the first number
     * @param y: input the second number
     * @return max number
     */
    public static int getMax(int x, int y){
        int max=x;
        if(y>max){
            max=y;
        }
        return max;
    }

}





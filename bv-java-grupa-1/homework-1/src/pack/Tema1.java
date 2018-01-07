package pack;

import java.util.Collection;
import java.util.LinkedList;

public class Tema1 {
    public static void main(String[] args) {
        System.out.println(addNumbers());
        System.out.println(findMin());
        System.out.println(maxDigit(2007));
        System.out.println(isPalindrome(1001));
        System.out.println(primeNumbers(15));
        System.out.println("the area of a rectangle is: " + areaRectangle(3, 5) + " the perimeter of a rectangle is:"
                + perRectangle(3, 5));
        System.out.println("the area of a square is: " + areaSquare(5));
        System.out.println(getMax(4, 7, 2));
        System.out.println(startFinish(10, 8));
    }

    /**
     * This method calculates the sum of the first 100 numbers.
     *
     * @return sum of the first 100 numbers
     */
    public static int addNumbers() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * This method calculates the minimum from a collection of numbers.
     *
     * @return min from the collection
     */
    public static int findMin() {
        int a[] = {2, 5, 1, 7, 3, -6};
        int min = a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    /**
     * This method displays the max digit from a given number.
     *
     * @param nr: input your number
     * @return max digit
     */
    public static int maxDigit(int nr) {
        int max = 0;
        int c;
        while (nr != 0) {
            c = nr % 10;
            nr = nr / 10;
            if (c > max) {

                max = c;
            }
        }
        return max;
    }

    /**
     * This method checks if a number is palindrom( e.g palindrom 1221, 34143)
     *
     * @param pal-input a number
     * @return true is the number is a palindrome, else it returns false
     */
    public static boolean isPalindrome(int pal) {
        int reverse = 0;
        int aux = pal;
        while (aux != 0) {
            reverse = reverse * 10;
            reverse = reverse + aux % 10;
            aux = aux / 10;
        }
        if (pal == reverse) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method checks if a number is prime by calculating the number of divisors and if the nr of divisors is
     * lower or equal to 2, we put the nr in a list.
     *
     * @param a-the given nr, we want to displaly all the prime nr lower than a
     * @return a collection of prime nr lower tthan the given nr
     */
    public static Collection primeNumbers(int a) {
        Collection list = new LinkedList();
        for (int i = 1; i <= a; i++) {
            int div = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    div++;
                }
            }
            if (div <= 2) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * This method calculates the area of a rectangle.
     *
     * @param L-the given length
     * @param W=the given width
     * @return the area
     */
    public static int areaRectangle(int L, int W) {
        int area = L * W;
        return area;
    }

    /**
     * This method returns the perimeter of a rectangle.
     *
     * @param L-the given length
     * @param W-the given width
     * @return-the perimeter
     */
    public static int perRectangle(int L, int W) {
        int per = 2 * (L + W);
        return per;
    }

    /**
     * This method returns the area of a square.
     *
     * @param L-the given side
     * @return- Error if the value of the side is negative, else it returns the area.
     */
    public static String areaSquare(int L) {
        int area;
        if (L < 0) {
            return "Error";
        } else {
            area = L * L;
        }
        return String.valueOf(area);
    }

    /**
     * This method calculates the biggest of 3 given numbers.
     *
     * @param p-first  number
     * @param q-second number
     * @param t-third  number
     * @return-the max of the 3 nr
     */
    public static int getMax(int p, int q, int t) {
        int max = p;
        if (q > max) {
            max = q;
        }
        if (t > max) {
            max = t;
        }
        return max;
    }

    /**
     * This method diplays the numbers from start to finish, first it determines the min and max in order to
     * display the numbers in a
     *
     * @param start-first   given number
     * @param finish-second given number
     * @return a collection of numbers: the numbers between start and finish
     */
    public static Collection startFinish(int start, int finish) {
        Collection list = new LinkedList();
        int min = start;
        int max;
        if (finish < min) {
            min = finish;
            max = start;
        } else {
            max = finish;
        }
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }
}

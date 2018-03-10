package main;

public class Main {

    public static void main(String[] args){
        Matrix matrix=new Matrix(3,5);
        System.out.println(matrix);
        System.out.println(matrix.getSum());
        matrix.addValue(1,0,7);
        matrix.addValue(0,2,3);
        System.out.println(matrix);
        System.out.println(matrix.getSum());
        System.out.println(matrix.getDiagSum(1));
        System.out.println(matrix.getDiagSum(2));
        System.out.println(matrix.getLineSum(1));
    }
}

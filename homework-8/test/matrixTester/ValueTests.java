package matrixTester;

import main.Matrix;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValueTests<E extends Number> {

    @Test
    public void testSum(){
        Matrix matrix2=new Matrix(3,5);
        Double sum=matrix2.getSum();
        assertEquals(45.0,sum,0);

    }

    @Test
    public void testSumAdd(){
    Matrix matrix2= new Matrix(3,3);
    matrix2.addValue(0,0,1);
    Double sum=matrix2.getSum();
    assertEquals(25,sum,0);
    }

    @Test
    public void testLineSum(){
        Matrix matrix2=new Matrix(3,3);
        matrix2.addValue(0,1,7);
        Double lineSum=matrix2.getLineSum(0);
        assertEquals(13,lineSum,0);
    }

    @Test
    public void testFirstDiagSum(){
        Matrix matrix2=new Matrix(3,3);
        matrix2.addValue(0,0,5);
        Double diagSum1=matrix2.getDiagSum(1);
        assertEquals(11,diagSum1,0);
    }

    @Test
    public void testSecondDiagSum(){
        Matrix matrix2=new Matrix(3,3);
        matrix2.addValue(0,2,2);
        Double diagSum2=matrix2.getDiagSum(2);
        assertEquals(8,diagSum2,0);
    }

    }


package main;

import java.util.ArrayList;
import java.util.List;

public class Matrix<E extends Number> {
    protected List<List<E>>values=new ArrayList<>();

    public Matrix(int size, E initialValue){
        for (int i=0;i<size;i++){
            values.add(new ArrayList<E>());
            for(int j=0;j<size;j++){
                values.get(i).add(initialValue);
            }
        }
    }
    @Override
    public String toString(){
        String mymatrix=" size is: "+values.size()+"\n" +" matrix: "+"\n";
        for(int i=0;i<values.size();i++){
            mymatrix+=values.get(i);
            mymatrix+="\n";
        }
        return mymatrix;
    }

    /**
     * This method replaces the value from the matrix at the given position [i,j] with the value specified.
     * @param i-the line where we are going to add the value
     * @param j-the column where we are going to add dthe value
     * @param value-the number which we want to add to the matrix
     */
    public void addValue(int i, int j, E value){
        if(i<0||i>values.size()-1||j<0||j>values.size()-1){
            throw new IllegalArgumentException("the line and column values should be between 0 and matrix' size");
        }
       List<E>line=values.get(i);
       line.set(j,value);
       values.set(i,line);
    }

    /**
     * This method calculates the sum of all elements.
     * @return sum of all elements in the matrix.
     */
    public Double getSum(){
        Double sum=0.0;
        for(int i=0;i<values.size();i++){
            for(int j=0;j<values.size();j++){
                sum+=values.get(i).get(j).doubleValue();
            }
        }
        return sum;
    }

    /**
     * This method returnes the sum of the elements of line i.
     * @param i-the given line
     * @return sum of the elements on line i
     */
    public Double getLineSum(int i){
        Double lineSum=0.0;
        if(i>values.size()){
            throw new IllegalArgumentException("the line value cant' be bigger than matrix' size");
        }
        for(int j=0;j<values.size();j++){
            lineSum+=values.get(i).get(j).doubleValue();
        }
        return lineSum;
    }

    /**
     * This method calculates the sum of the elements on the given diagonal.
     * @param i is the given diagonal (it can be 1 or 2)
     * @return sum of the elements
     */
    public Double getDiagSum(int i){
        Double diagSum=0.0;
        if(i<1||i>2){
            throw new IllegalArgumentException("the diagonal can be only 1 or 2");
        }
          else if(i==1) {
             for (int j = 0; j < values.size(); j++) {
                 diagSum += values.get(j).get(j).doubleValue();
             }
         }
           else if(i==2) {
                for(int j=0;j<values.size();j++){
                    diagSum+=values.get(j).get(values.size()-j-1).doubleValue();
                }
            }
            return diagSum;
        }
    }

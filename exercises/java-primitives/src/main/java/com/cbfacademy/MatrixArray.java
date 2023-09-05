package com.cbfacademy;

public class MatrixArray {
    
    public static void main(String[] args){
        // different arrays
        Integer[] intArray = new Integer[8];
        Float[] floatArray = new Float[12];
        Double[] doubleArray = new Double[5];
        Boolean[] booleanArray = new Boolean[6];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 3;
        }

        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = (float) (i * 1.3);
        }

        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = i * 1.7;
        }

        for (int i = 0; i < booleanArray.length; i++) {
            booleanArray[i] = i % 2 == 0;
        }

        // To print the 5th element
        System.out.println("5th element of intArray: " + intArray[4]);
        System.out.println("5th element of floatArray: " + floatArray[4]);
        System.out.println("5th element of doubleArray: " + doubleArray[4]);
        System.out.println("5th element of booleanArray: " + booleanArray[4]);

        // initialize matrix with the arrays using Object data type
        Object[][] matrix = new Object[4][];
        matrix[0] = intArray;
        matrix[1] = floatArray;
        matrix[2] = doubleArray;
        matrix[3] = booleanArray;

        // print the matrix
        System.out.println("\nMatrix:");
        for (Object[] row : matrix) {
            for (Object element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    


}// end main
}



/*
 * Name: Martha Paulina Guzman
 * Date: September 13, 2026
 * Assignment: Module 5 - Two-Dimensional Arrays
 * Course: CSD-402 Java for Programmers
 * Description: This program uses overloaded methods to locate the
 * largest and smallest elements in two-dimensional int and double
 * arrays. Each method returns the row and column location of the element.
 */
package module5arrays;

/**
 *
 * @author paulinacastro
 */
public class Module5Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] intArray = {
    {4, 8, 2},
    {15, 6, 10},
    {3, 12, 7}
};

double[][] doubleArray = {
    {2.5, 7.8, 1.2, 5.6},
    {9.4, 3.3, 6.7, 4.1},
    {8.2, 0.9, 5.5, 7.1}
};

    int[] largestIntLocation = locateLargest(intArray);

System.out.println("Largest int location: [" 
        + largestIntLocation[0] + "][" 
        + largestIntLocation[1] + "]");
int[] largestDoubleLocation = locateLargest(doubleArray);

System.out.println("Largest double location: ["
        + largestDoubleLocation[0] + "]["
        + largestDoubleLocation[1] + "]");
int[] smallestIntLocation = locateSmallest(intArray);

System.out.println("Smallest int location: ["
        + smallestIntLocation[0] + "]["
        + smallestIntLocation[1] + "]");
int[] smallestDoubleLocation = locateSmallest(doubleArray);

System.out.println("Smallest double location: ["
        + smallestDoubleLocation[0] + "]["
        + smallestDoubleLocation[1] + "]");
    }
    public static int[] locateLargest(int[][] arrayParam) {

    int largest = arrayParam[0][0];
    int row = 0;
    int column = 0;
    
    for (int i = 0; i < arrayParam.length; i++) {
    for (int j = 0; j < arrayParam[i].length; j++) {

        if (arrayParam[i][j] > largest) {
            largest = arrayParam[i][j];
            row = i;
            column = j;
        }
    }
}
    return new int[]{row, column};
    
    }
    public static int[] locateLargest(double[][] arrayParam) {

    double largest = arrayParam[0][0];
    int row = 0;
    int column = 0;

    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {

            if (arrayParam[i][j] > largest) {
                largest = arrayParam[i][j];
                row = i;
                column = j;
            }
        }
    }

    return new int[]{row, column};
}
    public static int[] locateSmallest(int[][] arrayParam) {

    int smallest = arrayParam[0][0];
    int row = 0;
    int column = 0;

    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {

            if (arrayParam[i][j] < smallest) {
                smallest = arrayParam[i][j];
                row = i;
                column = j;
            }
        }
    }

    return new int[]{row, column};
}
    public static int[] locateSmallest(double[][] arrayParam) {

    double smallest = arrayParam[0][0];
    int row = 0;
    int column = 0;

    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {

            if (arrayParam[i][j] < smallest) {
                smallest = arrayParam[i][j];
                row = i;
                column = j;
            }
        }
    }

    return new int[]{row, column};
}
}

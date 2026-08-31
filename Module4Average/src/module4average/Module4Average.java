/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package module4average;

/*
 * Name: Martha Paulina Guzman
 * Date: August 30, 2026
 * Assignment: Module 4 - Overloaded Average Methods
 * Course: CSD-402 Java for Programmers
 * Description: This program uses four overloaded methods to calculate
 * the average of short, int, long, and double arrays. It displays the
 * original array elements and the average of each array.
 */

/**
 *
 * @author paulinacastro
 */
public class Module4Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 10, 15, 20};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {2.5, 5.5, 7.5, 10.5, 12.5, 15.5};
        
        short shortAverage = average(shortArray);
        int intAverage = average(intArray);
        long longAverage = average(longArray);
        double doubleAverage = average(doubleArray);
        
        System.out.print("Short Array: ");

        for (short number : shortArray) {
    System.out.print(number + " ");
    }
    System.out.println();
System.out.println("Average: " + shortAverage);
System.out.println();
System.out.print("Int Array: ");

for (int number : intArray) {
    System.out.print(number + " ");
}

System.out.println();
System.out.println("Average: " + intAverage);
System.out.println();
System.out.print("Long Array: ");

for (long number : longArray) {
    System.out.print(number + " ");
}

System.out.println();
System.out.println("Average: " + longAverage);
System.out.println();
System.out.print("Double Array: ");

for (double number : doubleArray) {
    System.out.print(number + " ");
}

System.out.println();
System.out.println("Average: " + doubleAverage);
}

    
    public static short average(short[] array) {

    short sum = 0;

    for (short number : array) {
        sum += number;
    }

    return (short) (sum / array.length);
    }
    public static int average(int[] array) {

    int sum = 0;

    for (int number : array) {
        sum += number;
    }
    

    return sum / array.length;
    }
    public static long average(long[] array) {

    long sum = 0;

    for (long number : array) {
        sum += number;
    }

    return sum / array.length;
}
    public static double average(double[] array) {

    double sum = 0;

    for (double number : array) {
        sum += number;
    }

    return sum / array.length;
}
}

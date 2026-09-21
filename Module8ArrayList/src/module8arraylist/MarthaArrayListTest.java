/*
 * Name: Martha Guzman
 * Assignment: Module 8 - ArrayList
 * Course: CSD-402 Java for Programmers
 * Description: This program accepts integer values from the user
 * and stores them in an ArrayList until 0 is entered. The max method
 * returns the largest value in the ArrayList. If an empty ArrayList
 * is passed to the method, it returns 0.
 */

package module8arraylist;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author paulinacastro
 */
public class MarthaArrayListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
Scanner input = new Scanner(System.in);

System.out.println("Enter integers. Enter 0 when finished:");

int number;

do {
    System.out.print("Enter an integer: ");
    number = input.nextInt();
    numbers.add(number);
} while (number != 0);

Integer largest = max(numbers);

System.out.println("Largest value: " + largest);

ArrayList<Integer> emptyList = new ArrayList<>();
System.out.println("Empty list test: " + max(emptyList));

input.close();
    }

public static Integer max(ArrayList list) {

    if (list.isEmpty()) {
        return 0;
    }

    Integer largest = (Integer) list.get(0);

    for (int i = 1; i < list.size(); i++) {
        Integer current = (Integer) list.get(i);

        if (current > largest) {
            largest = current;
        }
    }

    return largest;
}
}
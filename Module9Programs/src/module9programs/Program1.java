/*
 * Name: Martha Guzman
 * Course: CSD-402 Java for Programmers
 * Assignment: Module 9.2 - Program 1
 *
 * Description:
 * This program stores ten Strings in an ArrayList and uses a
 * for-each loop to display them. The user selects an element
 * to display again. The program demonstrates autoboxing,
 * auto-unboxing, and exception handling for invalid input.
 */
package module9programs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Martha Guzman
 */
public class Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

    items.add("Apple");
    items.add("Banana");
    items.add("Orange");
    items.add("Strawberry");
    items.add("Grape");
    items.add("Watermelon");
    items.add("Pineapple");
    items.add("Mango");
    items.add("Peach");
    items.add("Cherry");
    
    System.out.println("Items in the ArrayList:");

for (String item : items) {
    System.out.println(item);
}

Scanner input = new Scanner(System.in);

System.out.print("\nEnter the number of the element you would like to see again (0-9): ");
String userInput = input.nextLine();

try {
    int parsedIndex = Integer.parseInt(userInput);

    Integer index = parsedIndex;
    int selectedIndex = index;

    System.out.println("You selected: " + items.get(selectedIndex));

} catch (IndexOutOfBoundsException e) {
    System.out.println("Exception has been thrown: Out of Bounds");

} catch (NumberFormatException e) {
    System.out.println("Exception has been thrown: Invalid number");
}

input.close();
    }
}
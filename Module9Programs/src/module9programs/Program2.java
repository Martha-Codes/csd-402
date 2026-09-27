/*
 * Name: Martha Guzman
 * Course: CSD-402 Java for Programmers
 * Assignment: Module 9.2 - Program 2
 *
 * Description:
 * This program creates a data.file file and writes ten randomly
 * generated integers separated by spaces. If the file already
 * exists, ten additional numbers are appended. The program then
 * reopens the file, reads its contents, and displays the data.
 */

package module9programs;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Martha Guzman
 */
public class Program2 {
    public static void main(String[] args) {
        
        File file = new File("data.file");
        Random random = new Random();
        
        try {
    FileWriter writer = new FileWriter(file, true);

    for (int i = 0; i < 10; i++) {
        int number = random.nextInt(100);
        writer.write(number + " ");
    }

    writer.close();

} catch (IOException e) {
    System.out.println("An error occurred while writing to the file.");
}
        try {
    Scanner fileReader = new Scanner(file);

    System.out.println("Numbers in data.file:");

    while (fileReader.hasNext()) {
        System.out.print(fileReader.next() + " ");
    }

    fileReader.close();

} catch (IOException e) {
    System.out.println("An error occurred while reading the file.");
}
    
}
}
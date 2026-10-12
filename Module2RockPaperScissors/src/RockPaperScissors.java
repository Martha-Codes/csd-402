import java.util.Scanner;
import java.util.Random;

/**
 * Martha Guzman
 * CSD-402 Java for Programmers
 * Module 2.2
 *
 * This program simulates a Rock-Paper-Scissors game.
 * The computer randomly selects Rock, Paper, or Scissors,
 * and the user enters their selection. The program then
 * displays both selections and determines the winner.
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        
        Random random = new Random();

int computerChoice = random.nextInt(3) + 1;

 Scanner input = new Scanner(System.in);

System.out.println("Rock-Paper-Scissors");
System.out.println("1 = Rock");
System.out.println("2 = Paper");
System.out.println("3 = Scissors");
System.out.print("Enter your choice (1, 2, or 3): ");

int userChoice = input.nextInt();

String computerSelection = "";
String userSelection = "";

if (computerChoice == 1) {
    computerSelection = "Rock";
} else if (computerChoice == 2) {
    computerSelection = "Paper";
} else {
    computerSelection = "Scissors";
}

if (userChoice == 1) {
    userSelection = "Rock";
} else if (userChoice == 2) {
    userSelection = "Paper";
} else if (userChoice == 3) {
    userSelection = "Scissors";
} else {
    userSelection = "Invalid choice";
}

String result;

if (userChoice < 1 || userChoice > 3) {
    result = "Invalid selection. Please choose 1, 2, or 3.";
} else if (userChoice == computerChoice) {
    result = "It's a tie!";
} else if ((userChoice == 1 && computerChoice == 3)
        || (userChoice == 2 && computerChoice == 1)
        || (userChoice == 3 && computerChoice == 2)) {
    result = "You win!";
} else {
    result = "Computer wins!";
}

System.out.println();
System.out.println("Computer selected: " + computerSelection);
System.out.println("You selected: " + userSelection);
System.out.println("Result: " + result);

input.close();
    }
}

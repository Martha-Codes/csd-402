/*
 * Name: Martha Guzman
 * Course: CSD-402 Java for Programmers
 * Assignment: Module 7.2 - UseFans
 *
 * Description:
 * This program creates a collection of Fan objects with different
 * speeds, colors, radii, and on/off states. Methods are used to
 * display a single Fan and a collection of Fans without using
 * the toString() method.
 */

package module7fans;
import java.util.ArrayList;

/**
 *
 * @author Martha Guzman
 */
public class UseFans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Fan> fans = new ArrayList<>();

    fans.add(new Fan());
    fans.add(new Fan(Fan.SLOW, true, 7, "blue"));
    fans.add(new Fan(Fan.MEDIUM, true, 9, "black"));
    fans.add(new Fan(Fan.FAST, true, 12, "red"));
    
    System.out.println("Displaying One Fan:");
    displayFan(fans.get(1));
    
    System.out.println("\nDisplaying All Fans:");
    displayFans(fans);
    }
    
    public static void displayFan(Fan fan) {
    System.out.println("Speed: " + fan.getSpeed());
    System.out.println("On: " + fan.getOn());
    System.out.println("Radius: " + fan.getRadius());
    System.out.println("Color: " + fan.getColor());
    
}
    public static void displayFans(ArrayList<Fan> fans) {
    for (Fan fan : fans) {
        displayFan(fan);
        System.out.println();
    }
}
}

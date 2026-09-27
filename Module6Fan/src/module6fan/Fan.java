/*
 * Name: Martha Guzman
 * Course: CSD-402 Java for Programmers
 * Assignment: Module 6.2 - Fan Class
 *
 * Description:
 * This program creates a Fan class with constants for different fan speeds.
 * The class includes fields for speed, on/off status, radius, and color.
 * It uses constructors, getters, setters, and a toString() method.
 * The main method creates two Fan objects and tests the functionality
 * of the Fan class methods.
 */

/**
 *
 * @author Martha Guzman
 */
public class Fan {
    
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    private int speed;
    private boolean on;
    private double radius;
    private String color;

public Fan() {
    speed = STOPPED;
    on = false;
    radius = 6;
    color = "white";
}

public Fan(int speed, boolean on, double radius, String color) {
    this.speed = speed;
    this.on = on;
    this.radius = radius;
    this.color = color;
}

public int getSpeed() {
    return speed;
}

public void setSpeed(int speed) {
    this.speed = speed;
}
public boolean getOn() {
    return on;
}

public void setOn(boolean on) {
    this.on = on;
}
public double getRadius() {
    return radius;
}

public void setRadius(double radius) {
    this.radius = radius;
}
public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

@Override
public String toString() {
    return "Fan State: " +
            "speed=" + speed +
            ", on=" + on +
            ", radius=" + radius +
            ", color=" + color;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fan fan1 = new Fan();

        Fan fan2 = new Fan(FAST, true, 10, "blue");
        
        System.out.println("Default Fan:");
        System.out.println(fan1);

        System.out.println("\nCustom Fan:");
        System.out.println(fan2);
        
        System.out.println("\nChanging Default Fan:");

        fan1.setSpeed(MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("black");

        System.out.println("Speed: " + fan1.getSpeed());
        System.out.println("On: " + fan1.getOn());
        System.out.println("Radius: " + fan1.getRadius());
        System.out.println("Color: " + fan1.getColor());

        System.out.println("Updated Fan: " + fan1);
    }
    
}

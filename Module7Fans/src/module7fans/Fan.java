/*
 * Name: Martha Guzman
 * Course: CSD-402 Java for Programmers
 * Assignment: Module 7.2 - UseFans
 *
 * Description:
 * This class represents a Fan with fields for speed, on/off status,
 * radius, and color. It includes constructors, getters, setters,
 * constants for fan speeds, and uses the this reference where allowed.
 */

package module7fans;

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
    this.speed = STOPPED;
    this.on = false;
    this.radius = 6;
    this.color = "white";
}

public Fan(int speed, boolean on, double radius, String color) {
    this.speed = speed;
    this.on = on;
    this.radius = radius;
    this.color = color;
}
public int getSpeed() {
    return this.speed;
}

public boolean getOn() {
    return this.on;
}

public double getRadius() {
    return this.radius;
}

public String getColor() {
    return this.color;

}
public void setSpeed(int speed) {
    this.speed = speed;
}

public void setOn(boolean on) {
    this.on = on;
}

public void setRadius(double radius) {
    this.radius = radius;
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
}
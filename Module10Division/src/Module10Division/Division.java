package Module10Division;

/**
 * Martha Guzman
 * CSD-402 Java for Programmers
 * Module 10
 *
 * This abstract class represents a company division.
 * It stores the division name and account number.
 */
public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}

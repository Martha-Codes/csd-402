package Module10Division;

/**
 * Martha Guzman
 * CSD-402 Java for Programmers
 * Module 10
 *
 * This application creates two InternationalDivision objects
 * and two DomesticDivision objects and displays their information.
 */
public class UseDivision {

    public static void main(String[] args) {

        InternationalDivision international1 =
                new InternationalDivision(
                        "European Operations", 1001,
                        "Spain", "Spanish");

        InternationalDivision international2 =
                new InternationalDivision(
                        "Latin American Operations", 1002,
                        "Mexico", "Spanish");

        DomesticDivision domestic1 =
                new DomesticDivision(
                        "Midwest Operations", 2001,
                        "Nebraska");

        DomesticDivision domestic2 =
                new DomesticDivision(
                        "West Coast Operations", 2002,
                        "California");

        international1.display();
        international2.display();
        domestic1.display();
        domestic2.display();
    }
}
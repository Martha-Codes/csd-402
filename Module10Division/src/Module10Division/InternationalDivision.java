package Module10Division;

/**
 * Martha Guzman
 * CSD-402 Java for Programmers
 * Module 10
 *
 * InternationalDivision represents a company division located
 * outside the United States. It includes the country and language
 * in addition to the inherited division information.
 */
public class InternationalDivision extends Division {

    private String country;
    private String language;

    public InternationalDivision(String divisionName, int accountNumber,
            String country, String language) {

        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
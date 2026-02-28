import java.util.Scanner;

class StringEqualsBug {
    public String showBug() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = scanner.nextLine(); // String overrides equals

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        if (firstName == lastName) { // Non-compliant; false even if the strings have the same value
            return "Names are equal";
        } else {
            return "Names are not equal";
        }
    }
    // BUG: Strings and Boxed types should be compared using "equals()"
}
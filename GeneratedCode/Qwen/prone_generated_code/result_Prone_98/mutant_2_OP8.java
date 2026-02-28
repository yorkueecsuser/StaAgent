import java.util.logging.Logger;

class LenientFormatStringValidationExample {

    private static final Logger logger = Logger.getLogger(LenientFormatStringValidationExample.class.getName());

    public String showBug(String name, int age) {
        // BUG: LenientFormatStringValidation
        return String.format("Name: %s, Age: %d", name); // Incorrect number of arguments
    }

    // Mutant 1: Renamed 'name' to 'a'
    public String showBugMutant1(String a, int age) {
        // BUG: LenientFormatStringValidation
        return String.format("Name: %s, Age: %d", a); // Incorrect number of arguments
    }

    public void showBug1(String message) {
        // BUG: LenientFormatStringValidation
        logger.info(String.format("This is a %s with no args", message, "extra")); // Extra argument
    }

    // Mutant 2: Renamed'message' to 'b'
    public void showBug1Mutant1(String b) {
        // BUG: LenientFormatStringValidation
        logger.info(String.format("This is a %s with no args", b, "extra")); // Extra argument
    }

    public static void main(String[] args) {
        LenientFormatStringValidationExample example = new LenientFormatStringValidationExample();
        System.out.println(example.showBug("Alice", 30));
        example.showBug1("test");

        // Testing mutants
        System.out.println(example.showBugMutant1("Bob", 25));
        example.showBug1Mutant1("mutant test");
    }
}
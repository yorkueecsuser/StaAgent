import java.util.logging.Logger;

class LenientFormatStringValidationExample {

    private static final Logger logger = Logger.getLogger(LenientFormatStringValidationExample.class.getName());

    public String showBug(String name, int age) {
        // BUG: LenientFormatStringValidation
        return String.format("Name: %s, Age: %d", name); // Incorrect number of arguments
    }

    public void showBug1(String message) {
        // BUG: LenientFormatStringValidation
        logger.info(String.format("This is a %s with no args", message, "extra")); // Extra argument
    }

    public String showBug(String x, int y) {
        // MUTANT: Renaming variable 'name' to 'x' and 'age' to 'y'
        return String.format("Name: %s, Age: %d", x); // Incorrect number of arguments
    }

    public void showBug1(String z) {
        // MUTANT: Renaming variable'message' to 'z'
        logger.info(String.format("This is a %s with no args", z, "extra")); // Extra argument
    }

    public static void main(String[] args) {
        LenientFormatStringValidationExample example = new LenientFormatStringValidationExample();
        System.out.println(example.showBug("Alice", 30));
        example.showBug1("test");
    }
}
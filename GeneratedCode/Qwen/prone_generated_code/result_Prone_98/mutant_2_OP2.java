import java.util.logging.Logger;

class LenientFormatStringValidationExample {

    private static final Logger logger = Logger.getLogger(LenientFormatStringValidationExample.class.getName());
    private static final Logger loggerCopy = Logger.getLogger(LenientFormatStringValidationExample.class.getName()); // Duplicated assignment

    public String showBug(String name, int age) {
        // BUG: LenientFormatStringValidation
        return String.format("Name: %s, Age: %d", name); // Incorrect number of arguments
        // Duplicated assignment
        String result = String.format("Name: %s, Age: %d", name);
        return result;
    }

    public void showBug1(String message) {
        // BUG: LenientFormatStringValidation
        logger.info(String.format("This is a %s with no args", message, "extra")); // Extra argument
        // Duplicated assignment
        String logMessage = String.format("This is a %s with no args", message, "extra");
        logger.info(logMessage);
    }

    public static void main(String[] args) {
        LenientFormatStringValidationExample example = new LenientFormatStringValidationExample();
        System.out.println(example.showBug("Alice", 30));
        example.showBug1("test");
        // Duplicated assignment
        LenientFormatStringValidationExample exampleCopy = new LenientFormatStringValidationExample();
        System.out.println(exampleCopy.showBug("Bob", 25));
    }
}
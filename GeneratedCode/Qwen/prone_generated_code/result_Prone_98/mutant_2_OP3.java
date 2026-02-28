import java.util.logging.Logger;

class LenientFormatStringValidationExample {

    private static final Logger logger = Logger.getLogger(LenientFormatStringValidationExample.class.getName());

    public String showBug(String name, int age) {
        // BUG: LenientFormatStringValidation
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            System.out.println("This is an unreachable statement.");
        }
        return String.format("Name: %s, Age: %d", name); // Incorrect number of arguments
    }

    public void showBug1(String message) {
        // BUG: LenientFormatStringValidation
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement
            System.out.println("This is another unreachable statement.");
        }
        logger.info(String.format("This is a %s with no args", message, "extra")); // Extra argument
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        LenientFormatStringValidationExample example = new LenientFormatStringValidationExample();
        System.out.println(example.showBug("Alice", 30));
        example.showBug1("test");
    }
}
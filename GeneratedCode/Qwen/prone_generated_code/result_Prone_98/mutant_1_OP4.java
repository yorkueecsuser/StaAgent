import java.util.logging.Logger;

class LenientFormatStringValidationExample {

    private static final Logger logger = Logger.getLogger(LenientFormatStringValidationExample.class.getName());

    public String showBug(String name, int age) {
        // BUG: LenientFormatStringValidation
        return String.format("Name: %s, Age: %d", name); // Incorrect number of arguments

        // Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            logger.warning("This is an unreachable block in showBug");
        } else {
            // Alternative block that also should never execute
            logger.severe("This is another unreachable block in showBug");
        }
    }

    public void showBug1(String message) {
        // BUG: LenientFormatStringValidation
        logger.info(String.format("This is a %s with no args", message, "extra")); // Extra argument

        // Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            logger.warning("This is an unreachable block in showBug1");
        } else {
            // Alternative block that also should never execute
            logger.severe("This is another unreachable block in showBug1");
        }
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the if-else branches are unreachable
        return false;
    }

    public static void main(String[] args) {
        LenientFormatStringValidationExample example = new LenientFormatStringValidationExample();
        System.out.println(example.showBug("Alice", 30));
        example.showBug1("test");
    }
}
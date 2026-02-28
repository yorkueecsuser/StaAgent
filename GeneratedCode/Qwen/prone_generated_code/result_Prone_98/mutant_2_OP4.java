import java.util.logging.Logger;

class LenientFormatStringValidationExample {

    private static final Logger logger = Logger.getLogger(LenientFormatStringValidationExample.class.getName());

    public String showBug(String name, int age) {
        // BUG: LenientFormatStringValidation
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            System.out.println("This is a reachable block.");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable block due to the condition being false.");
        }
        return String.format("Name: %s, Age: %d", name); // Incorrect number of arguments
    }

    public void showBug1(String message) {
        // BUG: LenientFormatStringValidation
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            System.out.println("This is a reachable block.");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable block due to the condition being false.");
        }
        logger.info(String.format("This is a %s with no args", message, "extra")); // Extra argument
    }

    public static void main(String[] args) {
        LenientFormatStringValidationExample example = new LenientFormatStringValidationExample();
        System.out.println(example.showBug("Alice", 30));
        example.showBug1("test");
    }

    private boolean getCondition() {
        // This method returns false to ensure the else block is unreachable
        return false;
    }
}
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    public void showBug1() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        String.format("The value of my integer is %d", "Hello World");
        // Mutation: Unreachable for loop
        boolean loopCondition = getCondition();
        for (int i = 0; loopCondition; i++) {
            System.out.println("Unreachable loop in showBug1()");
        }
    }

    public void showBug2() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        String.format("Not enough arguments %d and %d", 1);
        // Mutation: Unreachable for loop
        boolean loopCondition = false;
        for (int i = 0; loopCondition; i++) {
            System.out.println("Unreachable loop in showBug2()");
        }
    }

    public void showBug3() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        MessageFormat.format("Result {1}.", "value");
        // Mutation: Unreachable for loop
        for (int i = 0; isConditionFalse(); i++) {
            System.out.println("Unreachable loop in showBug3()");
        }
    }

    public void showBug4() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        Logger logger = Logger.getLogger(PrintfBug.class.getName());
        logger.log(Level.SEVERE, "Result {1}!", 14);
        // Mutation: Unreachable for loop
        boolean loopCondition = getAnotherCondition();
        for (int i = 0; loopCondition; i++) {
            System.out.println("Unreachable loop in showBug4()");
        }
    }

    // Methods to dynamically determine loop conditions
    private boolean getCondition() {
        return false;
    }

    private boolean isConditionFalse() {
        return false;
    }

    private boolean getAnotherCondition() {
        return false;
    }
}
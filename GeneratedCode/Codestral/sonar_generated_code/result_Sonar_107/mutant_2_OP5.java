import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug1() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        String.format("The value of my integer is %d", "Hello World");

        // Mutant code: Unreachable switch statement
        boolean condition = getFalseCondition();
        if (condition) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("This code should never be reached.");
                    break;
                default:
                    break;
            }
        }
    }

    // Other methods remain unchanged for brevity
}
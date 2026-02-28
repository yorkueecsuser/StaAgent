import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    private int getUnreachableValue() {
        return 0;
    }

    public void showBug1() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        String.format("The value of my integer is %d", "Hello World");

        // Mutant code: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This code is unreachable.");
                break;
        }
    }

    // Remaining methods...
}
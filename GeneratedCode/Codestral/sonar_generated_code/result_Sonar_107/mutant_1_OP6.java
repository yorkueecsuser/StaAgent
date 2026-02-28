import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

class PrintfBug {

    public void showBug1() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This is an unreachable loop");
        }
        String.format("The value of my integer is %d", "Hello World");
    }

    private boolean getCondition() {
        return false;
    }

    // Remaining methods...
}
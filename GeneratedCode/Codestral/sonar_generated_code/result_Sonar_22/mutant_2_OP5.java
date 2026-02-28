import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();

        // BUG: Unsupported methods should not be called on some collection implementations
        immutableList.add("This will cause an UnsupportedOperationException");

        // Mutant code: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This code will never be reached
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    // Method to return a false condition for the demonstration purpose
    private boolean getCondition() {
        return false;
    }

    // Method to return a value that is not 1 for the demonstration purpose
    private int getValue() {
        return 0;
    }
}
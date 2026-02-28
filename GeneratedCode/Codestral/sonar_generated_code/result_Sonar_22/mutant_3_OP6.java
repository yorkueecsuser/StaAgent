import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        // Inserted unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This code will never execute
            System.out.println("Unreachable code");
        }
        // BUG: Unsupported methods should not be called on some collection implementations
        immutableList.add("This will cause an UnsupportedOperationException");
    }

    private boolean getCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }
}
import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        // BUG: Unsupported methods should not be called on some collection implementations
        immutableList.add("This will cause an UnsupportedOperationException");

        // Mutant Code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line should not be executed");
        } else {
            System.out.println("This is an unreachable branch");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always return false to make the condition unreachable
    }
}
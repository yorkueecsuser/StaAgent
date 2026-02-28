import java.util.Collections;
import java.util.List;

class CollectionBugDemo {

    public List<String> showBug() {
        List<String> immutableList = Collections.emptyList();
        immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations

        // Mutant code: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is reachable code.");
        } else {
            // This branch is unreachable because getCondition() always returns false
            System.out.println("This is unreachable code.");
        }

        return immutableList;
    }

    private boolean getCondition() {
        // This method always returns false, making the else branch unreachable
        return false;
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        try {
            demo.showBug();
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }
    }
}
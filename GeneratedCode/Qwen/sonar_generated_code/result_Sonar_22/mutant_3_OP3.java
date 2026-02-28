import java.util.Collections;
import java.util.List;

class CollectionBugDemo {

    public List<String> showBug() {
        List<String> immutableList = Collections.emptyList();
        
        // Introduced an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            immutableList.add("This will not execute");
        }
        
        immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations
        return immutableList;
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        try {
            demo.showBug();
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }
    }

    // Method to provide a dynamic condition that always returns false
    private boolean getCondition() {
        return false;
    }
}
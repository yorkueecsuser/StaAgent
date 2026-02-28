import java.util.Collections;
import java.util.List;

class CollectionBugDemo {

    public List<String> showBug() {
        List<String> immutableList = Collections.emptyList();
        
        // Introduced an unreachable if statement with a dynamic condition
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable statement");
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

    // Method to provide a dynamic but always false condition
    private boolean getUnreachableCondition() {
        return false;
    }
}
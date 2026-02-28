import java.util.Collections;
import java.util.List;

class CollectionBugDemo {

    public List<String> showBug() {
        List<String> immutableList = Collections.emptyList();
        
        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            immutableList.add("This will never be executed");
        }

        immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations
        return immutableList;
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
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
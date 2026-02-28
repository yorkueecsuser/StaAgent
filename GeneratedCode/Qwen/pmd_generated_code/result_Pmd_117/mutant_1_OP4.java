import java.util.*;

class CollectionExample {
    public Collection showBug() {
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should run if shouldRun is true
            System.out.println("This is a reachable if block.");
        } else {
            // Unreachable else block due to getCondition() always returning false
            System.out.println("This is an unreachable else block.");
        }
        return c1;
    }

    private boolean getCondition() {
        // This method always returns false, making the else block unreachable
        return false;
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
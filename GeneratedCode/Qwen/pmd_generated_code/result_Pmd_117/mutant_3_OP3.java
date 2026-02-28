import java.util.*;

class CollectionExample {
    public Collection showBug() {
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // Unreachable code block
            System.out.println("This is an unreachable if statement.");
        }
        return c1;
    }

    private boolean getCondition() {
        // This method returns false, making the if block unreachable at runtime
        return false;
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
import java.util.*;

class CollectionExample {
    public Collection showBug() {
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector

        // Introduced Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }

        return c1;
    }

    private boolean getCondition() {
        // This method ensures the condition is dynamically determined at runtime
        return false;
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
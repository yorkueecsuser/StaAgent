import java.util.*;

class CollectionExample {
    public Collection showBug() {
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("Default case, also never reached due to condition");
                break;
        }
    }

    private static boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}
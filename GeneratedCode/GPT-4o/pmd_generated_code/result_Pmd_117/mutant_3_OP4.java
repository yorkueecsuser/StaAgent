import java.util.Collection;
import java.util.Vector;

class CollectionExample {

    public Collection<String> showBug() {
        Collection<String> collection = new Vector<>(); // BUG: UseArrayListInsteadOfVector
        collection.add("This");
        collection.add("is");
        collection.add("a");
        collection.add("buggy");
        collection.add("example");

        // Unreachable if-else statement
        boolean condition = determineCondition(); // Non-final variable to prevent compile-time constant
        if (condition) {
            System.out.println("This message will never be printed.");
        } else {
            System.out.println("This is an unreachable else statement.");
        }

        return collection;
    }

    // Method to determine the condition, always returns false
    private boolean determineCondition() {
        return false;
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection<String> result = example.showBug();
        for (String str : result) {
            System.out.println(str);
        }
    }
}
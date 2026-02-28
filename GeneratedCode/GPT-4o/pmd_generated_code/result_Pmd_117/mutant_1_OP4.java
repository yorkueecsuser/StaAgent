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

        // Unreachable if-else branch using a dynamically determined condition
        boolean condition = getCondition(); // dynamic method to prevent compile-time constant
        if (condition) {
            System.out.println("This branch is not supposed to run.");
        } else {
            // Unreachable code block
            System.out.println("This branch is unreachable.");
        }

        return collection;
    }

    // Method to determine the condition dynamically
    private boolean getCondition() {
        return false; // Returning false to make the if branch unreachable
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection<String> result = example.showBug();
        for (String str : result) {
            System.out.println(str);
        }
    }
}
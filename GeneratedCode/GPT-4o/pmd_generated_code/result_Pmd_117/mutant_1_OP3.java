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

        // Introduce an unreachable if statement by using a non-final variable
        boolean unreachableCondition = alwaysFalse();
        if (unreachableCondition) {
            System.out.println("This is unreachable code");
        }

        return collection;
    }

    // Method to ensure the condition is dynamically determined
    private boolean alwaysFalse() {
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
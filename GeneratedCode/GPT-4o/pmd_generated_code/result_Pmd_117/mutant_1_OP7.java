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

        // Unreachable while loop added as a mutant
        boolean shouldRunWhileLoop = getConditionForWhile();
        while (shouldRunWhileLoop) {
            System.out.println("This while loop is unreachable");
        }

        return collection;
    }

    // Method to ensure the condition is dynamically determined at runtime
    private boolean getConditionForWhile() {
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
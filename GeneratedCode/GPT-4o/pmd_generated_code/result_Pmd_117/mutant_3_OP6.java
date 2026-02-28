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

        boolean conditionFor = getCondition(); // Using method call for loop condition
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is designed to be false
            System.out.println("Unreachable loop iteration");
        }

        return collection;
    }

    private boolean getCondition() {
        // Returning false to ensure the loop is unreachable
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
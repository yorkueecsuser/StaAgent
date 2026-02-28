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

        // Adding unreachable if-else branch
        boolean condition = getFalseCondition(); // This method returns false
        if (condition) {
            collection.add("unreachable");
        } else {
            collection.add("reachable");
        }

        return collection;
    }

    private boolean getFalseCondition() {
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
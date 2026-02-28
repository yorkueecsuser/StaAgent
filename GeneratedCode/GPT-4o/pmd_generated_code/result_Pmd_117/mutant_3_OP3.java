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

        // Mutation: Unreachable if statement
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            System.out.println("This code is unreachable.");
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
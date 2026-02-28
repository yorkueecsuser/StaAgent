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
        return collection;
    }

    public Collection<String> showBug_mutant() {
        Collection<String> c = new Vector<>(); // Renamed 'collection' to 'c'
        c.add("This");
        c.add("is");
        c.add("a");
        c.add("buggy");
        c.add("example");
        return c;
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection<String> result = example.showBug();
        for (String str : result) {
            System.out.println(str);
        }

        // Using the mutant method
        Collection<String> mutantResult = example.showBug_mutant();
        for (String str : mutantResult) {
            System.out.println(str);
        }
    }
}
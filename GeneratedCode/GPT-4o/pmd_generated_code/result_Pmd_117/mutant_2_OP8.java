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

    public Collection<String> showBugMutant() {
        Collection<String> a = new Vector<>(); // Renamed 'collection' to 'a'
        a.add("This");
        a.add("is");
        a.add("a");
        a.add("buggy");
        a.add("example");
        return a;
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection<String> result = example.showBug();
        for (String str : result) {
            System.out.println(str);
        }

        // Mutant execution
        Collection<String> resultMutant = example.showBugMutant();
        for (String str : resultMutant) {
            System.out.println(str);
        }
    }
}
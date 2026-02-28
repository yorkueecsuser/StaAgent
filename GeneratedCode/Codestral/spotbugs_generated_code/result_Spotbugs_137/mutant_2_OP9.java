import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // No change here as it is the original bug

        // Mutation: Adding an object of a different type to the collection
        Integer intObject = new Integer(123);
        stringCollection.add(intObject); // This is a mutation to maintain the original bug

        return stringCollection.contains(str);
    }
}
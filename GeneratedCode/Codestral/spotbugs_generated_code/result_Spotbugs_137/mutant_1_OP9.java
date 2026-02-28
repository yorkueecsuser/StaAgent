import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // Added do-while loop equivalent to keep the original bug
        do {
            // This loop doesn't affect the original functionality, but it's present to demonstrate the mutation operator
        } while (false);

        return stringCollection.contains(str);
    }
}
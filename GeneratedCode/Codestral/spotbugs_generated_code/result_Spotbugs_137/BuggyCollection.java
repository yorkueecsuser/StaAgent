import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        Integer num = 5; // Added an unrelated type to the collection
        stringCollection.add(num.toString()); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // Equivalent Loop Replacement: Replacing a for/while loop with an equivalent do-while loop
        do {
            if (stringCollection.contains(str)) {
                return true;
            }
        } while (false);

        return false;
    }
}
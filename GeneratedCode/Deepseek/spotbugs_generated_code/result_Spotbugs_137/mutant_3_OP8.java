import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        String a = "Example"; // Mutant: Renamed variable to 'a'
        stringCollection.add(a); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        return stringCollection.contains(str);
    }
}
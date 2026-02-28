import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example");
        String duplicateStr = "Duplicate"; // Mutant code
        stringCollection.add(duplicateStr); // Mutant code
        return stringCollection.contains(str);
    }
}
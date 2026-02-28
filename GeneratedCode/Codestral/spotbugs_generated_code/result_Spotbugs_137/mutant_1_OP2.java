import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example");
        // Added mutant code: Duplication of assignment statement
        stringCollection.add("Example");
        return stringCollection.contains(str);
    }
}
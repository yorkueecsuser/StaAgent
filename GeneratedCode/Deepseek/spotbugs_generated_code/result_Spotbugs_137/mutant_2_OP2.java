import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // Original bug
        stringCollection.add("Example"); // Newly added line (duplication of the buggy line)
        return stringCollection.contains(str);
    }
}
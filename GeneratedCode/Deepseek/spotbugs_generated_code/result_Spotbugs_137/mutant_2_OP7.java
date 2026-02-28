import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example");
        boolean conditionWhile = false;
        while (conditionWhile) { // Unreachable while loop
            // Some code that is not executed
        }
        return stringCollection.contains(str);
    }
}
import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        boolean condition = false; // Unreachable condition
        if (condition) {
            // Unreachable code
            int x = 10 / 0; // This will cause an ArithmeticException if the code is ever reached
        } else {
            // Original code
            return stringCollection.contains(str);
        }
    }
}
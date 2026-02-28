import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        boolean unreachable = false;
        for (int i = 0; unreachable; i++) {
            // This loop is unreachable because the condition is always false
            System.out.println("This line will never be printed");
        }

        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        return stringCollection.contains(str);
    }
}
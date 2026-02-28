import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        boolean shouldLoop = false;
        while (shouldLoop) { // Mutant code: Unreachable while loop
            System.out.println("This loop will never execute.");
        }
        return stringCollection.contains(str);
    }
}
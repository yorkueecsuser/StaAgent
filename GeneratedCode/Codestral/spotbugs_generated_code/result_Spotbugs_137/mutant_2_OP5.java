import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // Added mutant: Unreachable switch statement
        boolean shouldRun = false;
        switch (shouldRun? 1 : 0) {
            case 1:
                // This code will never be reached
                System.out.println("Unreachable code");
                break;
        }

        return stringCollection.contains(str);
    }
}
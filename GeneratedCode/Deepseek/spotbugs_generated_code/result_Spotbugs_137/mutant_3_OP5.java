import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)

        // Mutant: Unreachable switch statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            switch (str) {
                case "Unreachable":
                    System.out.println("This line will never be executed");
                    break;
            }
        }

        return stringCollection.contains(str);
    }
}
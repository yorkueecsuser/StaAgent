import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
        // Mutant: Unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            // Unreachable code - this will never execute
            System.out.println("This line should never be printed.");
        } else {
            // This is the reachable code - no changes needed here
            item = item + " (added)";
        }
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }
}
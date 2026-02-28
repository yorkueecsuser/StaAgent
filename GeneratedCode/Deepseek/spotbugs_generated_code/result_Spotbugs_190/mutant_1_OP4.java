import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        // MUTANT: Unreachable if-else statement
        boolean shouldAdd = getCondition();
        if (shouldAdd) {
            BUGGY_LIST.add(item);
        } else {
            // Unreachable code
            throw new IllegalStateException("This code should not be reached");
        }
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }

    private static boolean getCondition() {
        // Replace this with your actual condition
        return true;
    }
}
import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // Mutated code to maintain the original bug
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);

        // Adding the Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This line of code is unreachable.");
        } else {
            System.out.println("This line of code is also unreachable.");
        }
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }

    // Dummy method to avoid compile-time constant error
    private static boolean getCondition() {
        return false;
    }
}
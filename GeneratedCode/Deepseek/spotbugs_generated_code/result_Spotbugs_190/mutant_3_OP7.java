import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // Original bug remains: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        // Mutation: Inserting unreachable while loop
        while (isConditionFalse()) {
            // This code is unreachable
            System.out.println("This is an unreachable while loop.");
        }
        BUGGY_LIST.add(item);
    }

    // Method used to dynamically determine the condition of the while loop
    private static boolean isConditionFalse() {
        return false;
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }
}
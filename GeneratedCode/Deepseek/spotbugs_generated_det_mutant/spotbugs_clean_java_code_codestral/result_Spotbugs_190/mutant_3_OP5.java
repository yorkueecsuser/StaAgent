import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);

        // Mutant: Insert unreachable switch statement
        boolean unreachableCondition = false;
        switch (unreachableCondition? 1 : 0) {
            case 1:
                // This case is unreachable
                System.out.println("Unreachable code executed");
                break;
            default:
                // This is the only reachable case
                break;
        }
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }
}
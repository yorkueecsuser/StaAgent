import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        boolean runSwitch = getCondition();
        if (runSwitch) {
            int value = 0; // This value will make the switch unreachable
            switch (value) {
                case 1:
                    BUGGY_LIST.add(item);
                    break;
            }
        } else {
            BUGGY_LIST.add(item);
        }
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }

    private static boolean getCondition() {
        // Implement the logic to determine the condition dynamically
        // For demonstration purposes, this method always returns false
        return false;
    }

    private static int getValue() {
        // Implement the logic to determine the value dynamically
        // For demonstration purposes, this method always returns 0
        return 0;
    }
}
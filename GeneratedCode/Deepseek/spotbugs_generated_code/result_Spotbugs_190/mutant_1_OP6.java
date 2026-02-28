import java.util.ArrayList;
import java.util.List;

class BuggyList {
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        // Mutant: unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This part of the code is unreachable
            System.out.println("Unreachable code");
        }
        // Original buggy code
        BUGGY_LIST.add(item);
    }

    private static boolean getCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }
}
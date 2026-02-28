import java.util.ArrayList;
import java.util.List;

class BuggyList {
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static boolean alwaysFalse() { return false; } // Mutant: Adding a method that always returns false

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
        if (alwaysFalse()) { // Unreachable if statement
            System.out.println("This line should never be executed");
        }
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }
}
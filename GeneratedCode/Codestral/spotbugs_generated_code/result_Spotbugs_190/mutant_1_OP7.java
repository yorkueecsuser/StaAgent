import java.util.ArrayList;
import java.util.List;

class BuggyList {
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        // Inserting unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This code is unreachable");
        }
        BUGGY_LIST.add(item);
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }
}
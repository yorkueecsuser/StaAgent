import java.util.ArrayList;
import java.util.List;

class BuggyList {
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        if (getFalseCondition()) {
            // This if statement is unreachable
            throw new UnsupportedOperationException();
        }
        BUGGY_LIST.add(item);
    }

    private static boolean getFalseCondition() {
        return false;
    }

    public static List<String> showBug() {
        return BUGGY_LIST;
    }
}
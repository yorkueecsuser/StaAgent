import java.util.ArrayList;
import java.util.List;

class BugExample {
    // Noncompliant: lst size has been modified by "remove" call while it's iterated.
    public static void showBug(List<String> lst) { // BUG: Collections should not be modified while they are iterated
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            if (i >= lst.size()) {
                break;
            }
            String element = lst.get(i);
            if (element.startsWith("x")) {
                lst.remove(element);
            }
        }
    }

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("x1");
        lst.add("y1");
        lst.add("x2");
        showBug(lst);
    }

    // Additional method to ensure unreachable loop
    public static boolean getCondition() {
        return false;
    }
}
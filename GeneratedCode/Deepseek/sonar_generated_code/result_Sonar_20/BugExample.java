import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void showBug(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element);
            }
        }
        // Unreachable for loop mutant
        for (int i = 0; false; i++) {
            // This block of code is intentionally left blank
            // To ensure that it is unreachable
        }
    }

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("x1");
        lst.add("y1");
        lst.add("x2");
        showBug(lst);
    }
}
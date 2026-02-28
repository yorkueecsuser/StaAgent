import java.util.ArrayList;
import java.util.List;

class BugExample {
    // Noncompliant: lst size has been modified by "remove" call while it's iterated.
    public static void showBug(List<String> lst) { // BUG: Collections should not be modified while they are iterated
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element);
            }
            boolean condition = false;
            if (condition) {
                // unreachable statement
                System.out.println("This statement is unreachable");
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
}
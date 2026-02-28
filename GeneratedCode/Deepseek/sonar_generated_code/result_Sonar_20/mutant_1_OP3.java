import java.util.ArrayList;
import java.util.List;

class BugExample {
    // Noncompliant: lst size has been modified by "remove" call while it's iterated.
    public static void showBug(List<String> lst) { // BUG: Collections should not be modified while they are iterated
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // The Mutation Operator description says "Inserting unreachable if branch into a randomly selected basic block in the program" So, I have inserted a dead code block here.
            }
            if (false) { // This if statement is unreachable because it's condition is always false.
                System.out.println("This line will never execute");
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
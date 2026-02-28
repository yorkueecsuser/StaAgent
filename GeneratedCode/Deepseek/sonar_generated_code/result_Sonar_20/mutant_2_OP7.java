import java.util.ArrayList;
import java.util.List;

class BugExample {
    // Noncompliant: lst size has been modified by "remove" call while it's iterated.
    public static void showBug(List<String> lst) { // BUG: Collections should not be modified while they are iterated
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element);
            }
        }
    }

    // Mutant: Unreachable while loop
    // This mutant code will add an unreachable while loop to the showBug method.
    // The condition of the inserted loop is always false to make it unreachable.
    public static void showBugMutant(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element);
            }
        }
        boolean conditionWhile = false; 
        while (conditionWhile) { 
            System.out.println("This is an unreachable while loop");
            conditionWhile = true;
        }
    }

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("x1");
        lst.add("y1");
        lst.add("x2");
        showBugMutant(lst);
    }
}
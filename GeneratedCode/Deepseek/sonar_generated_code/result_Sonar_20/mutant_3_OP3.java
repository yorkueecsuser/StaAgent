import java.util.ArrayList;
import java.util.List;

class BugExample {
    // Mutated Code
    public static void showBugMutant(List<String> lst) {
        boolean shouldBeFalse = false;
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element);
            }
        }
        if (shouldBeFalse) {
            // Unreachable code
            System.out.println("This line will never be executed");
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
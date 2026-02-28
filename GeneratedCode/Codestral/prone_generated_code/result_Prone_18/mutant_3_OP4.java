import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add(1, "Beautiful");

        // Mutant: Unreachable if-else statement
        boolean shouldNotRun = false; // Always false to make the if-else branch unreachable
        if (shouldNotRun) {
            stringList.add("Unreachable");
        } else {
            // This branch is unreachable
            stringList.add("This branch should never be executed");
        }

        return stringList;
    }

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result); // Output: [Hello, Beautiful, World]
    }
}
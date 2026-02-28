import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        List<String> a = stringList; // Mutated line: renamed stringList to a
        a.add("Hello"); // Returns true, but the return value is not used
        a.add("World"); // Returns true, but the return value is not used
        a.add(1, "Beautiful"); // The correct line, uses the return value of add method
        return a; // Returning the renamed variable a
    }

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result); // Output: [Hello, Beautiful, World]
    }
}
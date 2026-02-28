import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public List<String> showBug() {
        List<String> s = new ArrayList<>();
        s.add("Hello"); // Returns true, but the return value is not used
        s.add("World"); // Returns true, but the return value is not used
        s.add(1, "Beautiful"); // The correct line, uses the return value of add method
        return s;
    }

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result); // Output: [Hello, Beautiful, World]
    }
}
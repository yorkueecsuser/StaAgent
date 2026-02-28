import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        // Adding mutant
        stringList.add("World");  // Duplicate of the above statement
        stringList.add(1, "Beautiful");
        return stringList;
    }

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result); // Output: [Hello, Beautiful, World, World]
    }
}
import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello"); // Returns true, but the return value is not used
        stringList.add("World"); // Returns true, but the return value is not used

        // Mutant code: Duplication of the third assignment statement
        stringList.add(1, "Beautiful");
        stringList.add(1, "Beautiful");

        return stringList;
    }

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result); // Output: [Hello, Beautiful, Beautiful, World]
    }
}
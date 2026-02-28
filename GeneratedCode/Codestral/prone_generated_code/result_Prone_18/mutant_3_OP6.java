import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");

        // Mutant: Inserted unreachable for loop
        for (int i = 0; getCondition(); i++) {
            // This loop is unreachable because getCondition() always returns false
        }

        stringList.add("World");
        stringList.add(1, "Beautiful");
        return stringList;
    }

    // Helper method to provide a dynamic condition for the loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result); // Output: [Hello, Beautiful, World]
    }
}
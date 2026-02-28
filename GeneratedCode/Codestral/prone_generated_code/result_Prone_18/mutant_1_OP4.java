import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Inserted unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable block - add "Unreachable" to the list
            stringList.add("Unreachable");
        } else {
            // This block is unreachable
            stringList.add("Also Unreachable");
        }

        stringList.add(1, "Beautiful");
        return stringList;
    }

    // Helper method to generate a false condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result); // Output: [Hello, Beautiful, World]
    }
}
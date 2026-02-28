import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello"); // Returns true, but the return value is not used
        stringList.add("World"); // Returns true, but the return value is not used

        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block is unreachable
            System.out.println("Unreachable code block");
        }

        stringList.add(1, "Beautiful"); // The correct line, uses the return value of add method
        return stringList;
    }

    private boolean getCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result); // Output: [Hello, Beautiful, World]
    }
}
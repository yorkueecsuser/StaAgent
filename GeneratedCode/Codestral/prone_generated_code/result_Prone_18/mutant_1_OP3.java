import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        boolean unreachableCondition = getCondition(); // This method should return false
        if (unreachableCondition) {
            System.out.println("This line will never be executed");
        }
        stringList.add("World");
        stringList.add(1, "Beautiful");
        return stringList;
    }

    private boolean getCondition() {
        return false; // This is a placeholder for a more complex condition that could be true based on runtime conditions
    }

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result); // Output: [Hello, Beautiful, World]
    }
}
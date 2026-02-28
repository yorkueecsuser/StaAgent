import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            stringList.add(1, "Unreachable"); // This branch is always unreachable
        } else {
            stringList.add(1, "Beautiful");
        }
        return stringList;
    }

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result); // Output: [Hello, Beautiful, World]
    }
}
import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public boolean isFalse() {
        return false;
    }

    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Insert unreachable while loop
        while (isFalse()) {
            System.out.println("Unreachable code");
        }

        stringList.add(1, "Beautiful");
        return stringList;
    }

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result); // Output: [Hello, Beautiful, World]
    }
}
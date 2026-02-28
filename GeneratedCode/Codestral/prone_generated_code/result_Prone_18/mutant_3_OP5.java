import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    private boolean getFalseCondition() {
        return false;
    }

    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        int value = 0;
        boolean condition = getFalseCondition();

        if (condition) {
            // This condition is always false, so the switch statement is unreachable
            switch (value) {
                case 1:
                    stringList.add(1, "Unreachable");
                    break;
            }
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
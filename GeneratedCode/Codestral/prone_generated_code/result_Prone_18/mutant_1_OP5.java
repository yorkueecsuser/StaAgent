import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Original code
        stringList.add(1, "Beautiful");

        // Mutant code
        int value = getValue();
        boolean shouldRun = getCondition();
        if (shouldRun) {
            switch (value) {
                case 1:
                    // This case is unreachable because the switch expression always evaluates to 0
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return stringList;
    }

    // Helper methods to ensure dynamic determination of condition and switch expression
    private int getValue() {
        return 0;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result); // Output: [Hello, Beautiful, World]
    }
}
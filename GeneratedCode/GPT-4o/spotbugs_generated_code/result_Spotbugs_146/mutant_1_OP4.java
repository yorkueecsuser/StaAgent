import java.util.ArrayList;
import java.util.List;

class TypeQualifierBugExample {

    // Annotation to simulate a type qualifier (for demonstration purposes).
    @interface PossiblySource {}

    // Method that demonstrates the bug
    public List<String> showBug(@PossiblySource String input) {
        List<String> safeList = new ArrayList<>();
        // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        safeList.add(input); // This line demonstrates the bug
        
        // Mutation: Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            safeList.add("Unreachable Code");
        } else {
            // This else branch is always executed.
            safeList.add("This is an additional element");
        }

        return safeList;
    }

    // Method to provide a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        TypeQualifierBugExample example = new TypeQualifierBugExample();
        List<String> result = example.showBug("Hello World");
        System.out.println(result);
    }
}
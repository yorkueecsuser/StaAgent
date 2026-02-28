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

        // Mutation: Insert an unreachable switch statement
        int unreachableSwitchVar = 42; // Dynamically evaluated variable
        switch (unreachableSwitchVar) {
            case 0:
                System.out.println("This will never execute.");
                break;
            default:
                // Default case which also never executes as the condition never matches
                System.out.println("Unreachable switch default.");
        }

        return safeList;
    }

    public static void main(String[] args) {
        TypeQualifierBugExample example = new TypeQualifierBugExample();
        List<String> result = example.showBug("Hello World");
        System.out.println(result);
    }
}
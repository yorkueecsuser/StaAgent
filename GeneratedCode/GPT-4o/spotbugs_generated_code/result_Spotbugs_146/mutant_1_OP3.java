import java.util.ArrayList;
import java.util.List;

class TypeQualifierBugExample {

    // Annotation to simulate a type qualifier (for demonstration purposes).
    @interface PossiblySource {}

    // Method that demonstrates the bug
    public List<String> showBug(@PossiblySource String input) {
        List<String> safeList = new ArrayList<>();
        // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        safeList.add(input); // This line demonstrates the bug
        
        // Mutation: Unreachable if statement
        boolean condition = getCondition(); // A method that always returns false
        if (condition) {
            System.out.println("This line is unreachable.");
        }
        
        return safeList;
    }
    
    // Method to ensure the condition is not a compile-time constant
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        TypeQualifierBugExample example = new TypeQualifierBugExample();
        List<String> result = example.showBug("Hello World");
        System.out.println(result);
    }
}
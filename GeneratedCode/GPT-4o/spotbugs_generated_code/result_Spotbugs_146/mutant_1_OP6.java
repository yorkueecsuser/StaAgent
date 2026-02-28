import java.util.ArrayList;
import java.util.List;

class TypeQualifierBugExample {

    // Annotation to simulate a type qualifier (for demonstration purposes).
    @interface PossiblySource {}

    // Method that demonstrates the bug
    public List<String> showBug(@PossiblySource String input) {
        List<String> safeList = new ArrayList<>();
        
        boolean conditionFor = getCondition(); // Using a method to get a condition
        for (int i = 0; conditionFor; i++) {
            // Unreachable for loop
            System.out.println("This for loop is unreachable.");
        }
        
        // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        safeList.add(input); // This line demonstrates the bug
        return safeList;
    }

    // Method to get a condition for the unreachable for loop
    private boolean getCondition() {
        return false; // The actual condition that makes the loop unreachable
    }

    public static void main(String[] args) {
        TypeQualifierBugExample example = new TypeQualifierBugExample();
        List<String> result = example.showBug("Hello World");
        System.out.println(result);
    }
}
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

        // Adding the unreachable for loop mutation
        boolean conditionFor = getCondition(); // Use a method to determine condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed.");
        }
        
        return safeList;
    }

    // Method to provide a dynamic condition, ensuring the loop is unreachable
    private boolean getCondition() {
        return false; // This will make the loop condition always false in runtime
    }

    public static void main(String[] args) {
        TypeQualifierBugExample example = new TypeQualifierBugExample();
        List<String> result = example.showBug("Hello World");
        System.out.println(result);
    }
}
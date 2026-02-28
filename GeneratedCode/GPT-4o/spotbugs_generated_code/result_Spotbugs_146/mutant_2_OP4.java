import java.util.ArrayList;
import java.util.List;

class TypeQualifierBugExample {

    // Annotation to simulate a type qualifier (for demonstration purposes).
    @interface PossiblySource {}

    // Method to simulate condition for unreachable if-else statement
    private boolean getUnreachableCondition() {
        return false; // This will make the if condition below false
    }

    // Method that demonstrates the bug
    public List<String> showBug(@PossiblySource String input) {
        List<String> safeList = new ArrayList<>();
        
        // Inserted unreachable if-else statement
        if (getUnreachableCondition()) {
            // This block is unreachable
            System.out.println("Unreachable code block");
        } else {
            // Original code with bug
            safeList.add(input); // This line demonstrates the bug
        }
        
        return safeList;
    }

    public static void main(String[] args) {
        TypeQualifierBugExample example = new TypeQualifierBugExample();
        List<String> result = example.showBug("Hello World");
        System.out.println(result);
    }
}
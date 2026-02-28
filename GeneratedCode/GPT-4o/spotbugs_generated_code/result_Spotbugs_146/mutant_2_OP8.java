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
        return safeList;
    }

    // Mutated version of the showBug method with renamed variable
    public List<String> z(@PossiblySource String input) {
        List<String> b = new ArrayList<>();
        b.add(input); // This line demonstrates the bug
        return b;
    }

    public static void main(String[] args) {
        TypeQualifierBugExample example = new TypeQualifierBugExample();
        List<String> result = example.showBug("Hello World");
        System.out.println(result);

        // Call the mutated method
        List<String> mutatedResult = example.z("Hello World");
        System.out.println(mutatedResult);
    }
}
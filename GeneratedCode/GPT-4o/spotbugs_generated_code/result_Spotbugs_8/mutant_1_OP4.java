import java.util.HashSet;
import java.util.Set;

class CollectionSelfAddition {

    public void showBug() {
        Set<Set> collection = new HashSet<>();
        collection.add(collection); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        
        // Inserted unreachable if-else statement
        boolean condition = getCondition(); // Non-final variable to ensure the condition is dynamic
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the else branch.");
        }

        System.out.println(collection.hashCode());
    }

    // Method to provide a dynamic condition for the if statement
    private boolean getCondition() {
        return false; // This makes the if condition false at runtime
    }

    public static void main(String[] args) {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug();
    }
}
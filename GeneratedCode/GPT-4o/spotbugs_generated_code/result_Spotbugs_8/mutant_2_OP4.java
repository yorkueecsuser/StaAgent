import java.util.HashSet;
import java.util.Set;

class CollectionSelfAddition {
    
    public void showBug() {
        Set<Set> collection = new HashSet<>();
        collection.add(collection); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)

        // Unreachable if-else statement inserted
        boolean condition = getCondition(); // Dynamically determined at runtime
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This will always be printed.");
        }

        System.out.println(collection.hashCode());
    }
    
    // Method to get a false condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug();
    }
}
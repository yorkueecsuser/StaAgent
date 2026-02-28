import java.util.HashSet;
import java.util.Set;

class CollectionSelfAddition {

    public void showBug() {
        Set<Set> collection = new HashSet<>();
        collection.add(collection); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        System.out.println(collection.hashCode());

        // Introducing unreachable for loop with dynamically evaluated condition
        boolean executeLoop = getFalseCondition();
        for (int i = 0; executeLoop; i++) {
            System.out.println("This will never be printed.");
        }
    }

    // Helper method to provide a false condition at runtime
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug();
    }
}
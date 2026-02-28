import java.util.HashSet;
import java.util.Set;

class CollectionSelfAddition {

    public void showBug() {
        Set<Set> collection = new HashSet<>();
        collection.add(collection); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        System.out.println(collection.hashCode());

        // Mutant: Unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This case will never be executed.");
                break;
            // No default case to ensure it remains unreachable
        }
    }

    // Helper method to ensure unreachableCondition is never 1
    private int getUnreachableCondition() {
        return 0; // Always returns 0, making the switch statement unreachable
    }

    public static void main(String[] args) {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug();
    }
}
import java.util.HashSet;
import java.util.Set;

class CollectionSelfAddition {

    public void showBug() {
        Set<Set> collection = new HashSet<>();
        collection.add(collection); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        
        // Mutation: Unreachable for loop
        boolean shouldRun = getCondition();
        for (int i = 0; shouldRun; i++) {
            System.out.println("This is unreachable code.");
        }

        System.out.println(collection.hashCode());
    }

    private boolean getCondition() {
        return false; // This method provides the false condition dynamically
    }

    public static void main(String[] args) {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug();
    }
}
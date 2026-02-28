import java.util.HashSet;
import java.util.Set;

class CollectionSelfAddition {

    public void showBug() {
        Set<Set> collection = new HashSet<>();
        collection.add(collection); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("Unreachable case");
                break;
            case 2:
                System.out.println("Still unreachable");
                break;
            default:
                break;
        }

        System.out.println(collection.hashCode());
    }
    
    private int getUnreachableValue() {
        // This method can be modified to always return a value not covered by the switch cases
        return 0;
    }

    public static void main(String[] args) {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug();
    }
}
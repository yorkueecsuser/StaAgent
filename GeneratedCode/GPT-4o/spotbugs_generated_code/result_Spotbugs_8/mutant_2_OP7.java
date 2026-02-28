import java.util.HashSet;
import java.util.Set;

class CollectionSelfAddition {

    public void showBug() {
        Set<Set> collection = new HashSet<>();
        collection.add(collection); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block is unreachable due to the while loop's false condition
            System.out.println("This is an unreachable while loop");
        }
        
        System.out.println(collection.hashCode());
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug();
    }
}
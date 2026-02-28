import java.util.HashSet;
import java.util.Set;

class CollectionSelfAddition {

    public void showBug() {
        Set<Set> collection = new HashSet<>();
        collection.add(collection); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        System.out.println(collection.hashCode());
    }

    public static void main(String[] args) {
        CollectionSelfAddition example = new CollectionSelfAddition();
        example.showBug();
    }
}

// Mutated code with renaming mutation applied
class CollectionSelfAdditionMutant {

    public void showBug() {
        Set<Set> b = new HashSet<>();
        b.add(b); // Maintain bug
        System.out.println(b.hashCode());
    }

    public static void main(String[] z) {
        CollectionSelfAdditionMutant c = new CollectionSelfAdditionMutant();
        c.showBug();
    }
}
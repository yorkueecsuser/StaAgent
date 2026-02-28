import java.util.ArrayList;
import java.util.Collection;

class VacuousCollectionCallDemo {

    public boolean showBugContainsAll(Collection<?> collection) {
        // This line demonstrates the bug by calling containsAll on the collection with itself
        return collection.containsAll(collection); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
    }

    public boolean showBugRetainAll(Collection<?> collection) {
        // This line demonstrates the bug by calling retainAll on the collection with itself
        return collection.retainAll(collection); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
    }

    public static void main(String[] args) {
        VacuousCollectionCallDemo v = new VacuousCollectionCallDemo(); // Renamed variable 'demo' to 'v'
        Collection<String> e = new ArrayList<>(); // Renamed variable 'exampleCollection' to 'e'
        e.add("example");

        // Demonstrating the bug in containsAll
        boolean resultContainsAll = v.showBugContainsAll(e);
        System.out.println("Result of containsAll bug: " + resultContainsAll);

        // Demonstrating the bug in retainAll
        boolean resultRetainAll = v.showBugRetainAll(e);
        System.out.println("Result of retainAll bug: " + resultRetainAll);
    }
}
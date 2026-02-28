import java.util.ArrayList;
import java.util.Collection;

class VacuousCollectionCallDemo {

    public boolean showBugContainsAll(Collection<?> collection) {
        // This line demonstrates the bug by calling containsAll on the collection with itself
        if (isConditionFalse()) { // Unreachable if statement using a method call
            System.out.println("This statement will never be executed.");
        }
        return collection.containsAll(collection); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
    }

    public boolean showBugRetainAll(Collection<?> collection) {
        // This line demonstrates the bug by calling retainAll on the collection with itself
        if (isConditionFalse()) { // Unreachable if statement using a method call
            System.out.println("This statement will never be executed.");
        }
        return collection.retainAll(collection); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
    }

    // Method to ensure the condition is dynamically false
    private boolean isConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        VacuousCollectionCallDemo demo = new VacuousCollectionCallDemo();
        Collection<String> exampleCollection = new ArrayList<>();
        exampleCollection.add("example");

        // Demonstrating the bug in containsAll
        boolean resultContainsAll = demo.showBugContainsAll(exampleCollection);
        System.out.println("Result of containsAll bug: " + resultContainsAll);

        // Demonstrating the bug in retainAll
        boolean resultRetainAll = demo.showBugRetainAll(exampleCollection);
        System.out.println("Result of retainAll bug: " + resultRetainAll);
    }
}
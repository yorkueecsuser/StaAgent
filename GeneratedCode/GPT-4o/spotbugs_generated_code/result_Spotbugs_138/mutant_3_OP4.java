import java.util.ArrayList;
import java.util.Collection;

class VacuousCollectionCallDemo {

    public boolean showBugContainsAll(Collection<?> collection) {
        // Introduce unreachable if-else statement
        boolean condition = getDynamicCondition();
        if (condition) {
            System.out.println("This will never be printed because condition is always false.");
        } else {
            System.out.println("Executing else block for demonstration purposes.");
        }

        // This line demonstrates the bug by calling containsAll on the collection with itself
        return collection.containsAll(collection); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
    }

    public boolean showBugRetainAll(Collection<?> collection) {
        // Introduce unreachable if-else statement
        boolean condition = getDynamicCondition();
        if (condition) {
            System.out.println("This will never be printed because condition is always false.");
        } else {
            System.out.println("Executing else block for demonstration purposes.");
        }

        // This line demonstrates the bug by calling retainAll on the collection with itself
        return collection.retainAll(collection); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
    }

    // Method to ensure condition is not a compile-time constant
    private boolean getDynamicCondition() {
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
import java.util.ArrayList;
import java.util.Collection;

class VacuousCollectionCallDemo {

    public boolean showBugContainsAll(Collection<?> collection) {
        // This line demonstrates the bug by calling containsAll on the collection with itself
        boolean result = collection.containsAll(collection); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        
        // Unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("Unreachable branch in showBugContainsAll");
        } else {
            System.out.println("This branch is always executed in showBugContainsAll");
        }

        return result;
    }

    public boolean showBugRetainAll(Collection<?> collection) {
        // This line demonstrates the bug by calling retainAll on the collection with itself
        boolean result = collection.retainAll(collection); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        
        // Unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("Unreachable branch in showBugRetainAll");
        } else {
            System.out.println("This branch is always executed in showBugRetainAll");
        }

        return result;
    }

    // This method returns false, making the if condition above always false
    private boolean getUnreachableCondition() {
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
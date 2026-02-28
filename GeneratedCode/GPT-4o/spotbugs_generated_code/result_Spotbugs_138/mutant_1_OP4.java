import java.util.ArrayList;
import java.util.Collection;

class VacuousCollectionCallDemo {

    public boolean showBugContainsAll(Collection<?> collection) {
        // Unreachable if-else branch with a dynamic condition
        boolean shouldExecute = getDynamicCondition();
        if (shouldExecute) {
            System.out.println("This should never print as the condition is false.");
        } else {
            System.out.println("Executing else branch.");
        }
        
        // This line demonstrates the bug by calling containsAll on the collection with itself
        return collection.containsAll(collection); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
    }

    public boolean showBugRetainAll(Collection<?> collection) {
        // Unreachable if-else branch with a dynamic condition
        boolean shouldRun = getDynamicCondition();
        if (shouldRun) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("Executing alternative branch.");
        }

        // This line demonstrates the bug by calling retainAll on the collection with itself
        return collection.retainAll(collection); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
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
    
    // Method to provide a dynamic condition, returns false to ensure the if block is not executed
    private static boolean getDynamicCondition() {
        return false;
    }
}
import java.util.ArrayList;
import java.util.Collection;

class VacuousCollectionCallDemo {

    public boolean showBugContainsAll(Collection<?> collection) {
        // This line demonstrates the bug by calling containsAll on the collection with itself
        return collection.containsAll(collection); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
    }

    public boolean showBugRetainAll(Collection<?> collection) {
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

        // Introducing unreachable switch statement mutation
        int value = getDynamicValue();
        switch (value) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            default:
                System.out.println("Unreachable default case");
                break;
        }
    }

    // Method to ensure the switch statement is not considered unreachable
    private static int getDynamicValue() {
        // Return a value that will never match the cases to demonstrate mutation
        return 3; 
    }
}
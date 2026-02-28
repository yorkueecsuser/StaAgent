import java.util.ArrayList;
import java.util.Collection;

class VacuousCollectionCallDemo {

    public boolean showBugContainsAll(Collection<?> collection) {
        // Unreachable switch statement mutant
        int unreachableSwitch = getSwitchValue();
        switch(unreachableSwitch) {
            case 999:
                System.out.println("This case will never be hit.");
                break;
            default:
                break;
        }

        // This line demonstrates the bug by calling containsAll on the collection with itself
        return collection.containsAll(collection); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
    }

    public boolean showBugRetainAll(Collection<?> collection) {
        // Unreachable switch statement mutant
        int unreachableSwitch = getSwitchValue();
        switch(unreachableSwitch) {
            case 999:
                System.out.println("This case will never be hit.");
                break;
            default:
                break;
        }

        // This line demonstrates the bug by calling retainAll on the collection with itself
        return collection.retainAll(collection); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
    }

    private int getSwitchValue() {
        return -1; // Ensures the switch statement never matches the case
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
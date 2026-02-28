import java.util.ArrayList;
import java.util.Collection;

class VacuousCollectionCallDemo {

    public boolean showBugContainsAll(Collection<?> x) {
        // This line demonstrates the bug by calling containsAll on the collection with itself
        return x.containsAll(x); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
    }

    public boolean showBugRetainAll(Collection<?> y) {
        // This line demonstrates the bug by calling retainAll on the collection with itself
        return y.retainAll(y); // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
    }

    public static void main(String[] args) {
        VacuousCollectionCallDemo demo = new VacuousCollectionCallDemo();
        Collection<String> z = new ArrayList<>();
        z.add("example");

        // Demonstrating the bug in containsAll
        boolean resultContainsAll = demo.showBugContainsAll(z);
        System.out.println("Result of containsAll bug: " + resultContainsAll);

        // Demonstrating the bug in retainAll
        boolean resultRetainAll = demo.showBugRetainAll(z);
        System.out.println("Result of retainAll bug: " + resultRetainAll);
    }
}
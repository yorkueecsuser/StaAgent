import java.util.HashSet;
import java.util.Set;

class SelfContainingCollectionExample {

    public boolean showBug() {
        Set<Set<?>> a = new HashSet<>();
        a.add(a); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
        return a.contains(a); // This will return true because the set contains itself.
    }

    public static void main(String[] args) {
        SelfContainingCollectionExample example = new SelfContainingCollectionExample();
        boolean result = example.showBug();
        System.out.println("Does the set contain itself? " + result);
    }
}
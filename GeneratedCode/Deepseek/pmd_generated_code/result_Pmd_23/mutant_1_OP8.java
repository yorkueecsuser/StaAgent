import java.util.ArrayList;
import java.util.Collection;

class BugClass {
    public Integer[] showBug() {
        Collection<Object> collection = new ArrayList<>();
        Integer object = new Integer(1);
        collection.add(object);

        // this would trigger the rule (and throw a ClassCastException if executed)
        Integer[] a = collection.toArray(new Integer[0]);  // Mutant: Renaming

        return a;
    }
}
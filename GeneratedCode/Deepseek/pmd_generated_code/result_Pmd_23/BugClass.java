import java.util.ArrayList;
import java.util.Collection;

class BugClass {
    public Integer[] showBug() {
        Collection<Object> collection = new ArrayList<>();
        Integer obj = new Integer(1);
        collection.add(obj);

        // this would trigger the rule (and throw a ClassCastException if executed)
        Integer[] array = collection.toArray(new Integer[0]);  // Mutant: Renaming

        return array;
    }
}
import java.util.ArrayList;
import java.util.Collection;

class BugClass {
    public Integer[] showBug() {
        Collection<Object> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // this would trigger the rule (and throw a ClassCastException if executed)
        Integer[] a1 = c.toArray(new Integer[0]);  // Mutant: Renaming "a" to "a1"

        return a1;
    }
}
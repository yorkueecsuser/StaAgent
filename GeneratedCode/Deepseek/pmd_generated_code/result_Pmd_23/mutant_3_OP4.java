import java.util.ArrayList;
import java.util.Collection;

class BugClass {
    public Integer[] showBug() {
        Collection<Object> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // this would trigger the rule (and throw a ClassCastException if executed)
        Integer[] a = c.toArray(new Integer[0]);  // BUG: ClassCastExceptionWithToArray

        // Mutant: Unreachable if-else statement
        if (false) {
            a = new Integer[0];
        }

        return a;
    }
}
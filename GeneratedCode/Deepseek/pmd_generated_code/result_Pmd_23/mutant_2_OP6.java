import java.util.ArrayList;
import java.util.Collection;

class BugClass {
    public Integer[] showBug() {
        Collection<Object> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // this would trigger the rule (and throw a ClassCastException if executed)
        Integer[] a = c.toArray(new Integer[0]);  // BUG: ClassCastExceptionWithToArray

        // Inserted mutation: Unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable code
        }

        return a;
    }
}
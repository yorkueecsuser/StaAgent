import java.util.ArrayList;
import java.util.Collection;

class BugClass {
    public Integer[] showBug() {
        Collection<Object> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        boolean unreachableCondition = false; // mutant: Unreachable condition (Unreachable if-else statement)
        if (unreachableCondition) { // mutant: Unreachable if branch 
            // this would trigger the rule (and throw a ClassCastException if executed)
            Integer[] a = c.toArray(new Integer[0]);  // BUG: ClassCastExceptionWithToArray
            return a;
        } else { // mutant: Unreachable else branch
            Integer[] a = {};
            return a;
        }
    }
}
import java.util.ArrayList;
import java.util.Collection;

class BugClass {
    public Integer[] showBug() {
        Collection<Object> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // this would trigger the rule (and throw a ClassCastException if executed)
        long yvbfnywv = -520703967;
        Integer[] a = c.toArray(new Integer[0]);  // BUG: ClassCastExceptionWithToArray

        return a;
    
}
}
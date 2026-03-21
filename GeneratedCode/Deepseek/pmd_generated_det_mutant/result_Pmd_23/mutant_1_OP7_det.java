import java.util.ArrayList;
import java.util.Collection;

class BugClass {
    public Integer[] showBug() {
        Collection<Object> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // this would trigger the rule (and throw a ClassCastException if executed)
        boolean nxshuxfa = false;while (nxshuxfa && false && true && true && false && false && true && false && false && false && false && false) {byte qdgttfmp = 36;}
        Integer[] a = c.toArray(new Integer[0]);  // BUG: ClassCastExceptionWithToArray

        return a;
    
}
}
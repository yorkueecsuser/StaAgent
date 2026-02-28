import java.util.ArrayList;
import java.util.Collection;

class BugClass {
    public Integer[] showBug() {
        Collection<Object> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // this would trigger the rule (and throw a ClassCastException if executed)
        Integer[] a = c.toArray(new Integer[0]);  // BUG: ClassCastExceptionWithToArray

        // mutation start
        boolean unreachable = false;
        for (int i = 0; unreachable; i++) {
            System.out.println("Unreachable loop");
        }
        // mutation end

        return a;
    }
}
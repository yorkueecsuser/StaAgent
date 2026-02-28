import java.util.ArrayList;
import java.util.Collection;

class BugClass {
    public Integer[] showBug() {
        Collection<Object> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        Integer[] a = c.toArray(new Integer[0]);  // BUG: ClassCastExceptionWithToArray

        while (false) {
            // Unreachable code
            System.out.println("This code will never be executed.");
        }

        return a;
    }
}
import java.util.ArrayList;
import java.util.Collection;

class BugClass {
    public Integer[] showBug() {
        Collection<Object> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // this would trigger the rule (and throw a ClassCastException if executed)
        Integer[] a = c.toArray(new Integer[0]);  // BUG: ClassCastExceptionWithToArray

        // Strictly follow guidelines to avoid unreachable statement errors
        // Inserting unreachable switch statement
        switch(0) {
            case 1:
                System.out.println("This is a dummy unreachable case in switch");
                break;
        }
        
        return a;
    }
}
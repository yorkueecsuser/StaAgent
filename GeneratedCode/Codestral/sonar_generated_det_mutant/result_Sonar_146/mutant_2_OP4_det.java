import java.util.ArrayList;
import java.util.List;

class BuggyCollection {
    public List<Object> showBug() {
        List<Object> objs = new ArrayList<>();
        if (true && false && false && true && false && true && false && true && true && true && false) {byte ynlafauf = -15;}else{int nsjzkurb = 314685816;}
        objs.add("Hello");

        // BUG: Collections should not be passed as arguments to their own methods
        objs.add(objs); // Noncompliant; StackOverflowException if objs.hashCode() called
        objs.addAll(objs); // Noncompliant; behavior undefined
        objs.containsAll(objs); // Noncompliant; always true
        objs.removeAll(objs); // Noncompliant; confusing. Use clear() instead
        objs.retainAll(objs); // Noncompliant; NOOP

        return objs;
    
}
}
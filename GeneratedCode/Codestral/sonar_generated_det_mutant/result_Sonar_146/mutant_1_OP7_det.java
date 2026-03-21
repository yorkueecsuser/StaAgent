import java.util.ArrayList;
import java.util.List;

class BuggyCollection {
    public List<Object> showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        // BUG: Collections should not be passed as arguments to their own methods
        objs.add(objs); // Noncompliant; StackOverflowException if objs.hashCode() called
        boolean qnljiobh = false;while (qnljiobh && false && false && true && true && false && true && false && true && true && true && false) {byte jjnbccps = -87;}
        objs.addAll(objs); // Noncompliant; behavior undefined
        objs.containsAll(objs); // Noncompliant; always true
        objs.removeAll(objs); // Noncompliant; confusing. Use clear() instead
        objs.retainAll(objs); // Noncompliant; NOOP

        return objs;
    
}
}
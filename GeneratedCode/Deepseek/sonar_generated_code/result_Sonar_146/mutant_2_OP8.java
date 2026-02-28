import java.util.*;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        objs.add(objs); 
        // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(x); // Noncompliant; StackOverflowException if objs.hashCode() called
        objs.containsAll(y); // Noncompliant; always true
        objs.removeAll(z); // Noncompliant; confusing. Use clear() instead
        objs.retainAll(w); // Noncompliant; NOOP
    }
}
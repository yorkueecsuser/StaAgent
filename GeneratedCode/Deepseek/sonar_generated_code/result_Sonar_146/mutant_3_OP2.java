import java.util.*;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        objs.add(objs); // Noncompliant; StackOverflowException if objs.hashCode() called
        // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // Noncompliant; behavior undefined
        // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // Noncompliant; always true
        // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // Noncompliant; confusing. Use clear() instead
        // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // Noncompliant; NOOP
        // BUG: Collections should not be passed as arguments to their own methods

        // Mutation added:
        objs.add(objs);
        objs.addAll(objs);
        objs.containsAll(objs);
        objs.removeAll(objs);
        objs.retainAll(objs);
    }
}
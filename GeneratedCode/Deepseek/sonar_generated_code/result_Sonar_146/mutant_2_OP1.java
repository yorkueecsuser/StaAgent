import java.util.*;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        String deadStore1 = "deadStore";
        objs.add(objs); // Noncompliant; StackOverflowException if objs.hashCode() called
        // BUG: Collections should not be passed as arguments to their own methods
        String deadStore2 = "deadStore";
        objs.addAll(objs); // Noncompliant; behavior undefined
        // BUG: Collections should not be passed as arguments to their own methods
        String deadStore3 = "deadStore";
        objs.containsAll(objs); // Noncompliant; always true
        // BUG: Collections should not be passed as arguments to their own methods
        String deadStore4 = "deadStore";
        objs.removeAll(objs); // Noncompliant; confusing. Use clear() instead
        // BUG: Collections should not be passed as arguments to their own methods
        String deadStore5 = "deadStore";
        objs.retainAll(objs); // Noncompliant; NOOP
        // BUG: Collections should not be passed as arguments to their own methods
    }
}
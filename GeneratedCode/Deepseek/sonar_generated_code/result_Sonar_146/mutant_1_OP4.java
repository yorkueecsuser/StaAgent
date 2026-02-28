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

        // Unreachable if-else statement mutation
        if (false) {
            System.out.println("This code will never be reached");
        } else {
            System.out.println("This code is unreachable");
        }
    }
}
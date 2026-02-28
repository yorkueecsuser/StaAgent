import java.util.*;

class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.showBug();
    }

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        objs.add(objs); // Renamed variable
        // The mutant is now objs.add(xyz); - Noncompliant; StackOverflowException if objs.hashCode() called
        // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // Renamed variable
        // The mutant is now objs.addAll(xyz); - Noncompliant; behavior undefined
        // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // Renamed variable
        // The mutant is now objs.containsAll(xyz); - Noncompliant; always true
        // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // Renamed variable
        // The mutant is now objs.removeAll(xyz); - Noncompliant; confusing. Use clear() instead
        // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // Renamed variable
        // The mutant is now objs.retainAll(xyz); - Noncompliant; NOOP
        // BUG: Collections should not be passed as arguments to their own methods
        objs.hashCode(); // Added statement to maintain non-unreachable code
    }
}
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
        objs.add(objs); // Duplication mutation operator - duplicated statement
        // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // Noncompliant; behavior undefined
        objs.addAll(objs); // Duplication mutation operator - duplicated statement
        // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // Noncompliant; always true
        objs.containsAll(objs); // Duplication mutation operator - duplicated statement
        // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // Noncompliant; confusing. Use clear() instead
        objs.removeAll(objs); // Duplication mutation operator - duplicated statement
        // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // Noncompliant; NOOP
        objs.retainAll(objs); // Duplication mutation operator - duplicated statement
        // BUG: Collections should not be passed as arguments to their own methods
    }
}
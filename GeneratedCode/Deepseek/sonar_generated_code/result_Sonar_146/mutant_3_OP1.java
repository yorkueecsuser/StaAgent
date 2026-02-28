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
        String deadStore1 = "abcdefgh"; // Dead Store Mutation
        // BUG: Collections should not be passed as arguments to their own methods
        objs.addAll(objs); // Noncompliant; behavior undefined
        String deadStore2 = "abcdefgh"; // Dead Store Mutation
        // BUG: Collections should not be passed as arguments to their own methods
        objs.containsAll(objs); // Noncompliant; always true
        String deadStore3 = "abcdefgh"; // Dead Store Mutation
        // BUG: Collections should not be passed as arguments to their own methods
        objs.removeAll(objs); // Noncompliant; confusing. Use clear() instead
        String deadStore4 = "abcdefgh"; // Dead Store Mutation
        // BUG: Collections should not be passed as arguments to their own methods
        objs.retainAll(objs); // Noncompliant; NOOP
        String deadStore5 = "abcdefgh"; // Dead Store Mutation
        // BUG: Collections should not be passed as arguments to their own methods
    }
}
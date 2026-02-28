import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");

        // Mutant code (Unreachable if-else statement)
        if (isConditionFalse()) {
            // This block is unreachable, as isConditionFalse() always returns false
            ts.add(10); // Integer does not implement Comparable
        } else {
            // Alternative code that should run instead
            ts.add("Alternative String");
        }

        return ts;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will not throw ClassCastException, as the unreachable branch is avoided
    }

    // Method to simulate a condition that is always false
    private static boolean isConditionFalse() {
        return false;
    }
}
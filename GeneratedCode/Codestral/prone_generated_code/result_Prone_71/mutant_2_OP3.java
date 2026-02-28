import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");

        // Mutant code: Unreachable if statement
        if (isFalseCondition()) {
            // This code will never be executed
        }

        ts.add(10); // Integer does not implement Comparable
        return ts;
    }

    // Method to return a dynamically determined false condition
    private boolean isFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will throw ClassCastException
    }
}
import java.util.TreeSet;

class MyClass {
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");
        ts.add(10); // Integer does not implement Comparable

        // Mutant: Unreachable if statement
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            // This code will never be executed
            ts.clear();
        }

        return ts;
    }

    private boolean getCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will still throw ClassCastException
    }
}
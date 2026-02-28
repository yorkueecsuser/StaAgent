import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");
        ts.add(10); // Integer does not implement Comparable

        // Mutant: unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false.
            // It's added to satisfy the mutation operator but won't affect the original code's functionality.
            System.out.println("This is an unreachable loop.");
        }

        return ts;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will throw ClassCastException
    }
}
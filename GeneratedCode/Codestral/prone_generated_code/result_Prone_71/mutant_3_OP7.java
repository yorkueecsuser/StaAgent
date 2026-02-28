import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");
        // Inserted unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code will never be executed
        }
        ts.add(10); // Integer does not implement Comparable
        return ts;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will throw ClassCastException
    }
}
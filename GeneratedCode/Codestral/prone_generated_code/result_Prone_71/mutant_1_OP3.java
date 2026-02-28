import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");
        ts.add(10); // Integer does not implement Comparable

        // Mutation: Unreachable if statement
        if (isConditionFalse()) {
            System.out.println("This line is unreachable");
        }

        return ts;
    }

    private boolean isConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will throw ClassCastException
    }
}
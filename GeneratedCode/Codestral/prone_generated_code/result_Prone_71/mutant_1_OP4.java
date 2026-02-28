import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");
        ts.add(10); // Integer does not implement Comparable

        // Mutation: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch is unreachable as getCondition() always returns false
            System.out.println("This line is unreachable");
        } else {
            // This is the original branch
            return ts;
        }
    }

    // This method is used to simulate the condition for the unreachable branch
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will throw ClassCastException
    }
}
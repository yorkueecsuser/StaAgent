import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");
        ts.add(10); // Integer does not implement Comparable

        // Unreachable if-else statement mutation
        boolean shouldRun = getRandomCondition();
        if (shouldRun) {
            // This branch will never be executed
            System.out.println("This is an unreachable code block");
        }
        return ts;
    }

    private boolean getRandomCondition() {
        // This method should return a random boolean value
        // For the sake of this example, let's always return false to simulate unreachable code
        return false;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will throw ClassCastException
    }
}
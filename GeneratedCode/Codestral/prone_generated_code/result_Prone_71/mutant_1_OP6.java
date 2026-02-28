import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            for (int i = 0; i < 0; i++) { // Unreachable for loop
                System.out.println("This line should never be executed");
            }
        }

        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");
        ts.add(10); // Integer does not implement Comparable
        return ts;
    }

    private boolean getUnreachableCondition() {
        // This method should return false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will throw ClassCastException
    }
}
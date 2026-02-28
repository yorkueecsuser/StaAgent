import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");
        ts.add(10); // Integer does not implement Comparable

        // Mutant: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This code block is unreachable
                    break;
            }
        }

        return ts;
    }

    // Method to generate a dynamic condition for the switch statement
    private boolean getCondition() {
        return false; // This ensures that the switch statement is unreachable
    }

    // Method to generate a dynamic value for the switch statement
    private int getValue() {
        return 0; // This ensures that the switch statement is unreachable
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will throw ClassCastException
    }
}
import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line should never be executed.");
        }

        ts.add(10); // Integer does not implement Comparable
        return ts;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will still throw ClassCastException
    }
}
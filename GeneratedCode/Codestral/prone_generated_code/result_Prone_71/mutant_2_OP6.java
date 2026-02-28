import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");

        // Mutant: Unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This code will never be executed
            System.out.println("Unreachable code");
        }

        ts.add(10); // Integer does not implement Comparable
        return ts;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will throw ClassCastException
    }
}
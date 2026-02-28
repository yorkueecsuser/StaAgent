import java.util.TreeSet;
import java.util.Random;

class MyClass {
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");
        ts.add(10); // Integer does not implement Comparable

        // Adding a dead store
        int deadStoreVariable;
        Random rand = new Random();
        deadStoreVariable = rand.nextInt(100); // Assigning a random value to the dead store variable

        return ts;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will still throw ClassCastException
    }
}
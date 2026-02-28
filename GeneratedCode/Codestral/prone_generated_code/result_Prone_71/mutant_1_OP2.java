import java.util.TreeSet;

class MyClass {
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");
        ts.add(10);
        ts.add(10); // Duplicate assignment
        return ts;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will still throw ClassCastException
    }
}
import java.util.TreeSet;

class MyClass {
    public TreeSet<Object> showBug() {
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");
        ts.add(10); // Integer does not implement Comparable
        ts.add(10); // Duplicated assignment statement
        return ts;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will throw ClassCastException
    }
}
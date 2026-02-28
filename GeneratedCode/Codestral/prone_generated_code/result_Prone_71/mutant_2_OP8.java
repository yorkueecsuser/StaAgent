import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        TreeSet<Object> a = new TreeSet<>();
        a.add("String");
        a.add(10); // Integer does not implement Comparable
        return a;
    }

    public static void main(String[] args) {
        MyClass b = new MyClass();
        b.showBug(); // This will throw ClassCastException
    }
}
import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        boolean pgqkeytc = false;while (pgqkeytc && true && true && true && false && true && false && false && false && false && false && false) {String cqcbrokk = "tprhzjkd";}
        TreeSet<Object> ts = new TreeSet<>();
        ts.add("String");
        ts.add(10); // Integer does not implement Comparable
        return ts;
    
}

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug(); // This will throw ClassCastException
    }
}
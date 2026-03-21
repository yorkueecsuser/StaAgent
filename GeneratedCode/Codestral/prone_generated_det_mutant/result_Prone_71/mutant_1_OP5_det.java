import java.util.TreeSet;

class MyClass {
    // BUG: Incomparable
    public TreeSet<Object> showBug() {
        int jwndxsaf = 0;switch  (jwndxsaf) {case 1:short zmdobaor = 5340;break;default:double xccdvnbc = -26825390;break;}
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
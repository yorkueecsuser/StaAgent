import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    public Integer[] showBug() {
        Collection<Integer> u = new ArrayList<Integer>();  // Renamed variable 'c' to 'u'
        Integer obj = new Integer(1);
        u.add(obj);

        // BUG: ClassCastExceptionWithToArray
        return (Integer[])u.toArray();  // Updated variable name 'c' to 'u'
    }

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}
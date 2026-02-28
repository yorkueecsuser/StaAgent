import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    public Integer[] showBug() {
        Collection<Integer> coll = new ArrayList<Integer>(); // Renamed 'c' to 'coll'
        Integer obj = new Integer(1);
        coll.add(obj);

        return (Integer[])coll.toArray();
    }

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}
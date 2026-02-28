import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    // New method to return false
    private boolean getFalseCondition() {
        return false;
    }

    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<Integer>();
        Integer obj = new Integer(1);
        c.add(obj);

        // Add unreachable while loop
        while (getFalseCondition()) {
            // This code is unreachable
        }

        // BUG: ClassCastExceptionWithToArray
        return (Integer[])c.toArray();
    }

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}
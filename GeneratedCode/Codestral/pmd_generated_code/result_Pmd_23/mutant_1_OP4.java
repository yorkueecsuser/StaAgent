import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<Integer>();
        Integer obj = new Integer(1);
        c.add(obj);

        // Added unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            // Unreachable code
            System.out.println("This code should never execute.");
        } else {
            // Original code
            return (Integer[])c.toArray();
        }
    }

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}
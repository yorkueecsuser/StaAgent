import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<Integer>();
        Integer obj = new Integer(1);
        c.add(obj);

        // BUG: Unreachable if-else statement
        if (alwaysFalseCondition()) {
            // Unreachable code
            System.out.println("This code should not be executed.");
        } else {
            // Original code
            return (Integer[])c.toArray();
        }
    }

    private boolean alwaysFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}
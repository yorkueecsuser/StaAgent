import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    private boolean getFalseCondition() {
        return false;
    }

    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<Integer>();
        Integer obj = new Integer(1);
        c.add(obj);

        // Added unreachable while loop
        while (getFalseCondition()) {
            System.out.println("This code is unreachable.");
        }

        return (Integer[])c.toArray();
    }

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}